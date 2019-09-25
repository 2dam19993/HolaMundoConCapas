/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class JavaFxViewImplementation extends javafx.application.Application implements View {
    
    private String saludo ;
    
    @Override
    public void start(Stage stage) throws Exception {
        try{
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //Este metodo arranca un FX y siempre es obligatorio
            //Necesitamos cargar un escena que esta hechco por fxml y FXMLDocumentController
            //VERSION ESTATICA
            //Parent root= FXMLLoader.load(getClass().getResource("FXMLDocumentController.java"));
            //VERSION NO ESTATICA
            //Creador un cargardor Load node graph from fxml file
            FXMLLoader loader=new FXMLLoader(getClass().getResource("SceneBuilderVentana.fxml"));
            //asi lo cargamos y con el fxml fx:controller sabe cual es el controllador
            Parent root= (Parent) loader.load();
            //Get contoller for graph
            FXMLDocumentController viewController = ((FXMLDocumentController) loader.getController());
            viewController.setGreeting(saludo);
            //Obligatorio
            viewController.setStage(stage);
            viewController.initStage(root);
            
            //Con esto hacemos que ejecute el metodo que esta en el controller referncia=puntero
            //stage.setOnShowing(FXMLDocumentController::onWindowShowing); -mal
            
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public void showGreeting(String saludo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //JavaFXViewImplementation.greeting=greting;
        //JavaFxViewImplementation.saludo=saludo;
        
        //Es la forma de lanzar la apliacion
        launch(saludo);
        
    }
    //Con esto podemos pasar parametros ya que se ejecuta antes de start
    //Ya que esta en su ciclo de vida
    @Override
    public void init() throws Exception{
        this.saludo=getParameters().getRaw().get(0);
    }

    void setGreeting(String greeting) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.saludo=greeting;
    }
    
}
