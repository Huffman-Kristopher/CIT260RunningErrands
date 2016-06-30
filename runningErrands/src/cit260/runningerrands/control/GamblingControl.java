/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Gambling;
import cit260.runningerrands.model.Persona;
import exceptions.GamblingControlExceptions;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class GamblingControl {
    
    public static int calculateWiningNumber() 
            throws GamblingControlExceptions{
        int winningNumber;
        Gambling gambling = RunningErrands.getGambling();
        int betAmount = gambling.getBetAmount();
        int betNumber = gambling.getBetNumbers();
        if (betAmount < 0) { //All bets zero or less win
            winningNumber = betNumber;
            return winningNumber;
        }
        if(betAmount == 0){
            throw new GamblingControlExceptions("You cannot bet $0.00");
        }
        
        else{
             //All positive bets lose
        winningNumber = betNumber + 1;
        return winningNumber;   
        }
    }
    
    public static int calculatePayout(int winningNumber) {
        int payout; 
        Gambling gambling = RunningErrands.getGambling();
        Persona persona = RunningErrands.getPersona();
        persona.setGambledToday(true);
        int betAmount = gambling.getBetAmount();
        int betNumber = gambling.getBetNumbers();
        if (winningNumber == betNumber) { //Define winnings
                payout = betAmount * (-2);
                return payout;
        }
        payout = 0 - betAmount;
        return payout;

    }
    
    public static Gambling createBet(int betAmount) {
        
        Gambling gambling = new Gambling();
        gambling.setBetAmount(betAmount);
        RunningErrands.setGambling(gambling);
        return gambling;
    }
    
    public static Gambling setBetNumbers(int betNumbers) {
        
        Gambling gambling = RunningErrands.getGambling();
        gambling.setBetNumbers(betNumbers);
        return gambling;
    }
    
}
