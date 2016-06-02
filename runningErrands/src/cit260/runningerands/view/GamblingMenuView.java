/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.CharacterControl;
import cit260.runningerrands.control.GamblingControl;
import cit260.runningerrands.model.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;
import runningerrands.RunningErrands;

/**
 *
 * @author reddo
 */
class GamblingMenuView {
    int betAmount = 0;
    private String betAmountMenu;
    private String betNumbersMenu;
    private int winningNumber;
    private int winningsTotal;

    private int getMaxBet() {
        Persona persona = RunningErrands.getPersona();
        int maxBet = (persona.getMoney() / 2);
        return maxBet;
    }

    

    GamblingMenuView() {
        
        this.betAmountMenu = "\n"
              + "\n------------------------------------"
              + "\n| Gambling Den                      |" 
              + "\n------------------------------------"
              + "\nPlease enter an amount you'd like to bet: ";
        
        this.betNumbersMenu = "\n"
              + "\n------------------------------------"
              + "\n| Gambling Den                      |" 
              + "\n------------------------------------"
              + "\nPlease enter a number from 0 to 99999: ";
        }
    
        
    
    void displayGamblingMenuView() {
        boolean done = false; // Set flag to not done
        do {
            //Prompt for and get the character's career
                        int betAmount = this.getBetAmount();
            int betNumbers = this.getBetNumbers();
            //System.out.println("\nMenu Choice here is " + menuOption);
            //do the action and display the next view
            winningNumber = this.doAction(betAmount, betNumbers);
            winningsTotal = this.calculatePayout(betAmount, betNumbers, winningNumber);
            done = true;
        } while (!done);
    }
    
    

    private int getBetAmount() {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        int value = 0;
        boolean valid = false;
        
        while (!valid) { //loop while not valid
            try {
                System.out.println("\n" + this.betAmountMenu);
                value = keyboard.nextInt(); //Get the next line typed on the keyboard
                if (value < -99999 || value > 99999 || value > getMaxBet()) { //value is blank
                System.out.println("\nBet amount is outside the accepted range. Amount must be less than one half of your money, or 100,000, whichever is smaller.");
                continue;
                }
            }
            catch (InputMismatchException exception) 
            {
            System.out.println("This is not an integer");
            value = this.getBetAmount();
            }
            break; // end the loop
        }
        
        return value; // returns the value entered
    }

    private int getBetNumbers() {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        int value = 0;
        boolean valid = false;
        
        while (!valid) { //loop while not valid
            try {
                System.out.println("\n" + this.betNumbersMenu);
                value = 0;
                value = keyboard.nextInt(); //Get the next line typed on the keyboard
                if (value < -99999 || value > 99999 || value == 0) { //value is blank
                System.out.println("\nBet amount is outside the accepted range. Amount must be less than 100,000.");
                continue;
                }
            }
            catch (InputMismatchException exception) 
            {
            System.out.println("This is not an integer");
            value = this.getBetNumbers();
            }
            
            break; // end the loop
        }
        return value; // returns the value entered
    }

    private int doAction(int betAmount,int betNumbers) {
        
        int winningNumber = GamblingControl.calculateWiningNumber(betAmount, betNumbers);
        return winningNumber;
    }    
    

    private int calculatePayout(int betAmount,int betNumbers, int winningNumber) {
        
        int winningsTotal = GamblingControl.calculatePayout(betAmount, betNumbers, winningNumber);
        int updatedBalance = CharacterControl.updatePersonaMoney(winningsTotal);
        System.out.println("\nYou won " + winningsTotal + ". Your new balance is " + updatedBalance + ".");
        return winningsTotal;
    }
    
}


