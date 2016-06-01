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
public class Persona implements Serializable{
    
    // class instance variables 
    private char gender;
    private String career;
    private String personaName;
    private double health;
    private double money;
    private int coordinates;

    public Persona() {
    }

    
    
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getPersonaName() {
        return personaName;
    }

    public void setPersonaName(String characterName) {
        this.personaName = characterName;
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
        hash = 13 * hash + Objects.hashCode(this.career);
        hash = 13 * hash + Objects.hashCode(this.personaName);
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
        final Persona other = (Persona) obj;
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
        if (!Objects.equals(this.career, other.career)) {
            return false;
        }
        if (!Objects.equals(this.personaName, other.personaName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "gender=" + gender + ", career=" + career + ", personaName=" + personaName + ", health=" + health + ", money=" + money + ", coordinates=" + coordinates + '}';
    }
    
    
    
    
}
