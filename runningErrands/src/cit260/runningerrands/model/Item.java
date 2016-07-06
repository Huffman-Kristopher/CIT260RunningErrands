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
    private int itemValue;
    private int itemNumber;
    private String itemSellable;
    private String itemInSellList;
    private Scene sceneToSell;
    private Scene sceneToBuy;

    public int getItemValue() {
        return itemValue;
    }

    public void setItemValue(int itemValue) {
        this.itemValue = itemValue;
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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemSellable() {
        return itemSellable;
    }

    public void setItemSellable(String itemSellable) {
        this.itemSellable = itemSellable;
    }

    public String getItemInSellList() {
        return itemInSellList;
    }

    public void setItemInSellList(String itemInSellList) {
        this.itemInSellList = itemInSellList;
    }

    public Scene getSceneToSell() {
        return sceneToSell;
    }

    public void setSceneToSell(Scene sceneToSell) {
        this.sceneToSell = sceneToSell;
    }

    public Scene getSceneToBuy() {
        return sceneToBuy;
    }

    public void setSceneToBuy(Scene sceneToBuy) {
        this.sceneToBuy = sceneToBuy;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.itemName);
        hash = 59 * hash + Objects.hashCode(this.itemType);
        hash = 59 * hash + this.itemQuantity;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + this.requiredAmount;
        hash = 59 * hash + this.strength;
        hash = 59 * hash + this.itemCost;
        hash = 59 * hash + this.itemValue;
        hash = 59 * hash + this.itemNumber;
        hash = 59 * hash + Objects.hashCode(this.itemSellable);
        hash = 59 * hash + Objects.hashCode(this.itemInSellList);
        hash = 59 * hash + Objects.hashCode(this.sceneToSell);
        hash = 59 * hash + Objects.hashCode(this.sceneToBuy);
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
        if (this.itemValue != other.itemValue) {
            return false;
        }
        if (this.itemNumber != other.itemNumber) {
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
        if (!Objects.equals(this.itemInSellList, other.itemInSellList)) {
            return false;
        }
        if (!Objects.equals(this.sceneToSell, other.sceneToSell)) {
            return false;
        }
        if (!Objects.equals(this.sceneToBuy, other.sceneToBuy)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemName=" + itemName + ", itemType=" + itemType + ", itemQuantity=" + itemQuantity + ", description=" + description + ", requiredAmount=" + requiredAmount + ", strength=" + strength + ", itemCost=" + itemCost + ", itemValue=" + itemValue + ", itemNumber=" + itemNumber + ", itemSellable=" + itemSellable + ", itemInSellList=" + itemInSellList + ", sceneToSell=" + sceneToSell + ", sceneToBuy=" + sceneToBuy + '}';
    }


}
