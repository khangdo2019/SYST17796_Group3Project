package SoftwareFinalCode;

/**
 * A QuinzHandler class that generates results, based on user's choice.
 * @author sunha
 */

public class QuizHandler {

    /**
     * A default constructor of quizHandler
     */
    public QuizHandler() {}

    /**
     * A method that returns a car type based on user input. 
     * @param sedan
     * @param van
     * @param sport
     * @return carType;
     */
    public Car returnCarType(int sedan, int van, int sport){     
        Car carType = null;
        if(sedan > van && sedan > sport){
            carType = Car.Sedan;
        }else if(van>sedan && van>sport){
            carType = Car.Van;
        }else if(sport>sedan && sport>van){
            carType = Car.Sport;
        }
        
        return carType;
    }
    
    /**
     * A method that asks car brand questions based on selected options by user.
     * @param opt1
     * @param opt2
     * @return carBrandBoolean
     */
    public boolean askCarBrandCommon(int opt1, int opt2){
        Boolean carBrandBoolean = true;
        carBrandBoolean = (opt1>opt2);
        
        return carBrandBoolean;
    }  
    
    /**
     * A method that returns car brand questions 
     * based on both returned car type and 
     * selected options for car brand questions by user.
     * @param carType
     * @param carBrandBoolean
     * @return carBrand
     */
    public String returnCarBrand(Car carType, boolean carBrandBoolean){
        String carBrand = null;
        boolean b = carBrandBoolean;
        
        if(carType == Car.Sedan){
            carBrand = (b) ? Car.Sedan.getBrand1():Car.Sedan.getBrand2();
        }else if(carType == Car.Van){
            carBrand = (b) ? Car.Van.getBrand1():Car.Van.getBrand2();
        }else if(carType == Car.Sport){
            carBrand = (b) ? Car.Sport.getBrand1():Car.Sport.getBrand2();
        }        
        
        return carBrand;
    }
    
}
