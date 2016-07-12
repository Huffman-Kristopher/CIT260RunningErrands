/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.model.Email;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class EmailMenuView extends View{

     public EmailMenuView(String menu) {
        super(menu);
    }
         
    public String getMenuValues() {
        
        StringBuilder line;
        Email[] emails = RunningErrands.getEmails();
                
        String menu = "\n"
                  + "\n------------------------------------"
                  + "\n|             Inbox                |" 
                  + "\n------------------------------------"
                  + "\n"
                  + "\n"
                  + "\n";
                    
        
        for (Email email : emails) {
            
            int EmailNumber = email.getDays();
            String EmailSubject = email.getSubject();
                  
                        
                        
                        line = new StringBuilder("\n                                                                    ");
                        line.insert(2, EmailNumber);
                        line.insert(10,EmailSubject);
                        menu = menu + line.toString();
                        
                    
                }
        return menu;
    }
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        Email[] emails = RunningErrands.getEmails();
        switch (value) {
            
            case "R":
                this.openSceneMenu();
                return true;
            default:
                int emailChoice = Integer.parseInt(value);
                Email currentEmail = emails[emailChoice];
                String emailDescription = currentEmail.getDescription();
                int emailCount =  emails.length - 1;
                if (emailChoice > emailCount)
                { this.console.println("enter a valid number or R for return to menu.");}
                else {this.console.println(emailDescription); this.openSceneMenu();}
                    ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid menu selection, please try again");
                        return false; 
    }
    
    
}
    private void openSceneMenu() {
       String menu = "";
        SceneMenuView sceneMenuView = new SceneMenuView(menu);
        sceneMenuView.display();   
        }
    }
