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
public class MapTest {
    
    public MapTest() {
    }

    /**
     * Test of getRowCount method, of class Map.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        Map instance = new Map();
        double expResult = 0.0;
        double result = instance.getRowCount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRowCount method, of class Map.
     */
    @Test
    public void testSetRowCount() {
        System.out.println("setRowCount");
        double rowCount = 0.0;
        Map instance = new Map();
        instance.setRowCount(rowCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class Map.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        Map instance = new Map();
        double expResult = 0.0;
        double result = instance.getColumnCount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumnCount method, of class Map.
     */
    @Test
    public void testSetColumnCount() {
        System.out.println("setColumnCount");
        double columnCount = 0.0;
        Map instance = new Map();
        instance.setColumnCount(columnCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Map.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Map instance = new Map();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Map.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Map instance = new Map();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Map.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Map instance = new Map();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
