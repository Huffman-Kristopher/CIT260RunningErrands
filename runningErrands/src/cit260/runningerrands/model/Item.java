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
    private int itemCost;
    private int itemNumber;
    private String itemSellable;
    private String itemInSellList;
    private String itemBuyable;
    private String itemInBuyList;

    public void setItemInBuyList(String itemInBuyList) {
        this.itemInBuyList = itemInBuyList;
    }

    public String getItemInBuyList() {
        return itemInBuyList;
    }

    public String getItemInSellList() {
        return itemInSellList;
    }

    public void setItemInSellList(String itemInSellList) {
        this.itemInSellList = itemInSellList;
    }

    public String getItemSellable() {
        return itemSellable;
    }

    public void setItemSellable(String itemSellable) {
        this.itemSellable = itemSellable;
    }

    public String getItemBuyable() {
        return itemSellable;
    }
    
    public void setItemBuyable(String itemBuyable) {
        this.itemBuyable = itemBuyable;
    }
    
    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }

    public int getItemValue() {
        return itemValue;
    }

    public void setItemValue(int itemValue) {
        this.itemValue = itemValue;
    }
    private int itemValue;

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
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.itemName);
        hash = 79 * hash + Objects.hashCode(this.itemType);
        hash = 79 * hash + this.itemQuantity;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + this.requiredAmount;
        hash = 79 * hash + this.strength;
        hash = 79 * hash + this.itemCost;
        hash = 79 * hash + this.itemNumber;
        hash = 79 * hash + Objects.hashCode(this.itemSellable);
        hash = 79 * hash + Objects.hashCode(this.itemBuyable);
        hash = 79 * hash + Objects.hashCode(this.itemInSellList);
        hash = 79 * hash + Objects.hashCode(this.itemInBuyList);
        hash = 79 * hash + this.itemValue;
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
        if (this.itemCost != other.itemCost) {
            return false;
        }
        if (this.itemNumber != other.itemNumber) {
            return false;
        }
        if (this.itemValue != other.itemValue) {
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
        if (!Objects.equals(this.itemSellable, other.itemSellable)) {
            return false;
        }
        if (!Objects.equals(this.itemBuyable, other.itemBuyable)) {
            return false;
        }
        if (!Objects.equals(this.itemInSellList, other.itemInSellList)) {
            return false;
        }
        if (!Objects.equals(this.itemInBuyList, other.itemInBuyList)) {
            return false;
        }
        return true;
    }

}
