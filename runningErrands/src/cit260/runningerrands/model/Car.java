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
public class Car implements Serializable{
    
    private String carType;
    private double carFuel;
    private double carMileage;
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public Car() {
    }

    
    
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public double getCarFuel() {
        return carFuel;
    }

    public void setCarFuel(double carFuel) {
        this.carFuel = carFuel;
    }

    public double getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(double carMileage) {
        this.carMileage = carMileage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.carType);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.carFuel) ^ (Double.doubleToLongBits(this.carFuel) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.carMileage) ^ (Double.doubleToLongBits(this.carMileage) >>> 32));
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
        final Car other = (Car) obj;
        if (Double.doubleToLongBits(this.carFuel) != Double.doubleToLongBits(other.carFuel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.carMileage) != Double.doubleToLongBits(other.carMileage)) {
            return false;
        }
        if (!Objects.equals(this.carType, other.carType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" + "carType=" + carType + ", carFuel=" + carFuel + ", carMileage=" + carMileage + '}';
    }
    
    
    
    
}
