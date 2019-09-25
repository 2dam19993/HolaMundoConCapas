/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package holamundoconcapas.view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


/**
 * Es el controlador del documento FXML.
 * This class control de document FXML for the FXWindow
 * @author Ricardo Peinado Lastra
 */
public class FXMLDocumentController  {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger("holamundoconcapas.view.FXMLDocumentController");
    private String greeting;
    
    @FXML
    private Label lblTexto;
    private Button btnCierre;
    private Pane panePanel;
    private Stage stage;
    
    /**
     * Cierra la ventana generada
     * @param event Es un evento que le entregamos.
     */
    @FXML
    private void cierreAction(ActionEvent event){
        //Para cerrar SIEMPRE
        try{
            Platform.exit();
        }catch (Exception e){
            LOGGER.severe(e.getMessage());
        }
//Si le quitamos onclick de fxml y el @FXML que ayuda a anclarlo seria tal que asi
/*
@FXML
Private Button boton; arriba
y aqui
button.setOnAction(this::handleButtonAction);
*/
    }
    /**
     * Este metodo cambia el contenido de la etiqueta del a ventana por el 
     * saludo.
     * This method change the label content with the greeting.
     * @param event El evento en el que tiene que cambiar.
     */
    public void onWindowShowing (WindowEvent event){
        lblTexto.setText(greeting);
    }
    /**
     * Este metodo da valor al saludo de esta clase.
     * This method put the value to the greeting variable.
     * @param greeting El saludo.
     */
    public void setGreeting(String greeting){
        this.greeting=greeting;
        //CAMBIO
        //lblTexto.setText(greeting);
        //cambio
    }
    //Este metodo se ejecuta mas que se inicializa
    /**
     * Este metdo inicia el escenario.
     * This method initialize the ground.
     * @param root Es el parent de la ventana.
     */
    public void initStage(Parent root){
        //Create scene an set document for it
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setOnShowing(this::onWindowShowing);
    }
    /**
     * Este metodo da inserta un valor a la variable stage de esta clase.
     * This method inserts the value to stage variable.
     * @param stage El valor que recie para el escenario
     */
    public void setStage  (Stage stage){
        this.stage=stage;
    }
    
}
