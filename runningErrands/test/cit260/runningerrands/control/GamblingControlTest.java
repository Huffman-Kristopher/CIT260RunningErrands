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
public class GamblingControlTest {
    
    public GamblingControlTest() {
    }

    /**
     * Test of calculateWiningNumber method, of class GamblingControl.
     */
    @Test
    public void testCalculateWiningNumber() {
        System.out.println("calculateWiningNumber");
        int bet = 0;
        int numberPick = 0;
        int expResult = 0;
        int result = GamblingControl.calculateWiningNumber(bet, numberPick);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePayout method, of class GamblingControl.
     */
    @Test
    public void testCalculatePayout() {
        System.out.println("calculatePayout");
        int bet = 0;
        int numberPick = 0;
        int winningNumber = 0;
        int expResult = 0;
        int result = GamblingControl.calculatePayout(bet, numberPick, winningNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateMessage method, of class GamblingControl.
     */
    @Test
    public void testCalculateMessage() {
        System.out.println("calculateMessage");
        int payout = 0;
        GamblingControl instance = new GamblingControl();
        String expResult = "";
        String result = instance.calculateMessage(payout);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
