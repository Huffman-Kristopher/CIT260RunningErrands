/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import cit260.runningerrands.control.MapControl.LocationName;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class Scene implements Serializable{
    
    
    private String description;
    private double travelTime;
    private double distance;
    private String locationSymbol;
    private Location location;
    private LocationName type;
    private Item itemToDeliver;
    private String menuOption1;
    private String menuOption2;
    private String menuOption3;
    private String conversationSuccessText;
    private String conversationFailureText;
    private String conversationMenuType;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getLocationSymbol() {
        return locationSymbol;
    }

    public void setLocationSymbol(String locationSymbol) {
        this.locationSymbol = locationSymbol;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public LocationName getType() {
        return type;
    }

    public void setType(LocationName type) {
        this.type = type;
    }

    public Item getItemToDeliver() {
        return itemToDeliver;
    }

    public void setItemToDeliver(Item itemToDeliver) {
        this.itemToDeliver = itemToDeliver;
    }

    public String getMenuOption1() {
        return menuOption1;
    }

    public void setMenuOption1(String menuOption1) {
        this.menuOption1 = menuOption1;
    }

    public String getMenuOption2() {
        return menuOption2;
    }

    public void setMenuOption2(String menuOption2) {
        this.menuOption2 = menuOption2;
    }

    public String getMenuOption3() {
        return menuOption3;
    }

    public void setMenuOption3(String menuOption3) {
        this.menuOption3 = menuOption3;
    }

    public String getConversationSuccessText() {
        return conversationSuccessText;
    }

    public void setConversationSuccessText(String conversationSuccessText) {
        this.conversationSuccessText = conversationSuccessText;
    }

    public String getConversationFailureText() {
        return conversationFailureText;
    }

    public void setConversationFailureText(String conversationFailureText) {
        this.conversationFailureText = conversationFailureText;
    }

    public String getConversationMenuType() {
        return conversationMenuType;
    }

    public void setConversationMenuType(String conversationMenuType) {
        this.conversationMenuType = conversationMenuType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.distance) ^ (Double.doubleToLongBits(this.distance) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.locationSymbol);
        hash = 89 * hash + Objects.hashCode(this.location);
        hash = 89 * hash + Objects.hashCode(this.type);
        hash = 89 * hash + Objects.hashCode(this.itemToDeliver);
        hash = 89 * hash + Objects.hashCode(this.menuOption1);
        hash = 89 * hash + Objects.hashCode(this.menuOption2);
        hash = 89 * hash + Objects.hashCode(this.menuOption3);
        hash = 89 * hash + Objects.hashCode(this.conversationSuccessText);
        hash = 89 * hash + Objects.hashCode(this.conversationFailureText);
        hash = 89 * hash + Objects.hashCode(this.conversationMenuType);
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.distance) != Double.doubleToLongBits(other.distance)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.locationSymbol, other.locationSymbol)) {
            return false;
        }
        if (!Objects.equals(this.menuOption1, other.menuOption1)) {
            return false;
        }
        if (!Objects.equals(this.menuOption2, other.menuOption2)) {
            return false;
        }
        if (!Objects.equals(this.menuOption3, other.menuOption3)) {
            return false;
        }
        if (!Objects.equals(this.conversationSuccessText, other.conversationSuccessText)) {
            return false;
        }
        if (!Objects.equals(this.conversationFailureText, other.conversationFailureText)) {
            return false;
        }
        if (!Objects.equals(this.conversationMenuType, other.conversationMenuType)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.itemToDeliver, other.itemToDeliver)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", distance=" + distance + ", locationSymbol=" + locationSymbol + ", location=" + location + ", type=" + type + ", itemToDeliver=" + itemToDeliver + ", menuOption1=" + menuOption1 + ", menuOption2=" + menuOption2 + ", menuOption3=" + menuOption3 + ", conversationSuccessText=" + conversationSuccessText + ", conversationFailureText=" + conversationFailureText + ", conversationMenuType=" + conversationMenuType + '}';
    }

}
