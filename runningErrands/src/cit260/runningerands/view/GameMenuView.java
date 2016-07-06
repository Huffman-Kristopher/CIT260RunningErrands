/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.PersonaControl;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman And Kirk Brown
 */
public class GameMenuView extends View{

    public GameMenuView() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Game Main Menu                        |" 
                  + "\n------------------------------------"
                  + "\nM - Map"
                  + "\nT - Travel"
                  + "\nV - Visit Store"
                  + "\nI - View Inventory"
                  + "\nF – Investments"
                  + "\nG – Gambling"
                  + "\nE - View Email"
                  + "\nK – Character Stats"
                  + "\nH – Help Menu"
                  + "\nS – Save Game"
//                  + "\nL – Load Game"
                  + "\nQ – Quit Game"
                  + "\nA - TEST ADDING ONE DAY"
                  + "\n-------------------------"
                  + "\nPlease select a menu option: ");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "M": //open map.
                this.displayMap();
                return false;
            case "T": //open map.
                this.openMapMenu();
                return false;
            case "V": //open store.
                this.openStoreMenu();
                return false;
            case "I": //open inventory.
                this.viewInventory();
                return false;
            case "F": //open inveestments.
                this.openInvestmentMenu();
                return false;
            case "G": //gamble.
                this.openGamblingMenu();
                return false;
            case "S": //save the game.
                this.OpensaveGame();
                return false;
/**            case "L": //load the game.
                this.openLoadGame();
                return false;
**/
            case "E": //open email and get objectives.
                this.openEmailMenu();
                return false;
            case "H": //open help menu.
                this.openHelpMenu();
                return false;
            case "K": //open stats.
                this.openStatsMenu();
                return false;
            case "Q": //return to main menu.
                this.openMainMenu();
                return true;
            case "A": //return to main menu.
                this.addOneDay();
                return false;
            default:
                System.out.println("\nInvalid main menu selection, please try again");
                return false;  
        }
    }


    private void openMapMenu() {
        String menu = "";
        TravelMenuView mapMenuView = new TravelMenuView(menu);
        mapMenuView.MapMenuValues();
        
    }

    private void openInvestmentMenu() {
        //display investment menu
        InvestmentTypeMenuView investmentMenuView = new InvestmentTypeMenuView();
        investmentMenuView.display();
    }

    private void openGamblingMenu()  {
        //display Gambling menu
        String menu = "";
        GamblingAmountMenuView gamblingAmountMenuView = new GamblingAmountMenuView(menu);
        gamblingAmountMenuView.GamblingMenuValues();
        
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
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void openStatsMenu() {
        String menu = "";
        StatsMenuView statsMenuView = new StatsMenuView(menu);
        statsMenuView.StatsValues();
    }

    private void openStoreMenu() {
        StoreMenuView storeMenuView = new StoreMenuView();
        storeMenuView.display();
    }

    private void openMainMenu() {
    MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();    
    }

    private void addOneDay() {
        PersonaControl.addOneDay();
    }

    private void viewInventory() {
        
        StringBuilder line;
        Persona persona = RunningErrands.getPersona();
        Item[] inventory = persona.getItem();
        
        System.out.println("\n      LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                              ");
        line.insert(0, "Description");
        line.insert(20, "Required");
        line.insert(30, "In Stock");
        System.out.println(line.toString());
        
        for (Item item : inventory) {
            
            if(item.getItemQuantity() > 0) {
            line= new StringBuilder("                              ");
            line.insert(0,item.getDescription());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getItemQuantity());
            
            System.out.println(line.toString());
            }
            else {
                
                /* Do nothing*/
            }
        }
        
    }

    private void displayMap() {
            
            System.out.println(RunningErrands.getCurrentGame().getMap().getMapString());
        }
        
    }
    

