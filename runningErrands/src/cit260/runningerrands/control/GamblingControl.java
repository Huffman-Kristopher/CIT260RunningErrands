/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Persona;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class GamblingControl {
    
    public static int calculateWiningNumber(int bet, int numberPick) {
        int winningNumber;
        if (bet < 0) { //All bets zero or less win
            winningNumber = numberPick;
            return winningNumber;
        }
        //All positive bets lose
        winningNumber = numberPick + 1;
        return winningNumber;
        
    }
    
    public static int calculatePayout(int bet, int numberPick, int winningNumber) {
        
        int payout; 
        
        if (winningNumber == numberPick) { //Define winnings
                payout = bet * (-2);
                return payout;
        }
        
        payout = 0 - bet;

        return payout;

    }
    
    public String calculateMessage (int payout) {
        String gamblingResultMessage;
        if (payout == 0) {
               gamblingResultMessage = "Congratulations! You lost! You did not win any money!";
               return gamblingResultMessage;
        }
        
        gamblingResultMessage = "Congratulations, you found a way to cheat the system! You won " + payout + "!";
        return gamblingResultMessage;

    }
}
