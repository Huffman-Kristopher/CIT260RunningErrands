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
public class ViewTest {
    
    public ViewTest() {
    }

    /**
     * Test of display method, of class View.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        View instance = new ViewImpl();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInput method, of class View.
     */
    @Test
    public void testGetInput() {
        System.out.println("getInput");
        View instance = new ViewImpl();
        String expResult = "";
        String result = instance.getInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ViewImpl extends View {

        @Override
        public boolean doAction(String value) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
   