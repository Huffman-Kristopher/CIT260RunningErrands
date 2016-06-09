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
public class ObjectiveItemTest {
    
    public ObjectiveItemTest() {
    }

    /**
     * Test of getQuantityNeeded method, of class ObjectiveItem.
     */
    @Test
    public void testGetQuantityNeeded() {
        System.out.println("getQuantityNeeded");
        ObjectiveItem instance = new ObjectiveItem();
        double expResult = 0.0;
        double result = instance.getQuantityNeeded();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantityNeeded method, of class ObjectiveItem.
     */
    @Test
    public void testSetQuantityNeeded() {
        System.out.println("setQuantityNeeded");
        double quantityNeeded = 0.0;
        ObjectiveItem instance = new ObjectiveItem();
        instance.setQuantityNeeded(quantityNeeded);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ObjectiveItem.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ObjectiveItem instance = new ObjectiveItem();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ObjectiveItem.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ObjectiveItem instance = new ObjectiveItem();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ObjectiveItem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ObjectiveItem instance = new ObjectiveItem();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
