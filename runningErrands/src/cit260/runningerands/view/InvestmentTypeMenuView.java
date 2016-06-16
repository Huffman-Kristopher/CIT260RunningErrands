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
public class InvestmentTypeMenuView extends View {
    
private int days;
private Investment investment;


     private int getMaxInvest() {
        Persona persona = RunningErrands.getPersona();
        int maxInvest = (persona.getMoney() - 1);
        return maxInvest;
    }
    public InvestmentTypeMenuView() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Investment Menu                   |" 
                  + "\n------------------------------------"
                  + "\n3 - Stock investment."
                  + "\n2 - Bond Investment."
                  + "\n1 - Money Market Account."
                  + "\nR - Return to main menu"
                  + "\n-------------------------"
                  + "\nPlease select an Investment option: ");
      }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "3": //create a stock investment.
                investment = InvestmentControl.setInvestmentType(value);
                this.selectInvestDays();
                break;
            case "2": //create a bond inveestment.
                investment = InvestmentControl.setInvestmentType(value);
                this.selectInvestDays();
                break;
            case "1": //Create a money market investment.
                investment = InvestmentControl.setInvestmentType(value);
                this.selectInvestDays();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;


}
    private void selectInvestDays() {
        //Display Help Menu
        InvestmentDaysMenuView InvestmentDaysMenuView = new InvestmentDaysMenuView();
        InvestmentDaysMenuView.display();    }
}
