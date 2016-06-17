/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.InvestmentControl;
import cit260.runningerrands.model.Investment;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class InvestmentAmountMenuView extends View {
    
private int investAmount = 0;
private Investment investment;


/**     private int getMaxInvest() {
        Persona persona = RunningErrands.getPersona();
       int maxInvest = (persona.getMoney() - 1);
        return maxInvest;
    }
**/
    public InvestmentAmountMenuView() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Investment Amount Menu            |" 
                  + "\n------------------------------------"
                  + "\nPlease enter a number from 0 to 99999 or R to exit: ");
      }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "R": //create a stock investment.
                this.openGameMenu();
                break;
            default:
                int investAmount = Integer.parseInt(value);
                Persona persona = RunningErrands.getPersona();
                int maxBet = persona.getMoney() - 1 ;
                if (investAmount < 1 || investAmount > maxBet) {
                    System.out.println("\nPlease enter a bet between 1 and " + maxBet);
                }
                else {
                    investment = InvestmentControl.setInvestmentAmount(investAmount);
                    this.calculateInvesmentReturn(investAmount);
                }
                break;
        }
        return false;
}
    private void calculateInvesmentReturn(int investAmount) {
        //Display Help Menu
        int investReturn = InvestmentControl.calculateInvestmentReturn();
        InvestmentControl.updateInvestmentReturn(investReturn);
        Persona persona = RunningErrands.getPersona();
        int currentBalance = persona.getMoney();
        int updatedBalance = currentBalance - investAmount;
        persona.setMoney(updatedBalance);
        GameMenuView GameMenuView = new GameMenuView();
        GameMenuView.display();  
        
    }
    
    private void openGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}
