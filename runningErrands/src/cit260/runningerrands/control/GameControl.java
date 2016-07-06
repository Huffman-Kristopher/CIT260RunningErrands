/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Game;
import cit260.runningerrands.model.Location;
import cit260.runningerrands.model.Map;
import cit260.runningerrands.model.Player;
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
    public static void saveGame(Game game, String filepath)
            throws GameControlException{
        try(FileOutputStream fops = new FileOutputStream(filepath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write game object to file
            }
        catch (Exception e) {
                throw new GameControlException(e.getMessage());
            }
    }
    public static void getSavedGame(String filepath)
            throws GameControlException{
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); //read game file
            }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        // close ouput file
        RunningErrands.setCurrentGame(game);
        }
    }
