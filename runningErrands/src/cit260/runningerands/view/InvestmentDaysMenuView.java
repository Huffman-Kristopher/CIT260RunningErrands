/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.InvestmentControl;
import cit260.runningerrands.model.Investment;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class InvestmentDaysMenuView extends View {
    
private int investDays = 0;
private Investment investment;

    public InvestmentDaysMenuView() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Investment days Menu            |" 
                  + "\n------------------------------------"
                  + "\nPlease enter a number from 1 to 29 or R to exit: ");
      }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "R": //create a stock investment.
                this.openGameMenu();
                return true;
            default:
                try {
                int investDays = Integer.parseInt(value);
                if (investDays < 0 || investDays > 29) {
                    ErrorView.display(this.getClass().getName(), "\nInvalid selection: Please enter a numeric value or R to return to the game menu.");
                    return false;
                }
                else {
                    investment = InvestmentControl.setInvestmentDays(investDays);
                    this.selectInvestAmount();
                    return true;
                }
                } catch (NumberFormatException ne) {
                    ErrorView.display(this.getClass().getName(), "Invalid selection: Please enter a numeric value or R to return to the game menu.");
                    return false;
                }
        }
}
    private void selectInvestAmount() {
        //Display Help Menu
        InvestmentAmountMenuView InvestmentAmountMenuView = new InvestmentAmountMenuView();
        InvestmentAmountMenuView.display();
    }
        
    private void openGameMenu() {
         String menu = "";
        SceneMenuView sceneMenuView = new SceneMenuView(menu);
        sceneMenuView.display();   
        }
}
