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
public class MapControl {
    
    public boolean calculateTravel(double dollarsSpent, double fuelPrice, double mpg) {
        double distanceToLocation = 250; //needs to be pulled from map data
        double distanceAbleToTravel = (dollarsSpent / fuelPrice) * mpg;
                
        if (dollarsSpent < 1.50 || dollarsSpent > 1000) { 
            return false;
        }
        if (distanceAbleToTravel < distanceToLocation ) {
            return false;
        }
        return true;
    }        
            
}
