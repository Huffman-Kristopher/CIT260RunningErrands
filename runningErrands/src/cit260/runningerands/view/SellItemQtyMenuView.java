/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.ItemControl;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 * @author reddo
 */
public class SellItemQtyMenuView extends View {
    
    public Item itemToSell;
    
    public SellItemQtyMenuView(String menu) {
        super(menu);
    }

    
    String getMenuValues(Item currentItem) {
        
        StringBuilder line;
        Persona persona = RunningErrands.getPersona();
        String menu = "\n"
            + "\n------------------------------------"
            + "\n| Sell Menu                            |" 
            + "\n------------------------------------"
            + "\n"
            + "Item #  Description            In Stock  Sell Price  Total Value"
            + "\n";        

            line = new StringBuilder("\n                                                                    ");
            line.insert(2, currentItem.getItemNumber());
            line.insert(10,currentItem.getDescription());
            line.insert(33, currentItem.getRequiredAmount());
            line.insert(43, currentItem.getItemQuantity());
            line.insert(55, (currentItem.getItemQuantity() * currentItem.getItemValue()));
            menu = menu + line.toString();
            menu = menu + "\n" 
                    + "\n Enter a quantity to sell"
                    + "\n R - Return to game menu";
            this.itemToSell = currentItem;
            SellItemQtyMenuView sellItemQtyMenuView = new SellItemQtyMenuView(menu);
            sellItemQtyMenuView.display();
            
            return menu;
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        Persona persona = RunningErrands.getPersona();
        Item currentItem = RunningErrands.getItem();
        int qtyOnHand = currentItem.getItemQuantity();
        switch (value) {
            case "R": //create a stock investment.
                return true;
            default:
                try {
                    int sellQty = Integer.parseInt(value);
                    if (sellQty < 1) {
                        if(qtyOnHand == 1) {
                            this.console.println("\nPlease enter 1 to sell or R to return to game menu.");
                            return false;
                        }

                        this.console.println("\nPlease enter a number from 1 to " + qtyOnHand);
                        return false;
                    }
                    else {
                        int saleAmount = ItemControl.sellItem(currentItem, sellQty);
                        this.console.println("\nCongratulations! You just made $" + saleAmount + ".");
                        return true;    
                        }
                } catch (NumberFormatException ne) {
                    ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please enter a quantity.");
                    return false;
                }
                }
                
        
        }

     private void openGameMenu() {
       GameMenuView GameMenuView = new GameMenuView();
       GameMenuView.display();
    }
}
