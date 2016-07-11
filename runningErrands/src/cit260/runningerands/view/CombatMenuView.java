/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.model.Npc;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman And Kirk Brown
 */
public class CombatMenuView extends View {

    public CombatMenuView() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Combat Menu                        |" 
                  + "\n------------------------------------"
                  + "\nS - Select Weapon"
                  + "\nA - Attack"
                  + "\nQ - Return to Game Menu"
                  + "\n-------------------------"
                  + "\nPlease select an Game menu option: ");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "Q":
                return true;
            case "S": //create and start a new game
                this.weaponSelect();
                break;
            case "A": //load saved game
                this.attack();
                break;
            case "R": //Open help menu
                this.runAway();
                break;
            case "N": //Open help menu
                this.bribe();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection, please try again");
                break;  
        }

        return false;
    }
    
    private void weaponSelect() {
        // Display weapon select
        String menu = "";
        CombatSelectWeaponMenuView combatSelectWeaponMenuView = new CombatSelectWeaponMenuView(menu);
        combatSelectWeaponMenuView.CombatSelectWeaponMenuValues();        
                }
    private void attack() {
        //Display attack
        Persona persona = RunningErrands.getPersona();
        Npc npc = persona.getLocation().getScene().getNpc();
        int npcHealth = npc.getNpcHealth();
        String npcName = npc.getNpcName();
        if (npcHealth < 0) {
            this.console.println("You have already defeated " + npcName + " today. Please try again another day.");
        }
        String menu = "";
        CombatAttackMenuView combatAttackMenuView = new CombatAttackMenuView(menu);
        combatAttackMenuView.CombatAttackMenuValues();
    }
    private void runAway() {
        //Display runaway
   this.console.println("*** runAway function called ***");
    }
    private void bribe() {
        //Display bribe
    this.console.println("*** bribe function called ***");
    }
    
}
