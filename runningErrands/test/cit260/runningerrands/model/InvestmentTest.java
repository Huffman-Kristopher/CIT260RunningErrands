/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reddo
 */
public class InvestmentTest {
    
    public InvestmentTest() {
    }

    /**
     * Test of getInvestAmount method, of class Investment.
     */
    @Test
    public void testGetInvestAmount() {
        System.out.println("getInvestAmount");
        Investment instance = new Investment();
        double expResult = 0.0;
        double result = instance.getInvestAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInvestAmount method, of class Investment.
     */
    @Test
    public void testSetInvestAmount() {
        System.out.println("setInvestAmount");
        double investAmount = 0.0;
        Investment instance = new Investment();
        instance.setInvestAmount(investAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInvestPayout method, of class Investment.
     */
    @Test
    public void testGetInvestPayout() {
        System.out.println("getInvestPayout");
        Investment instance = new Investment();
        double expResult = 0.0;
        double result = instance.getInvestPayout();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInvestPayout method, of class Investment.
     */
    @Test
    public void testSetInvestPayout() {
        System.out.println("setInvestPayout");
        double investPayout = 0.0;
        Investment instance = new Investment();
        instance.setInvestPayout(investPayout);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInvestType method, of class Investment.
     */
    @Test
    public void testGetInvestType() {
        System.out.println("getInvestType");
        Investment instance = new Investment();
        String expResult = "";
        String result = instance.getInvestType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInvestType method, of class Investment.
     */
    @Test
    public void testSetInvestType() {
        System.out.println("setInvestType");
        String investType = "";
        Investment instance = new Investment();
        instance.setInvestType(investType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApr method, of class Investment.
     */
    @Test
    public void testGetApr() {
        System.out.println("getApr");
        Investment instance = new Investment();
        double expResult = 0.0;
        double result = instance.getApr();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApr method, of class Investment.
     */
    @Test
    public void testSetApr() {
        System.out.println("setApr");
        double apr = 0.0;
        Investment instance = new Investment();
        instance.setApr(apr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Investment.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Investment instance = new Investment();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Investment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Investment instance = new Investment();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
