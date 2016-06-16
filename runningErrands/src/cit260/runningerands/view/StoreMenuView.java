/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import java.util.Scanner;

/**
 *
 * @author Kris
 */
public class StoreMenuView extends View{

    public StoreMenuView() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Store Menu                        |" 
                  + "\n------------------------------------"
                  + "\nB - Buy items."
                  + "\nS - Sell items."
                  + "\nR - Return to game menu"
                  + "\n-------------------------"
                  + "\nPlease select an Store option: ");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "B": //buy stuff.
                this.openBuyMenu();
                break;
            case "S": //sell stuff.
                this.openSellMenu();
                break;
            case "R": //return to game menu.
                this.openGameMenu();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;


}

    private void openBuyMenu() {
        System.out.println("\n ***Runs buy menu function ***");
    }

    private void openSellMenu() {
        System.out.println("\n ***Runs sell menu function ***");
    }

    private void openGameMenu() {
       GameMenuView GameMenuView = new GameMenuView();
       GameMenuView.display();
    }
}
