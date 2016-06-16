/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

/**
 *
 * @author reddo
 */
public class CareerMenuViewF extends View {

    private char gender;
    private String career;

//    CareerMenuView(char gender) {
//       System.out.println("*** CareerMenuView function called with " + gender + "as gender option ***");
//    }

    public CareerMenuViewF() {
        super("\n"
                      + "\n------------------------------------"
                      + "\n| Career Options                    |" 
                      + "\n------------------------------------"
                      + "\nS - Secretary"
                      + "\nN - Nurse"
                      + "\nH - Hair Dresser"
                      + "\nT - Teacher"
                      + "\nB - Back to previous menu"
                      + "\n-------------------------"
                      + "\nPlease select a Career: ");
        }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "S": //Set gender to Female and career to Secretary
                gender = 'F';
                career = "Secretary";                   
                this.openPersonaNameView(gender, career);
                break;
            case "N": //Set gender to Female and career to Nurse
                gender = 'F';
                career = "Nurse";                   
                this.openPersonaNameView(gender, career);
                break;
            case "H": //Set gender to Female and career to Hair Dresser
                gender = 'F';
                career = "Hair Dresser";                   
                this.openPersonaNameView(gender, career);
                break;
            case "T": //Set gender to Female and career to Teacher
                gender = 'F';
                career = "Teacher";                   
                this.openPersonaNameView(gender, career);
                break;
            case "M": //Set gender to Female and career to Teacher
                gender = 'F';
                career = "Megastar";                   
                this.openPersonaNameView(gender, career);
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;
    }

    private void openPersonaNameView(char gender, String career) {
        PersonaNameMenuView PersonaNameMenuView = new PersonaNameMenuView(gender, career);
            
        PersonaNameMenuView.displayPersonaNameMenuView(gender, career);
    }
    
}
