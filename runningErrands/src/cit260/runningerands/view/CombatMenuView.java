/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

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
                  + "\nR - Run Away"
                  + "\nN - Negotiate"
                  + "\n-------------------------"
                  + "\nPlease select an Game menu option: ");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
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
       this.console.println("*** weapon select function called ***");
    }
    private void attack() {
        //Display attack
        this.console.println("*** attack function called ***");
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
