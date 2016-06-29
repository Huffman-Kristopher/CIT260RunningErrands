/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Game;
import cit260.runningerrands.model.Location;
import cit260.runningerrands.model.Map;
import cit260.runningerrands.model.Persona;
import cit260.runningerrands.model.Player;
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
        Location[][] location = new Location[0][0];
        MapControl.movePersonaToStartingLocation(location);
    }

}