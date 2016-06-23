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
public class Store implements Serializable{
    
    private String itemType;
    private String itemName;
    private double itemCost;
    private double orderFillTime;
    private double itemQuantityAvl;
    private Item[] item;

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }
    
    public Store() {
    }

    
    
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public double getOrderFillTime() {
        return orderFillTime;
    }

    public void setOrderFillTime(double orderFillTime) {
        this.orderFillTime = orderFillTime;
    }

    public double getItemQuantityAvl() {
        return itemQuantityAvl;
    }

    public void setItemQuantityAvl(double itemQuantityAvl) {
        this.itemQuantityAvl = itemQuantityAvl;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.itemType);
        hash = 47 * hash + Objects.hashCode(this.itemName);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.itemCost) ^ (Double.doubleToLongBits(this.itemCost) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.orderFillTime) ^ (Double.doubleToLongBits(this.orderFillTime) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.itemQuantityAvl) ^ (Double.doubleToLongBits(this.itemQuantityAvl) >>> 32));
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
        final Store other = (Store) obj;
        if (Double.doubleToLongBits(this.itemCost) != Double.doubleToLongBits(other.itemCost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.orderFillTime) != Double.doubleToLongBits(other.orderFillTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemQuantityAvl) != Double.doubleToLongBits(other.itemQuantityAvl)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Store{" + "itemType=" + itemType + ", itemName=" + itemName + ", itemCost=" + itemCost + ", orderFillTime=" + orderFillTime + ", itemQuantityAvl=" + itemQuantityAvl + '}';
    }
    
    
        
}
