/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import java.io.Serializable;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public enum ObjectiveItem implements Serializable{
    
    Item1("Description here",5);
    
    private final double quantityNeeded;
    private final String description;
    private Item item;

    ObjectiveItem(String description,int quantityNeeded) {
        this.description = description;
        this.quantityNeeded = quantityNeeded;
    }
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    public double getQuantityNeeded() {
        return quantityNeeded;
    }
}
