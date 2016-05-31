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
public class Weapon implements Serializable{
    
    private String weaponStrength;

    public Weapon() {
    }

    
    
    public String getWeaponStrength() {
        return weaponStrength;
    }

    public void setWeaponStrength(String weaponStrength) {
        this.weaponStrength = weaponStrength;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.weaponStrength);
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
        final Weapon other = (Weapon) obj;
        if (!Objects.equals(this.weaponStrength, other.weaponStrength)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Weapon{" + "weaponStrength=" + weaponStrength + '}';
    }
    
    
    
}
