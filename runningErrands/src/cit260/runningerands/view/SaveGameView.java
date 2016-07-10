/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.GameControl;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class SaveGameView extends View {
    
    public SaveGameView() {
        super("\n"
                  + "\n-------------------------"
                  + "\n| Save Menu             |" 
                  + "\n-------------------------"
                  + "\n - Please Enter a name for the save game file -"
                  + "\n-------------------------"
                  + "\n");
    }

    @Override
    public boolean doAction(String filePath) {
      try{
           // save the game to the speciried file.
           GameControl.saveGame(RunningErrands.getCurrentGame(), filePath);
       } catch (Exception ex){
            ErrorView.display("SceneMenuView", ex.getMessage());
       }
        return true;
    }
}
