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
 * @author reddo
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
              + "\nPlease enter a bet amount or press 'R' to return to main menu: ");;
        }
        else {
            System.out.println("\nYou have already gambled today. Please return tomorrow.");
            this.openGameMenu();
        }
        
        GamblingAmountMenuView gamblingAmountMenuView = new GamblingAmountMenuView(menu);
        gamblingAmountMenuView.display();
        return menu;
    }

    @Override
    public boolean doAction(String value) {
        
        switch (value) {
            case "R": //create a stock investment.
                this.openGameMenu();
                break;
            default:
                int betAmount = Integer.parseInt(value);
                Gambling gambling = RunningErrands.getGambling();
                Persona persona = RunningErrands.getPersona();
                int maxBet = persona.getMoney() - 1 ;
                if (betAmount == 0 || betAmount > maxBet) {
                    System.out.println("\nPlease enter a bet between 1 and " + maxBet);
                }
                else {
                    gambling = GamblingControl.createBet(betAmount);
                    this.openGamblingNumbersMenuView();
                }
                break;
        }
        return false;
    }    

    private void openGamblingNumbersMenuView() {
        GamblingNumbersMenuView gamblingNumbersMenuView = new GamblingNumbersMenuView();
        gamblingNumbersMenuView.display();
    }
    private void openGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
    
}


