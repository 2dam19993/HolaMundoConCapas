/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package holamundoconcapas.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Esta clase testea la clase ModelImplementation.
 * This class test the ModelImplementation class.
 * @author Ricardo Peinado Lastra
 */
public class ModelImplementationTest {
    
    public ModelImplementationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    //private Model model;
    @Before
    public void setUp() {
        //model= new ModelImplementation();
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of getGreeting method, of class ModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        ModelImplementation instance = new ModelImplementation();
        String expResult = "Hola mundo";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
    }
    
}
