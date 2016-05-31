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
    private double itemQuantity;

    public Item() {
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

    public double getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.itemName);
        hash = 67 * hash + Objects.hashCode(this.itemType);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.itemQuantity) ^ (Double.doubleToLongBits(this.itemQuantity) >>> 32));
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
        if (Double.doubleToLongBits(this.itemQuantity) != Double.doubleToLongBits(other.itemQuantity)) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemName=" + itemName + ", itemType=" + itemType + ", itemQuantity=" + itemQuantity + '}';
    }
    
    
    
}
