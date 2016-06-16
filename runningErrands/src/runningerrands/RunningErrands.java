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
import cit260.runningerrands.model.Persona;
import cit260.runningerrands.model.Player;

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

    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

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
}
