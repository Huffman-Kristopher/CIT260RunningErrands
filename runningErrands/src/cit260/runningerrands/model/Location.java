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
public class Location implements Serializable{

    private int row;
    private int column;
    private boolean vistited;
    private String type;
    private Scene scene;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public String getType() {
        return type;
    }

    public void setType(String sceneType) {
        this.type = sceneType;
    }

    public Location() {
    }

    public double getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVistited() {
        return vistited;
    }

    public void setVistited(boolean vistited) {
        this.vistited = vistited;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.row;
        hash = 83 * hash + this.column;
        hash = 83 * hash + (this.vistited ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.type);
        hash = 83 * hash + Objects.hashCode(this.scene);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.vistited != other.vistited) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }
    
}