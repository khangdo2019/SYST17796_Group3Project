/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareFinalCode;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A class to test the methods of QuizHandler class
 * @author Khang Do
 */
public class QuizHandlerTest {
    
    public QuizHandlerTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of returnCarType method, of class QuizHandler.
     * Test gives a good input for the sedan, van, and sport points as 
     * consecutively 4,2,0 and method should return Car.Sedan
     */
    @Test
    public void testReturnCarTypeGood() {
        System.out.println("Test returnCarType method Good");
        int sedan = 4;
        int van = 2;
        int sport = 0;
        QuizHandler instance = new QuizHandler();
        Car expResult = Car.Sedan;
        Car result = instance.returnCarType(sedan, van, sport);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of returnCarType method, of class QuizHandler.
     * Test gives a good input for the sedan, van, and sport points as 
     * consecutively -1,2,0 and method should throws IllegalArgumentException as
     * the point should be positive and return null.
     */
    @Test (expected=IllegalArgumentException.class)
    public void testReturnCarTypeBad() {
        System.out.println("Test returnCarType method Bad");
        int sedan = -1;
        int van = 2;
        int sport = 0;
        QuizHandler instance = new QuizHandler();
        Car expResult = null;
        Car result = instance.returnCarType(sedan, van, sport);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of returnCarType method, of class QuizHandler.
     * Test gives a boundary input for the sedan, van, and sport points as 
     * consecutively 1,0,0 and method should return Car.Sedan
     */
    @Test
    public void testReturnCarTypeBoundary() {
        System.out.println("Test returnCarType method Boundary");
        int sedan = 1;
        int van = 0;
        int sport = 0;
        QuizHandler instance = new QuizHandler();
        Car expResult = Car.Sedan;
        Car result = instance.returnCarType(sedan, van, sport);
        assertEquals(expResult, result);        
    }

    /**
     * Test of askCarBrandCommon method, of class QuizHandler.
     * Test gives a good input of opt1 and opt2 points are 2 and 1 which
     * method should return true
     */
    @Test
    public void testAskCarBrandCommonGood() {
        System.out.println("Test askCarBrandCommon method Good");
        int opt1 = 2;
        int opt2 = 1;
        QuizHandler instance = new QuizHandler();
        boolean expResult = true;
        boolean result = instance.askCarBrandCommon(opt1, opt2);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of askCarBrandCommon method, of class QuizHandler.
     * Test gives a bad input of opt1 and opt2 points are -1 and 1 which
     * method should throw an IllegalArgumentException
     */
    @Test (expected=IllegalArgumentException.class)
    public void testAskCarBrandCommonBad() {
        System.out.println("Test askCarBrandCommon method Good");
        int opt1 = -1;
        int opt2 = 0;
        QuizHandler instance = new QuizHandler();        
        boolean result = instance.askCarBrandCommon(opt1, opt2);
    }
    
    /**
     * Test of askCarBrandCommon method, of class QuizHandler.
     * Test gives a boundary input of opt1 and opt2 points are 1 and 0 which
     * method should return true
     */
    @Test
    public void testAskCarBrandCommonBoundary() {
        System.out.println("Test askCarBrandCommon method Boundary");
        int opt1 = 1;
        int opt2 = 0;
        QuizHandler instance = new QuizHandler();
        boolean expResult = true;
        boolean result = instance.askCarBrandCommon(opt1, opt2);
        assertEquals(expResult, result);        
    }

    /**
     * Test of returnCarBrand method, of class QuizHandler.
     * Test gives a good input of carType as Sedan and carBrandBoolean is true
     * which method should return Tesla
     */
    @Test
    public void testReturnCarBrandGood() {
        System.out.println("Test returnCarBrand method Good");
        Car carType = Car.Sedan;
        boolean carBrandBoolean = true;
        QuizHandler instance = new QuizHandler();
        String expResult = "Tesla";
        String result = instance.returnCarBrand(carType, carBrandBoolean);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of returnCarBrand method, of class QuizHandler.
     * Test gives a bad input of carType as null and carBrandBoolean is true
     * which method should throw an IllegalArgumentException
     */
    @Test (expected=IllegalArgumentException.class)
    public void testReturnCarBrandBad() {
        System.out.println("Test returnCarBrand method Bad");
        Car carType = null;
        boolean carBrandBoolean = true;
        QuizHandler instance = new QuizHandler();        
        String result = instance.returnCarBrand(carType, carBrandBoolean);        
    }
    
    /**
     * Test of returnCarBrand method, of class QuizHandler.
     * Test gives a boundary input of carType as Sedan and carBrandBoolean is false
     * which method should return Honda
     */
    @Test
    public void testReturnCarBrandBoundary() {
        System.out.println("Test returnCarBrand method Good");
        Car carType = Car.Sedan;
        boolean carBrandBoolean = false;
        QuizHandler instance = new QuizHandler();
        String expResult = "Honda";
        String result = instance.returnCarBrand(carType, carBrandBoolean);
        assertEquals(expResult, result);        
    }
    
}
