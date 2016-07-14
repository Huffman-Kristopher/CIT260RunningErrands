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
public class CombatSelectWeaponMenuView extends View {
    
        public CombatSelectWeaponMenuView(String menu) {
        super(menu);
    }

public String CombatSelectWeaponMenuValues() {
        
        StringBuilder line;
        Persona persona = RunningErrands.getPersona();
        Item[] inventory = persona.getItem();
        
        this.console.println("\n      LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                              ");
        line.insert(0, "Description");
        line.insert(20, "Required");
        line.insert(30, "Strength");
        String menu = line.toString();
        
        for (Item item : inventory) {
            
            if(item.getItemType() == "Weapon") {
                if(item.getItemQuantity() > 0) {
                    line= new StringBuilder("                                                  ");
                    line.insert(0,item.getItemNumber());
                    line.insert(4,item.getDescription());
                    line.insert(27, item.getRequiredAmount());
                    line.insert(37, item.getStrength());

                    menu = menu + "\n" + line.toString();
                }
                else {
                    /* Do nothing */                    
                }
            }
            else {
                
                /* Do nothing*/
            }
        }
        
        CombatSelectWeaponMenuView combatSelectWeaponMenuView = new CombatSelectWeaponMenuView(menu);
        combatSelectWeaponMenuView.display();
        
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
                    if (currentItem.getItemType() != "Weapon") {

                        this.console.println("\nPlease select a weapon item.");
                        return false;
                    }

                    else {
                        String description = currentItem.getDescription();
                        persona.setWeaponItem(currentItem);
                        this.console.println("You have selected the following weapon: " + description);
                        return true;
                    }
                } catch (NumberFormatException ne) {
                    this.console.println("Error reading input. Please enter a selectin from above.");
                    ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please select an option above.");
                    return false;
                }
        }
        
        
        }
}
    