/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package holamundoconcapas.view;

import java.util.logging.Logger;
import javafx.stage.Stage;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.control.LabeledMatchers.hasText;


/**
 * Esta clase testea la clase FXMLDocumentController.
 * This class tests the FXMLDocumentController class.
 * @author Ricardo Peinado Lastra
 */
public class FXMLDocumentControllerIT extends ApplicationTest {
    private static final Logger LOGGER = Logger.getLogger("holamundoconcapas.control.Controller");
    private final String greeting="Hola soy un fichero";
    public FXMLDocumentControllerIT() {
    }
    /**
     * Este metodo testea el start de la ventanFX
     * This method tests the start of the windowFX
     * @param stage es el escenario de la ventana
     */
    @Override
    public void start(Stage stage) throws Exception{
        try{
            JavaFxViewImplementation  myapp= new JavaFxViewImplementation();
            myapp.setGreeting(greeting);
            myapp.start(stage);
        }catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
        
    }
    /**
     * Esta metodo testea si tiene el saludo o no
     * This method tests the label has a greeting or no
     */
    @Test
    public void testLabelHasGreeting() {
        verifyThat("#lblTexto",hasText(greeting));
        //clickOn("#btnCierre");
    }
    /**
     * Esta clase comprueba si se cierra y tiene por doble el saludo
     * This class comfirm if the windows is closed or no
     */
    @Test
    public void testButtonClick(){
        clickOn("#btnCierre");
        verifyThat("#lblTexto",hasText(greeting+greeting));
    }
}
