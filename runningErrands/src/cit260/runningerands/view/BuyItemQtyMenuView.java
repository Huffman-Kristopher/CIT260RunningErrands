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

public class BuyItemQtyMenuView extends View{

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
            + "Item #  Description            Price"
            + "\n";        

            line = new StringBuilder("\n                                                       ");
            line.insert(2, currentItem.getItemNumber());
            line.insert(9,currentItem.getDescription());
            line.insert(31, currentItem.getItemCost());
            menu = menu + line.toString();
            menu = menu + "\n" 
                    + "\n Enter a quantity to Purchase"
                    + "\n R - Return to game menu";
            BuyItemQtyMenuView buyItemQtyMenuView = new BuyItemQtyMenuView(menu);
            buyItemQtyMenuView.display();
            
            return menu;
            
            
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "R": //create a buy menu.
                return true;
            default:
              try{
                
                    Persona persona = RunningErrands.getPersona();
                    int buyQty = Integer.parseInt(value);
                    Item itemToTrade = persona.getItemToTrade();
                    String itemToTradeName = itemToTrade.getDescription();
                    if(buyQty < 1) {
                        this.console.println("Quantity to buy must be greater than zero.");
                        return false;
                    }
                    else {

                        int itemCost = itemToTrade.getItemCost();
                        int purchasePrice = buyQty * itemCost;
                        int moneyOnHand = persona.getMoney();
                        if(purchasePrice > moneyOnHand) {
                            this.console.println("You do not have enough money for that. Your balance is $" + moneyOnHand + ".");
                            return false;
                        }
                        else {
                            this.console.println("You have successfully completed your purchase of " + itemToTradeName + " at a cost of $" + purchasePrice);
                            ItemControl.buyItem(itemToTrade, buyQty);
                            return true;
                        }
                    }
                } catch (NumberFormatException nf){
                    ErrorView.display(this.getClass().getName(), "Error reading input: " + "enter a valid number");
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
