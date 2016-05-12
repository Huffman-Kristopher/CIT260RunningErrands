/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands;

import cit260.runningerrands.model.Player;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class RunningErrands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerChar = new Player();
        
        
        playerChar.setName("Aaron");
        playerChar.setAge(19);
        playerChar.setTimePlayed(24);
        
        String playerInfo = playerChar.toString();
        System.out.println(playerInfo);
        
    }
    
}
