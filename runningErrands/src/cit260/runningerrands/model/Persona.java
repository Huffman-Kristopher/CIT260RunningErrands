/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import java.io.Serializable;
import java.util.Arrays;
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
    private boolean gambledToday;
    private Car car;
    private Item[] item;
    private Location location;
    private Scene scene;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public Email[] getEmail() {
        return email;
    }

    public void setEmail(Email[] email) {
        this.email = email;
    }
    private Email[] email;
    

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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

    public boolean isGambledToday() {
        return gambledToday;
    }

    public void setGambledToday(boolean gambledToday) {
        this.gambledToday = gambledToday;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.gender;
        hash = 37 * hash + Objects.hashCode(this.career);
        hash = 37 * hash + Objects.hashCode(this.personaName);
        hash = 37 * hash + this.health;
        hash = 37 * hash + this.money;
        hash = 37 * hash + this.coordinates;
        hash = 37 * hash + this.age;
        hash = 37 * hash + this.day;
        hash = 37 * hash + this.salary;
        hash = 37 * hash + (this.gambledToday ? 1 : 0);
        hash = 37 * hash + Objects.hashCode(this.car);
        hash = 37 * hash + Arrays.deepHashCode(this.item);
        hash = 37 * hash + Objects.hashCode(this.location);
        hash = 37 * hash + Objects.hashCode(this.scene);
        hash = 37 * hash + Arrays.deepHashCode(this.email);
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
        if (this.gambledToday != other.gambledToday) {
            return false;
        }
        if (!Objects.equals(this.career, other.career)) {
            return false;
        }
        if (!Objects.equals(this.personaName, other.personaName)) {
            return false;
        }
        if (!Objects.equals(this.car, other.car)) {
            return false;
        }
        if (!Arrays.deepEquals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Arrays.deepEquals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "gender=" + gender + ", career=" + career + ", personaName=" + personaName + ", health=" + health + ", money=" + money + ", coordinates=" + coordinates + ", age=" + age + ", day=" + day + ", salary=" + salary + ", gambledToday=" + gambledToday + ", car=" + car + ", item=" + item + ", location=" + location + ", scene=" + scene + ", email=" + email + '}';
    }

    
}