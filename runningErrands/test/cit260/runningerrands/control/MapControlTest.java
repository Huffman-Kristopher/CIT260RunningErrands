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
        double dollarsSpent = 1;
        double fuelPrice = 0;
        double mpg = 0;
        MapControl instance = new MapControl();
        boolean expResult = false;
        boolean result = instance.calculateTravel(dollarsSpent, fuelPrice, mpg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateTravel2() {
        System.out.println("calculateTravel Test 2");
        double dollarsSpent = 1001;
        double fuelPrice = 0;
        double mpg = 0;
        MapControl instance = new MapControl();
        boolean expResult = false;
        boolean result = instance.calculateTravel(dollarsSpent, fuelPrice, mpg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateTravel3() {
        System.out.println("calculateTravel Test 3");
        double dollarsSpent = 2.00;
        double fuelPrice = 1.50;
        double mpg = 20;
        MapControl instance = new MapControl();
        boolean expResult = false;
        boolean result = instance.calculateTravel(dollarsSpent, fuelPrice, mpg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateTravel4() {
        System.out.println("calculateTravel Test 4");
        double dollarsSpent = 500;
        double fuelPrice = 1.5;
        double mpg = 20;
        MapControl instance = new MapControl();
        boolean expResult = true;
        boolean result = instance.calculateTravel(dollarsSpent, fuelPrice, mpg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
