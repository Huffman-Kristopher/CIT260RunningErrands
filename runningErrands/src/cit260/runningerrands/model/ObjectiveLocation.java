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
public class ObjectiveLocation implements Serializable{
    
    private String objectiveName;
    private String objectiveDescription;
    private boolean objectiveMet;
    private boolean objectiveBlock;
    private String objectiveConditions;
    private String objectivePayout;
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public ObjectiveLocation() {
    }

    public String getObjectivePayout() {
        return objectivePayout;
    }

    public void setObjectivePayout(String objectivePayout) {
        this.objectivePayout = objectivePayout;
    }
   
    
    public String getObjectiveName() {
        return objectiveName;
    }

    public void setObjectiveName(String objectiveName) {
        this.objectiveName = objectiveName;
    }

    public String getObjectiveDescription() {
        return objectiveDescription;
    }

    public void setObjectiveDescription(String objectiveDescription) {
        this.objectiveDescription = objectiveDescription;
    }

    public boolean isObjectiveMet() {
        return objectiveMet;
    }

    public void setObjectiveMet(boolean objectiveMet) {
        this.objectiveMet = objectiveMet;
    }

    public boolean isObjectiveBlock() {
        return objectiveBlock;
    }

    public void setObjectiveBlock(boolean objectiveBlock) {
        this.objectiveBlock = objectiveBlock;
    }

    public String getObjectiveConditions() {
        return objectiveConditions;
    }

    public void setObjectiveConditions(String objectiveConditions) {
        this.objectiveConditions = objectiveConditions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.objectiveName);
        hash = 67 * hash + Objects.hashCode(this.objectiveDescription);
        hash = 67 * hash + (this.objectiveMet ? 1 : 0);
        hash = 67 * hash + (this.objectiveBlock ? 1 : 0);
        hash = 67 * hash + Objects.hashCode(this.objectiveConditions);
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
        final ObjectiveLocation other = (ObjectiveLocation) obj;
        if (this.objectiveMet != other.objectiveMet) {
            return false;
        }
        if (this.objectiveBlock != other.objectiveBlock) {
            return false;
        }
        if (!Objects.equals(this.objectiveName, other.objectiveName)) {
            return false;
        }
        if (!Objects.equals(this.objectiveDescription, other.objectiveDescription)) {
            return false;
        }
        if (!Objects.equals(this.objectiveConditions, other.objectiveConditions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ObjectiveLocation{" + "objectiveName=" + objectiveName + ", objectiveDescription=" + objectiveDescription + ", objectiveMet=" + objectiveMet + ", objectiveBlock=" + objectiveBlock + ", objectiveConditions=" + objectiveConditions + '}';
    }
    
    
    
}
