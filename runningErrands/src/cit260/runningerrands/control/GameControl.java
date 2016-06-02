/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

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
        //Test for Gambling control
        System.out.println("\nFrom here, we start the real parts of the game. createNewGame stub function called.");
    }

}