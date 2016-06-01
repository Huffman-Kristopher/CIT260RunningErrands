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
class CareerMenuView {

    private String menu;
    private char gender;
    private String career;

//    CareerMenuView(char gender) {
//       System.out.println("*** CareerMenuView function called with " + gender + "as gender option ***");
//    }

    CareerMenuView(char gender) {
        if (gender == 'F')  {  
            this.menu = "\n"
                      + "\n------------------------------------"
                      + "\n| Career Options                    |" 
                      + "\n------------------------------------"
                      + "\nS - Secretary"
                      + "\nN - Nurse"
                      + "\nH - Hair Dresser"
                      + "\nT - Teacher"
                      + "\nB - Back to previous menu"
                      + "\n-------------------------"
                      + "\nPlease select a Career: ";
        }
        if (gender == 'M') {
            this.menu = "\n"
                      + "\n------------------------------------"
                      + "\n| Career Options                    |" 
                      + "\n------------------------------------"
                      + "\nJ - Janitor"
                      + "\nM - Mail Clerk"
                      + "\nP - Pizza Delivery"
                      + "\nA - Auto Mechanic"
                      + "\nB - Back to previous menu"
                      + "\n-------------------------"
                      + "\nPlease select a Career: ";        
        }
    }

    void displayCareerMenuView(char gender) {
        boolean done = false; // Set flag to not done
        do {
            //Prompt for and get the character's career
            String menuOption = this.getMenuOption(gender);
            System.out.println("\nMenu Choice here is " + menuOption);
            System.out.println("\nMenu Choice upper case here is " + menuOption.toUpperCase());
            if (menuOption.toUpperCase().equals("FB")) //Prompt answered with return to previous menu
                return; //exit game
            if (menuOption.toUpperCase().equals("MB")) //Prompt answered with return to previous menu
                return; //exit game
            //do the action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption(char gender) {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        String value = "";
        String choice = "";
        boolean valid = false;
        
        while (!valid) { //loop while not valid
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); //Get the next line typed on the keyboard
            value = value.trim(); // Trim off leading and trailing spaces
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: Please select a career or enter B to return to the previous menu");
                continue;
            }
            
            break; // end the loop
        }
        choice = (gender + value);
        return choice; // returns the value entered
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "FS": //Set gender to Female and career to Secretary
                gender = 'F';
                career = "Secretary";                   
                this.openPersonaNameView(gender, career);
                break;
            case "FN": //Set gender to Female and career to Nurse
                gender = 'F';
                career = "Nurse";                   
                this.openPersonaNameView(gender, career);
                break;
            case "FH": //Set gender to Female and career to Hair Dresser
                gender = 'F';
                career = "Hair Dresser";                   
                this.openPersonaNameView(gender, career);
                break;
            case "FT": //Set gender to Female and career to Teacher
                gender = 'F';
                career = "Teacher";                   
                this.openPersonaNameView(gender, career);
                break;
            case "MJ": //Set gender to Male and career to Janitor
                gender = 'M';
                career = "Janitor";                   
                this.openPersonaNameView(gender, career);
                break;
            case "MM": //Set gender to Male and career to Mail Clerk
                gender = 'M';
                career = "Mail Clerk";                   
                this.openPersonaNameView(gender, career);
                break;
            case "MP": //Set gender to Male and career to Pizza Delivery
                gender = 'M';
                career = "Pizza Delivery";                   
                this.openPersonaNameView(gender, career);
                break;
            case "MA": //Set gender to Male and career to Auto Mechanic
                gender = 'M';
                career = "Auto Mechanic";                   
                this.openPersonaNameView(gender, career);
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;
    }

    private void openPersonaNameView(char gender, String career) {
        PersonaNameMenuView PersonaNameMenuView = new PersonaNameMenuView(gender, career);
            
        PersonaNameMenuView.displayPersonaNameMenuView(gender, career);
    }
    
}
