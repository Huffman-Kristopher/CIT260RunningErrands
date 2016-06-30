/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.PersonaControl;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class PersonaAgeMenuView extends View {

    public PersonaAgeMenuView() {
        super("\n"
            + "\n------------------------------------"
            + "\n| Character Creation: Age Selection |" 
            + "\n------------------------------------"
            + "\nPlease enter an age for your "
            + "\ncharacter or press Q to quit game."
            + "\n");  
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "R": //create a stock investment.
                return true;
            default:
                try {
                    int age = Integer.parseInt(value);
                    if (age < 12 || age > 120) {
                        System.out.println("\nInvalid age:"
                        + "Please enter a value between 12 and 120.");
                        return false;
                    }
                    else {
                    Persona persona = RunningErrands.getPersona();
                    PersonaControl.setPersonaAge(age);
                    this.openPersonaDisplayMenuView();
                    return true;
                    }
                } catch (NumberFormatException ne) {
                    System.out.println("\nPlease enter a numeric value, or press Q to return to the main menu.");
            }
        }
        return true;
    }
    
    private void openPersonaDisplayMenuView() {
        
        String menu = "";
        PersonaDisplayMenuView personaDisplayMenuView = new PersonaDisplayMenuView(menu);
        menu = personaDisplayMenuView.PersonaDataValues();
        
    }
    
        
    private void openMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
