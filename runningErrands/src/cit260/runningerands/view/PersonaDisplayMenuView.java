
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class PersonaDisplayMenuView extends View {

    public PersonaDisplayMenuView(String menu) {
        super(menu);  
    }
    
    public String PersonaDataValues (){
        Persona persona = RunningErrands.getPersona();
        String career = persona.getCareer();
        char gender = persona.getGender();
        if (gender == 'F') {
            String genderDisplay = "female";
        }
        else {
            String genderDisplay = "male";
        }
        String name = persona.getPersonaName();
        int age = persona.getAge();
        int health = persona.getHealth();
        int balance = persona.getMoney();
        int salary = persona.getSalary();
        
        String menu = ("\n==========================="
            + "\nYou have created a new character!"
            + "\nCharacter name: " + name
            + "\nGender: " + gender
            + "\nAge: " + age
            + "\nBeginning health: " + health
            + "\nCareer: " + career
            + "\nSalary: $" + salary
            + "\nBeginning balance: $" + balance
            + "\nNow - go run some errands!"
            + "\n==========================="
            + "\nAre these correct? Enter Y for yes or N for no."
            + "\n");
        PersonaDisplayMenuView personaDisplayMenuView = new PersonaDisplayMenuView(menu);
        personaDisplayMenuView.display();
        return menu;
}
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "Y": //Set gender to Female and career to Secretary
                this.openGameMenuView();
                break;
            case "N": //Set gender to Female and career to Nurse
                this.createNewPersona();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                return false;  
        }
        return true;
        }
    private void createNewPersona() {
        // Display game menu
        PersonaGenderMenuView createNewPersona = new PersonaGenderMenuView();
        createNewPersona.display();
    }
    
    private void openGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}

