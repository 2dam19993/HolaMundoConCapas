/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import javafx.stage.Stage;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.control.LabeledMatchers.hasText;


/**
 *
 * @author 2dam
 */
public class FXMLDocumentControllerIT extends ApplicationTest {
    private final String greeting="Hola soy un fichero";
    public FXMLDocumentControllerIT() {
    }
    @Override
    public void start(Stage stage) throws Exception{
        JavaFxViewImplementation  myapp= new JavaFxViewImplementation();
        myapp.setGreeting(greeting);
        myapp.start(stage);
        
    }
    
    @Test
    public void testLabelHasGreeting() {
        verifyThat("#lblTexto",hasText(greeting));
        //clickOn("#btnCierre");
    }
    
    @Test
    public void testButtonClick(){
        clickOn("#btnCierre");
        verifyThat("#lblTexto",hasText(greeting+greeting));
    }
}
