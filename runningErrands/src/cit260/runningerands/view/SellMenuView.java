package cit260.runningerands.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */

public class SellMenuView extends View{

    public SellMenuView() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Sell Menu                        |" 
                  + "\n------------------------------------"
                  + "\nS - Select item."
                  + "\nR - Return to game menu"
                  + "\n-------------------------"
                  + "\nPlease select an Store option: ");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "S": //select items to sell.
                this.openSellItmesMenu();
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

    private void openSellItmesMenu() {
       SellItemsMenu SellItemsMenu = new SellItemsMenu();
       SellItemsMenu.display();
    }

     private void openGameMenu() {
       GameMenuView GameMenuView = new GameMenuView();
       GameMenuView.display();
    }
}
