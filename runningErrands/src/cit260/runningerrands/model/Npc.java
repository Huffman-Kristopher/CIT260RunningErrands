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
    private String Type;

    public Npc() {
    }

    
    
    public String getNpcName() {
        return npcName;
    }

    public void setNpcName(String npcName) {
        this.npcName = npcName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.npcName);
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
        if (!Objects.equals(this.npcName, other.npcName)) {
            return false;
        }
        if (!Objects.equals(this.Type, other.Type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Npc{" + "npcName=" + npcName + ", Type=" + Type + '}';
    }
    
    
    
}
