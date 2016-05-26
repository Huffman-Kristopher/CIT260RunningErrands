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
        System.out.println("calculateInvestmentReturn Test 1");
        int investmentType = 5;
        double investmentAmount = 500.0;
        double days = 6.0;
        InvestmentControl instance = new InvestmentControl();
        int expResult = -1;
        int result = instance.calculateInvestmentReturn(investmentType, investmentAmount, days);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateInvestmentReturn2() {
        System.out.println("calculateInvestmentReturn Test 2");
        int investmentType = 1;
        double investmentAmount = 50.0;
        double days = 6.0;
        InvestmentControl instance = new InvestmentControl();
        int expResult = -1;
        int result = instance.calculateInvestmentReturn(investmentType, investmentAmount, days);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateInvestmentReturn3() {
        System.out.println("calculateInvestmentReturn Test 3");
        int investmentType = 1;
        double investmentAmount = 9999990.0;
        double days = 6.0;
        InvestmentControl instance = new InvestmentControl();
        int expResult = -1;
        int result = instance.calculateInvestmentReturn(investmentType, investmentAmount, days);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateInvestmentReturn4() {
        System.out.println("calculateInvestmentReturn Test 4");
        int investmentType = 3;
        double investmentAmount = 1000.0;
        double days = 6.0;
        InvestmentControl instance = new InvestmentControl();
        int expResult = -1;
        int result = instance.calculateInvestmentReturn(investmentType, investmentAmount, days);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateInvestmentReturn5() {
        System.out.println("calculateInvestmentReturn Test 5");
        int investmentType = 2;
        double investmentAmount = 250.0;
        double days = 6.0;
        InvestmentControl instance = new InvestmentControl();
        int expResult = -1;
        int result = instance.calculateInvestmentReturn(investmentType, investmentAmount, days);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
    @Test
        public void testCalculateInvestmentReturn6() {
        System.out.println("calculateInvestmentReturn Test 6");
        int investmentType = 1;
        double investmentAmount = 250.0;
        double days = 6.0;
        InvestmentControl instance = new InvestmentControl();
        int expResult = 282;
        int result = instance.calculateInvestmentReturn(investmentType, investmentAmount, days);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    /**
     * Test of calculateMessage method, of class InvestmentControl.
     */
    @Test
    public void testCalculateMessage() {
        System.out.println("calculateInvestReturnMessage Test 1");
        int investmentReturn = 5000;
        InvestmentControl instance = new InvestmentControl();
        String expResult = "Congratulations! You earned 5000!";
        String result = instance.calculateInvestReturnMessage(investmentReturn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateMessage2() {
        System.out.println("calculateInvestReturnMessage Test 2");
        int investmentReturn = 6000001;
        InvestmentControl instance = new InvestmentControl();
        String expResult = "Congratulations! You broke the bank! You earned 6000001!";
        String result = instance.calculateInvestReturnMessage(investmentReturn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
