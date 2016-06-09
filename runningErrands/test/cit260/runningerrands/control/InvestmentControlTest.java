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
public class InvestmentControlTest {
    
    public InvestmentControlTest() {
    }

    /**
     * Test of calculateInvestmentReturn method, of class InvestmentControl.
     */
    @Test
    public void testCalculateInvestmentReturn1() {
        System.out.println("calculateInvestmentReturn");
        int investmentType = 1;
        int investmentAmount = 1000;
        int days = 1;
        InvestmentControl instance = new InvestmentControl();
        int expResult = 1020;
        int result = instance.calculateInvestmentReturn(investmentType, investmentAmount, days);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
public void testCalculateInvestmentReturn2() {
        System.out.println("calculateInvestmentReturn");
        int investmentType = 1;
        int investmentAmount = -2000;
        int days = 1;
        InvestmentControl instance = new InvestmentControl();
        int expResult = -1;
        int result = instance.calculateInvestmentReturn(investmentType, investmentAmount, days);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
public void testCalculateInvestmentReturn3() {
        System.out.println("calculateInvestmentReturn");
        int investmentType = A;
        int investmentAmount = 1000;
        int days = 29;
        InvestmentControl instance = new InvestmentControl();
        int expResult = -1;
        int result = instance.calculateInvestmentReturn(investmentType, investmentAmount, days);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of calculateInvestReturnMessage method, of class InvestmentControl.
     */
    @Test
    public void testCalculateInvestReturnMessage1() {
        System.out.println("calculateInvestReturnMessage");
        int investmentReturn = 1020;
        InvestmentControl instance = new InvestmentControl();
        String expResult = "Your investment has matured! You earned 1020!";
        String result = instance.calculateInvestReturnMessage(investmentReturn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testCalculateInvestReturnMessage2() {
        System.out.println("calculateInvestReturnMessage");
        int investmentReturn = -1;
        InvestmentControl instance = new InvestmentControl();
        String expResult = "Invalid investment amount!";
        String result = instance.calculateInvestReturnMessage(investmentReturn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testCalculateInvestReturnMessage3() {
        System.out.println("calculateInvestReturnMessage");
        int investmentReturn = 1020;
        InvestmentControl instance = new InvestmentControl();
        String expResult = "Invalid investment type!";
        String result = instance.calculateInvestReturnMessage(investmentReturn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
