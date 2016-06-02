/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.CharacterControl;
import cit260.runningerrands.control.GameControl;
import cit260.runningerrands.model.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;
import runningerrands.RunningErrands;

/**
 *
 * @author reddo
 */
class PersonaNameMenuView {

    private String menu;
    private char gender;
    private String career; 
    private String promptMessage;
    private int personaAge;
    private String promptAgeMessage;

    public PersonaNameMenuView(char gender, String career) {
            this.promptMessage = "\nPlease enter a name for your persona: ";
            //this.promptMessage = "\nPlease enter your age:";
            this.promptAgeMessage = "\nPlease enter an age for your persona: ";
    }

    void displayPersonaNameMenuView(char gender, String career) {
       boolean done = false; // Set flag to not done
       do {
           //Promt for and get the payers name
           String personaName = this.getPersonaName();
           personaAge = this.getPersonaAge();
           if (personaName.toUpperCase().equals("Q")) //Prompt answered with desire to quit
               return; //exit game
           //do the action and display the next view
           done = this.doAction(personaName, gender, career, personaAge);
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

    private boolean doAction(String personaName, char gender, String career, int personaAge) {
        if (personaName.length() < 2) {
        System.out.println("\nInvalid persona name:"
            +"The name must be greater than one character in length.");
        return false;
        }
        
    Persona persona = CharacterControl.createPersona(personaName, gender, career, personaAge);
    if (persona == null) {
        System.out.println("\nError creating the player.");
        return false;
    }
    
    this.displayNextView(persona);
    return true;
    }

    private void displayNextView(Persona persona) {
        gender = persona.getGender();
        String genderDisplay ="";
        
        switch (gender) {
            case 'M': //If gender is M, then male
                genderDisplay = "male";
                break;
            case 'F': //If gender is M, then male
                genderDisplay = "memale";
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        System.out.println("\n==========================="
                         + "\n You have created a new persona!"
                         + "\n Your " + persona.getAge() + " year old " + genderDisplay + " persona is named " + persona.getPersonaName()
                         + "\n and is a " + persona.getCareer() + "! Starting health is " + persona.getHealth()
                         + "\n Now - go run some errands!"
                         + "\n==========================="
         );
        this.openGameMenuView();
    }
        
private void openGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
            
        gameMenuView.displayGameMenuView();
    }

    private int getPersonaAge() {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        int value = 0;
        boolean valid = false;
        
        while (!valid) { //loop while not valid
            try {
                System.out.println("\n" + this.promptAgeMessage);
                value = keyboard.nextInt(); //Get the next line typed on the keyboard
                if (value < 3 || value > 120) { //value is blank
                System.out.println("\nInvalid value: Persona's name cannot be blank");
                continue;
                }
            }
            catch (InputMismatchException exception) 
            {
            System.out.println("This is not an integer");
            value = this.getPersonaAge();
            }
            
            break; // end the loop
        }
        
        return value; // returns the value entered
    }
    
}
