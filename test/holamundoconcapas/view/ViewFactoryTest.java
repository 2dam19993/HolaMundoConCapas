/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package holamundoconcapas.view;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//Permite utilizar sus metodos sin mecionar todo el rato Assert
import static org.junit.Assert.*;

/**
 * Esta clase testea la clase ViewFactory
 * This class tests the View Factory class
 * @author Ricardo Peinado Lastra
 */
public class ViewFactoryTest {
    
    public ViewFactoryTest() {
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
     * Test of getView method, of class ViewFactory.
     */
    @Test
    public void testGetView() {
        System.out.println("getView");
        ViewFactory instance = new ViewFactory();
        //View expResult = new ViewImplementation();
        View result = instance.getView();
        //assertEquals(expResult, result);
        assertTrue("No es una vista",result instanceof View);
    }
    
}
