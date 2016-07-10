/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class CombatControl {
    // this is still combat control //
    
        public boolean calculateBribeResult (int bribeAmount) {
        boolean bribeResult;
        int userBalance = 5; //userBalance to be fully defined with view layer????
        int bribeMinimum = userBalance / 2; 
        int bribeMaximum = userBalance;
        
        if (bribeAmount <= 0 || bribeAmount > userBalance) {
            return false;
        }
        if (bribeAmount >= bribeMinimum) {
        int randomNum = ThreadLocalRandom.current().nextInt(bribeMinimum, bribeMaximum + 1);
            if (bribeAmount == randomNum) {
                bribeResult = true;
                return bribeResult;
            }
            bribeResult = false;
            return bribeResult;
        }
        bribeResult = false;
        return bribeResult;
    }
    
    public String calculateBribeMessage (boolean bribeResult) {
        String bribeResultMessage;
        if (bribeResult == true) {
               bribeResultMessage = "Congratulations! Your bribe has succeeded!";
               return bribeResultMessage;
        }
        
        bribeResultMessage = "Your bribe has failed!";
        return bribeResultMessage;

    }
}

