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
 *
 * @author Khang Do
 */
public class CarTest {
    
    public CarTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getBrand1 method, of class Car.
     * This test gives a good input of Car Sedan as Tesla and Sport as BMW, which should 
     * return "Tesla BMW" when we call the getBrand method.
     */
    @Test
    public void testGetBrand1Good() {
        System.out.println("Test getBrand1 method Good");
        Car instance1 = Car.Sedan;
        Car instance2 = Car.Sport;
        String expResult = "Tesla BMW";
        String result = (instance1.getBrand1()+ " " +instance2.getBrand1());
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getBrand1 method, of class Car.
     * This test gives a null object invoke the method, which should 
     * throws an Exception.
     */
    @Test (expected=NullPointerException.class)
    public void testGetBrand1Bad() {
        System.out.println("Test getBrand1 method Bad");
        Car instance = null;
        String expResult = "";
        String result = instance.getBrand1();        
    }
    
    /**
     * Test of getBrand1 method, of class Car.
     * This test gives a good input of Car Sedan as Tesla, which should 
     * return the same string when we call the getBrand method.
     */
    @Test
    public void testGetBrand1Boundary() {
        System.out.println("Test getBrand1 method Boundary");
        Car instance = Car.Sedan;
        String expResult = "Tesla";
        String result = instance.getBrand1();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getBrand2 method, of class Car.
     * This test gives a good input of Car Sedan as Honda and Sport as 
     * Lamborghini, which should return "Honda Lamborghini" 
     * when we call the getBrand method.
     */
    @Test
    public void testGetBrand2Good() {
        System.out.println("Test getBrand2 method Good");
        Car instance1 = Car.Sedan;
        Car instance2 = Car.Sport;
        String expResult = "Honda Lamborghini";
        String result = (instance1.getBrand2() + " " + instance2.getBrand2());
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getBrand2 method, of class Car.
     * This test gives a null object invoke the method, which should 
     * throws an Exception.
     */
    @Test (expected=NullPointerException.class)
    public void testGetBrand2Bad() {
        System.out.println("Test getBrand2 method Bad");
        Car instance = null;
        String expResult = "";
        String result = instance.getBrand2();         
    }
    
    /**
     * Test of getBrand2 method, of class Car.
     * This test gives a good input of Car Sedan as Honda, which should 
     * return the same string when we call the getBrand method.
     */
    @Test
    public void testGetBrand2Boundary() {
        System.out.println("Test getBrand2 method Boundary");
        Car instance = Car.Sedan;
        String expResult = "Honda";
        String result = instance.getBrand2();
        assertEquals(expResult, result);        
    }
}
