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
    private int money;
    private int coordinates;
    private int age;
    private int day;
    private int salary;

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

    public void setPersonaName(String personaName) {
        this.personaName = personaName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.gender;
        hash = 47 * hash + Objects.hashCode(this.career);
        hash = 47 * hash + Objects.hashCode(this.personaName);
        hash = 47 * hash + this.health;
        hash = 47 * hash + this.money;
        hash = 47 * hash + this.coordinates;
        hash = 47 * hash + this.age;
        hash = 47 * hash + this.day;
        hash = 47 * hash + this.salary;
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
        if (this.gender != other.gender) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        if (this.money != other.money) {
            return false;
        }
        if (this.coordinates != other.coordinates) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.day != other.day) {
            return false;
        }
        if (this.salary != other.salary) {
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
        return "Persona{" + "gender=" + gender + ", career=" + career + ", personaName=" + personaName + ", health=" + health + ", money=" + money + ", coordinates=" + coordinates + ", age=" + age + ", day=" + day + ", salary=" + salary + '}';
    }
    
}