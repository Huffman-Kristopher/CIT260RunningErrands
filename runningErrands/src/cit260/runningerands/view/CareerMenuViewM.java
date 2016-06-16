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
public class CareerMenuViewM extends View {

    private char gender;
    private String career;

//    CareerMenuView(char gender) {
//       System.out.println("*** CareerMenuView function called with " + gender + "as gender option ***");
//    }

    public CareerMenuViewM() {
        super("\n"
                      + "\n------------------------------------"
                      + "\n| Career Options                    |" 
                      + "\n------------------------------------"
                      + "\nJ - Janitor"
                      + "\nM - Mail Clerk"
                      + "\nP - Pizza Delivery"
                      + "\nA - Auto Mechanic"
                      + "\nB - Back to previous menu"
                      + "\n-------------------------"
                      + "\nPlease select a Career: ");
        }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "J": //Set gender to Male and career to Janitor
                gender = 'M';
                career = "Janitor";                   
                this.openPersonaNameView(gender, career);
                break;
            case "M": //Set gender to Male and career to Mail Clerk
                gender = 'M';
                career = "Mail Clerk";                   
                this.openPersonaNameView(gender, career);
                break;
            case "P": //Set gender to Male and career to Pizza Delivery
                gender = 'M';
                career = "Pizza Delivery";                   
                this.openPersonaNameView(gender, career);
                break;
            case "A": //Set gender to Male and career to Auto Mechanic
                gender = 'M';
                career = "Auto Mechanic";                   
                this.openPersonaNameView(gender, career);
                break;  
        }

        return false;
    }

    private void openPersonaNameView(char gender, String career) {
        PersonaNameMenuView PersonaNameMenuView = new PersonaNameMenuView(gender, career);
            
        PersonaNameMenuView.displayPersonaNameMenuView(gender, career);
    }
    
}