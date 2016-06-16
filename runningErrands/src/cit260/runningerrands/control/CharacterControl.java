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

           
    public static Persona createPersona(String personaName, char gender, String career, int personaAge, int salary) {
        
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 9);
        int characterHealth = (personaAge * 3) + randomNumber;      
        
        Persona persona = new Persona();
        Investment investment = new Investment();
        persona.setGender(gender);
        persona.setPersonaName(personaName);
        persona.setCareer(career);
        persona.setAge(personaAge);
        persona.setHealth(characterHealth);
        persona.setSalary(salary);
        persona.setMoney(salary);
        persona.setDay(1);
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

    public static void addOneDay() {
        Persona persona = RunningErrands.getPersona();
        Investment investment = RunningErrands.getInvestment();
        int currentDay = persona.getDay();
        int newDay = currentDay + 1;
        persona.setDay(newDay);
        int investmentReturn = investment.getInvestReturn();
        int investmentMatureDay = investment.getInvestMatureDay();
        int personaCurrentMoney = persona.getMoney();
        int personaSalary = persona.getSalary();
        int personaNewMoney = personaCurrentMoney + personaSalary;
        persona.setMoney(personaNewMoney);
        if (investmentMatureDay == newDay ) {
            personaCurrentMoney = persona.getMoney();
            personaNewMoney = personaCurrentMoney + investmentReturn;
            persona.setMoney(personaNewMoney);
            investment = new Investment();
            RunningErrands.setInvestment(investment);
        }
    }
}
