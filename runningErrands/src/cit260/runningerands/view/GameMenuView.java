/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.PersonaControl;
import cit260.runningerrands.model.Investment;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

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
                  + "\nM - Map"
                  + "\nV - Visit Store"
                  + "\nI - Inventory"
                  + "\nF – Investments"
                  + "\nG – Gambling"
                  + "\nE - View Email"
                  + "\nK – Character Stats"
                  + "\nH – Help Menu"
                  + "\nS – Save Game"
//                  + "\nL – Load Game"
                  + "\nQ – Quit Game"
                  + "\nA - TEST ADDING ONE DAY"
                  + "\n-------------------------"
                  + "\nPlease select a menu option: ");
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
/**            case "L": //load the game.
                this.openLoadGame();
                break;
**/
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
            case "A": //return to main menu.
                this.addOneDay();
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
        System.out.println("\n ***Runs Inventory menu function ***");
    }

    private void openInvestmentMenu() {
        //display investment menu
        InvestmentTypeMenuView investmentMenuView = new InvestmentTypeMenuView();
        investmentMenuView.display();
    }

    private void openGamblingMenu()  {
        //display Gambling menu
        String menu = "";
        GamblingAmountMenuView gamblingAmountMenuView = new GamblingAmountMenuView(menu);
        menu = gamblingAmountMenuView.GamblingMenuValues();
        gamblingAmountMenuView.display();
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
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void openStatsMenu() {
        String menu = "";
        StatsMenuView statsMenuView = new StatsMenuView(menu);
        menu = statsMenuView.StatsValues();
        statsMenuView.display();
    }

    private void openStoreMenu() {
        StoreMenuView storeMenuView = new StoreMenuView();
        storeMenuView.display();
    }

    private void openMainMenu() {
    MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();    
    }

    private void addOneDay() {
        PersonaControl.addOneDay();
    }
    
}
