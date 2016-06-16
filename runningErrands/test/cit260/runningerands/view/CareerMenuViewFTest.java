/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reddo
 */
public class CareerMenuViewFTest {
    
    public CareerMenuViewFTest() {
    }

    /**
     * Test of doAction method, of class CareerMenuViewF.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String choice = "";
        CareerMenuViewF instance = new CareerMenuViewF();
        boolean expResult = false;
        boolean result = instance.doAction(choice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
