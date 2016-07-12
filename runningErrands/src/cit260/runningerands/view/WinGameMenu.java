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
        super("Congratulations! You have successfully" +
            "\ncompleted all objectives and returned" +
            "\nhome! Unfortunately the volcano still errupted"+
            "\n and you died, buy you have won the game you're just dead!!" +
            "\nPlease press Q to exit the game.");
    }

    @Override
    public boolean doAction(String value) {
        switch (value) {
            case "Q": //return to main menu.
                this.endGame();
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection, please try again");
                return false;  
        }
        
    }    
        
    private void endGame() {
        System.exit(0);
    }
    private void openMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();    
    }
        
}
