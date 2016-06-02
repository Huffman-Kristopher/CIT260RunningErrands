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
    private int health;
    private double money;
    private int coordinates;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
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
        hash = 97 * hash + this.gender;
        hash = 97 * hash + Objects.hashCode(this.career);
        hash = 97 * hash + Objects.hashCode(this.personaName);
        hash = 97 * hash + this.health;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 97 * hash + this.coordinates;
        hash = 97 * hash + this.age;
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
