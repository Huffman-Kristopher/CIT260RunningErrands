/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

/**
 *
* @author Kristopher Huffman and Kirk Brown
 */
public class LoseGameMenuView extends View{
        
    public LoseGameMenuView() {
        super("I'm sorry, but you have run out of time. You must complete all objectives " + "\n"
            + "within 60 days. Please try our game again!" +
            "\nPlease press Q to exit the game.");
    }

    @Override
    public boolean doAction(String value) {
        switch (value) {
            case "Q": //return to main menu.
                this.endGame();
                return true;
            default:
                this.endGame();
                return true;  
        }
        
    }    
        
    private void endGame() {
        System.exit(0);
    }
        
}