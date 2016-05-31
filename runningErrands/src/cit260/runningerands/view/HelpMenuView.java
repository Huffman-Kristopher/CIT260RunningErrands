/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import java.util.Scanner;

/**
 *
 * @author reddo
 */
public class HelpMenuView {
    private String menu;
    
    public HelpMenuView() {
        this.menu = "\n"
                  + "\n------------------------------------"
                  + "\n| Help Menu                         |" 
                  + "\n------------------------------------"
                  + "\nO - What is the game's objective?"
                  + "\nM - How do I get where I'm going? (movement)"
                  + "\nI - How do I use my inventory"
                  + "\nC - How do I engage in combat?"
                  + "\nP - How do I purchase items?"
                  + "\nB - Back to main menu"
                  + "\n-------------------------"
                  + "\nPlease select a help menu option: ";
    }    

    void displayHelpMenuView() {
        boolean done = false; // Set flag to not done
        do {
           //Promt for and get the payers name
           String menuOption = this.getMenuOption();
           if (menuOption.toUpperCase().equals("B")) //Prompt answered with desire to quit
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
            case "O": //create and start a new game
                this.showObjectiveHelp();
                break;
            case "M": //load saved game
                this.showMovementHelp();
                break;
            case "I": //Open help menu
                this.showInventoryHelp();
                break;
            case "C": //Open help menu
                this.showCombatHelp();
                break;
            case "P": //Open help menu
                this.showPurchaseHelp();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;


}

    private void showObjectiveHelp() {
        System.out.println("*** showObjectiveHelp function called ***");
    }

    private void showMovementHelp() {
        System.out.println("*** showMovementHelp function called ***");
    }

    private void showInventoryHelp() {
        System.out.println("*** showInventoryHelp function called ***");
    }

    private void showCombatHelp() {
        System.out.println("*** showCombatHelp function called ***");
    }

    private void showPurchaseHelp() {
        System.out.println("*** showPurchaseHelp function called ***");
    }
}
