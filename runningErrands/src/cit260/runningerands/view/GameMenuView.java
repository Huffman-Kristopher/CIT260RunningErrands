/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

/**
 *
 * @author Kristopher Huffman And Kirk Brown
 */
public class GameMenuView extends View{

    public GameMenuView() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Game Main Menu                        |" 
                  + "\n------------------------------------"
                  + "\nM - Map."
                  + "\nV - Visit Store"
                  + "\nI - inventory"
                  + "\nF – Investments"
                  + "\nG – Gambling"
                  + "\nS – save game"
                  + "\nL – load game"
                  + "\nE - view email"
                  + "\nK – stats menu"
                  + "\nH – help menu"
                  + "\nQ – quit game"
                  + "\n-------------------------"
                  + "\nPlease select an Game menu option: ");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "M": //open map.
                this.openMapMenu();
                break;
            case "V": //open store.
                this.openStoreMenu();
                break;
            case "I": //open inventory.
                this.openInventoryMenu();
                break;
            case "F": //open inveestments.
                this.openInvestmentMenu();
                break;
            case "G": //gamble.
                this.openGamblingMenu();
                break;
            case "S": //save the game.
                this.OpensaveGame();
                break;
            case "L": //load the game.
                this.openLoadGame();
                break;
            case "E": //open email and get objectives.
                this.openEmailMenu();
                break;
            case "H": //open help menu.
                this.openHelpMenu();
                break;
            case "K": //open stats.
                this.openStatsMenu();
                break;
            case "Q": //return to main menu.
                this.openMainMenu();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;

}

    private void openMapMenu() {
        System.out.println("\n ***Runs Map menu function ***");
    }

    private void openInventoryMenu() {
        System.out.println("\n ***Runs Inventroy menu function ***");
    }

    private void openInvestmentMenu() {
        //display investment menu
        InvestmentTypeMenuView InvestmentMenuView = new InvestmentTypeMenuView();
        InvestmentMenuView.display();
    }

    private void openGamblingMenu()  {
        //display Gambling menu
        GamblingMenuView GamblingMenuView = new GamblingMenuView();
        GamblingMenuView.displayGamblingMenuView();
        //GameControl.createNewGame(RunningErrands.getPlayer());
    }

    private void OpensaveGame() {
       System.out.println("\n ***Runs save Game function ***");
    }

    private void openLoadGame() {
        System.out.println("\n ***Runs Load Game function ***");
    }

    private void openEmailMenu() {
        System.out.println("\n ***Runs email menu function ***");
    }

    private void openHelpMenu() {
        //Display Help Menu
        HelpMenuView HelpMenuView = new HelpMenuView();
        HelpMenuView.display();
    }

    private void openStatsMenu() {
        System.out.println("\n ***Runs stats menu function ***");
    }

    private void openStoreMenu() {
        StoreMenuView StoreMenuView = new StoreMenuView();
        StoreMenuView.display();
    }

    private void openMainMenu() {
    MainMenuView MainMenuView = new MainMenuView();
        MainMenuView.display();    
    }
    
}
