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
        super("\nAs you wander the area, you encounter a gruff looking man who quietly motions " 
            + "\nyou over. Press Y to talk to this stranger, or R to run away. \n");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        Persona persona = RunningErrands.getPersona();
        Location currentLocation = persona.getLocation();
        Scene currentScene = currentLocation.getScene();
        String sceneType = currentScene.getConversationMenuType();
        Objective objective = currentScene.getObjective();
        int objectiveItemReq = objective.getObjectiveQtyRequired();
        Objective[] objectives = RunningErrands.getObjective();
        

        
        
        switch (value) {
            case "R":
                this.openSceneMenuView();
                return true;
            case "Y":
                try{
                    if (sceneType == "Give") {
                        int giveItemReq = 0;
                        Item giveItem = currentScene.getItemToDeliver();
                        int giveItemOnHand = giveItem.getItemQuantity();
                        String giveItemDesc = giveItem.getDescription();

                            for (Objective objectiveList : objectives ) {
                                if(objectiveList.getObjectiveItem() == giveItem) {
                                    giveItemReq = objectiveList.getObjectiveQtyRequired();
                                }
                                else {
                                    /** Do nothing - keep giveItemQty at it's current setting **/
                                }
                        }

                        if(giveItemOnHand < giveItemReq) {
                            
                            String sceneFailureText = objective.getObjectiveNotEnoughText();
                            this.console.println(sceneFailureText);
                            this.openSceneMenuView();
                            return true;
                        }

                        else {
                            String sceneSuccessText = objective.getObjectiveCompleteText();
                            this.console.println(sceneSuccessText);
                            /** Remove required item from inventory**/
                            fulfillObjective(giveItem, giveItemReq);
                            markObjectiveComplete(objective);
                            this.openSceneMenuView();
                            return true;
                        }
                    } 

                    else {
                        Item receiveItem = currentScene.getItemToReceive();
                        int receiveItemOnHand = receiveItem.getItemQuantity();
                        String receiveItemDesc = receiveItem.getDescription();
                        int receiveItemReq = 0;

                        for (Objective objectiveList : objectives ) {
                                if(objectiveList.getObjectiveItem() == receiveItem) {
                                    receiveItemReq = objectiveList.getObjectiveQtyRequired();
                                }
                                else {
                                    /** Do nothing - keep giveItemQty at it's current setting **/
                                }
                        }

                        if(receiveItemOnHand >= receiveItemReq) {
                            String sceneFailureText = objective.getObjectiveAlreadyHaveItemsText();
                            this.console.println(sceneFailureText);
                            this.openSceneMenuView();
                            return true;
                        }

                        else {
                            int qtyToReceive = receiveItemReq - receiveItemOnHand;
                            String sceneSuccessText = objective.getObjectiveGiveItemText();
                            this.console.println(sceneSuccessText);
                            receiveItem(receiveItem, objectiveItemReq);
                            /** Add required item to inventory**/
                            this.openSceneMenuView();
                            return true;
                        }


                    }
                } catch (NumberFormatException nf){
                    this.console.println("Error reading input. Please press Y or R.");
                    ErrorView.display(this.getClass().getName(), "Error reading input:" + "enter a valid number");
                }
            default:
                this.console.println("Error reading input. Please press Y or R.");
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
