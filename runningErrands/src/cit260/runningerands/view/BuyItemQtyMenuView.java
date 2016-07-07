/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.ItemControl;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Persona;
import exceptions.PurchaseExceptions;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */

public class BuyItemQtyMenuView extends View{

   public Item itemToBuy;
    
    public BuyItemQtyMenuView(String menu) {
        super(menu);
    }

    
    String getMenuValues(Item currentItem) {
        
        StringBuilder line;
        Persona persona = RunningErrands.getPersona();
        String menu = "\n"
            + "\n------------------------------------"
            + "\n| Buy Menu                            |" 
            + "\n------------------------------------"
            + "\n"
            + "Item #  Description            In Stock  Buy Price  Total Value"
            + "\n";        

            line = new StringBuilder("\n                                                                    ");
            line.insert(2, currentItem.getItemNumber());
            line.insert(10,currentItem.getDescription());
            line.insert(33, currentItem.getRequiredAmount());
            line.insert(43, currentItem.getItemQuantity());
            line.insert(55, (currentItem.getItemQuantity() * currentItem.getItemCost()));
            menu = menu + line.toString();
            menu = menu + "\n" 
                    + "\n Enter a quantity to Purchase"
                    + "\n R - Return to game menu";
            this.itemToBuy = currentItem;
            BuyItemQtyMenuView buyItemQtyMenuView = new BuyItemQtyMenuView(menu);
            buyItemQtyMenuView.display();
            
            return menu;
            
            
    }
    
    @Override
    public boolean doAction(String value) {
        Persona persona = RunningErrands.getPersona();
        Item currentItem = RunningErrands.getItem();
        int qtyOnHand = currentItem.getItemQuantity();
                
        switch (value) {
            case "R": //create a buy menu.
                this.openGameMenu();
                break;
            default:
              try{
                int buyQty = Integer.parseInt(value);
             
                
                if (buyQty < 1) {
                    if(qtyOnHand == 1) {
                        try {
                            throw new PurchaseExceptions ("enter 1 to sell or R to return to game menu.");
                        } catch (PurchaseExceptions ex) {
                           ErrorView.display(this.getClass().getName(), "Error reading input:" + ex.getMessage());
                        }
                        
                    }
                    try{
                         throw new PurchaseExceptions ("Please enter a number from 1 to " + qtyOnHand);
                    }
                    catch(PurchaseExceptions ep){
                        ErrorView.display(this.getClass().getName(), "Error reading input:" + ep.getMessage());
                    }
                } 
                else {
                    
                    int saleAmount = ItemControl.buyItem(currentItem, buyQty);
                    this.console.println("\nCongratulations! You just bought"+ currentItem + ".");
                    GameMenuView GameMenuView = new GameMenuView();
                    GameMenuView.display();
                    return true;    
                    }
              } catch (NumberFormatException nf){
                  ErrorView.display(this.getClass().getName(), "Error reading input:" + "enter a valid number");
              }
                }
                
        return false;
        }

     private void openGameMenu() {
       GameMenuView GameMenuView = new GameMenuView();
       GameMenuView.display();
    }
}
