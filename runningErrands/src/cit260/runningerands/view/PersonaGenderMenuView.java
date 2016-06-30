/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.PersonaControl;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */

public class PersonaGenderMenuView extends View {

    public PersonaGenderMenuView() {
        super("\n"
              + "\n------------------------------------"
              + "\n| Character Creation: Select Gender  |" 
              + "\n------------------------------------"
              + "\nF - Female"
              + "\nM - Male"
              + "\nQ - Back to main menu"
              + "\n-------------------------"
              + "\nPlease select a gender: ");
    }

    @Override    
    public boolean doAction(String value) {
                value = value.toUpperCase();
                char gender = value.charAt(0);
        
        switch (gender) {
            case 'F': //Display Feale Career Options
                PersonaControl.createPersona(gender);
                this.openCareerMenu();
                break;
            case 'M': //load saved game
                PersonaControl.createPersona(gender);
                this.openCareerMenu();
                break;
            case 'Q': //load saved game
                return true;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return true;
    }

    private void openMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
        
    private void openCareerMenu() {
        String menu = "";
        PersonaCareerMenuView personaCareerMenuView = new PersonaCareerMenuView(menu);
        menu = personaCareerMenuView.CareerMenuValues();
        
    }
}

