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
public class StoreMenuView {
    
private String storeMenu;

    public StoreMenuView() {
        this.storeMenu = "\n"
                  + "\n------------------------------------"
                  + "\n| Store Menu                        |" 
                  + "\n------------------------------------"
                  + "\nB - Buy items."
                  + "\nS - Sell items."
                  + "\nR - Return to game menu"
                  + "\n-------------------------"
                  + "\nPlease select an Store option: ";
    }
        
        void displayStoreMenuView() {
        boolean done = false; // Set flag to not done
        do {
           //Promt for and get the payers name
           String storeMenuOption = this.getStoreMenuOption();
           if (storeMenuOption.toUpperCase().equals("R")) //Prompt answered with desire to quit
               return; //Return to main menu
           //do the action and display the next view
           done = this.doAction(storeMenuOption);
        } while (!done);
    }
    
    private String getStoreMenuOption() {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        String value = "";
        boolean valid = false;

        while (!valid) { //loop while not valid
            System.out.println("\n" + this.storeMenu);

            value = keyboard.nextLine(); //Get the next line typed on the keyboard
            value = value.trim(); // Trim off leading and trailing spaces

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: Please enter B, S, or R.");
                continue;
            }

            break; // end the loop
        }

        return value; // returns the value entered
    }
    
    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "B": //create a stock investment.
                this.openBuyMenu();
                break;
            case "S": //create a bond inveestment.
                this.openSellMenu();
                break;
            case "R": //create a bond inveestment.
                this.openGameMenu();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;


}

    private void openBuyMenu() {
        System.out.println("\n ***Runs buy menu function ***");
    }

    private void openSellMenu() {
        System.out.println("\n ***Runs sell menu function ***");
    }

    private void openGameMenu() {
       GameMenuView GameMenuView = new GameMenuView();
       GameMenuView.displayGameMenuView();
    }
}
