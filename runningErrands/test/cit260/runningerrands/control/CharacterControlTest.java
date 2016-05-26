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
public class CharacterControlTest {
    
    public CharacterControlTest() {
    }

    /**
     * Test of calculatehealth method, of class CharacterControl.
     */
    @Test
    public void testCalculatehealth() {
        System.out.println("calculatehealth");
        int age = -1;
        CharacterControl instance = new CharacterControl();
        int expResult = -1;
        int result = instance.calculatehealth(age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculatehealth2() {
        System.out.println("calculatehealth Test 2");
        int age = 121;
        CharacterControl instance = new CharacterControl();
        int expResult = -1;
        int result = instance.calculatehealth(age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculatehealth3() {
        System.out.println("calculatehealth Test 3 - MAY FAIL DUE TO RANDOM");
        int age = 25;
        CharacterControl instance = new CharacterControl();
        int expResult = 80;
        int result = instance.calculatehealth(age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
