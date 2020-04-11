package SoftwareFinalCode;

/**
 * A QuinzHandler class that generates results, based on user's choice.
 *
 * @author sunha
 */
public class QuizHandler {

    /**
     * A default constructor of quizHandler
     */
    public QuizHandler() {
    }

    /**
     * A method that returns a car type based on user input.
     *
     * @param sedan
     * @param van
     * @param sport
     * @return carType;
     * @throws IllegalArgumentException when sedan, van, or sport is negative
     */
    public Car returnCarType(int sedan, int van, int sport)
            throws IllegalArgumentException {
        Car carType = null;
        if (sedan >= 0 && van >= 0 && sport >= 0) {
            if (sedan > van && sedan > sport) {
                carType = Car.Sedan;
            } else if (van > sedan && van > sport) {
                carType = Car.Van;
            } else if (sport > sedan && sport > van) {
                carType = Car.Sport;
            }
        } else {
            throw new IllegalArgumentException("Error: Car point should be "
                    + "positive");
        }
        return carType;
    }

    /**
     * A method that asks car brand questions based on selected options by user.
     *
     * @param opt1
     * @param opt2
     * @return carBrandBoolean
     * @throws IllegalArgumentException when opt1 or opt2 is negative
     */
    public boolean askCarBrandCommon(int opt1, int opt2) throws
            IllegalArgumentException {
        Boolean carBrandBoolean = true;
        if (opt1 >= 0 && opt2 >= 0) {
            carBrandBoolean = (opt1 > opt2);
        } else {
            throw new IllegalArgumentException("Error: Option point should"
                    + "be positive!");
        }
        return carBrandBoolean;
    }

    /**
     * A method that returns car brand questions based on both returned car type
     * and selected options for car brand questions by user.
     *
     * @param carType
     * @param carBrandBoolean
     * @return carBrand
     * @throws IllegalArgumentException when carType is null
     */
    public String returnCarBrand(Car carType, boolean carBrandBoolean) throws
            IllegalArgumentException {
        String carBrand = null;
        boolean b = carBrandBoolean;
        if (carType != null) {
            if (carType == Car.Sedan) {
                carBrand = (b) ? Car.Sedan.getBrand1() : Car.Sedan.getBrand2();
            } else if (carType == Car.Van) {
                carBrand = (b) ? Car.Van.getBrand1() : Car.Van.getBrand2();
            } else if (carType == Car.Sport) {
                carBrand = (b) ? Car.Sport.getBrand1() : Car.Sport.getBrand2();
            }
        } else {
            throw new IllegalArgumentException("Error: CarType should not"
                    + "be null!");
        }
        return carBrand;
    }

}
