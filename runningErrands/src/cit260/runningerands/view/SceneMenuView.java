/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.MapControl;
import cit260.runningerrands.control.PersonaControl;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Location;
import cit260.runningerrands.model.Persona;
import cit260.runningerrands.model.Scene;
import runningerrands.RunningErrands;

/**
 *
 * @author reddo
 */
public class SceneMenuView extends View {
    
        public SceneMenuView(String menu) {
        super(menu);
    }

    public String SceneMenuValues() {
        
        String menu;
        Persona persona = RunningErrands.getPersona();
        Location currentLocation = persona.getLocation();
        Scene currentScene = currentLocation.getScene();
        String currentSceneDescription = currentScene.getDescription();
        String menuOption1 = currentScene.getMenuOption1();
        String menuOption2 = currentScene.getMenuOption2();
        String menuOption3 = currentScene.getMenuOption3();
        if ( currentSceneDescription == "Home") {
            
            menu = "\n------------------------------------"
                  + "\n  "  + currentSceneDescription + " Menu"
                  + "\n------------------------------------"
                  + "\n1 - View Email"  
                  + "\n2 - " + menuOption1
                  + "\n3 - " + menuOption2
                  + "\n4 - " + menuOption3
                  + "\n5 - Map"
                  + "\n6 - Travel"
                  + "\n7 - View Stats"
                  + "\n8 – Investments"
                  + "\n9 – Gambling"
                  + "\nH – Help Menu"
                  + "\nS – Save Game"
//                  + "\nL – Load Game"
                  + "\nQ – Quit Game"
                  + "\nA - TEST ADDING ONE DAY"
                  + "\n-------------------------"
                  + "\nPlease select a menu option: ";

        SceneMenuView sceneMenuView = new SceneMenuView(menu);
        sceneMenuView.display();
        }
        else {
            String menuOption0 = "";
            menu = "\n------------------------------------"
                  + "\n  "  + currentSceneDescription + " Menu"
                  + "\n------------------------------------"
                  + "\n1 - View Email"  
                  + "\n2 - " + menuOption1
                  + "\n3 - " + menuOption2
                  + "\n4 - " + menuOption3
                  + "\n5 - Map"
                  + "\n6 - Go Home"
                  + "\n7 - View Stats"
                  + "\n8 – Investments"
                  + "\n9 – Gambling"
                  + "\nH – Help Menu"
                  + "\nS – Save Game"
//                  + "\nL – Load Game"
                  + "\nQ – Quit Game"
                  + "\n-------------------------"
                  + "\nPlease select a menu option: ";

        SceneMenuView sceneMenuView = new SceneMenuView(menu);
        sceneMenuView.display();
        }
        
        return menu;
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        String currentSceneDescription = RunningErrands.getPersona().getLocation().getScene().getDescription();
        switch (value) {
            case "1": //open email and get objectives.
                this.openEmailMenu();
                return false;
            case "2":
                this.openCombatMenu();
                return false;
            case "3":
                this.openConversationMenu();
                return false;
            case "4":
                this.openBuySellMenu();
                return false;
            case "5": //open map.
                this.displayMap();
                return false;
            case "6": //open map.
                if ("Home".equals(currentSceneDescription)) {
                    this.openTravelMenu();
                    return false;
                }
                else {
                    this.travelHome();
                    return false;
                }
            case "7": //open store.
                this.openStatsMenu();
                return false;
            case "8": //open inveestments.
                this.openInvestmentMenu();
                return false;
            case "9": //gamble.
                this.openGamblingMenu();
                return false;
            case "S": //save the game.
                this.OpensaveGame();
                return false;
/**            case "L": //load the game.
                this.openLoadGame();
                return false;
**/
            case "H": //open help menu.
                this.openHelpMenu();
                return false;
            case "Q": //return to main menu.
                this.openMainMenu();
                return true;
            default:
                System.out.println("\nInvalid main menu selection, please try again");
                return false;  
        }
    }


    private void openTravelMenu() {
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

    private void openCombatMenu() {
        System.out.println("\n ***Runs Combat menu function ***");
    }

    private void openConversationMenu() {
        System.out.println("\n ***Runs Conversation menu function ***");
    }

    private void openBuySellMenu() {
        System.out.println("\n ***Runs Store menu function ***");
    }

    private void travelHome() {
        
        PersonaControl.addOneDay();
        MapControl.movePersonaToNewLocation("01");
        this.SceneMenuValues();
        this.display();
    }
        
    }