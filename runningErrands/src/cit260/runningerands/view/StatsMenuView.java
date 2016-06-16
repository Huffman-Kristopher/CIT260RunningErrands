/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.model.Investment;
import cit260.runningerrands.model.Persona;
import java.util.Scanner;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class StatsMenuView extends View {
    Persona persona = RunningErrands.getPersona();
    Investment investment = RunningErrands.getInvestment();
    String personaName = persona.getPersonaName();
    String personaCareer = persona.getCareer();
    int personaAge = persona.getAge();
    int personaHealth = persona.getHealth();
    int personaMoney = persona.getMoney();
    int investmentReturn = investment.getInvestReturn();
    int investmentDays = investment.getInvestDays();


        
    public StatsMenuView(String menu) {
        super(menu);
    }
    
    public String StatsValues() {
        String menu = ("\n"
                  + "\n------------------------------------"
                  + "\n| Character Stats                   |" 
                  + "\n------------------------------------"
                  + "\nCharacter Name: " + personaName 
                  + "\nCharacter Age: " + personaAge
                  + "\nCharacter Health: " + personaHealth
                  + "\nChosen Career: " + personaCareer
                  + "\nCurrent Balance: " + personaMoney
                  + "\nYour investment will return " + investmentReturn + " dollars in " + investmentDays + " days"
                  + "\n-------------------------"
                  + "\nB - Back to main menu");
        StatsMenuView StatsMenuView = new StatsMenuView(menu);
        StatsMenuView.display();
        return menu;
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "B": //return to main menu.
                this.openGameMenu();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;

}

    private void openGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}
