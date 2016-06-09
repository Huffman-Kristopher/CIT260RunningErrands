/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reddo
 */
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of getCarType method, of class Car.
     */
    @Test
    public void testGetCarType() {
        System.out.println("getCarType");
        Car instance = new Car();
        String expResult = "";
        String result = instance.getCarType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarType method, of class Car.
     */
    @Test
    public void testSetCarType() {
        System.out.println("setCarType");
        String carType = "";
        Car instance = new Car();
        instance.setCarType(carType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarFuel method, of class Car.
     */
    @Test
    public void testGetCarFuel() {
        System.out.println("getCarFuel");
        Car instance = new Car();
        double expResult = 0.0;
        double result = instance.getCarFuel();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarFuel method, of class Car.
     */
    @Test
    public void testSetCarFuel() {
        System.out.println("setCarFuel");
        double carFuel = 0.0;
        Car instance = new Car();
        instance.setCarFuel(carFuel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarMileage method, of class Car.
     */
    @Test
    public void testGetCarMileage() {
        System.out.println("getCarMileage");
        Car instance = new Car();
        double expResult = 0.0;
        double result = instance.getCarMileage();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarMileage method, of class Car.
     */
    @Test
    public void testSetCarMileage() {
        System.out.println("setCarMileage");
        double carMileage = 0.0;
        Car instance = new Car();
        instance.setCarMileage(carMileage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Car.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Car.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Car instance = new Car();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Car.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Car instance = new Car();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
