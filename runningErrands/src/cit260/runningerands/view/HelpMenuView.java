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
                  + "\nS - How do I sell items?"
                  + "\nE - How do I earn money?"
                  + "\nR - Return to main menu"
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
            case "S": //Open help menu
                this.showSellHelp();
                break;
            case "E": //Open help menu
                this.showMoneyHelp();
                break;
            case "R": //Open help menu
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return true;


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

    private void showSellHelp() {
        System.out.println("*** showSellHelp function called ***");
    }

    private void showMoneyHelp() {
        System.out.println("\n"
                + "\nThere are 4 ways to earn money in this game. First, you earn "
                + "\na Salary each day. You can view your salary on the Stats menu."
                + "\nNext, you may choose to gamble. Gambling is risky, and if you "
                + "\ndon't know what you're doing, you will likely lose! You may "
                + "\ngamble by visiting the Gambling menu. Third, you may invest"
                + "\nyour money. Investing your money takes time, but can present "
                + "\nhuge yields. You may invest your money by visiting the "
                + "\nInvestment menu. Finally, you can earn money by selling "
                + "\ncertain items. Keep in mind that many items can be used as a"
                + "\nweapon, and some items are needed to fulfill objectives.");
    }
}
