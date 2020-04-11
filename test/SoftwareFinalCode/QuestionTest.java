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
 *
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
     * Test of getOpt1 and setOpt1 methods, of class Question.
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
     * Test of getOpt2 and setOpt2 methods, of class Question.
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
     * Test of getOpt3 method, of class Question.
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
     * Test of getUserChoice and setUserChoice methods, of class Question.
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
}
