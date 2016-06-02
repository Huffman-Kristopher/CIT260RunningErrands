/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import java.util.Scanner;

/**
 *
 * @author Kris
 */
public class InvestmentMenuView {
    
private String menu;
    
    public InvestmentMenuView() {
        this.menu = "\n"
                  + "\n------------------------------------"
                  + "\n| Investment Menu                         |" 
                  + "\n------------------------------------"
                  + "\nS - Stock investment."
                  + "\nB - Bond Investment."
                  + "\nA - Money Market Account."
                  + "\nR - Return to main menu"
                  + "\n-------------------------"
                  + "\nPlease select an Investment option: ";
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
                System.out.println("\nInvalid value: Please enter O, M, I, C, P, or B");
                continue;
            }

            break; // end the loop
        }

        return value; // returns the value entered
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "S": //create a stock investment.
                this.showStockInvestment();
                break;
            case "B": //create a bond inveestment.
                this.showBondInvestment();
                break;
            case "A": //Create a money market investment. 
                this.showAccountInvestment();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;


}

    private void showStockInvestment() {
        System.out.println("*** showStockInvestment function called ***");
    }

    private void showBondInvestment() {
        System.out.println("*** showBondInvestment function called ***");
    }

    private void showAccountInvestment() {
        System.out.println("*** showAccountInvestment function called ***");
    }

    
}

