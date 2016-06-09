/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Persona;
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
     * Test of createPersona method, of class CharacterControl.
     */
    @Test
    public void testCreatePersona() {
        System.out.println("createPersona");
        String personaName = "";
        char gender = ' ';
        String career = "";
        int personaAge = 0;
        Persona expResult = null;
        Persona result = CharacterControl.createPersona(personaName, gender, career, personaAge);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePersonaMoney method, of class CharacterControl.
     */
    @Test
    public void testUpdatePersonaMoney() {
        System.out.println("updatePersonaMoney");
        int depositAmount = 0;
        int expResult = 0;
        int result = CharacterControl.updatePersonaMoney(depositAmount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
