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
public class Npc implements Serializable{
    
    private String npcName;
    private String npcDescription;
    private int npcStrength;
    private int npcHealth;

    public String getNpcName() {
        return npcName;
    }

    public void setNpcName(String npcName) {
        this.npcName = npcName;
    }

    public String getNpcDescription() {
        return npcDescription;
    }

    public void setNpcDescription(String npcDescription) {
        this.npcDescription = npcDescription;
    }

    public int getNpcStrength() {
        return npcStrength;
    }

    public void setNpcStrength(int npcStrength) {
        this.npcStrength = npcStrength;
    }

    public int getNpcHealth() {
        return npcHealth;
    }

    public void setNpcHealth(int npcHealth) {
        this.npcHealth = npcHealth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.npcName);
        hash = 47 * hash + Objects.hashCode(this.npcDescription);
        hash = 47 * hash + this.npcStrength;
        hash = 47 * hash + this.npcHealth;
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
        final Npc other = (Npc) obj;
        if (this.npcStrength != other.npcStrength) {
            return false;
        }
        if (this.npcHealth != other.npcHealth) {
            return false;
        }
        if (!Objects.equals(this.npcName, other.npcName)) {
            return false;
        }
        if (!Objects.equals(this.npcDescription, other.npcDescription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Npc{" + "npcName=" + npcName + ", npcDescription=" + npcDescription + ", npcStrength=" + npcStrength + ", npcHealth=" + npcHealth + '}';
    }

    

}
