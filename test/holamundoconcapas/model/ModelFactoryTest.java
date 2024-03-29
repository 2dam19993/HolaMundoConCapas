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
 * Esta clase testea la clase ModelFactory.
 * This class test the ModelFactory class
 * @author Ricardo Peinado Lastra
 */
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
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
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        ModelFactory instance = new ModelFactory();
        //Model expResult = null;
        //Model expResult = new ModelImplementation();
        Model result = instance.getModel();
        assertTrue(result instanceof Model);
        
    }
    
}
