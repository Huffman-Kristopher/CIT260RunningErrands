/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reddo
 */
public class ObjectiveControlTest {
    
    public ObjectiveControlTest() {
    }

    /**
     * Test of calculateBribeResult method, of class ObjectiveControl.
     */
    @Test
    public void testCalculateBribeResult() {
        System.out.println("calculateBribeResult");
        int bribeAmount = 0;
        ObjectiveControl instance = new ObjectiveControl();
        boolean expResult = false;
        boolean result = instance.calculateBribeResult(bribeAmount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateBribeResult2() {
        System.out.println("calculateBribeResult Test 2");
        int bribeAmount = 5000000;
        ObjectiveControl instance = new ObjectiveControl();
        boolean expResult = false;
        boolean result = instance.calculateBribeResult(bribeAmount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateBribeResult3() {
        System.out.println("calculateBribeResult Test 3 - MAY FAIL DUE TO RANDOM");
        int bribeAmount = 5;
        ObjectiveControl instance = new ObjectiveControl();
        boolean expResult = true;
        boolean result = instance.calculateBribeResult(bribeAmount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of calculateMessage method, of class ObjectiveControl.
     */
    @Test
    public void testCalculateMessage() {
        System.out.println("calculateBribeMessage");
        boolean bribeResult = true;
        ObjectiveControl instance = new ObjectiveControl();
        String expResult = "Congratulations! Your bribe has succeeded!";
        String result = instance.calculateBribeMessage(bribeResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateMessage2() {
        System.out.println("calculateBribeMessage Test 2");
        boolean bribeResult = false;
        ObjectiveControl instance = new ObjectiveControl();
        String expResult = "We're sorry. Your bribe failed.";
        String result = instance.calculateBribeMessage(bribeResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
