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
public class OccupationTest {
    
    public OccupationTest() {
    }

    /**
     * Test of getSalary method, of class Occupation.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Occupation instance = new Occupation();
        double expResult = 0.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalary method, of class Occupation.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        double salary = 0.0;
        Occupation instance = new Occupation();
        instance.setSalary(salary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOccupationName method, of class Occupation.
     */
    @Test
    public void testGetOccupationName() {
        System.out.println("getOccupationName");
        Occupation instance = new Occupation();
        String expResult = "";
        String result = instance.getOccupationName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOccupationName method, of class Occupation.
     */
    @Test
    public void testSetOccupationName() {
        System.out.println("setOccupationName");
        String occupationName = "";
        Occupation instance = new Occupation();
        instance.setOccupationName(occupationName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Occupation.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Occupation instance = new Occupation();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Occupation.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Occupation instance = new Occupation();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Occupation.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Occupation instance = new Occupation();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
