/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.GameControl;
import cit260.runningerrands.model.Player;
import runningerrands.RunningErrands;

/**
 *
 * @author reddo
 */
class GameMenuView {

    void displayGameMenuView() {
        
        GamblingMenuView GamblingMenuView = new GamblingMenuView();
        GamblingMenuView.displayGamblingMenuView();
        //GameControl.createNewGame(RunningErrands.getPlayer());
    }
    
}
