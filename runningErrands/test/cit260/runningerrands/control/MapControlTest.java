/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reddo
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calculateTravel method, of class MapControl.
     */
    @Test
    public void testCalculateTravel() {
        System.out.println("calculateTravel");
        double dollarsSpent = 0.0;
        double fuelPrice = 0.0;
        double mpg = 0.0;
        MapControl instance = new MapControl();
        boolean expResult = false;
        boolean result = instance.calculateTravel(dollarsSpent, fuelPrice, mpg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
