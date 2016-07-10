/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;



import cit260.runningerands.view.ErrorView;
import java.io.Serializable;
import java.util.Arrays;


/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class Map implements Serializable{
    
    private int rowCount = 6;
    private int columnCount = 5;
    private Location[][] locations;
    
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }
    
    public Map() {
        
    }
    
    public Map(int rowCount, int columnCount) {
        
        if(rowCount <1 || columnCount < 1) {
            ErrorView.display(this.getClass().getName(), "Error reading input:" + "The number of rows and columns must be greater than zero.");
            return;
        }
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                Location location = new Location();
                location.setColumn(col);
                location.setRow(row);
                location.setVistited(false);
                locations[row][col] = location;
            }
        }
        
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

    public String getMapString() {
            
        String rtn = "";
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                rtn += locations[row][col].getScene().getLocationSymbol() + "\t";
            }
            rtn += "\n";
        }
        return rtn;
        
    }
    
    public String getTravelMapString(String symbol) {
        
        String rtn = "";
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                if (row == rowCount -1 ) {
                    if ( col == columnCount -1) {
                        String locationSymbol = locations[row][col].getScene().getLocationSymbol();
                        if (locationSymbol == symbol) {
                            
                            rtn += "XX - You Are Here!\n";
                            
                        }
                        else {
                            rtn += locations[row][col].getScene().getLocationSymbol() + " - " + locations[row][col].getScene().getDescription() + "\n";
                        }
                    }
                    else {
                        String locationSymbol = locations[row][col].getScene().getLocationSymbol();
                        if (locationSymbol == symbol) {
                            
                            rtn += "XX - You Are Here!\n";
                            
                        }
                        else {
                            rtn += locations[row][col].getScene().getLocationSymbol() + " - " + locations[row][col].getScene().getDescription() + "\n";
                        }
                    }
                }
                else {
                    String locationSymbol = locations[row][col].getScene().getLocationSymbol();
                    if (locationSymbol == symbol) {
                            
                            rtn += "XX - You Are Here!\n";
                            
                        }
                        else {
                            rtn += locations[row][col].getScene().getLocationSymbol() + " - " + locations[row][col].getScene().getDescription() + "\n";
                    }
                }
            }
        }
        return rtn;   
        
    }
    
    public Location getLocationFromSymbol(String symbol) {
        
        String rtn = "";
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                if (row == rowCount -1 ) {
                    if ( col == columnCount -1) {
                        String locationSymbol = locations[row][col].getScene().getLocationSymbol();
                        if (locationSymbol.equals(symbol)) {
                            
                            Location locationFromSymbol = locations[row][col];
                            return locationFromSymbol;
                            
                        }
                        else {
                            
                        }
                        
                    }
                    else {
                        String locationSymbol = locations[row][col].getScene().getLocationSymbol();
                        if (locationSymbol.equals(symbol)) {
                            
                            Location locationFromSymbol = locations[row][col];
                            return locationFromSymbol;
                        }
                        
                    }
                }
                else {
                    String locationSymbol = locations[row][col].getScene().getLocationSymbol();
                    if (locationSymbol.equals(symbol)) {
                            Location locationFromSymbol = locations[row][col];
                            return locationFromSymbol;
                        }
                        
                    }
                
            }
        }
        Location errorLocation = locations[5][4];
        return errorLocation;
    }
    

    public Boolean validateLocation (String symbol) {
        Boolean value = false;
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                String locationSymbol = locations[row][col].getScene().getLocationSymbol();
                if( locationSymbol == symbol) { 
                    value = true;
                    return value; 
                }
            }
           
        }
        return value;
    }
}
