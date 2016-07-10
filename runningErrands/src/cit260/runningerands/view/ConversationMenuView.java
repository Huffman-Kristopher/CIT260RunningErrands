/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import static cit260.runningerrands.control.ItemControl.fulfillObjective;
import static cit260.runningerrands.control.ItemControl.receiveItem;
import static cit260.runningerrands.control.ObjectiveControl.markObjectiveComplete;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Location;
import cit260.runningerrands.model.Objective;
import cit260.runningerrands.model.Persona;
import cit260.runningerrands.model.Scene;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class ConversationMenuView extends View {
        
    public ConversationMenuView() {
        super("Press Y to ask about your tasks.");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        Persona persona = RunningErrands.getPersona();
        Location currentLocation = persona.getLocation();
        Scene currentScene = currentLocation.getScene();
        String sceneType = currentScene.getConversationMenuType();
        Objective objective = currentScene.getObjective();
        
        switch (value) {
            case "R":
                this.openSceneMenuView();
                return true;
            case "Y":
                if (sceneType == "Give") {
                    Item giveItem = objective.getObjectiveItem();
                    String itemDescription = giveItem.getDescription();
                    int giveItemQtyOnHand = giveItem.getItemQuantity();
                    int giveItemQtyReq = objective.getObjectiveQtyRequired();

                    if(giveItemQtyOnHand < giveItemQtyReq) {
                        String sceneFailureText = currentScene.getConversationFailureText();
                        this.console.println(sceneFailureText);
                        this.openSceneMenuView();
                        return true;
                    }

                    else {
                        String sceneSuccessText = currentScene.getConversationSuccessText();
                        this.console.println(sceneSuccessText);
                        /** Remove required item from inventory**/
                        fulfillObjective(giveItem, giveItemQtyReq);
                        markObjectiveComplete(objective);
                        this.openSceneMenuView();
                        return true;
                    }
                } 

                else {
                    Item receiveItem = objective.getObjectiveItem();
                    int receiveItemQtyOnHand = receiveItem.getItemQuantity();
                    int receiveItemQtyReq = objective.getObjectiveQtyRequired();
                    if(receiveItemQtyOnHand >= receiveItemQtyReq) {
                        String sceneFailureText = currentScene.getConversationFailureText();
                        this.console.println(sceneFailureText);
                        this.openSceneMenuView();
                        return true;
                    }

                    else {
                        String sceneSuccessText = currentScene.getConversationSuccessText();
                        this.console.println(sceneSuccessText);
                        receiveItem(receiveItem, receiveItemQtyReq);
                        /** Add required item to inventory**/
                        this.openSceneMenuView();
                        return true;
                    }


                }
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection, please try again");
                return false;  

        }
        
    }
    
    private void openSceneMenuView() {
        String menu = "";
        SceneMenuView sceneMenuView = new SceneMenuView(menu);
        sceneMenuView.SceneMenuValues();

    }
    
}
