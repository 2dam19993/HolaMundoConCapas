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
 *
 * @author 2dam
 */
public class FXMLDocumentController  {
    
    private String greeting;
    
    @FXML
    private Label lblTexto;
    private Button btnCierre;
    private Pane panePanel;
    private Stage stage;
        
    @FXML
    private void cierreAction(ActionEvent event){
        //Para cerrar SIEMPRE
        Platform.exit();
        //Si le quitamos onclick de fxml y el @FXML que ayuda a anclarlo seria tal que asi
        /*
            @FXML
            Private Button boton; arriba
            y aqui
            button.setOnAction(this::handleButtonAction);
        */
    }
    
    public void onWindowShowing (WindowEvent event){
        lblTexto.setText(greeting);
    }
    public void setGreeting(String greeting){
        this.greeting=greeting;
        //CAMBIO
        //lblTexto.setText(greeting);
        //cambio
    }
    //Este metodo se ejecuta mas que se inicializa
    public void initStage(Parent root){
        //Create scene an set document for it
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setOnShowing(this::onWindowShowing);
    }
    
    public void setStage  (Stage stage){
        this.stage=stage;
    }
    
}
    