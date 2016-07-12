/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */

public class SellItemsMenu extends View{

    public SellItemsMenu(String menu) {
        super(menu);
    }

    
    String getMenuValues() {
        
        StringBuilder line;
        Persona persona = RunningErrands.getPersona();
        Item[] inventory = RunningErrands.getItems();
        String currentScene = persona.getLocation().getScene().getLocationSymbol();
        String menu = "\n"
                  + "\n------------------------------------"
                  + "\n| Sell Menu                            |" 
                  + "\n------------------------------------"
                  + "\n"
                  + "Item #  Description            On Hand  Sell Price  Total Value"
                  + "\n";
        
        int totalItems = 0; 
                
        for (Item item : inventory) {
            String sceneToSell = item.getSceneToSell().getLocationSymbol();
            int itemNumber = item.getItemNumber();
                if(sceneToSell == currentScene) {
                    if(itemNumber == 0) {
                        /** Do nothing - keep Secret Ray Gun off the list **/
                    }
                    else{
                        
                        int qtyOnHand = item.getItemQuantity();
                        int itemCost = item.getItemCost();
                        line = new StringBuilder("\n                                                                    ");
                        line.insert(2, item.getItemNumber());
                        line.insert(10,item.getDescription());
                        line.insert(33, qtyOnHand);
                        line.insert(43,"$");
                        line.insert(44, itemCost);
                        menu = menu + line.toString();
                    }
                }
        }
        menu = menu + "\n------------------------------------"
                + "\n Total items on hand: " + totalItems
                + "\n------------------------------------"
                + "\n"
                + "\n Enter item number to sell"
                + "\n P - Print Item List"
                + "\n R - Return to game menu";
        SellItemsMenu sellItemsMenu = new SellItemsMenu(menu);
        sellItemsMenu.display();        
        return menu;
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "R": //create a buy menu.
                this.openSceneMenu();
                break;
            default:
                int itemChoice = Integer.parseInt(value);
                Persona persona = RunningErrands.getPersona();
                Item[] inventory = persona.getItem();
                Item currentItem = inventory[itemChoice];
                String currentLocationSymbol = persona.getLocation().getScene().getLocationSymbol();
                String itemSellLocationSymbol = currentItem.getSceneToSell().getLocationSymbol();
                if (currentLocationSymbol != itemSellLocationSymbol) {
                        this.console.println("Selected Item cannot be sold at this location.");
                    return false;
                }
                else {
                    persona.setItemToTrade(currentItem);
                    String menu = "";
                    SellItemQtyMenuView sellItemQtyMenuView = new SellItemQtyMenuView(menu);
                    menu = sellItemQtyMenuView.getMenuValues(currentItem);
                    sellItemQtyMenuView.display();
                    return true;
                }
        }
        return false;
    }

     private void openSceneMenu() {
        String menu = "";
        SceneMenuView sceneMenuView = new SceneMenuView(menu);
        sceneMenuView.SceneMenuValues();
    }
}

