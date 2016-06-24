/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import cit260.runningerrands.control.MapControl.SceneType;
import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class Map implements Serializable{
    
    private int rowCount = 9;
    private int columnCount = 9;
    private Location[][] locations;

    public Map() {
        
        locations = new Location[rowCount][columnCount];
        init();
        
    }

    private void init() {
        for ( int row = 0; row < rowCount; row++ ) {
            for (int column = 0; column < columnCount; column++) {
                Location location = new Location();
                location.setScene(SceneType.values() [(int) (Math.random() * SceneType.values().length)]);
                
                locations[row][column] = location;
            }
        }
    }
    
    public Map(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount <1) {
            
            System.out.println("The number of rows and columns must be greater than zero");
            return;
            
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                
                locations[row][column] = location;
            }
                
        }
    }

    
    
    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.rowCount;
        hash = 37 * hash + this.columnCount;
        hash = 37 * hash + Arrays.deepHashCode(this.locations);
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }


    public Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
}
