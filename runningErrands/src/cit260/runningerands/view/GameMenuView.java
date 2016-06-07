/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import java.util.Scanner;

/**
 *
 * @author Kristopher Huffman And Kirk Brown
 */
class GameMenuView {
    
    private String gameMenu;

    public GameMenuView() {
        this.gameMenu = "\n"
                  + "\n------------------------------------"
                  + "\n| Store Menu                        |" 
                  + "\n------------------------------------"
                  + "\nM - Map."
                  + "\nS - Sell items."
                  + "\nI - inventory."
                  + "\nF – Investments"
                  + "\nG – Gambling"
                  + "\nS – save game"
                  + "\nL – load game"
                  + "\nV - view email"
                  + "\nK – stats menu"
                  + "\nH – help menu"
                  + "\nQ – quit game"
                  + "\n-------------------------"
                  + "\nPlease select an Store option: ";
    }
        
        void displayGameMenuView() {
        boolean done = false; // Set flag to not done
        do {
           //Promt for and get the payers name
           String gameMenuOption = this.getGameMenuOption();
           if (gameMenuOption.toUpperCase().equals("R")) //Prompt answered with desire to quit
               return; //Return to main menu
           //do the action and display the next view
           done = this.doAction(gameMenuOption);
        } while (!done);
    }
    
    private String getGameMenuOption() {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        String value = "";
        boolean valid = false;

        while (!valid) { //loop while not valid
            System.out.println("\n" + this.gameMenu);

            value = keyboard.nextLine(); //Get the next line typed on the keyboard
            value = value.trim(); // Trim off leading and trailing spaces

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: Please enter M, I, F, G, S, L, V, K, H, or Q.");
                continue;
            }

            break; // end the loop
        }

        return value; // returns the value entered
    }
    
    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "M": //create a stock investment.
                this.openMapMenu();
                break;
            case "I": //create a bond inveestment.
                this.openInventoryMenu();
                break;
            case "F": //create a bond inveestment.
                this.openInvestmentMenu();
                break;
                case "G": //create a stock investment.
                this.openGamblingMenu();
                break;
            case "S": //create a bond inveestment.
                this.OpensaveGame();
                break;
            case "L": //create a bond inveestment.
                this.openLoadGame();
                break;
                case "V": //create a stock investment.
                this.openEmailMenu();
                break;
            case "H": //create a bond inveestment.
                this.openHelpMenu();
                break;
            case "K": //create a bond inveestment.
                this.openStatsMenu();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;

}

    private void openMapMenu() {
        System.out.println("\n ***Runs Map menu function ***");
    }

    private void openInventoryMenu() {
        System.out.println("\n ***Runs Inventroy menu function ***");
    }

    private void openInvestmentMenu() {
        //display investment menu
        InvestmentMenuView InvestmentMenuView = new InvestmentMenuView();
        InvestmentMenuView.displayInvestmentMenuView();
    }

    private void openGamblingMenu()  {
        //display Gambling menu
        GamblingMenuView GamblingMenuView = new GamblingMenuView();
        GamblingMenuView.displayGamblingMenuView();
        //GameControl.createNewGame(RunningErrands.getPlayer());
    }

    private void OpensaveGame() {
       System.out.println("\n ***Runs save Game function ***");
    }

    private void openLoadGame() {
        System.out.println("\n ***Runs Load Game function ***");
    }

    private void openEmailMenu() {
        System.out.println("\n ***Runs email menu function ***");
    }

    private void openHelpMenu() {
        //Display Help Menu
        HelpMenuView HelpMenuView = new HelpMenuView();
        HelpMenuView.displayHelpMenuView();
    }

    private void openStatsMenu() {
        System.out.println("\n ***Runs stats menu function ***");
    }
    
}
