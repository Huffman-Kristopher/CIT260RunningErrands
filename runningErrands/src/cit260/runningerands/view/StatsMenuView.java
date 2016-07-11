/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.model.Investment;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Persona;
import java.text.NumberFormat;
import java.util.Locale;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */

public class StatsMenuView extends View {
            
    public StatsMenuView(String menu) {
        super(menu);
    }
    
    public String StatsValues() {
        Persona persona = RunningErrands.getPersona();
        Investment investment = RunningErrands.getInvestment();
        String personaName = persona.getPersonaName();
        String personaCareer = persona.getCareer();
        int personaAge = persona.getAge();
        int personaHealth = persona.getHealth();
        int personaMoney = persona.getMoney();
        int investmentReturn = investment.getInvestReturn();
        int investmentMaturityDay = investment.getInvestMatureDay();
        int currentDay = persona.getDay();
        int investDaysToMature = investmentMaturityDay - currentDay;
        int personaSalary = persona.getSalary();
        String money = NumberFormat.getNumberInstance(Locale.US).format(personaMoney);
        String salary = NumberFormat.getNumberInstance(Locale.US).format(personaSalary);
        String investmentMessage;
        String itemList = this.viewInventory();
        String weaponItemDescription = persona.getWeaponItem().getDescription();
        int weaponItemStrength = persona.getWeaponItem().getStrength();
        if (investmentReturn == 0) {
            investmentMessage = "\nYou do not currently have any investments pending.";
        }
        else {
            investmentMessage = "\nYour investment will return $" + investmentReturn + " in " + investDaysToMature + " days.";
        }
        String menu = ("\n"
                  + "\n------------------------------------"
                  + "\n| Character Stats                   |" 
                  + "\n------------------------------------"
                  + "\nName: " + personaName 
                  + "\nAge: " + personaAge
                  + "\nHealth: " + personaHealth
                  + "\nCareer: " + personaCareer
                  + "\nSalary: $" + salary
                  + "\nCurrent Balance: $" + money
                  + investmentMessage
                  + itemList
                  + "\nCurrent Weapon: " + weaponItemDescription
                  + "\nWeapon Strength: " + weaponItemStrength
                  + "\n-------------------------"
                  + "\nR - Return to main menu");
        StatsMenuView StatsMenuView = new StatsMenuView(menu);
        StatsMenuView.display();
        return menu;
    }
    
        private String viewInventory() {
        
        StringBuilder line;
        Persona persona = RunningErrands.getPersona();
        Item[] inventory = persona.getItem();
        
        String itemList = "\n \n      LIST OF INVENTORY ITEMS";
        line = new StringBuilder("                              ");
        line.insert(0, "Description");
        line.insert(20, "Required");
        line.insert(30, "In Stock");
        itemList = itemList + "\n" + line.toString();
        
        for (Item item : inventory) {
            
            if(item.getItemQuantity() > 0) {
            line= new StringBuilder("                              ");
            line.insert(0,item.getDescription());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getItemQuantity());
            
            itemList = itemList + "\n" + line.toString();
            }
            else {
                
                /* Do nothing*/
            }
        }
        
        return itemList;
        
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "R": //return to main menu.
                return true;
            default:
               ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please enter R to return to menu");
                return false;
        }

}

    private void openGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}
