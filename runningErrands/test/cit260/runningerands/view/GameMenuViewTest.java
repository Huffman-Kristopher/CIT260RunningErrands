/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reddo
 */
public class GameMenuViewTest {
    
    public GameMenuViewTest() {
    }

    /**
     * Test of displayGameMenuView method, of class GameMenuView.
     */
    @Test
    public void testDisplayGameMenuView() {
        System.out.println("displayGameMenuView");
        GameMenuView instance = new GameMenuView();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class GameMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String value = "";
        GameMenuView instance = new GameMenuView();
        boolean expResult = false;
        boolean result = instance.doAction(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
