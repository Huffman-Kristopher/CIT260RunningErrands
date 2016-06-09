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
    public void testCalculateInvestmentReturn() {
        System.out.println("calculateInvestmentReturn");
        int investmentType = 0;
        int investmentAmount = 0;
        int days = 0;
        InvestmentControl instance = new InvestmentControl();
        int expResult = 0;
        int result = instance.calculateInvestmentReturn(investmentType, investmentAmount, days);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateInvestReturnMessage method, of class InvestmentControl.
     */
    @Test
    public void testCalculateInvestReturnMessage() {
        System.out.println("calculateInvestReturnMessage");
        int investmentReturn = 0;
        InvestmentControl instance = new InvestmentControl();
        String expResult = "";
        String result = instance.calculateInvestReturnMessage(investmentReturn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
