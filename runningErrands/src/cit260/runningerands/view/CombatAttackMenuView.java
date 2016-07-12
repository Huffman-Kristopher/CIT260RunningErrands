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
public class CombatAttackMenuView extends View {
    
        public CombatAttackMenuView(String menu) {
        super(menu);
    }

    public String CombatAttackMenuValues() {
        
        Persona persona = RunningErrands.getPersona();
        Scene currentScene = persona.getLocation().getScene();
        int npcStrength = currentScene.getNpc().getNpcStrength();
        int npcHealth = currentScene.getNpc().getNpcHealth();
        int playerHealth = persona.getHealth();
        int playerStrength = persona.getWeaponItem().getStrength();
        Npc npc = currentScene.getNpc();
        String npcDescription = npc.getNpcDescription();
        String objectiveItem = persona.getLocation().getScene().getObjective().getObjectiveItem().getDescription();
        String npcName = npc.getNpcName();
        String menu;
        menu = "\n"
                + "\n------------------------------------"
                + "\n| Combat Attack Menu                        |" 
                + "\n------------------------------------"
                + "\nPlease select a Game menu option: "
                + "\nA - Attack"
                + "\nE - Escape"
                + "\nB - Bribe"
                + "\n"
                + "\n You are facing " + npcName + ". " 
                + "\n" + npcDescription
                + "\n"
                + "\n" + npcName + " has currently has a strength of " + npcStrength + " and " + npcHealth + " health."
                + "\nYour health is at " + playerHealth + ", and your strength is " + playerStrength
                + "\nIf you defeat " + npcName + ", you will receive a " + objectiveItem + "."
                ;
        
        CombatAttackMenuView combatAttackMenuView = new CombatAttackMenuView(menu);
        combatAttackMenuView.display();
        
        return menu;
    }

            
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        Persona persona = RunningErrands.getPersona();
        Item objectiveItem = persona.getLocation().getScene().getObjective().getObjectiveItem();
        String objectiveItemDescription = objectiveItem.getDescription();
        Item weaponItem = persona.getWeaponItem();
        int playerStrength = weaponItem.getStrength();
        int playerHealth = persona.getHealth();
        Scene scene = persona.getLocation().getScene();
        Npc npc = scene.getNpc();
        String npcName = npc.getNpcName();
        int npcStrength = npc.getNpcStrength();
        int npcHealth =  npc.getNpcHealth();
        int minimumDamage = 1;
        
        switch (value) {
            case "A":
                try {
                    if(npcStrength > playerStrength) {
                        int difference = npcStrength - playerStrength;
                        Random r = new Random();
                        int playerDamage = r.nextInt((difference - minimumDamage) + 1) + minimumDamage;
                        int newPlayerHealth = playerHealth - playerDamage;
                        int npcDamage = r.nextInt(((difference - minimumDamage) /2 ) + 1) + minimumDamage;
                        int newNpcHealth = npcHealth - npcDamage;
                        if(newPlayerHealth < 1) {
                            this.console.println("Oh no! You were killed by " + npcName + "! You will now be sent home." );
                            this.travelHome();
                        }
                        if(newNpcHealth < 1 ) {
                            npc.setNpcHealth(newNpcHealth);
                            this.console.println("Congratulations! You killed " + npcName + ". You have received a " + objectiveItemDescription + ".");
                            ItemControl.receiveItem(objectiveItem, 1);
                            return true;
                        }
                        else {
                            npc.setNpcHealth(newNpcHealth);
                            persona.setHealth(newPlayerHealth);
                            this.console.println("You caused " + npcDamage + " damage to " + npcName + ". Their health has dropped to " + newNpcHealth + ".");
                            this.console.println("You received " + playerDamage + " damage. Your new health is " + newPlayerHealth + ".");
                            String menu = "";
                            CombatAttackMenuView combatAttackMenuView = new CombatAttackMenuView(menu);
                            combatAttackMenuView.CombatAttackMenuValues();
                            return true;
                        }
                    }
                    if(playerStrength > npcStrength) {
                        /** damage towards npc **/
                        int difference = playerStrength - npcStrength;
                        Random r = new Random();
                        int npcDamage = r.nextInt((difference - minimumDamage) + 1) + minimumDamage;
                        int newNpcHealth = npcHealth - npcDamage;
                        int playerDamage = r.nextInt(((difference - minimumDamage) / 2 ) + 1) + minimumDamage;
                        int newPlayerHealth = playerHealth - playerDamage;
                        if(newNpcHealth <1) {
                            npc.setNpcHealth(newNpcHealth);
                            this.console.println("Congratulations! You killed " + npcName + ". You have received a " + objectiveItemDescription + ".");
                            ItemControl.receiveItem(objectiveItem, 1);
                            return true;
                        }
                        if(newPlayerHealth < 1) {
                            this.console.println("Oh no! You were killed by " + npcName + "! You will now be sent home." );
                            this.travelHome();
                        }
                        else {
                            npc.setNpcHealth(newNpcHealth);
                            this.console.println("You caused " + npcDamage + " damage to " + npcName + ". Their health has dropped to " + newNpcHealth + ".");
                            this.console.println("You received " + playerDamage + " damage. Your new health is " + newPlayerHealth + ".");
                            String menu = "";
                            CombatAttackMenuView combatAttackMenuView = new CombatAttackMenuView(menu);
                            combatAttackMenuView.CombatAttackMenuValues();
                            return true;
                        }
                    }
                    else {
                        /** damage towards both **/
                        Random npcRandom = new Random();
                        int npcDamage = npcRandom.nextInt((npcStrength - minimumDamage) + 1) + minimumDamage;
                        Random playerRandom = new Random();
                        int playerDamage = playerRandom.nextInt((npcStrength - minimumDamage ) + 1) + minimumDamage;
                        int newNpcHealth = npcHealth - npcDamage;
                        int newPlayerHealth = playerHealth - playerDamage;
                        if (newNpcHealth < 1) {
                            npc.setNpcHealth(newNpcHealth);
                            this.console.println("Congratulations! You killed " + npcName + ". You have received a " + objectiveItemDescription + ".");
                            ItemControl.receiveItem(objectiveItem, 1);
                            int beginningNpcHealth = npc.getStartingNpcHealth();
                            npc.setNpcHealth(beginningNpcHealth);
                            String menu = "";
                            SceneMenuView sceneMenuView = new SceneMenuView(menu);
                            sceneMenuView.SceneMenuValues();
                            return true;    
                        }
                        if (newPlayerHealth < 1) {
                            this.console.println("Oh no! You were killed by " + npcName + "! You will now be sent home." );
                            int beginningNpcHealth = npc.getStartingNpcHealth();
                            npc.setNpcHealth(beginningNpcHealth);
                            this.travelHome();
                            return true;
                        }
                        else {
                            npc.setNpcHealth(newNpcHealth);
                            persona.setHealth(newPlayerHealth);
                            this.console.println("You caused " + npcDamage + " damage to " + npcName + ". Their health has dropped to " + newNpcHealth + ".");
                            this.console.println("You received " + playerDamage + " damage. Your new health is " + newPlayerHealth + ".");
                            String menu = "";
                            CombatAttackMenuView combatAttackMenuView = new CombatAttackMenuView(menu);
                            combatAttackMenuView.CombatAttackMenuValues();
                            return true;
                        }
                        
                    }
                } catch (NumberFormatException ne) {
                   ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please select an option above.");
                    return false;
                }
            case "E":
                try {
                    Random playerRandom = new Random();
                    int playerDamage = playerRandom.nextInt(((npcStrength - minimumDamage )* 2) + 1) + minimumDamage;
                    int newPlayerHealth = playerHealth - playerDamage;
                    if (newPlayerHealth < 1) {
                        this.console.println("Oh no! You were killed by " + npcName + " while trying to escape! You will now be sent home." );
                        int beginningNpcHealth = npc.getStartingNpcHealth();
                        npc.setNpcHealth(beginningNpcHealth);
                        this.travelHome();
                        return true;
                    }
                    else {
                        persona.setHealth(newPlayerHealth);
                        this.console.println("You received " + playerDamage + " damage while trying to escape. Your new health is " + newPlayerHealth + ".");
                        String menu = "";
                        SceneMenuView sceneMenuView = new SceneMenuView(menu);
                        sceneMenuView.SceneMenuValues();
                        return true;
                    }
                    
                } catch (NumberFormatException ne) {
                   ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please select an option above.");
                    return false;
                }
            case "B":
                try {
                    boolean bribeAttemptedToday = scene.isBribeAttemptedToday();
                    if(bribeAttemptedToday) {
                        this.console.println("I'm sorry. You may only make one bribe attempt per day. Please select another option.");
                        String menu = "";
                        CombatAttackMenuView combatAttackMenuView = new CombatAttackMenuView(menu);
                        combatAttackMenuView.CombatAttackMenuValues();
                        return true;
                    }
                    else {
                        String menu = "";
                        CombatBribeMenuView combatBribeMenuView = new CombatBribeMenuView(menu);
                        combatBribeMenuView.CombatBribeMenuValues();
                        return true;
                    }
                } catch (NumberFormatException ne) {
                   ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please select an option above.");
                    return false;
                }
            default:
                   ErrorView.display(this.getClass().getName(), "Error reading input:" + "\nInvalid selection, please select an option above.");
                    return false;
                
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
}
