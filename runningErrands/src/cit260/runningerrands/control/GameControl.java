/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Game;
import cit260.runningerrands.model.Investment;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Location;
import cit260.runningerrands.model.Map;
import cit260.runningerrands.model.Npc;
import cit260.runningerrands.model.Objective;
import cit260.runningerrands.model.Persona;
import cit260.runningerrands.model.Player;
import cit260.runningerrands.model.Scene;
import exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
                RunningErrands.setPlayer(player); // Save the player
                
        return player;
    }
    
    public static void createNewGame(Player player) {
        
        Game game = new Game();
        RunningErrands.setCurrentGame(game);
        Map map = MapControl.createMap();
        game.setMap(map);
        Location[][] locations = map.getLocations();
        
    }
    public static void saveGame(Game game, String filePath)
            throws GameControlException{
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            Investment investment = RunningErrands.getInvestment();
            Item[] items = RunningErrands.getItems();
            Location[][] locations = RunningErrands.getLocations();
            Map map = RunningErrands.getMap();
            Npc[] npc = RunningErrands.getNpc();
            Persona persona = RunningErrands.getPersona();
            Player player = RunningErrands.getPlayer();
            Scene[] scenes = RunningErrands.getScene();
            Objective[] objectives = RunningErrands.getObjective();
            
            output.writeObject(game); // write game object to file
            output.writeObject(investment); // write investments to file
            output.writeObject(items); // write items to file
            output.writeObject(locations); // write locations to file
            output.writeObject(map); // write map to file
            output.writeObject(npc); // write NPC's to file
            output.writeObject(persona); // write persona to file
            output.writeObject(player); //write player to file
            output.writeObject(scenes); // write scense to file
            output.writeObject(objectives); // write objectives to file
            
            }
        catch (Exception e) {
                throw new GameControlException(e.getMessage());
            }
    }
    public static void getSavedGame(String filePath)
            throws GameControlException{
        Game game;
        Investment investment;
        Item[] items;
        Location[][] locations;
        Map map;
        Npc[] npc;
        Persona persona;
        Player player;
        Scene[] scenes;
        Objective[] objectives;
        
        try( FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); //read game file
            investment = (Investment) input.readObject();
            items = (Item[]) input.readObject();
            locations = (Location[][]) input.readObject();
            map = (Map) input.readObject();
            npc = (Npc[]) input.readObject();
            persona = (Persona) input.readObject();
            player = (Player) input.readObject();
            scenes = (Scene[]) input.readObject();
            objectives = (Objective[]) input.readObject();
            
            RunningErrands.setCurrentGame(game);
            RunningErrands.setInvestment(investment);
            RunningErrands.setItems(items);
            RunningErrands.setLocations(locations);
            RunningErrands.setMap(map);
            RunningErrands.setNpc(npc);
            RunningErrands.setPersona(persona);
            RunningErrands.setPlayer(player);
            RunningErrands.setScene(scenes);
            RunningErrands.setObjective(objectives);
            
            }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        // close ouput file
        RunningErrands.setCurrentGame(game);
        }
    public static void saveItems(Item[] item, String filePath)
            throws GameControlException{
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(item); // write game object to file
            }
        catch (Exception e) {
                throw new GameControlException(e.getMessage());
            }
    }
    }
