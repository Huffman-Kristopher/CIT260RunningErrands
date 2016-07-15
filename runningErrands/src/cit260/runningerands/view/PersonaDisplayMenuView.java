
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.model.Persona;
import java.text.NumberFormat;
import java.util.Locale;
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
        int personaMoney = persona.getMoney();
        int personaSalary = persona.getSalary();
        String money = NumberFormat.getNumberInstance(Locale.US).format(personaMoney);
        String salary = NumberFormat.getNumberInstance(Locale.US).format(personaSalary);
        
        String menu = ("\n==========================="
            + "\nYou have created a new character!"
            + "\nCharacter name: " + name
            + "\nGender: " + gender
            + "\nAge: " + age
            + "\nBeginning health: " + health
            + "\nCareer: " + career
            + "\nSalary: $" + salary
            + "\nBeginning balance: $" + money
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
                this.openSceneMenuView();
                return true;
            case "N": //Set gender to Female and career to Nurse
                this.createNewPersona();
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\nIError reading input. Please enter selection from above.");
                return false;  
        }
        
        }
    private void createNewPersona() {
        // Display game menu
        PersonaGenderMenuView createNewPersona = new PersonaGenderMenuView();
        createNewPersona.display();
    }
    
    private void openSceneMenuView() {
        String menu = "";
        SceneMenuView sceneMenuView = new SceneMenuView(menu);
        sceneMenuView.SceneMenuValues();

    }
}

