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
                return true;
            case "2": //create a bond inveestment.
                investment = InvestmentControl.setInvestmentType(value);
                this.selectInvestDays();
                return true;
            case "1": //Create a money market investment.
                investment = InvestmentControl.setInvestmentType(value);
                this.selectInvestDays();
                return true;
            case "R": //Create a money market investment.
                 this.openGameMenu();
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid selection, please select an option above.");
                return false;  
        }

}
    private void selectInvestDays() {
        //Display Help Menu
        InvestmentDaysMenuView InvestmentDaysMenuView = new InvestmentDaysMenuView();
        InvestmentDaysMenuView.display();    }

    private void openGameMenu() {
        String menu = "";
        SceneMenuView sceneMenuView = new SceneMenuView(menu);
        sceneMenuView.display();   
        }
}
