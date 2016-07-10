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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.objectiveItem);
        hash = 53 * hash + this.objectiveQtyRequired;
        hash = 53 * hash + Objects.hashCode(this.objectiveCompleteText);
        hash = 53 * hash + (this.objectiveCompleteFlag ? 1 : 0);
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
        if (!Objects.equals(this.objectiveCompleteText, other.objectiveCompleteText)) {
            return false;
        }
        if (!Objects.equals(this.objectiveItem, other.objectiveItem)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Objective{" + "objectiveItem=" + objectiveItem + ", objectiveQtyRequired=" + objectiveQtyRequired + ", objectiveCompleteText=" + objectiveCompleteText + ", objectiveCompleteFlag=" + objectiveCompleteFlag + '}';
    }
    
    
}
