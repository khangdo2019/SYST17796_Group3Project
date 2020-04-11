import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sunha
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)   { 
        int sedan=0, van=0, sport=0; 
        int opt1 = 0, opt2=0;
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
                                "Sedan", "Van", "Sport"));
        quiz.addCarTypeQ(new Question("Are you looking for a vehicle that uses electricity, petrol or diesel?",
                                "Electricity", "Petrol", "Diesel"));
        quiz.addCarTypeQ(new Question("How many cars are you most likely to own?",
                                "1-2", "2-4", "4 and up"));
        quiz.addCarTypeQ(new Question("How much would you spend on your car?",
                                "20k-35", "35-65", "65 and higher"));
        quiz.addCarTypeQ(new Question("What type of vehicle is your dream car?",
                                "Sedan", "Van", "Sports"));
        quiz.addCarTypeQ(new Question("In a car do you pay more attention to the electronics, luxury?",
                                "Electronics and gimmicks", "looks of the car are irrelevant", "luxury"));

        // for user to see the common questions
        for(int i=0; i<quiz.getCommonQs().size(); i++){
            System.out.println(i+1 +". " + quiz.getCommonQs().get(i).getQuestion()
                                + "\n"
                                + quiz.getCommonQs().get(i).getOpt1()+"\t" 
                                + quiz.getCommonQs().get(i).getOpt2() + "\t"
                                + quiz.getCommonQs().get(i).getOpt3());
                try {
                    qNum = sc.nextInt();
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
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                    qNum = sc.nextInt();
                }
                
            if((quiz.getCommonQs().size()/Car.values().length) == sedan 
                && sedan == van && van == sport){
                    quiz.addCarTypeQ(new Question("What is your most important value when you buy car?",
                                                "A Efficient fuel economy", "A large indoor space", 
                                                "An appearance"));
            }    
            System.out.println("");            
        }

        // add car brand question
        quiz.addCarBrandQ(new Question("Do you enjoy going off roading?", "Yes ", "No"));
        quiz.addCarBrandQ(new Question("If your on a road trip, and your on open road, "
                            + " are you more likely drive fast or go on the speed limit?", 
                             "Drive fast", "Speed limit"));
        quiz.addCarBrandQ(new Question("Do you care about the vehicle brand?", "No", "Yes"));
                
        recommendCarType = qh.returnCarType(sedan, van, sport);       
        
        // for user to see the common questions
        for(int i=0; i<quiz.getCarBrandQs().size(); i++){
            System.out.println(((i+1)+quiz.getCommonQs().size()) +". " 
                                + quiz.getCarBrandQs().get(i).getQuestion()
                                + "\n"
                                + quiz.getCarBrandQs().get(i).getOpt1()+"\t" 
                                + quiz.getCarBrandQs().get(i).getOpt2());
            try {
                qNum = sc.nextInt();                      
                    switch(qNum){
                        case 1 : opt1++;
                            quiz.getCarBrandQs().get(i).setUserChoice
                                                     (recommendCarType.getBrand1());                            
                            break;
                        case 2 : opt2++;
                            quiz.getCarBrandQs().get(i).setUserChoice
                                                     (recommendCarType.getBrand2());
                            break;
                    }
                              
            }catch (Exception e) {
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
        for(int i=0; i<finalQuiz.size(); i++){
            System.out.println(finalQuiz.get(i).getQuestion() + " "
                                + finalQuiz.get(i).getUserChoice());
        }
        
    }
    
}
