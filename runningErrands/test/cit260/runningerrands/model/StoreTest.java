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
public class StoreTest {
    
    public StoreTest() {
    }

    /**
     * Test of getItemType method, of class Store.
     */
    @Test
    public void testGetItemType() {
        System.out.println("getItemType");
        Store instance = new Store();
        String expResult = "";
        String result = instance.getItemType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemType method, of class Store.
     */
    @Test
    public void testSetItemType() {
        System.out.println("setItemType");
        String itemType = "";
        Store instance = new Store();
        instance.setItemType(itemType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemName method, of class Store.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        Store instance = new Store();
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemName method, of class Store.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String itemName = "";
        Store instance = new Store();
        instance.setItemName(itemName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCost method, of class Store.
     */
    @Test
    public void testGetItemCost() {
        System.out.println("getItemCost");
        Store instance = new Store();
        double expResult = 0.0;
        double result = instance.getItemCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemCost method, of class Store.
     */
    @Test
    public void testSetItemCost() {
        System.out.println("setItemCost");
        double itemCost = 0.0;
        Store instance = new Store();
        instance.setItemCost(itemCost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderFillTime method, of class Store.
     */
    @Test
    public void testGetOrderFillTime() {
        System.out.println("getOrderFillTime");
        Store instance = new Store();
        double expResult = 0.0;
        double result = instance.getOrderFillTime();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderFillTime method, of class Store.
     */
    @Test
    public void testSetOrderFillTime() {
        System.out.println("setOrderFillTime");
        double orderFillTime = 0.0;
        Store instance = new Store();
        instance.setOrderFillTime(orderFillTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemQuantityAvl method, of class Store.
     */
    @Test
    public void testGetItemQuantityAvl() {
        System.out.println("getItemQuantityAvl");
        Store instance = new Store();
        double expResult = 0.0;
        double result = instance.getItemQuantityAvl();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemQuantityAvl method, of class Store.
     */
    @Test
    public void testSetItemQuantityAvl() {
        System.out.println("setItemQuantityAvl");
        double itemQuantityAvl = 0.0;
        Store instance = new Store();
        instance.setItemQuantityAvl(itemQuantityAvl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Store.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Store instance = new Store();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Store.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Store instance = new Store();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Store.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Store instance = new Store();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
