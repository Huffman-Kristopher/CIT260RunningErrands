/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;
import cit260.runningerrands.model.Investment;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Npc;
import cit260.runningerrands.model.Persona;
import cit260.runningerrands.model.Scene;
import java.util.concurrent.ThreadLocalRandom;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class PersonaControl {

           
    public static void createPersona(char gender) {
        
        Persona persona = new Persona();
        Investment investment = new Investment();
        persona.setGender(gender);
        persona.setDay(1);
        persona.setGambledToday(false);
        RunningErrands.setPersona(persona); // Save the character
        RunningErrands.setInvestment(investment); // Save the investment
        Item[] inventoryList = ItemControl.createInventoryList();
        Scene[] scene = MapControl.assignItemToDeliver();
        persona.setItem(inventoryList);
        Npc[] npcs = NPCControl.createNPCList();
        RunningErrands.setNpc(npcs);

    }
    
    public static void setPersonaCareer (String career) {
        
        Persona persona = RunningErrands.getPersona();
        persona.setCareer(career);
        int salary = 0;
        switch (career) {
            case "Janitor": //open map.
                salary = 300;
                break;
            case "Mail Clerk": //open map.
                salary = 500;
                break;
            case "Pizza Deliverer": //open map.
                salary = 250;
                break;
            case "Auto Mechanic": //open map.
                salary = 800;
                break;
            case "Secretary": //open map.
                salary = 600;
                break;
            case "Nurse": //open map.
                salary = 1000;
                break;
            case "Hair Dresser": //open map.
                salary = 400;
                break;
            case "Teacher": //open map.
                salary = 450;
                break;
            case "CEO"://
                salary = 1000000;
                break;
            case "Megastar"://
                salary = 2000000;
                break;
        }
        persona.setSalary(salary);
        int money = salary / 2;
        persona.setMoney(money);
        RunningErrands.setPersona(persona); // Save the character
        
    }

    public static void setPersonaAge (int age) {
        
        Persona persona = RunningErrands.getPersona();
        persona.setAge(age);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 9);
        int personaHealth = (age * 3) + randomNumber;
        persona.setHealth(personaHealth);
        RunningErrands.setPersona(persona); // Save the character
    }
    
    public static void setPersonaName (String name) {
        
        Persona persona = RunningErrands.getPersona();
        persona.setPersonaName(name);
        RunningErrands.setPersona(persona); // Save the character
        
    }
    
    public static int updatePersonaMoney(int depositAmount) {
        
        Persona persona = RunningErrands.getPersona();
        int currentBalance = persona.getMoney();
        int newBalance = (depositAmount + currentBalance);
        persona.setMoney(newBalance);
        int updatedBalance = persona.getMoney();
        RunningErrands.setPersona(persona);
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
        persona.setGambledToday(false);
        if (investmentMatureDay == newDay ) {
            personaCurrentMoney = persona.getMoney();
            personaNewMoney = personaCurrentMoney + investmentReturn;
            persona.setMoney(personaNewMoney);
            investment = new Investment();
            RunningErrands.setInvestment(investment);
        }
        MapControl.movePersonaToNewLocation("01");
    }
}
