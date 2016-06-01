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
public class StartNewGameView {

    private String menu;

    public StartNewGameView() {
    this.menu = "\n"
              + "\n------------------------------------"
              + "\n| Please select a gender            |" 
              + "\n------------------------------------"
              + "\nF - Female"
              + "\nM - Male"
              + "\nB - Back to main menu"
              + "\n-------------------------"
              + "\nPlease select a gender: ";
    }
        
    void displayGameMenuView() {
        boolean done = false; // Set flag to not done
        do {
           //Promt for and get the payers name
           String menuOption = this.getMenuOption();
           if (menuOption.toUpperCase().equals("B")) //Prompt answered with desire to quit
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
                System.out.println("\nInvalid value: Please enter F, M, or B");
                continue;
            }

            break; // end the loop
        }

        return value; // returns the value entered
    }

    private boolean doAction(String choice) {
                choice = choice.toUpperCase();
        
        switch (choice) {
            case "F": //Display Feale Career Options
                this.openCareerMenu('F');
                break;
            case "M": //load saved game
                this.openCareerMenu('M');
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;
    }

    private void openCareerMenu(char gender) {
        //Display Career Menu
        CareerMenuView careerMenuView = new CareerMenuView(gender);
            
        careerMenuView.displayCareerMenuView(gender);
    }
    
}
