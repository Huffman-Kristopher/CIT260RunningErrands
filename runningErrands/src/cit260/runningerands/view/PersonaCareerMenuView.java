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
public class PersonaCareerMenuView extends View {


//    CareerMenuView(char gender) {
//       System.out.println("*** CareerMenuView function called with " + gender + "as gender option ***");
//    }
        
    public PersonaCareerMenuView(String menu) {
        super(menu);
    }

    public String CareerMenuValues() {
        String menu = "";
        Persona persona = RunningErrands.getPersona();
        char gender = persona.getGender();
        if (gender == 'F') {
            menu = ("\n"
                      + "\n------------------------------------"
                      + "\n| Character Creation: Career Options |" 
                      + "\n------------------------------------"
                      + "\nS - Secretary"
                      + "\nN - Nurse"
                      + "\nH - Hair Dresser"
                      + "\nT - Teacher"
                      + "\nQ - Back to main menu"
                      + "\n-------------------------"
                      + "\nPlease select a Career: ");
        }
        if (gender == 'M') {
            menu = ("\n"
                      + "\n------------------------------------"
                      + "\n| Character Creation: Career Options |" 
                      + "\n------------------------------------"
                      + "\nJ - Janitor"
                      + "\nM - Mail Clerk"
                      + "\nP - Pizza Delivery Driver"
                      + "\nA - Auto Mechanic"
                      + "\nQ - Back to main menu"
                      + "\n-------------------------"
                      + "\nPlease select a Career: ");
        }
        
        PersonaCareerMenuView personaCareerMenuView = new PersonaCareerMenuView(menu);
        personaCareerMenuView.display();
        return menu;
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        Persona persona = RunningErrands.getPersona();
        char gender = persona.getGender();
        String career = "";
        
        if (gender == 'F') {
            switch (value) {
                case "S": //Set gender to Female and career to Secretary
                    career = "Secretary";
                    PersonaControl.setPersonaCareer(career);
                    this.openPersonaNameView();
                    break;
                case "N": //Set gender to Female and career to Nurse
                    career = "Nurse";                   
                    PersonaControl.setPersonaCareer(career);
                    this.openPersonaNameView();
                    break;
                case "H": //Set gender to Female and career to Hair Dresser
                    career = "Hair Dresser";                   
                    PersonaControl.setPersonaCareer(career);
                    this.openPersonaNameView();
                    break;
                case "T": //Set gender to Female and career to Teacher
                    career = "Teacher";                   
                    PersonaControl.setPersonaCareer(career);
                    this.openPersonaNameView();
                    break;
                case "M": //Set gender to Female and career to Teacher
                    career = "Megastar";                   
                    PersonaControl.setPersonaCareer(career);
                    this.openPersonaNameView();
                    break;
                case "Q":
                    this.openMainMenuView();
                    break;
                default:
                    System.out.println("\nInvalid selection, please try again");
                    break;  
            }
        }
        if (gender == 'M') {
            switch (value) {
                case "J": //Set gender to Male and career to Janitor
                    career = "Janitor";                   
                    PersonaControl.setPersonaCareer(career);
                    this.openPersonaNameView();
                    break;
                case "M": //Set gender to Male and career to Mail Clerk
                    career = "Mail Clerk";                   
                    PersonaControl.setPersonaCareer(career);
                    this.openPersonaNameView();
                    break;
                case "P": //Set gender to Male and career to Pizza Delivery
                    career = "Pizza Delivery Driver";                   
                    PersonaControl.setPersonaCareer(career);
                    this.openPersonaNameView();
                    break;
                case "A": //Set gender to Male and career to Auto Mechanic
                    career = "Auto Mechanic";                   
                    PersonaControl.setPersonaCareer(career);
                    this.openPersonaNameView();
                    break;
                case "C": //Set gender to Male and career to Auto Mechanic
                    career = "CEO";                   
                    PersonaControl.setPersonaCareer(career);
                    this.openPersonaNameView();
                    break; 
                case "Q":
                    this.openMainMenuView();
                    break;
                default:
                    System.out.println("\nInvalid selection, please try again");
                    break;  
            }
        }
        
        return false;
    }

    private void openMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
    private void openPersonaNameView() {
        PersonaNameMenuView personaNameMenuView = new PersonaNameMenuView();
        personaNameMenuView.display();
    }
    
}
