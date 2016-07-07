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
        
        int totalItems = 0; 
        StringBuilder line;
        Persona persona = RunningErrands.getPersona();
        Item[] inventory = persona.getItem();
        String menu = "\n"
                  + "\n------------------------------------"
                  + "\n| Sell Menu                            |" 
                  + "\n------------------------------------"
                  + "\n"
                  + "Item #  Description            In Stock  Sell Price  Total Value"
                  + "\n";
        for (Item item : inventory) {
            
            if ("N".equals(item.getItemSellable())) {
                item.setItemInSellList("N");
            }
            else {
                if(item.getItemQuantity() > 0) {
                    int qtyOnHand = item.getItemQuantity();
                    int itemValue = item.getItemValue();
                    totalItems = totalItems + item.getItemQuantity();
                    line = new StringBuilder("\n                                                                    ");
                    line.insert(2, item.getItemNumber());
                    line.insert(10,item.getDescription());
                    line.insert(33, qtyOnHand);
                    line.insert(43,"$");
                    line.insert(44, itemValue);
                    line.insert(55,"$");
                    line.insert(56, (qtyOnHand * itemValue));
                    menu = menu + line.toString();
                    item.setItemInSellList("Y");
                    
                }
                else {

                    /* Do nothing*/
                }
                
            }
        }
        menu = menu + "\n------------------------------------"
                + "\n Total items on hand: " + totalItems
                + "\n------------------------------------"
                + "\n"
                + "\n Enter item number to sell"
                + "\n R - Return to game menu";
        SellItemsMenu sellItemsMenu = new SellItemsMenu(menu);
        sellItemsMenu.display();        
        return menu;
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "R": //Return to game menu.
                return true;
            default:
                try {
                    int itemChoice = Integer.parseInt(value);
                    Persona persona = RunningErrands.getPersona();
                    Item[] inventory = persona.getItem();
                    Item currentItem = inventory[itemChoice];
                    if ("N".equals(currentItem.getItemInSellList())) {

                        this.console.println("\nPlease select a sellable item.");
                        return false;
                    }

                    else {
                        RunningErrands.setItem(currentItem);
                        String menu = "";
                        SellItemQtyMenuView sellItemQtyMenuView = new SellItemQtyMenuView(menu);
                        menu = sellItemQtyMenuView.getMenuValues(currentItem);
                        return true;
                    }
                } catch (NumberFormatException ne) {
                   ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please select an option above.");
                    return false;
                }
        }
        
        
        }

     private void openGameMenu() {
       GameMenuView GameMenuView = new GameMenuView();
       GameMenuView.display();
    }
}

