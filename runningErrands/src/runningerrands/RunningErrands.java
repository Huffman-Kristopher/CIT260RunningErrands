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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private static Item item = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        RunningErrands.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        RunningErrands.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        RunningErrands.inFile = inFile;
    }
    

    public static Item getItem() {
        return item;
    }

    public static void setItem(Item item) {
        RunningErrands.item = item;
    }

    public static Scene[] getScene() {
        return scene;
    }

    public static void setScene(Scene[] scene) {
        RunningErrands.scene = scene;
    }

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        RunningErrands.map = map;
    }

    public static Location[][] getLocations() {
        return locations;
    }

    public static void setLocations(Location[][] locations) {
        RunningErrands.locations = locations;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
       try{
        //open charcter stream files ofr end user input and ouput
        RunningErrands.inFile =
                new BufferedReader(new InputStreamReader(System.in));

        RunningErrands.outFile = new PrintWriter(System.out, true);
         //open log file
         String filePath ="log.txt";
         RunningErrands.logFile = new PrintWriter (filePath);
       } catch (Exception e){
           System.out.println("Exception: "+ e.toString()+
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
       }
        StartProgramView startProgramView = new StartProgramView();
        try{
        startProgramView.displayStartProgramView();
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        }
        finally {
            try {
               if (RunningErrands.inFile !=null)
                RunningErrands.inFile.close();
               
               if (RunningErrands.outFile !=null)
                RunningErrands.outFile.close();
               
               if (RunningErrands.logFile != null)
                   RunningErrands.logFile.close();
               
            } catch (IOException ex) {
                System.out.println("Error Closing FIles");
            }
        }
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
