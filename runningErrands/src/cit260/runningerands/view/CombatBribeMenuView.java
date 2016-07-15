/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.ItemControl;
import cit260.runningerrands.control.MapControl;
import cit260.runningerrands.control.ObjectiveControl;
import static cit260.runningerrands.control.ObjectiveControl.checkObjectiveCompletedToday;
import cit260.runningerrands.control.PersonaControl;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Npc;
import cit260.runningerrands.model.Persona;
import cit260.runningerrands.model.Scene;
import java.util.Random;
import runningerrands.RunningErrands;

/**
 *
 * @author reddo
 */
public class CombatBribeMenuView extends View {
    
        public CombatBribeMenuView(String menu) {
        super(menu);
    }

    public String CombatBribeMenuValues() {
        
        Persona persona = RunningErrands.getPersona();
        Scene currentScene = persona.getLocation().getScene();
        int npcStrength = currentScene.getNpc().getNpcStrength();
        int npcHealth = currentScene.getNpc().getNpcHealth();
        int playerHealth = persona.getHealth();
        int playerStrength = persona.getWeaponItem().getStrength();
        Item combatWinItem = persona.getLocation().getScene().getCombatWinItem();
        String combatWinItemDescription = combatWinItem.getDescription();
        String npcName = currentScene.getNpc().getNpcName();
        String menu;
        menu = "\n"
                + "\n------------------------------------"
                + "\n| Bribe Attempt Menu                 |" 
                + "\n------------------------------------"
                + "\nSo, you want to give " + npcName + " a bribe, eh?"
                + "\nHow much do you think it is worth?"
                + "\nYou are facing " + npcName + ", who currently has a strength of " + npcStrength + " and " + npcHealth + " health."
                + "\nYour health is at " + playerHealth + ", and your strength is " + playerStrength
                + "Please enter a bribe amount, or R to return to previous menu.";
        
        CombatBribeMenuView combatBribeMenuView = new CombatBribeMenuView(menu);
        combatBribeMenuView.display();
        
        return menu;
    }

            
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        Persona persona = RunningErrands.getPersona();
        Item combatWinItem = persona.getLocation().getScene().getCombatWinItem();
        String combatWinItemDescription = combatWinItem.getDescription();
        Item weaponItem = persona.getWeaponItem();
        int maxBribe = (persona.getMoney() / 2);
        int startingBalance = persona.getMoney();
        Scene scene = persona.getLocation().getScene();
        Npc npc = scene.getNpc();
        String npcName = npc.getNpcName();
        int npcStrength = npc.getNpcStrength();
        int npcHealth =  npc.getNpcHealth();
        int bribeAmount = Integer.parseInt(value);
        String menu = "";
        
        switch (value) {
            case "R": //Return to game menu.
                return true;
            default:
                try {
                    if(bribeAmount > maxBribe) {
                        this.console.println("You may only pay up to " + maxBribe + ". Please enter a new amount." );
                        CombatBribeMenuView combatBribeMenuView = new CombatBribeMenuView(menu);
                        combatBribeMenuView.CombatBribeMenuValues();
                        return true;
                    }
                    else {
                        Random r = new Random();
                        int bribeNeeded = r.nextInt(((npcStrength * npcHealth)) + 1) + npcStrength;
                        if(bribeAmount >= bribeNeeded) {
                            this.console.println("Congratulations! " + npcName + " accepted your bribe. You have received a " + combatWinItemDescription + ".");
                            ItemControl.receiveItem(combatWinItem, 1);
                            int newBalance = startingBalance - bribeAmount;
                            persona.setMoney(newBalance);
                            scene.setBribeAttemptedToday(true);
                            npc.setNpcHealth(0);
                            return true;
                        }
                        else {
                            this.console.println("I'm sorry. " + npcName + " did not accept your bribe. Unfortunately, you're still facing him!");
                            CombatAttackMenuView combatAttackMenuView = new CombatAttackMenuView(menu);
                            combatAttackMenuView.CombatAttackMenuValues();
                            scene.setBribeAttemptedToday(true);
                            return true;
                        }
                    }
                        
                    } catch (NumberFormatException ne) {
                        this.console.println("Error reading input. Please enter a number");
                        ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please select an option above.");
                        return false;
                    }
                
        }
        
        
    }
    private void travelHome() {
        String objectiveCompletedToday = checkObjectiveCompletedToday();
        this.console.println(objectiveCompletedToday);
        boolean winCondition = ObjectiveControl.checkWinCondition();
        if (winCondition) {
            WinGameMenu winGameMenu = new WinGameMenu();
            winGameMenu.display();
        }
        else {
            PersonaControl.addOneDay();
            MapControl.movePersonaToNewLocation("01");
            String menu = "";
            SceneMenuView sceneMenuView = new SceneMenuView(menu);
            sceneMenuView.SceneMenuValues();
        }
    }
    
    private void openSceneMenu() {
        String menu = "";
        SceneMenuView sceneMenuView = new SceneMenuView(menu);
        sceneMenuView.SceneMenuValues();
    }
}
