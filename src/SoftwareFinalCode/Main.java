package SoftwareFinalCode;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sunha
 * @modifier HsiaoHsienKuo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int sedan = 0, van = 0, sport = 0;
        int opt1 = 0, opt2 = 0;
        int qNum;
        boolean carBrandBoolean;
        String userChoice = null;

        Car recommendCarType;
        String recommendedCarBrand;

        Quiz quiz = new Quiz();
        QuizHandler qh = new QuizHandler();
        ArrayList<Question> finalQuiz = new ArrayList<>(); //arraylist of final questions

        Scanner sc = new Scanner(System.in);

        // add common 6 question
        quiz.addCarTypeQ(new Question("What type of vehicle do you most commonly drive?",
                "1.Sedan", "2.Van", "3.Sport"));
        quiz.addCarTypeQ(new Question("Are you looking for a vehicle that uses electricity, petrol or diesel?",
                "1.Electricity", "2.Petrol", "3.Diesel"));
        quiz.addCarTypeQ(new Question("How many cars are you most likely to own?",
                "1.1-2", "2.2-4", "3.4 and up"));
        quiz.addCarTypeQ(new Question("How much would you spend on your car?",
                "1.20k-35", "2.35-65", "3.65 and higher"));
        quiz.addCarTypeQ(new Question("What type of vehicle is your dream car?",
                "1.Sedan", "2.Van", "3.Sports"));
        quiz.addCarTypeQ(new Question("In a car do you pay more attention to the electronics, luxury?",
                "1.Electronics and gimmicks", "2.Looks of the car are irrelevant", "3.Luxury"));

        System.out.println("Welcome to the Carology Test where you can find your dream car.");
        System.out.println("Please choose cho number 1,2,3 stands for each answer.");
        int num = quiz.getCommonQs().size(); //Check number of common question
        // for user to see the common questions
        for (int i = 0; i < quiz.getCommonQs().size(); i++) {
            System.out.println(i + 1 + ". " + quiz.getCommonQs().get(i).getQuestion()
                    + "\n"
                    + quiz.getCommonQs().get(i).getOpt1() + "\t"
                    + quiz.getCommonQs().get(i).getOpt2() + "\t"
                    + quiz.getCommonQs().get(i).getOpt3());
            try {
                qNum = checkIntMisInputException(sc);
                switch (qNum) {
                    case 1:
                        sedan++;
                        userChoice = "sedan";
                        quiz.getCommonQs().get(i).setUserChoice(userChoice);
                        break;
                    case 2:
                        van++;
                        userChoice = "van";
                        quiz.getCommonQs().get(i).setUserChoice(userChoice);
                        break;
                    case 3:
                        sport++;
                        userChoice = "sport";
                        quiz.getCommonQs().get(i).setUserChoice(userChoice);
                        break;
                    default:
                        throw new Exception("Please enter number of 1~3");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                qNum = sc.nextInt();
            }
            //If the counts of sedan, van, or sport are equal
            if (num == i + 1) {
                if (sport == sedan && sedan == van) {
                    quiz.addCarTypeQ(new Question("What is your most important value when you buy car?",
                            "1.A Efficient fuel economy", "2.A large indoor space",
                            "3.An appearance"));
                    System.out.println("Senda " + sedan + "Van " + van + "Sport " + sport);
                } else if (sedan == van) {
                    quiz.addCarTypeQ(new Question("What is your most important value when you buy car?",
                            "1.A Efficient fuel economy", "2.A large indoor space",
                            ""));
                    System.out.println("Senda " + sedan + "Van " + van + "Sport " + sport);
                } else if (sedan == sport) {
                    quiz.addCarTypeQ(new Question("What is your most important value when you buy car?",
                            "1.A Efficient fuel economy", "",
                            "3.An appearance"));
                    System.out.println("Senda " + sedan + "Van " + van + "Sport " + sport);
                } else if (van == sport) {
                    quiz.addCarTypeQ(new Question("What is your most important value when you buy car?",
                            "", "2.A large indoor space",
                            "3.An appearance"));
                    System.out.println("Senda " + sedan + "Van " + van + "Sport " + sport);
                }
            }
            System.out.println("");
        }

        // add car brand question
        quiz.addCarBrandQ(new Question("Do you enjoy going off roading?", "1.Yes ", "2.No"));
        quiz.addCarBrandQ(new Question("If your on a road trip, and your on open road, "
                + " are you more likely drive fast or go on the speed limit?",
                "1.Drive fast", "2.Speed limit"));
        quiz.addCarBrandQ(new Question("Do you care about the vehicle brand?", "1.No", "2.Yes"));

        recommendCarType = qh.returnCarType(sedan, van, sport);

        // for user to see the common questions
        for (int i = 0; i < quiz.getCarBrandQs().size(); i++) {
            System.out.println(((i + 1) + quiz.getCommonQs().size()) + ". "
                    + quiz.getCarBrandQs().get(i).getQuestion()
                    + "\n"
                    + quiz.getCarBrandQs().get(i).getOpt1() + "\t"
                    + quiz.getCarBrandQs().get(i).getOpt2());
            try {
                qNum = checkIntInputOneAndTwoOnly(sc);
                switch (qNum) {
                    case 1:
                        opt1++;
                        quiz.getCarBrandQs().get(i).setUserChoice(recommendCarType.getBrand1());
                        break;
                    case 2:
                        opt2++;
                        quiz.getCarBrandQs().get(i).setUserChoice(recommendCarType.getBrand2());
                        break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                qNum = sc.nextInt();
            }
            System.out.println("");
        }

        carBrandBoolean = qh.askCarBrandCommon(opt1, opt2);

        recommendedCarBrand = qh.returnCarBrand(recommendCarType, carBrandBoolean);

        System.out.println("We recommend you " + recommendCarType + " " + recommendedCarBrand);
        System.out.println("");

        finalQuiz.addAll(quiz.getCommonQs());
        finalQuiz.addAll(quiz.getCarBrandQs());

        // print final questions and user answers repectively
        for (int i = 0; i < finalQuiz.size(); i++) {
            System.out.println(finalQuiz.get(i).getQuestion() + " "
                    + finalQuiz.get(i).getUserChoice());
        }

    }

    public static int checkIntMisInputException(Scanner sc) {
        int num = 0;
        boolean vaild = false;
        do {
            try {
                num = sc.nextInt();
                vaild = true;
            } catch (InputMismatchException e) {
                System.out.println("Please input a number > ");
                sc.nextLine();
            }
        } while (!vaild);
        return num;
    }

    public static int checkIntInputOneAndTwoOnly(Scanner sc) {
        int num = 0;
        boolean vaild = false;
        do {
            try {
                num = sc.nextInt();
                if (num != 1 && num != 2) {
                    throw new IllegalArgumentException("Number need to be input"
                            + "1 or 2 to choose first option or second option > ");
                }
                vaild = true;
            } catch (InputMismatchException e) {
                System.out.println("Please input a number > ");
                sc.nextLine();
            }
        } while (!vaild);
        return num;
    }

}
