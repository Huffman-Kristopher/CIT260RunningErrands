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
 *  @author Kristopher Huffman And Kirk Brown
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

            int qtyOnHand = currentItem.getItemQuantity();
            int itemCost = currentItem.getItemCost();
            line = new StringBuilder("\n                                                                    ");
            line.insert(0, currentItem.getItemNumber());
            line.insert(8,currentItem.getDescription());
            line.insert(31, qtyOnHand);
            line.insert(40,"$");
            line.insert(41, itemCost);
            line.insert(53,"$");
            line.insert(54, (qtyOnHand * itemCost));
            menu = menu + line.toString();
            SellItemQtyMenuView sellItemQtyMenuView = new SellItemQtyMenuView(menu);
            sellItemQtyMenuView.display();
            
            return menu;
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "R": //create a buy menu.
                this.openGameMenu();
                break;
            default:
              try{
                
                    Persona persona = RunningErrands.getPersona();
                    int sellQty = Integer.parseInt(value);
                    Item itemToTrade = persona.getItemToTrade();
                    String itemToTradeName = itemToTrade.getItemName();
                    int qtyOnHand = itemToTrade.getItemQuantity();
                    if(sellQty < 1) {
                        this.console.println("Quantity to buy must be greater than zero.");
                        return false;
                    }
                    else {
                        if (sellQty > qtyOnHand) {
                            this.console.println("Quantity to buy cannot be greater than the quantity on hand.");
                        }
                        else {

                            int itemCost = itemToTrade.getItemCost();
                            int sellingPrice = sellQty * itemCost;
                            int moneyOnHand = persona.getMoney();
                                this.console.println("You have successfully completed your sale of " + itemToTradeName + " at a cost of " + sellingPrice);
                                ItemControl.sellItem(itemToTrade, sellQty);
                                String menu = "";
                                SceneMenuView sceneMenuView = new SceneMenuView(menu);
                                sceneMenuView.SceneMenuValues();
                                return true;
                        }
                    }
                    
                } catch (NumberFormatException nf){
                    this.console.println("Error reading input. Please enter a numeric value.");
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
