/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

/**
 *
 * @author reddo
 */
public class GamblingControl {
   
    public int calculateWiningNumber(int bet, int numberPick) {
        int winningNumber;
                
        if (numberPick > 99999 ) { //numberPick is too big
            return -1;
        }

        if (numberPick < 0) {//numberPick is too low
            return -1;
        }

        if (bet <= 0) { //All bets zero or less win
            winningNumber = numberPick;
            return winningNumber;
        }

        //All positive bets lose
        winningNumber = numberPick + 1;
        return winningNumber;
        
    }
    
    public int calculatePayout(int bet, int numberPick, int winningNumber) {
        
        int payout; 
        
        if (winningNumber == numberPick) { //Define winnings
                payout = bet * (-2);
                return payout;
        }
        
        payout = 0;
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
