/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareFinalCode;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class QuizTest {
    
    public QuizTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of addCarTypeQ and getCommonQs method, of class Quiz.
     * This test gives 2 questions and use addCarTypeQ method to add them to 
     * commonQs field in the Quiz class. So, size of commonQs should be 2
     * when we invoke the getCommonQs method.
     */
    @Test
    public void testAddCarTypeQGetCommonQsGood() {
        System.out.println("Test addCarTypeQ and getCommonQs methods Good");
        Question q1 = new Question("What type of vehicle do you most commonly drive?",
                "1.Sedan", "2.Van", "3.Sport");
        Question q2 = new Question("Are you looking for a vehicle that uses electricity, petrol or diesel?",
                "1.Electricity", "2.Petrol", "3.Diesel");
        Quiz instance = new Quiz();
        instance.addCarTypeQ(q1);
        instance.addCarTypeQ(q2);
        assertEquals(2, instance.getCommonQs().size());
    }
    
    /**
     * Test of addCarTypeQ and getCommonQs method, of class Quiz.
     * This test gives a null question and use addCarTypeQ method to add them to 
     * commonQs field in the Quiz class which throws an IllegalArgumentException.
     */
    @Test (expected=IllegalArgumentException.class)
    public void testAddCarTypeQGetCommonQsBad() {
        System.out.println("Test addCarTypeQ and getCommonQs methods Good");
        Question q = null;        
        Quiz instance = new Quiz();
        instance.addCarTypeQ(q);                
    }
    
    /**
     * Test of addCarTypeQ and getCommonQs method, of class Quiz.
     * This test gives 1 question and use addCarTypeQ method to add them to 
     * commonQs field in the Quiz class. So, size of commonQs should be 1
     * when we invoke the getCommonQs method.
     */
    @Test
    public void testAddCarTypeQGetCommonQsBoundary() {
        System.out.println("Test addCarTypeQ and getCommonQs methods Boundary");
        Question q = new Question("What type of vehicle do you most commonly drive?",
                "1.Sedan", "2.Van", "3.Sport");        
        Quiz instance = new Quiz();
        instance.addCarTypeQ(q);        
        assertEquals(1, instance.getCommonQs().size());
    }

    /**
     * Test of addCarBrandQ and getCarBrandQs methods, of class Quiz.
     * This test gives 2 questions and use addCarBrandQ method to add them to 
     * carBrandQs field in the Quiz class. So, size of carBrandQs should be 2
     * when we invoke the getCarBrandQs method.
     */
    @Test
    public void testAddCarBrandQGetCarBrandQsGood() {
        System.out.println("Test addCarBrandQ and getCarBrandQs methods Good");
        Question q1 = new Question("Do you enjoy going off roading?", 
                "1.Yes ", "2.No");
        Question q2 = new Question("If your on a road trip, and your on open road, "
                + " are you more likely drive fast or go on the speed limit?",
                "1.Drive fast", "2.Speed limit");
        Quiz instance = new Quiz();
        instance.addCarBrandQ(q1);
        instance.addCarBrandQ(q2);
        assertEquals(2, instance.getCarBrandQs().size());
    }

    /**
     * Test of addCarBrandQ and getCarBrandQs methods, of class Quiz.
     * This test gives a null question and use addCarBrandQ method to add them to 
     * carBrandQs field in the Quiz class which throws an IllegalArgumentException.
     */
    @Test (expected=IllegalArgumentException.class)
    public void testAddCarBrandQGetCarBrandQsBad() {
        System.out.println("Test addCarBrandQ and getCarBrandQs methods Bad");
        Question q = null;        
        Quiz instance = new Quiz();
        instance.addCarTypeQ(q);                
    }
    
    /**
     * Test of addCarBrandQ and getCarBrandQs methods, of class Quiz.
     * This test gives 1 question and use addCarBrandQ method to add them to 
     * carBrandQs field in the Quiz class. So, size of carBrandQs should be 1
     * when we invoke the getCarBrandQs method.
     */
    @Test
    public void testAddCarBrandQGetCarBrandQsBoundary() {
        System.out.println("Test addCarBrandQ and getCarBrandQs methods Good");
        Question q = new Question("Do you enjoy going off roading?", 
                "1.Yes ", "2.No");        
        Quiz instance = new Quiz();
        instance.addCarBrandQ(q);        
        assertEquals(1, instance.getCarBrandQs().size());
    }
}
