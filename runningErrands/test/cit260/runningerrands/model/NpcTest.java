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
public class NpcTest {
    
    public NpcTest() {
    }

    /**
     * Test of getNpcName method, of class Npc.
     */
    @Test
    public void testGetNpcName() {
        System.out.println("getNpcName");
        Npc instance = new Npc();
        String expResult = "";
        String result = instance.getNpcName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNpcName method, of class Npc.
     */
    @Test
    public void testSetNpcName() {
        System.out.println("setNpcName");
        String npcName = "";
        Npc instance = new Npc();
        instance.setNpcName(npcName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Npc.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Npc instance = new Npc();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Npc.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String Type = "";
        Npc instance = new Npc();
        instance.setType(Type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Npc.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Npc instance = new Npc();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Npc.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Npc instance = new Npc();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Npc.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Npc instance = new Npc();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
