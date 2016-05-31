/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.GameControl;
import java.util.Scanner;
import runningerrands.RunningErrands;

/**
 *
 * @author reddo
 */
public class MainMenuView {
    
    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n-------------------------"
                  + "\n| Main Menu             |" 
                  + "\n-------------------------"
                  + "\nN - Start new game"
                  + "\nL - Load saved game"
                  + "\nH - Open Help menu"
                  + "\nQ - Quit Game"
                  + "\n-------------------------"
                  + "\nPlease select a menu option: ";
    }
    void displayMainMenuView() {
        boolean done = false; // Set flag to not done
        do {
           //Promt for and get the payers name
           String menuOption = this.getMenuOption();
           if (menuOption.toUpperCase().equals("Q")) //Prompt answered with desire to quit
               return; //exit game
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
                System.out.println("\nInvalid value: Please enter N, L, H, or Q");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // returns the value entered
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N": //create and start a new game
                this.startNewGame();
                break;
            case "L": //load saved game
                this.loadSavedGame();
                break;
            case "H": //Open help menu
                this.openHelpMenu();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;
    }
    
    private void startNewGame() {
        //Create new game
        GameControl.createNewGame(RunningErrands.getPlayer());
        // Display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    private void loadSavedGame() {
        System.out.println("*** loadSavedGame function called ***");
    }
    private void openHelpMenu() {
        //Create new game
    HelpMenuView HelpMenuView = new HelpMenuView();
            
    HelpMenuView.displayHelpMenuView();
    }
}