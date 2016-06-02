/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;
import cit260.runningerrands.model.Persona;
import cit260.runningerrands.model.Player;
import java.util.concurrent.ThreadLocalRandom;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class CharacterControl {

           
    public static Persona createPersona(String personaName, char gender, String career, int personaAge) {
        
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 9);
        int characterHealth = (personaAge * 3) + randomNumber;      
        
        Persona persona = new Persona();
        persona.setGender(gender);
        persona.setPersonaName(personaName);
        persona.setCareer(career);
        persona.setAge(personaAge);
        persona.setHealth(characterHealth);
        RunningErrands.setPersona(persona); // Save the character
        return persona;
    }
}
