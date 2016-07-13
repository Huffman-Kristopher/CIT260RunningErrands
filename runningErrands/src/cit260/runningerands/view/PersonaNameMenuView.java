/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.MapControl;
import cit260.runningerrands.control.PersonaControl;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */

public class PersonaNameMenuView extends View {

    public PersonaNameMenuView() {
        super("\n"
            + "\n------------------------------------"
            + "\n| Character Creation: Name Selection |" 
            + "\n------------------------------------"
            + "\nPlease enter a name for your "
            + "\ncharacter or press Q to quit game:"
            + "\n");  
    }
    
    @Override
    public boolean doAction(String value) {
        if ("Q".equals(value)) {
            return true;
        }
        if (value.length() < 2) {
            this.console.println("Error reading input. Please enter a name greater than one character in length.");
            ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid persona name:"
                +"The name must be greater than one character in length.");
            return false;
        }
        else {
            Persona persona = RunningErrands.getPersona();
            PersonaControl.setPersonaName(value);
            MapControl.movePersonaToStartingLocation();
            this.openPersonaAgeMenuView();
            return true;
        }
    }

    private void openPersonaAgeMenuView() {
        PersonaAgeMenuView personaAgeMenuView = new PersonaAgeMenuView();
        personaAgeMenuView.display();
    }
    
    private void openMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
    private void openGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}
