/**
 * A enum class of Car. This class includes car types as enum value,
 * two car brand as data fields and method which returns description of each car type.
 * @author sunha
 */

public enum Car {

    /**
     * A value of an enumerated type - Sport
     * It has two parameters, which are string values of "BMW" and "Lamborghini"
     */
    Sport("BMW", "Lamborghini") {
        /**
         * An overriding abstract method which explains Sport car description.
         * @return a String value of Sport description. 
         */
        @Override
        String carTypeDescription() {
            return "Sport description"; 
        }
    },

    /**
     * A value of an enumerated type - Van
     * It has two parameters, which are string values of "Dodge" and "Chrysler"
     */
    Van("Dodge", "Chrysler") {
        /**
         * An overriding abstract method which explains Van description.
         * @return a String value of van description.
         */
        @Override
        String carTypeDescription() {
            return "Van description";
        }
    },

    /**
     * A value of an enumerated type - Sedan
     * It has two parameters, which are string values of "Tesla" and "Honda"
     */
    Sedan("Tesla", "Honda") {
        /**
         * An overriding abstract method which explains sedan description.
         * @return a String value of sedan description. 
         */
        @Override
        String carTypeDescription() {
            return "Sedan description"; 
        }
    };
    
    private String brand1; // A data field which represents first car brand
    private String brand2; // A data field which represents second car brand
    
    /**
     * A constructor of Car class
     * @param brand1
     * @param brand2 
     */
    private Car(String brand1, String brand2) {
        this.brand1 = brand1;
        this.brand2 = brand2;
    }
    
    /**
     * An abstract method in Enum class. It makes possible that 
     * each enumerated values explains different descriptions. 
     */
    abstract String carTypeDescription(); 

    /**
     * An accessor method that reads the first data field and return it.
     * @return brand1
     */
    public String getBrand1() {
        return brand1;
    }

    /**
     * An accessor method that reads the second data field and return it.
     * @return brand2
     */
    public String getBrand2() {
        return brand2;
    }
    
    
}
