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
public class WinGameMenu extends View {
        
    public WinGameMenu() {
        super("Congratulations! You have successfully" +
            "\ncompleted all objectives and returned" +
            "\nhome! You have won the game!!" +
            "\nPlease press Q to quit the game and" +
            "\nreturn to the main menu.");
    }

    @Override
    public boolean doAction(String value) {
        switch (value) {
            case "Q": //return to main menu.
                this.openMainMenu();
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection, please try again");
                return false;  
        }
        
    }    
        
    private void openMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();    
    }
        
}
