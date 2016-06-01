/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.CharacterControl;
import cit260.runningerrands.model.Persona;
import java.util.Scanner;

/**
 *
 * @author reddo
 */
class PersonaNameMenuView {

    private String menu;
    private char gender;
    private String career; 
    private String promptMessage;

    public PersonaNameMenuView(char gender, String career) {
            this.promptMessage = "\nPlease enter a name for your persona: ";
            //this.promptMessage = "\nPlease enter your age:";
    }

    void displayPersonaNameMenuView(char gender, String career) {
       boolean done = false; // Set flag to not done
       do {
           //Promt for and get the payers name
           String personaName = this.getPersonaName();
           if (personaName.toUpperCase().equals("Q")) //Prompt answered with desire to quit
               return; //exit game
           //do the action and display the next view
           done = this.doAction(personaName, gender, career);
       } while (!done);
    }

    private String getPersonaName() {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        String value = "";
        boolean valid = false;
        
        while (!valid) { //loop while not valid
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //Get the next line typed on the keyboard
            value = value.trim(); // Trim off leading and trailing spaces
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: Persona's name cannot be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // returns the value entered
    }

    private boolean doAction(String personaName, char gender, String career) {
        if (personaName.length() < 2) {
        System.out.println("\nInvalid persona name:"
            +"The name must be greater than one character in length.");
        return false;
        }
        
    Persona persona = CharacterControl.createPersona(personaName, gender, career);
    if (persona == null) {
        System.out.println("\nError creating the player.");
        return false;
    }
    
    this.displayNextView(persona);
    return true;
    }

    private void displayNextView(Persona persona) {
        System.out.println("\n==========================="
                         + "\n You have created a new persona!"
                         + "\n Your " + persona.getGender() + "persona is named " + persona.getPersonaName()
                         + "\n and is a " + persona.getCareer() + "!"
                         + "\n Now - go run some errands!"
                         + "\n==========================="
         );
        System.out.println("\nFrom here, we start the real parts of the game.");
    }


}
