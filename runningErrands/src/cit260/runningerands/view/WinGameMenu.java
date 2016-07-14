/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class WinGameMenu extends View {
        
    public WinGameMenu() {
        super("Congratulations! You have successfully completed" +
            "\nall objectives and returned home! Unfortunately," +
            "\nthe volcano still erupted, and you roasted to death"+
            "\nburied in ash and lava. But you have still won the"+
            "\ngame, you just didn't survive long enough to" +
            "\ncelebrate your victory!"+
            "\n"+
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
