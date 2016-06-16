/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;
import cit260.runningerrands.model.Investment;
import cit260.runningerrands.model.Persona;
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
        Investment investment = new Investment();
        persona.setGender(gender);
        persona.setPersonaName(personaName);
        persona.setCareer(career);
        persona.setAge(personaAge);
        persona.setHealth(characterHealth);
        persona.setMoney(500);
        RunningErrands.setPersona(persona); // Save the character
        RunningErrands.setInvestment(investment);
        return persona;
    }

    public static int updatePersonaMoney(int depositAmount) {
        
        Persona persona = RunningErrands.getPersona();
        int currentBalance = persona.getMoney();
        int newBalance = (depositAmount + currentBalance);
        persona.setMoney(newBalance);
        int updatedBalance = persona.getMoney();
        return updatedBalance;
    }


}
