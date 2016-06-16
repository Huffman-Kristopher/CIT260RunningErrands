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
public class CreateNewPersonaView extends View {

    public CreateNewPersonaView() {
        super("\n"
              + "\n------------------------------------"
              + "\n| Please select a gender            |" 
              + "\n------------------------------------"
              + "\nF - Female"
              + "\nM - Male"
              + "\nB - Back to main menu"
              + "\n-------------------------"
              + "\nPlease select a gender: ");
    }

    @Override    
    public boolean doAction(String value) {
                value = value.toUpperCase();
        
        switch (value) {
            case "F": //Display Feale Career Options
                this.openCareerMenuF();
                break;
            case "M": //load saved game
                this.openCareerMenuM();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;
    }

    private void openCareerMenuF() {
        //Display Career Menu
        CareerMenuViewF CareerMenuViewF = new CareerMenuViewF();
        CareerMenuViewF.display();
    }
    
        private void openCareerMenuM() {
        //Display Career Menu
        CareerMenuViewM CareerMenuViewM = new CareerMenuViewM();
        CareerMenuViewM.display();
    }
    
}
