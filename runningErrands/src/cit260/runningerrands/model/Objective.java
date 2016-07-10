/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class Objective implements Serializable{
        
    private Item objectiveItem;
    private int objectiveQtyRequired;
    private String objectiveCompleteText;
    private boolean objectiveCompleteFlag;
    private boolean objectiveCompletedTodayFlag;
    private String objectiveNotEnoughText;
    private String objectiveAlreadyHaveItemsText;
    private String objectiveGiveItemText;

    public Item getObjectiveItem() {
        return objectiveItem;
    }

    public void setObjectiveItem(Item objectiveItem) {
        this.objectiveItem = objectiveItem;
    }

    public int getObjectiveQtyRequired() {
        return objectiveQtyRequired;
    }

    public void setObjectiveQtyRequired(int objectiveQtyRequired) {
        this.objectiveQtyRequired = objectiveQtyRequired;
    }

    public String getObjectiveCompleteText() {
        return objectiveCompleteText;
    }

    public void setObjectiveCompleteText(String objectiveCompleteText) {
        this.objectiveCompleteText = objectiveCompleteText;
    }

    public boolean isObjectiveCompleteFlag() {
        return objectiveCompleteFlag;
    }

    public void setObjectiveCompleteFlag(boolean objectiveCompleteFlag) {
        this.objectiveCompleteFlag = objectiveCompleteFlag;
    }

    public boolean isObjectiveCompletedTodayFlag() {
        return objectiveCompletedTodayFlag;
    }

    public void setObjectiveCompletedTodayFlag(boolean objectiveCompletedTodayFlag) {
        this.objectiveCompletedTodayFlag = objectiveCompletedTodayFlag;
    }

    public String getObjectiveNotEnoughText() {
        return objectiveNotEnoughText;
    }

    public void setObjectiveNotEnoughText(String objectiveNotEnoughText) {
        this.objectiveNotEnoughText = objectiveNotEnoughText;
    }

    public String getObjectiveAlreadyHaveItemsText() {
        return objectiveAlreadyHaveItemsText;
    }

    public void setObjectiveAlreadyHaveItemsText(String objectiveAlreadyHaveItemsText) {
        this.objectiveAlreadyHaveItemsText = objectiveAlreadyHaveItemsText;
    }

    public String getObjectiveGiveItemText() {
        return objectiveGiveItemText;
    }

    public void setObjectiveGiveItemText(String objectiveGiveItemText) {
        this.objectiveGiveItemText = objectiveGiveItemText;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.objectiveItem);
        hash = 71 * hash + this.objectiveQtyRequired;
        hash = 71 * hash + Objects.hashCode(this.objectiveCompleteText);
        hash = 71 * hash + (this.objectiveCompleteFlag ? 1 : 0);
        hash = 71 * hash + (this.objectiveCompletedTodayFlag ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.objectiveNotEnoughText);
        hash = 71 * hash + Objects.hashCode(this.objectiveAlreadyHaveItemsText);
        hash = 71 * hash + Objects.hashCode(this.objectiveGiveItemText);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Objective other = (Objective) obj;
        if (this.objectiveQtyRequired != other.objectiveQtyRequired) {
            return false;
        }
        if (this.objectiveCompleteFlag != other.objectiveCompleteFlag) {
            return false;
        }
        if (this.objectiveCompletedTodayFlag != other.objectiveCompletedTodayFlag) {
            return false;
        }
        if (!Objects.equals(this.objectiveCompleteText, other.objectiveCompleteText)) {
            return false;
        }
        if (!Objects.equals(this.objectiveNotEnoughText, other.objectiveNotEnoughText)) {
            return false;
        }
        if (!Objects.equals(this.objectiveAlreadyHaveItemsText, other.objectiveAlreadyHaveItemsText)) {
            return false;
        }
        if (!Objects.equals(this.objectiveGiveItemText, other.objectiveGiveItemText)) {
            return false;
        }
        if (!Objects.equals(this.objectiveItem, other.objectiveItem)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objective{" + "objectiveItem=" + objectiveItem + ", objectiveQtyRequired=" + objectiveQtyRequired + ", objectiveCompleteText=" + objectiveCompleteText + ", objectiveCompleteFlag=" + objectiveCompleteFlag + ", objectiveCompletedTodayFlag=" + objectiveCompletedTodayFlag + ", objectiveNotEnoughText=" + objectiveNotEnoughText + ", objectiveAlreadyHaveItemsText=" + objectiveAlreadyHaveItemsText + ", objectiveGiveItemText=" + objectiveGiveItemText + '}';
    }
    
    
}
