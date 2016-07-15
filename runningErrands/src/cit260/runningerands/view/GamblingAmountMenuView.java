/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.GamblingControl;
import cit260.runningerrands.model.Gambling;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman And Kirk Brown
 */

public class GamblingAmountMenuView extends View {

    public GamblingAmountMenuView(String menu) {
        super(menu);
    }
    
    public String GamblingMenuValues() {
        String menu = "";
        Persona persona = RunningErrands.getPersona();
        boolean gambledToday = persona.isGambledToday();
        if (gambledToday == false) {
            menu = ("\n"
              + "\n------------------------------------"
              + "\n| Gambling Den                      |" 
              + "\n------------------------------------"
              + "\nPlease enter a bet amount or press 'R' to return to main menu: ");
        }
        else {
            this.console.println("\nYou have already gambled today. Please return tomorrow.");
            this.openSceneMenu();
        }
        
        GamblingAmountMenuView gamblingAmountMenuView = new GamblingAmountMenuView(menu);
        gamblingAmountMenuView.display();
        return menu;
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "R": //create a stock investment.
                this.openSceneMenu();
                return true;
            default:
                try {
                    int betAmount = Integer.parseInt(value);
                    Gambling gambling = RunningErrands.getGambling();
                    Persona persona = RunningErrands.getPersona();
                    int maxBet = persona.getMoney() - 1 ;
                    if (betAmount == 0 || betAmount > maxBet) {
                        this.console.println("\nPlease enter a bet between 1 and " + maxBet);
                        return false;
                    }
                    else {
                        gambling = GamblingControl.createBet(betAmount);
                        this.openGamblingNumbersMenuView();
                        return true;
                    }
                }
                catch (NumberFormatException nf) {
                    ErrorView.display(this.getClass().getName()," Please enter a numeric bet or R to return to the game menu.");
                    return false;
                }
        }
        
    }    

    private void openGamblingNumbersMenuView() {
        GamblingNumbersMenuView gamblingNumbersMenuView = new GamblingNumbersMenuView();
        gamblingNumbersMenuView.display();
    }
    private void openSceneMenu() {
        String menu = "";
        SceneMenuView sceneMenuView = new SceneMenuView(menu);
        sceneMenuView.SceneMenuValues();
    }
    
}


