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
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateBribeMessage method, of class ObjectiveControl.
     */
    @Test
    public void testCalculateBribeMessage() {
        System.out.println("calculateBribeMessage");
        boolean bribeResult = false;
        ObjectiveControl instance = new ObjectiveControl();
        String expResult = "";
        String result = instance.calculateBribeMessage(bribeResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
