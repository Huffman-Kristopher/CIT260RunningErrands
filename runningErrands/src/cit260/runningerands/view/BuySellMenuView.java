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
public class BuySellMenuView extends View{
    
    public BuySellMenuView() {
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
                ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please try again");
                return false;  
        }

}

    private void openBuyMenu() {
        String menu = "";
        BuyItemsMenu buyItemsMenu = new BuyItemsMenu(menu);
        buyItemsMenu.getMenuValues();
    }

    private void openSellMenu() {
        String menu = "";
        SellItemsMenu sellItemsMenu = new SellItemsMenu(menu);
        sellItemsMenu.getMenuValues();
    }
    
    private void openSceneMenu() {
        String menu = "";
        SceneMenuView sceneMenuView = new SceneMenuView(menu);
        sceneMenuView.SceneMenuValues();
    }
}
