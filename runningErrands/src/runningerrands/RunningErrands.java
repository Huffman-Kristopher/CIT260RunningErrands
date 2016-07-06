/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands;

import cit260.runningerands.view.StartProgramView;
import cit260.runningerrands.model.Gambling;
import cit260.runningerrands.model.Game;
import cit260.runningerrands.model.Investment;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Location;
import cit260.runningerrands.model.Map;
import cit260.runningerrands.model.Persona;
import cit260.runningerrands.model.Player;
import cit260.runningerrands.model.Scene;
import cit260.runningerrands.model.Npc;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class RunningErrands {
       
    private static Game currentGame = null;
    private static Player player = null;
    private static Persona persona = null;
    private static Investment investment = null;
    private static Gambling gambling = null;
    private static Location[][] locations = null;
    private static Map map = null;
    private static Scene[] scene = null;
    private static Item[] items = null;
    private static Item item = null;
    private static Npc[] npc = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        RunningErrands.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        RunningErrands.player = player;
    }

    public static Persona getPersona() {
        return persona;
    }

    public static void setPersona(Persona persona) {
        RunningErrands.persona = persona;
    }

    public static Investment getInvestment() {
        return investment;
    }

    public static void setInvestment(Investment investment) {
        RunningErrands.investment = investment;
    }

    public static Gambling getGambling() {
        return gambling;
    }

    public static void setGambling(Gambling gambling) {
        RunningErrands.gambling = gambling;
    }

    public static Location[][] getLocations() {
        return locations;
    }

    public static void setLocations(Location[][] locations) {
        RunningErrands.locations = locations;
    }

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        RunningErrands.map = map;
    }

    public static Scene[] getScene() {
        return scene;
    }

    public static void setScene(Scene[] scene) {
        RunningErrands.scene = scene;
    }

    public static Item[] getItems() {
        return items;
    }

    public static void setItems(Item[] items) {
        RunningErrands.items = items;
    }

    public static Item getItem() {
        return item;
    }

    public static void setItem(Item item) {
        RunningErrands.item = item;
    }

    public static Npc[] getNpc() {
        return npc;
    }

    public static void setNpc(Npc[] npc) {
        RunningErrands.npc = npc;
    }

    
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        try{
        startProgramView.displayStartProgramView();
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        }
    }

}
