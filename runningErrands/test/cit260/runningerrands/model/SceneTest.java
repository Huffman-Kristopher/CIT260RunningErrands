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
public class SceneTest {
    
    public SceneTest() {
    }

    /**
     * Test of getDescription method, of class Scene.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Scene instance = new Scene();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Scene.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Scene instance = new Scene();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTravelTime method, of class Scene.
     */
    @Test
    public void testGetTravelTime() {
        System.out.println("getTravelTime");
        Scene instance = new Scene();
        double expResult = 0.0;
        double result = instance.getTravelTime();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTravelTime method, of class Scene.
     */
    @Test
    public void testSetTravelTime() {
        System.out.println("setTravelTime");
        double travelTime = 0.0;
        Scene instance = new Scene();
        instance.setTravelTime(travelTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistance method, of class Scene.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        Scene instance = new Scene();
        double expResult = 0.0;
        double result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistance method, of class Scene.
     */
    @Test
    public void testSetDistance() {
        System.out.println("setDistance");
        double distance = 0.0;
        Scene instance = new Scene();
        instance.setDistance(distance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLocationBlock method, of class Scene.
     */
    @Test
    public void testIsLocationBlock() {
        System.out.println("isLocationBlock");
        Scene instance = new Scene();
        boolean expResult = false;
        boolean result = instance.isLocationBlock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocationBlock method, of class Scene.
     */
    @Test
    public void testSetLocationBlock() {
        System.out.println("setLocationBlock");
        boolean locationBlock = false;
        Scene instance = new Scene();
        instance.setLocationBlock(locationBlock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocationSymbol method, of class Scene.
     */
    @Test
    public void testGetLocationSymbol() {
        System.out.println("getLocationSymbol");
        Scene instance = new Scene();
        String expResult = "";
        String result = instance.getLocationSymbol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocationSymbol method, of class Scene.
     */
    @Test
    public void testSetLocationSymbol() {
        System.out.println("setLocationSymbol");
        String locationSymbol = "";
        Scene instance = new Scene();
        instance.setLocationSymbol(locationSymbol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Scene.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Scene instance = new Scene();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Scene.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Scene instance = new Scene();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Scene.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Scene instance = new Scene();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
