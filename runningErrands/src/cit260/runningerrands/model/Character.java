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
 * @author Kris
 */
public class Character implements Serializable{
    
    // class instance variables 
    private String gender;
    private String occupation;
    private String characterName;
    private double health;
    private double money;
    private int coordinates;

    public Character() {
    }

    
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.gender);
        hash = 13 * hash + Objects.hashCode(this.occupation);
        hash = 13 * hash + Objects.hashCode(this.characterName);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 13 * hash + this.coordinates;
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
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        if (Double.doubleToLongBits(this.money) != Double.doubleToLongBits(other.money)) {
            return false;
        }
        if (this.coordinates != other.coordinates) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.occupation, other.occupation)) {
            return false;
        }
        if (!Objects.equals(this.characterName, other.characterName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "gender=" + gender + ", occupation=" + occupation + ", characterName=" + characterName + ", health=" + health + ", money=" + money + ", coordinates=" + coordinates + '}';
    }
    
    
    
    
}
