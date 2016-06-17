/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.PersonaControl;
import cit260.runningerrands.model.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;
import runningerrands.RunningErrands;

/**
 *
 * @author reddo
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
        if (value == "Q") {
            this.openMainMenuView();
            return true;
        }
        if (value.length() < 2) {
        System.out.println("\nInvalid persona name:"
            +"The name must be greater than one character in length.");
        return false;
        }
        else {
        Persona persona = RunningErrands.getPersona();
        PersonaControl.setPersonaName(value);
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
