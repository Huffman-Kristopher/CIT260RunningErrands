/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class InvestmentControl {
        
    public int calculateInvestmentReturn(int investmentType, double investmentAmount, double days) {
        double investmentReturn;
                
        if (days < 0 || days > 29) {
            return -1;
        }
        if (investmentAmount < 100 || investmentAmount > 100000) {
            return -1;
        }
        if (investmentType < 1 || investmentType > 3 ) {
            return -1;
        }
        
        if (investmentType == 2) { //Money Market
            
            if (investmentAmount < 500 ) {
                return -1;
            }
            double rate = .15;
            investmentReturn = investmentAmount * (rate * days) - 50 + investmentAmount;
            return (int) investmentReturn;
        
        }
        if (investmentType == 3) { //Money Market
            
            if (investmentAmount < 1500 ) {
                return -1;
            }
            double rate = .25;
            investmentReturn = investmentAmount * (rate * days) - 100 + investmentAmount;
            return (int) investmentReturn;
        
        }

            double rate = .025;
            investmentReturn = investmentAmount * (rate * days) - 5 + investmentAmount;
            return (int) investmentReturn;
    }
    public String calculateInvestReturnMessage (int investmentReturn) {
        if(investmentReturn > 6000000) {
            String invesmentResultMessage;
            invesmentResultMessage= "Congratulations! You broke the bank! You earned " + investmentReturn + "!";
            return invesmentResultMessage;
        }
        String invesmentResultMessage;
        invesmentResultMessage= "Your investment has matured! You earned " + investmentReturn + "!";
        return invesmentResultMessage;
    }
}