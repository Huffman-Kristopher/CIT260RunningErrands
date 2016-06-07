/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.CharacterControl;
import cit260.runningerrands.control.InvestmentControl;
import cit260.runningerrands.model.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;
import runningerrands.RunningErrands;

/**
 *
 * @author Kris
 */
public class InvestmentMenuView {
    
private String menu;
private String investmentAmountMenu;
private String investmentDaysMenu;
private int investmentReturn;
private int days;
private int investmentAmount;


     private int getMaxInvest() {
        Persona persona = RunningErrands.getPersona();
        int maxInvest = (persona.getMoney() / 2);
        return maxInvest;
    }
    public InvestmentMenuView() {
        this.menu = "\n"
                  + "\n------------------------------------"
                  + "\n| Investment Menu                   |" 
                  + "\n------------------------------------"
                  + "\n3 - Stock investment."
                  + "\n2 - Bond Investment."
                  + "\n1 - Money Market Account."
                  + "\nR - Return to main menu"
                  + "\n-------------------------"
                  + "\nPlease select an Investment option: ";
      
        this.investmentAmountMenu = "\n"
                  + "\n------------------------------------"
                  + "\n| Investment Amount Menu            |" 
                  + "\n------------------------------------"
                  + "\nPlease enter a number from 0 to 99999 or R to exit: ";
        this.investmentDaysMenu = "\n"
                  + "\n------------------------------------"
                  + "\n| Investment days Menu            |" 
                  + "\n------------------------------------"
                  + "\nPlease enter a number from 1 to 29 or R to exit: ";
    }  
    
    void displayInvestmentMenuView() {
        boolean done = false; // Set flag to not done
        do {
           //Promt for and get the payers name
           String menuOption = this.getMenuOption();
           if (menuOption.toUpperCase().equals("R")) //Prompt answered with desire to quit
               return; //Return to main menu
           //do the action and display the next view
           done = this.doAction(menuOption);
        } while (!done);
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        String value = "";
        boolean valid = false;

        while (!valid) { //loop while not valid
            System.out.println("\n" + this.menu);

            value = keyboard.nextLine(); //Get the next line typed on the keyboard
            value = value.trim(); // Trim off leading and trailing spaces

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: Please enter 3, 2, 1, or R.");
                continue;
            }

            break; // end the loop
        }

        return value; // returns the value entered
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "3": //create a stock investment.
                this.calculateInvesmentReturn();
                break;
            case "2": //create a bond inveestment.
                this.calculateInvesmentReturn();
                break;
            case "1": //Create a money market investment. 
                this.calculateInvesmentReturn();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;


}
     private double getinvestmentAmount() {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        int value = 0;
        boolean valid = false;
        
        while (!valid) { //loop while not valid
            try {
                System.out.println("\n" + this.investmentAmountMenu);
                value = keyboard.nextInt(); //Get the next line typed on the keyboard
                if (value < 0 || value > 99999 || value > getMaxInvest()) { //value is blank
                System.out.println("\nInvestment amount is outside the accepted range. Amount must be less than one half of your money, or 100,000, whichever is smaller.");
                continue;
                }
            }
            catch (InputMismatchException exception) 
            {
            System.out.println("This is not an integer");
            value = this.investmentAmount();
            }
            break; // end the loop
        }
        
        return value; // returns the value entered
    }
      private String getInvestmentDays() {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        String value = "";
        boolean valid = false;

        while (!valid) { //loop while not valid
            System.out.println("\n" + this.investmentDaysMenu);

            value = keyboard.nextLine(); //Get the next line typed on the keyboard
            value = value.trim(); // Trim off leading and trailing spaces

            if (value.length() < 1 || value.length() > 29) { //value is blank
                System.out.println("\nInvalid value: Please enter a number from 1-29 or R.");
                continue;
            }

            break; // end the loop
        }

        return value; // returns the value entered
    }
     private int calculateInvestmentReturn(int investmentType, int investmentAmount, int days){
        
        int InvestmentReturn = InvestmentControl.calculateInvestmentReturn( investmentType, investmentAmount, days);
        int updatedBalance = CharacterControl.updatePersonaMoney(InvestmentReturn);
        System.out.println("\nYour investment has matured " + InvestmentReturn + ". Your new balance is " + updatedBalance + ".");
        return InvestmentReturn;
    }
}

