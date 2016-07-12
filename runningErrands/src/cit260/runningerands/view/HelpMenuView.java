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
                  + "\nC - How do I engage in combat?"
                  + "\nP - How do I purchase items?"
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
           
            case "C": //Open help menu
                this.showCombatHelp();
                break;
            case "P": //Open help menu
                this.showPurchaseHelp();
                break;
            
            case "E": //Open help menu
                this.showMoneyHelp();
                break;
            case "R": //Open help menu
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid selection, please try again");
                break;  
        }

        return true;


}

    private void showObjectiveHelp() {
        this.console.println("\n"
                + "\n Each place has an objective.  "
                + "\n Travel to a place and find a hint for what the objective is"
                + "\n or try to find hints in your emails."
                + "\n");
    }

    private void showMovementHelp() {
        this.console.println("\n"
                + "\nBring up the travel menu and select a destination by typing "
                + "\nits corrisponding number. Youwill then go to that location"
                + "\n and have options based on the location you are in. "
                + "\n");
    }

   

    private void showCombatHelp() {
        this.console.println("\n"
                + "\nCombat can be brutal. Be sure to have a good weapon before"
                + "\nYou engage in combat. You start off with a baseball bat, and "
                + "\nit can handle some stuff, let me tell you.  "
                + "\nYou have three options in the combat menu, first is selecting a "
                + "\nweapon. open this menu to shoose your weapon. Second is to "
                + "\nAttack, this is where all the magic happens or you die, one"
                + "\n or the other. Last you can run away, like a coward, but maybe "
                + "\nyou live another day. Keep in mind people can hit you while "
                + "\nyou run away."
                + "\n");
    }

    private void showPurchaseHelp() {
        this.console.println("\n"
                + "\nDifferent places have different things to purchase. The prices "
                + "\nrange from cheep to how can I ever afford that. i suggest finding a "
                + "\nway to cheat, but thats just me. each item has an item number "
                + "\nuse this number to select the items to buy and sell. You will "
                + "\nget the item if you can afford it or the money from selling it."
                + "\n");
    }
   
    private void showMoneyHelp() {
        this.console.println("\n"
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
