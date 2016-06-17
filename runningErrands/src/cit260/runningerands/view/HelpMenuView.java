/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class HelpMenuView extends View {
        
    public HelpMenuView() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Help Menu                         |" 
                  + "\n------------------------------------"
                  + "\nO - What is the game's objective?"
                  + "\nM - How do I get where I'm going? (movement)"
                  + "\nI - How do I use my inventory"
                  + "\nC - How do I engage in combat?"
                  + "\nP - How do I purchase items?"
                  + "\nB - Back to main menu"
                  + "\n-------------------------"
                  + "\nPlease select a help menu option: ");
    }    

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "O": //create and start a new game
                this.showObjectiveHelp();
                break;
            case "M": //load saved game
                this.showMovementHelp();
                break;
            case "I": //Open help menu
                this.showInventoryHelp();
                break;
            case "C": //Open help menu
                this.showCombatHelp();
                break;
            case "P": //Open help menu
                this.showPurchaseHelp();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;


}

    private void showObjectiveHelp() {
        System.out.println("*** showObjectiveHelp function called ***");
    }

    private void showMovementHelp() {
        System.out.println("*** showMovementHelp function called ***");
    }

    private void showInventoryHelp() {
        System.out.println("*** showInventoryHelp function called ***");
    }

    private void showCombatHelp() {
        System.out.println("*** showCombatHelp function called ***");
    }

    private void showPurchaseHelp() {
        System.out.println("*** showPurchaseHelp function called ***");
    }
}
