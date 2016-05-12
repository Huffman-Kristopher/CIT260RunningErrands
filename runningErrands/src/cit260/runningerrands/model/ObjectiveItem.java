/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import java.io.Serializable;

/**
 *
 * @author Kris
 */
public class ObjectiveItem implements Serializable{
    
    private double quantityNeeded;

    public ObjectiveItem() {
    }

    
    
    public double getQuantityNeeded() {
        return quantityNeeded;
    }

    public void setQuantityNeeded(double quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.quantityNeeded) ^ (Double.doubleToLongBits(this.quantityNeeded) >>> 32));
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
        final ObjectiveItem other = (ObjectiveItem) obj;
        if (Double.doubleToLongBits(this.quantityNeeded) != Double.doubleToLongBits(other.quantityNeeded)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ObjectiveItem{" + "quantityNeeded=" + quantityNeeded + '}';
    }
    
    
    
}
