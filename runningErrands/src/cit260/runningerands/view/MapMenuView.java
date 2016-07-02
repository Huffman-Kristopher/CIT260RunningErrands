/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.MapControl;
import cit260.runningerrands.model.Location;
import cit260.runningerrands.model.Map;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class MapMenuView extends View {
    
    public MapMenuView(String menu) {
        super(menu);
    }

    public String MapMenuValues() {
        
        Persona persona = RunningErrands.getPersona();
        Location currentlocation = persona.getLocation();
        String locationSymbol = currentlocation.getScene().getLocationSymbol();
        String menu = RunningErrands.getCurrentGame().getMap().getTravelMapString(locationSymbol);
        
        menu = "\n------------------------------------"
                  + "\n| Map Menu                        |" 
                  + "\n------------------------------------"
                  + "\n" + menu;
        menu += "-------------------------" 
        + "\nPlease select a location to visit or press R to return to Game Menu";
        
        MapMenuView mapMenuView = new MapMenuView(menu);
        mapMenuView.display();
        return menu;
    }
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        System.out.println(value) ;
        if ("R".equals(value)) {
            this.openGameMenu();
            return true;
        }
        else {
                System.out.println("Inside doAction: " + value);
                MapControl.movePersonaToNewLocation(value);
                return true;
        }

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

    private void openGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();   
    }

    private void travelHome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
