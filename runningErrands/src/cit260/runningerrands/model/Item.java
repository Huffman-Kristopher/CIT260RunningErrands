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
public class Item implements Serializable{
    
    private String itemName;
    private String itemType;
    private int itemQuantity;
    private String description;
    private int requiredAmount;
    private int strength;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.itemName);
        hash = 19 * hash + Objects.hashCode(this.itemType);
        hash = 19 * hash + this.itemQuantity;
        hash = 19 * hash + Objects.hashCode(this.description);
        hash = 19 * hash + this.requiredAmount;
        hash = 19 * hash + this.strength;
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
        final Item other = (Item) obj;
        if (this.itemQuantity != other.itemQuantity) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (this.strength != other.strength) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemName=" + itemName + ", itemType=" + itemType + ", itemQuantity=" + itemQuantity + ", description=" + description + ", requiredAmount=" + requiredAmount + ", strength=" + strength + '}';
    }
    
}
