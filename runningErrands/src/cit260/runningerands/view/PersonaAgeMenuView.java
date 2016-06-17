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
 * @author reddo
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
    }
    
    private void openPersonaDisplayMenuView() {
        
        String menu = "";
        PersonaDisplayMenuView personaDisplayMenuView = new PersonaDisplayMenuView(menu);
        menu = personaDisplayMenuView.PersonaDataValues();
        personaDisplayMenuView.display();
    }
}
