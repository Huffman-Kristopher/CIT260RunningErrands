/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.PersonaControl;
import cit260.runningerrands.control.GamblingControl;
import cit260.runningerrands.model.Gambling;
import cit260.runningerrands.model.Persona;
import exceptions.GamblingControlExceptions;
import exceptions.PersonaControlExceptions;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman And Kirk Brown
 */

public class GamblingNumbersMenuView extends View {
    int betAmount = 0;
    private int winningNumber;
    private int winningsTotal;

    private int getMaxBet() {
        Persona persona = RunningErrands.getPersona();
        int maxBet = (persona.getMoney() / 2);
        return maxBet;
    }

    public GamblingNumbersMenuView() {
        
        super("\n"
              + "\n------------------------------------"
              + "\n| Gambling Den                      |" 
              + "\n------------------------------------"
              + "\nPlease enter a number from 0 to 99999 or press 'R' to return to main menu: ");

        }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "R": //create a stock investment.
                this.openGameMenu();
                break;
            default:
                try{
               int betNumbers = Integer.parseInt(value);
                
                Gambling gambling = RunningErrands.getGambling();
                if (betNumbers <1 || betNumbers > 99999 ) {
                    System.out.println("\nPlease enter a bet between 1 and 99999");
                }
                else {
                    GamblingControl.setBetNumbers(betNumbers);
                    int betAmount = gambling.getBetAmount();
                    betNumbers = gambling.getBetNumbers();
                    this.calculatePayout();
                }
                break;
                }catch (NumberFormatException nf){
                    System.out.println("Please enter a numeric value or R to return to the game menu.");
                }
        }
        return false;
    }    
    

    private void calculatePayout() {
        
        Gambling gambling = RunningErrands.getGambling();
        try{
            int winningNumber = GamblingControl.calculateWiningNumber();
        
         int winningsTotal = GamblingControl.calculatePayout(winningNumber);
        
        int updatedBalance = PersonaControl.updatePersonaMoney(winningsTotal);
        
        if (winningsTotal < 0) {
            System.out.println("\nThe winning number was " + winningNumber + "."
                    +"\nWe're sorry! You lost $" + winningsTotal * (-1) + ". Your new balance is $" + updatedBalance + ".");
        }
        else {
            System.out.println("\nThe winning number was " + winningNumber + "."
                    +"\nYou won $" + winningsTotal + ". Your new balance is $" + updatedBalance + ".");
        }
        } catch (GamblingControlExceptions error) {
            System.out.println(error.getMessage());
        }
        this.openGameMenu();
    }

    private void openGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
    
}


