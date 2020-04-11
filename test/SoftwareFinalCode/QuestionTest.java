/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareFinalCode;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * A class to test the methods of Question class
 * @author Khang Do
 */
public class QuestionTest {
    
    public QuestionTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getQuestion method, of class Question.
     * This test gives a good input for setter method of Question, which should 
     * return the same string when we call a getter.
     */
    @Test
    public void testQuestionGood() {
        System.out.println("Test Getter/Setter Question Good");
        Question instance = new Question();
        String expResult = "Question";
        instance.setQuestion("Question");
        String result = instance.getQuestion();
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getQuestion method, of class Question.
     * This test gives a bad input of empty String, which expected to throw
     * an IllegalArgumentException
     */
    @Test (expected=IllegalArgumentException.class)
    public void testQuestionBad() {
        System.out.println("Test Getter/Setter Question Bad");
        Question instance = new Question();
        String expResult = "";
        instance.setQuestion("");
        String result = instance.getQuestion();
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getQuestion method, of class Question.
     * This test gives exactly one character to setter method of question, 
     * which should return the same string when we call a getter.
     */
    @Test
    public void testQuestionBoundary() {
        System.out.println("Test Getter/Setter Question Boundary");
        Question instance = new Question();
        String expResult = "1";
        instance.setQuestion("1");
        String result = instance.getQuestion();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getOpt1 and setOpt1 methods, of class Question.
     * This test gives a good input for setter method of 1. Sedan, which should 
     * return the same string when we call a getter.
     */
    @Test
    public void testOpt1Good() {
        System.out.println("Test Getter/Setter Opt1 Good");
        Question instance = new Question();
        String expResult = "1. Sedan";
        instance.setOpt1("1. Sedan");
        String result = instance.getOpt1();
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getOpt1 and setOpt1 methods, of class Question.
     * This test gives a bad input of empty String, which expected to throw
     * an IllegalArgumentException
     */
    @Test (expected=IllegalArgumentException.class)
    public void testOpt1Bad() {
        System.out.println("Test Getter/Setter Opt1 Bad");
        Question instance = new Question();
        String expResult = "";
        instance.setOpt1("");
        String result = instance.getOpt1();
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getOpt1 and setOpt1 methods, of class Question.
     * This test gives exactly one character to setter method of question, 
     * which should return the same string when we call a getter.
     */
    @Test
    public void testOpt1Boundary() {
        System.out.println("Test Getter/Setter Opt1 Boundary");
        Question instance = new Question();
        String expResult = "1";
        instance.setOpt1("1");
        String result = instance.getOpt1();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getOpt2 and setOpt2 methods, of class Question.
     * This test gives a good input for setter method of 2. Van, which should 
     * return the same string when we call a getter.
     */
    @Test
    public void testOpt2Good() {
        System.out.println("Test Getter/Setter Opt2 Good");
        Question instance = new Question();
        String expResult = "2. Van";
        instance.setOpt2("2. Van");
        String result = instance.getOpt2();
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getOpt2 and setOpt2 methods, of class Question.
     * This test gives a bad input of empty String, which expected to throw
     * an IllegalArgumentException
     */
    @Test (expected=IllegalArgumentException.class)
    public void testOpt2Bad() {
        System.out.println("Test Getter/Setter Opt2 Bad");
        Question instance = new Question();
        String expResult = "";
        instance.setOpt2("");
        String result = instance.getOpt2();
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getOpt2 and setOpt2 methods, of class Question.
     * This test gives exactly one character to setter method of question, 
     * which should return the same string when we call a getter.
     */
    @Test
    public void testOpt2Boundary() {
        System.out.println("Test Getter/Setter Opt2 Boundary");
        Question instance = new Question();
        String expResult = "1";
        instance.setOpt2("1");
        String result = instance.getOpt2();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getOpt3 method, of class Question.
     * This test gives a good input for setter method of 3. Sport, which should 
     * return the same string when we call a getter.
     */
    @Test
    public void testOpt3Good() {
        System.out.println("Test Getter/Setter Opt3 Good");
        Question instance = new Question();
        String expResult = "3. Sport";
        instance.setOpt3("3. Sport");
        String result = instance.getOpt3();
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getOpt3 method, of class Question.
     * This test gives a bad input of empty String, which expected to throw
     * an IllegalArgumentException
     */
    @Test (expected=IllegalArgumentException.class)
    public void testOpt3Bad() {
        System.out.println("Test Getter/Setter Opt3 Bad");
        Question instance = new Question();
        String expResult = "";
        instance.setOpt3("");
        String result = instance.getOpt3();
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getOpt3 method, of class Question.
     * This test gives exactly one character to setter method of question, 
     * which should return the same string when we call a getter.
     */
    @Test
    public void testOpt3Boundary() {
        System.out.println("Test Getter/Setter Opt3 Boundary");
        Question instance = new Question();
        String expResult = "1";
        instance.setOpt3("1");
        String result = instance.getOpt3();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getUserChoice and setUserChoice methods, of class Question.
     * This test gives a good input for setter method of Sedan Tesla, which should 
     * return the same string when we call a getter.
     */
    @Test
    public void testUserChoiceGood() {
        System.out.println("Test Getter/Setter userChoice Good");
        Question instance = new Question();
        String expResult = "Sedan Tesla";
        instance.setUserChoice("Sedan Tesla");
        String result = instance.getUserChoice();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getUserChoice and setUserChoice methods, of class Question.
     * This test gives a good input for setter method of Sedan Tesla, which should 
     * return the same string when we call a getter.
     */
    @Test (expected=IllegalArgumentException.class)
    public void testUserChoiceBad() {
        System.out.println("Test Getter/Setter userChoice Bad");
        Question instance = new Question();
        String expResult = "";
        instance.setUserChoice("");
        String result = instance.getUserChoice();
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of getUserChoice and setUserChoice methods, of class Question.
     * This test gives exactly one character to setter method of question, 
     * which should return the same string when we call a getter.
     */
    @Test
    public void testUserChoiceBoundary() {
        System.out.println("Test Getter/Setter userChoice Boundary");
        Question instance = new Question();
        String expResult = "1";
        instance.setUserChoice("1");
        String result = instance.getUserChoice();
        assertEquals(expResult, result);        
    }
}
