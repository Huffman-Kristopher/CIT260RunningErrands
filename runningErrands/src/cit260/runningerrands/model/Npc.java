/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import java.io.Serializable;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public enum Npc implements Serializable{
    
    Shopkeeper("He manages the store"),
    Librarian("She runs the Library"),
    Priest("He preaches"),
    Orphan("Has no one to love him"),
    Receptionist("Greets you as you enter"),
    Officer("He will taze you"),
    Principal("Runs the school"),
    BankTeller("Grants access to your money"),
    Ninja("Can't find him"),
    Soldier("Shoots...everything"),
    Pirate("Aye, he runs the boats"),
    Giraffe("Yell at him... His head is way up there"),
    Docent("Boring, but knows everything..."),
    Ghost("Woooooooo"),
    Joe("It's him vs. the Volcano"),
    MarinaMike("Runs the Marina"),
    Guru("He knows all"),
    Nikolai("Russian arms dealer"),
    PlagueMonkey("Full of disease"),
    Sergy("Russian thug");

    private final String description;
    private final Location coordinates;
    private Item[] item;

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    Npc(String description) {
        this.description = description;
        coordinates = Location(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Location getCoordinates() {
        return coordinates;
    }

    private Location Location(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
