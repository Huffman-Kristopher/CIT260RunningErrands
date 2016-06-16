/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import java.util.Scanner;

/**
 *
 * @author Kris
 */
public class SellItemsMenu extends View{

    public SellItemsMenu() {
        super("\n"
                  + "\n------------------------------------"
                  + "\n| Sell inventory Menu                        |" 
                  + "\n------------------------------------"
                  + "\n1 -  item." // place holder
                  + "\n2 -  item." // place holder
                  + "\n3 -  item." // place holder
                  + "\nR - Return to game menu"
                  + "\n-------------------------"
                  + "\nPlease select an Store itme option: ");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "1": //item 1.
                this.option1();
                break;
            case "2": //item 2.
                this.option2();
                break;
            case "3": //item 3.
                this.option3();
                break;
            case "R": //return to game menu.
                this.openGameMenu();
                break;
            default:
                System.out.println("\nInvalid selection, please try again");
                break;  
        }

        return false;

}

    private void option1() {
        System.out.println("\n ***Sell option 1 ***");
    }
     private void option2() {
        System.out.println("\n ***Sell option 2 ***");
     }
      private void option3() {
        System.out.println("\n ***Sell option 3 ***");
    }

     private void openGameMenu() {
       GameMenuView GameMenuView = new GameMenuView();
       GameMenuView.display();
    }
}

