package cit260.runningerands.view;

import cit260.runningerrands.control.GameControl;
import cit260.runningerrands.model.Player;
import java.util.Scanner; //if it screws up - delete this

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class StartProgramView {

        private String promptMessage;
        public StartProgramView() {
            this.promptMessage = "\nPlease enter your name: ";
            //this.promptMessage = "\nPlease enter your age:";
            
            this.displayBanner();
        }

    private void displayBanner() {
        System.out.println(
         "\n*************************************"
        +"\n*                                   *"
        +"\n* In this action packed text based  *"
        +"\n* role playing game you play the    *"
        +"\n* part of a struggling lower to     *"
        +"\n* middle class working trying to    *"
        +"\n* make your way in life. You soon   *"
        +"\n* learn in your journey that every  *"
        +"\n* action has a consequence. Every   *"
        +"\n* day is full of excitement as      *"
        +"\n* unexpected events keep popping up *"
        +"\n* when you try to do anything. You  *"
        +"\n* have bills to pay, groceries to   *"
        +"\n* buy, books to return to the       *"
        +"\n* library. It seems that every time *"
        +"\n* you go to do one of the tasks     *"
        +"\n* something catastrophic happens    *"
        +"\n* and you are faced with life       *"
        +"\n* threatening peril.                *"
        +"\n*                                   *" 
        +"\n*************************************"
        );
    }

    public void displayStartProgramView() {
        
       boolean done = false; // Set flag to not done
       do {
           //Promt for and get the payers name
           String playerName = this.getPlayerName();
           if (playerName.toUpperCase().equals("Q")) //Prompt answered with desire to quit
               return; //exit game
           //do the action and display the next view
           done = this.doAction(playerName);
       } while (!done);
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
        String value = "";
        boolean valid = false;
        
        while (!valid) { //loop while not valid
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //Get the next line typed on the keyboard
            value = value.trim(); // Trim off leading and trailing spaces
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: Player's Name cannot be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // returns the value entered
    }

    private boolean doAction(String playerName) {
        if (playerName.length() < 2) {
        System.out.println("\nInvalid player name:"
            +"The name must be greater than one character in length.");
        return false;
        }
    
    Player player = GameControl.createPlayer(playerName);
    if (player == null) {
        System.out.println("\nError creating the player.");
        return false;
    }
    
    this.displayNextView(player);
    return true;
}

    private void displayNextView(Player player) {
        System.out.println("\n==========================="
                          +"\n Welcome to the game, " + player.getName() + "."
                          +"\n We hope you enjoy playing!"
                          +"\n==========================="
                 );
    MainMenuView mainMenuView = new MainMenuView();
            
    mainMenuView.displayMainMenuView();
    }
}
