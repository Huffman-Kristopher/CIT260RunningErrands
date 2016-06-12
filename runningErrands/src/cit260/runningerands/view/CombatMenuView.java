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
public class CombatMenuView {
    private String combatMenu;

    public CombatMenuView() {
        this.combatMenu = "\n"
                  + "\n------------------------------------"
                  + "\n| Combat Menu                        |" 
                  + "\n------------------------------------"
                  + "\nS - Select Weapon"
                  + "\nA - Attack"
                  + "\nR - Run Away"
                  + "\nN - Negotiate"
                  + "\n-------------------------"
                  + "\nPlease select an Game menu option: ";
    }
        
        void displayCombatMenuView() {
        boolean done = false; // Set flag to not done
        do {
           //Prompt for and get the players name
           String combatMenuOption = this.getCombatMenuOption();
           if (combatMenuOption.toUpperCase().equals("Q")) //Prompt answered with desire to quit
               return; //exit game
           //do the action and display the next view
           done = this.doAction(combatMenuOption);
        } while (!done);
    }

    private String getCombatMenuOption() {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        String value = "";
        boolean valid = false;
        
        while (!valid) { //loop while not valid
            System.out.println("\n" + this.combatMenu);
            
            value = keyboard.nextLine(); //Get the next line typed on the keyboard
            value = value.trim(); // Trim off leading and trailing spaces
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: Please enter S, A, R, or N");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // returns the value entered
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "S": //create and start a new game
                this.weaponSelect();
                break;
            case "A": //load saved game
                this.attack();
                break;
            case "R": //Open help menu
                this.runAway();
                break;
            case "N": //Open help menu
                this.bribe();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;
    }
    
    private void weaponSelect() {
        // Display weapon select
       System.out.println("*** weapon select function called ***");
    }
    private void attack() {
        //Display attack
        System.out.println("*** attack function called ***");
    }
    private void runAway() {
        //Display runaway
    System.out.println("*** runAway function called ***");
    }
    private void bribe() {
        //Display bribe
    System.out.println("*** bribe function called ***");
    }
}
