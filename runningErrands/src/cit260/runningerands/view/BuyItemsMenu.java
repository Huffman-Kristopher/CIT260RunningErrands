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
 * @author Kristopher Huffman And Kirk Brown
 */
public class BuyItemsMenu extends View{

    public BuyItemsMenu(String menu) {
        super(menu);
    }

    String getMenuValues() {
        
        StringBuilder line;
        Persona persona = RunningErrands.getPersona();
        Item[] inventory = RunningErrands.getItems();
        String currentScene = persona.getLocation().getScene().getLocationSymbol();
        
        String menu = "\n"
                  + "\n------------------------------------"
                  + "\n| Buy Menu                            |" 
                  + "\n------------------------------------"
                  + "\n"
                  + "Item #  Description            In Stock  Buy Price  Total Value"
                  + "\n";
        int totalItems = 0;            
        
        for (Item item : inventory) {
            String sceneToBuy = item.getSceneToBuy().getLocationSymbol();
            int itemNumber = item.getItemNumber();
                if(sceneToBuy == currentScene) {
                    if(itemNumber == 0) {
                        /** Do nothing - keep Secret Ray Gun off the list **/
                    }
                    else{
                        
                        int qtyOnHand = item.getItemQuantity();
                        int itemCost = item.getItemCost();
                        totalItems = totalItems + item.getItemQuantity();
                        line = new StringBuilder("\n                                                                    ");
                        line.insert(2, item.getItemNumber());
                        line.insert(10,item.getDescription());
                        line.insert(33, qtyOnHand);
                        line.insert(43,"$");
                        line.insert(44, itemCost);
                        line.insert(55,"$");
                        line.insert(56, (qtyOnHand * itemCost));
                        menu = menu + line.toString();
                        item.setItemInBuyList("Y");
                    }
                }
        }
        menu = menu + "\n------------------------------------"
                + "\n Total items on hand: " + totalItems
                + "\n------------------------------------"
                + "\n"
                + "\n Enter the item number of the item you wish to purchase."
                + "\n R - Return to game menu";
        BuyItemsMenu buyItemsMenu = new BuyItemsMenu(menu);
        buyItemsMenu.display();        
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
                String itemBuyLocationSymbol = currentItem.getSceneToBuy().getLocationSymbol();
                if (currentLocationSymbol != itemBuyLocationSymbol) {
                        this.console.println("Selected Item cannot be purchased at this location.");
                    return false;
                }
                else {
                    persona.setItemToTrade(currentItem);
                    String menu = "";
                    BuyItemQtyMenuView buyItemQtyMenuView = new BuyItemQtyMenuView(menu);
                    menu = buyItemQtyMenuView.getMenuValues(currentItem);
                    buyItemQtyMenuView.display();
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