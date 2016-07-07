/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Persona;
import exceptions.PurchaseExceptions;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Item[] inventory = persona.getItem();
        String menu = "\n"
                  + "\n------------------------------------"
                  + "\n| Buy Menu                            |" 
                  + "\n------------------------------------"
                  + "\n"
                  + "Item #  Description            In Stock  Buy Price  Total Value"
                  + "\n";
        int totalItems = 0;            
        
        for (Item item : inventory) {
            
            if ("N".equals(item.getItemBuyable())) {
                item.setItemInBuyList("N");
            }
            else {
                if(item.getItemQuantity() > 0) {
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
                else {

                    /* Do nothing*/
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
        int itemChoice = Integer.parseInt(value);
        Persona persona = RunningErrands.getPersona();
        Item[] inventory = persona.getItem();
        Item currentItem = inventory[itemChoice];
        
        switch (value) {
            case "R": //Return to game menu.
                this.openGameMenu();
                break;
            default:
                
                if ("N".equals(currentItem.getItemInBuyList())) {
            try {
                throw new PurchaseExceptions("Selected Item cannot be purchased.");
            } catch (PurchaseExceptions ex) {
                System.out.println(ex.getMessage());
            }
                    
                }
                else {
                    RunningErrands.setItem(currentItem);
                    String menu = "";
                    BuyItemQtyMenuView buyItemQtyMenuView = new BuyItemQtyMenuView(menu);
                    menu = buyItemQtyMenuView.getMenuValues(currentItem);
                    buyItemQtyMenuView.display();
                    return true;
                    }
                }
                
        return false;
        }

     private void openGameMenu() {
       GameMenuView GameMenuView = new GameMenuView();
       GameMenuView.display();
    }
}