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
public class ItemTest {
    
    public ItemTest() {
    }

    /**
     * Test of getItemName method, of class Item.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        Item instance = new Item();
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemName method, of class Item.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String itemName = "";
        Item instance = new Item();
        instance.setItemName(itemName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemType method, of class Item.
     */
    @Test
    public void testGetItemType() {
        System.out.println("getItemType");
        Item instance = new Item();
        String expResult = "";
        String result = instance.getItemType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemType method, of class Item.
     */
    @Test
    public void testSetItemType() {
        System.out.println("setItemType");
        String itemType = "";
        Item instance = new Item();
        instance.setItemType(itemType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemQuantity method, of class Item.
     */
    @Test
    public void testGetItemQuantity() {
        System.out.println("getItemQuantity");
        Item instance = new Item();
        double expResult = 0.0;
        double result = instance.getItemQuantity();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemQuantity method, of class Item.
     */
    @Test
    public void testSetItemQuantity() {
        System.out.println("setItemQuantity");
        double itemQuantity = 0.0;
        Item instance = new Item();
        instance.setItemQuantity(itemQuantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Item.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Item instance = new Item();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Item.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Item instance = new Item();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Item.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Item instance = new Item();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
