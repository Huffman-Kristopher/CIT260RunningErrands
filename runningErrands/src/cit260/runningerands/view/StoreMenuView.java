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
                return true;
            case "S": //sell stuff.
                this.openSellMenu();
                return true;
            case "R": //return to game menu.
                return true;
            default:
                System.out.println("\nInvalid selection, please try again");
                return false;  
        }

}

    private void openBuyMenu() {
       BuyMenuView BuyMenuView = new BuyMenuView();
       BuyMenuView.display();
    }

    private void openSellMenu() {
        String menu = "";
        SellItemsMenu sellItemsMenu = new SellItemsMenu(menu);
        menu = sellItemsMenu.getMenuValues();
    }

    private void openGameMenu() {
       GameMenuView GameMenuView = new GameMenuView();
       GameMenuView.display();
    }
}
