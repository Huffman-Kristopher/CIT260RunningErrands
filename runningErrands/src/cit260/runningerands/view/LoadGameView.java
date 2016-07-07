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
 * @author Kris
 */
public class LoadGameView extends View{
    public LoadGameView() {
        super("\n"
                  + "\n-------------------------"
                  + "\n| Laod Game Menu             |" 
                  + "\n-------------------------"
                  + "\n - Please Enter a name for the save game file -"
                  + "\n-------------------------"
                  + "\n");
    }

    @Override
    public boolean doAction(String filePath) {
        try{
           GameControl.getSavedGame(filePath);
       } catch (Exception ex){
           ErrorView.display("SceneMenuView", ex.getMessage());
       }
        return true;
    }
}
