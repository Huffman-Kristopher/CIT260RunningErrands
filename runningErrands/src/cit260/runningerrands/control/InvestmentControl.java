/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Investment;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class InvestmentControl {
        
    public static Investment setInvestmentType(String investType) {
         
        Investment investment = new Investment();
        investment.setInvestType(investType);
        RunningErrands.setInvestment(investment);
        return investment;
    }

    public static Investment setInvestmentDays(int investDays) {
        Persona persona = RunningErrands.getPersona();
        int currentDay = persona.getDay();
        int matureDay = currentDay + investDays;
        Investment investment = RunningErrands.getInvestment();
        investment.setInvestDays(investDays);
        investment.setInvestBeginningDay(currentDay);
        investment.setInvestMatureDay(matureDay);
        return investment;
    }
    
    public static Investment setInvestmentAmount(int investAmount) {
        Investment investment = RunningErrands.getInvestment();
        investment.setInvestAmount(investAmount);
        return investment;
    }
    
    public static int calculateInvestmentReturn() {
        Investment investment = RunningErrands.getInvestment();
        int investAmount = investment.getInvestAmount();
        int investDays = investment.getInvestDays();
        int investReturn = 0;
        double amount = investAmount;
        double days = investDays;
        double invReturn = investReturn;
        
        String investType = investment.getInvestType();
        
        if (investType == "2") { //bond investment
            invReturn = amount * (.15 * days) - 50 + amount;
            investReturn = (int) invReturn;
            return investReturn;
        }
        if (investType == "3") { //Stock investment
            invReturn = amount * (.25 * days) - 100 + amount;
            investReturn = (int) invReturn;
            return investReturn;
        }
        else {
            invReturn = amount * (.025 * days) - 5 + amount;
            investReturn = (int) invReturn;
            return investReturn;
        }
    }

    public static int updateInvestmentReturn(int investReturn) {
        Investment investment = RunningErrands.getInvestment();
        investment.setInvestReturn(investReturn);
        return investReturn;
    }
    
    
}