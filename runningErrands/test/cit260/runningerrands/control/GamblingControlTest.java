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
     * Test of calculateWinLoss method, of class GamblingControl.
     */
    @Test
    public void testCalculateWinLoss() {
        //Test Case 1
        System.out.println("calculateWinLoss Test 1");
        int bet = 500;
        int numberPick = 12345;
        GamblingControl instance = new GamblingControl();
        int expResult = 12346;
        int result = instance.calculateWinLoss(bet, numberPick);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateWinLoss2() {
        //Test Case 2
        System.out.println("calculateWinLoss Test 2");
        int bet = -500;
        int numberPick = 12345;
        GamblingControl instance = new GamblingControl();
        int expResult = 12345;
        int result = instance.calculateWinLoss(bet, numberPick);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
        public void testCalculateWinLoss3() {
        //Test Case 2
        System.out.println("calculateWinLoss Test 3");
        int bet = -500;
        int numberPick = 999999;
        GamblingControl instance = new GamblingControl();
        int expResult = -1;
        int result = instance.calculateWinLoss(bet, numberPick);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePayout method, of class GamblingControl.
     */
    @Test
    public void testCalculatePayout() {
        System.out.println("calculatePayout Test 1");
        int bet = -500;
        int numberPick = 55555;
        int winningNumber = 55555;
        GamblingControl instance = new GamblingControl();
        int expResult = 1000;
        int result = instance.calculatePayout(bet, numberPick, winningNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculatePayout2() {
        System.out.println("calculatePayout Test 2");
        int bet = -500;
        int numberPick = 55555;
        int winningNumber = 55556;
        GamblingControl instance = new GamblingControl();
        int expResult = 0;
        int result = instance.calculatePayout(bet, numberPick, winningNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculateMessage method, of class GamblingControl.
     */
    @Test
    public void testCalculateMessage() {
        System.out.println("calculateMessage Test 1");
        int payout = 500;
        GamblingControl instance = new GamblingControl();
        String expResult = "Congratulations! You won 500!";
        String result = instance.calculateMessage(payout);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
        public void testCalculateMessage2() {
        System.out.println("calculateMessage Test 2");
        int payout = 0;
        GamblingControl instance = new GamblingControl();
        String expResult = "Congratulations! You lost! You did not win any money!";
        String result = instance.calculateMessage(payout);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
