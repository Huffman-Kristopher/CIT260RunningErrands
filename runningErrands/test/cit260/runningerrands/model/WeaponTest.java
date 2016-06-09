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
public class WeaponTest {
    
    public WeaponTest() {
    }

    /**
     * Test of getWeaponStrength method, of class Weapon.
     */
    @Test
    public void testGetWeaponStrength() {
        System.out.println("getWeaponStrength");
        Weapon instance = new Weapon();
        String expResult = "";
        String result = instance.getWeaponStrength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeaponStrength method, of class Weapon.
     */
    @Test
    public void testSetWeaponStrength() {
        System.out.println("setWeaponStrength");
        String weaponStrength = "";
        Weapon instance = new Weapon();
        instance.setWeaponStrength(weaponStrength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Weapon.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Weapon instance = new Weapon();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Weapon.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Weapon instance = new Weapon();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Weapon.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Weapon instance = new Weapon();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
