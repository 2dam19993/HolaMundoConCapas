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
 *
 * @author 2dam
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
    
    @Before
    public void setUp() {
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
        // TODO review the generated test code and remove the default call to fail.
        fail("El mensaje no es el correcpondiente");
    }
    
}