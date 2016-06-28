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
        
        StringBuilder line = null;
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
            if(item.getItemQuantity() > 0) {
                
                line = new StringBuilder("                              ");
                line.insert(0, item);
                line.insert(8,item.getDescription());
                line.insert(31, item.getRequiredAmount());
                line.insert(41, item.getItemQuantity());
                line.insert(53, (item.getItemQuantity() * item.getItemValue()));
                menu = menu + line.toString();
                return menu;
            }
            else {
                
                    /*Do nothing - do not display this item*/
                return menu;
            }
        }
        menu = menu + "\n" + "\n R - Return to game menu";
        return menu;
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "1": //item 1.
                this.option1();
                break;
            case "2": //item 2.
                this.option2();
                break;
            case "3": //item 3.
                this.option3();
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

    private void option1() {
        System.out.println("\n ***Sell option 1 ***");
    }
     private void option2() {
        System.out.println("\n ***Sell option 2 ***");
     }
      private void option3() {
        System.out.println("\n ***Sell option 3 ***");
    }

     private void openGameMenu() {
       GameMenuView GameMenuView = new GameMenuView();
       GameMenuView.display();
    }
}

