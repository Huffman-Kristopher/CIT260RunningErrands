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
 * @author Kris
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
        int investAmount = Integer.parseInt(value);
        
        if (investAmount < 100 || investAmount > 100000) {
            System.out.println("\nInvalid selection, please try again");
        }
        else {
            investment = InvestmentControl.setInvestmentAmount(investAmount);
            this.calculateInvesmentReturn();
        }
                
        return false;


}
    private void calculateInvesmentReturn() {
        //Display Help Menu
        int investReturn = InvestmentControl.calculateInvestmentReturn();
        int updatedReturn = InvestmentControl.updateInvestmentReturn(investReturn);
        GameMenuView GameMenuView = new GameMenuView();
        GameMenuView.display();  
        
    }
}
