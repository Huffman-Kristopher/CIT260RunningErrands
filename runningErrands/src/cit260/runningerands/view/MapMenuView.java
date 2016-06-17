/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class MapMenuView extends View {
    
    public MapMenuView() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Map Menu                        |" 
                  + "\n------------------------------------"
                  + "\n01 - Home"
                  + "\n02 - Mall"
                  + "\n03 - Grocery store"
                  + "\n04 – Gas station"
                  + "\n05 – Gun shop"
                  + "\n06 – Sporting goods store"
                  + "\n07 – Library"
                  + "\n08 - Church"
                  + "\n09 – Hospital"
                  + "\n10 – School"
                  + "\n11 – Bank"
                  + "\n12 - Convenience store"
                  + "\n13 - Car repair shop"
                  + "\n14 – Martial arts school"
                  + "\n15 – Army base"
                  + "\n16 – Post office"
                  + "\n17 – Fireworks stand"
                  + "\n18 - Pet store"
                  + "\n19 – Marina "
                  + "\n20 – Home improvement store"
                  + "\n21 – Police station"
                  + "\n22 - Zoo"
                  + "\n23 - Natural history museum"
                  + "\n24 – Cemetery "
                  + "\n25 – Volcano"
                  + "\n26 – Pizza parlor"
                  + "\nR – Return to previous menu"
                  + "\n-------------------------"
                  + "\nPlease select an Game menu option: ");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "M": //open map.
                this.openMapMenu();
                break;
            case "V": //open store.
                this.openStoreMenu();
                break;
            case "I": //open inventory.
                this.openInventoryMenu();
                break;
            case "F": //open inveestments.
                this.openInvestmentMenu();
                break;
            case "G": //gamble.
                this.openGamblingMenu();
                break;
            case "S": //save the game.
                this.OpensaveGame();
                break;
            case "L": //load the game.
                this.openLoadGame();
                break;
            case "E": //open email and get objectives.
                this.openEmailMenu();
                break;
            case "H": //open help menu.
                this.openHelpMenu();
                break;
            case "K": //open stats.
                this.openStatsMenu();
                break;
            case "Q": //return to main menu.
                this.openMainMenu();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;

}

    private void openMapMenu() {
        System.out.println("\n ***Runs Map menu function ***");
    }

    private void openInventoryMenu() {
        System.out.println("\n ***Runs Inventroy menu function ***");
    }

    private void openInvestmentMenu() {
        //display investment menu
        InvestmentTypeMenuView InvestmentMenuView = new InvestmentTypeMenuView();
        InvestmentMenuView.display();
    }

    private void openGamblingMenu()  {
        //display Gambling menu
        String menu = "";
        GamblingAmountMenuView gamblingAmountMenuView = new GamblingAmountMenuView(menu);
        menu = gamblingAmountMenuView.GamblingMenuValues();
        gamblingAmountMenuView.display();
        //GameControl.createNewGame(RunningErrands.getPlayer());
    }

    private void OpensaveGame() {
       System.out.println("\n ***Runs save Game function ***");
    }

    private void openLoadGame() {
        System.out.println("\n ***Runs Load Game function ***");
    }

    private void openEmailMenu() {
        System.out.println("\n ***Runs email menu function ***");
    }

    private void openHelpMenu() {
        //Display Help Menu
        HelpMenuView HelpMenuView = new HelpMenuView();
        HelpMenuView.display();
    }

    private void openStatsMenu() {
        System.out.println("\n ***Runs stats menu function ***");
    }

    private void openStoreMenu() {
        StoreMenuView StoreMenuView = new StoreMenuView();
        StoreMenuView.display();
    }

    private void openMainMenu() {
    MainMenuView MainMenuView = new MainMenuView();
        MainMenuView.display();    
    }
    
}
