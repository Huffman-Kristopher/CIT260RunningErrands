/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */

public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = RunningErrands.getInFile();
    protected final PrintWriter console = RunningErrands.getOutFile();
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
        public void display() {
        boolean done = false; // Set flag to not done
        do {
           //Prompt for and get input
           String value = this.getInput();
           if (value.toUpperCase().equals("Q")) //Prompt answered with desire to quit
               return; //exit the view
           
           //do the action and display the next view
           done = this.doAction(value);
        } while (!done);
    }
        
    @Override
    public String getInput() {
         // Get infile for keyboard
        boolean valid = false;
        String value = null;
                
        while (!valid) { //loop while not valid
            System.out.println("\n" + this.displayMessage);
            
            try {
                value = this.keyboard.readLine(); //Get the next line typed on the keyboard
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); // Trim off leading and trailing spaces
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: Please enter a valid value");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // returns the value entered
    }   
}
