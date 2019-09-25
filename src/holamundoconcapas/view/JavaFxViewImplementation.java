/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package holamundoconcapas.view;


//import com.sun.istack.internal.logging.Logger;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Esta clase es que implementa la ventana FX
 * @author Ricardo Peinado Lastra
 */
public class JavaFxViewImplementation extends javafx.application.Application implements View {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger("holamundoconcapas.view.JavaFxViewImplementation");
    private String saludo ;
    /**
     * Es la primera sentecia obligatoria para una venta FX.
     * @param stage Es el escenario que previamente se crea.
     */
    @Override
    public void start(Stage stage) {
        try{
            LOGGER.info("Empieza el metodo start.");
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
            LOGGER.info("Acaba el metodo start.");
        }catch (Exception e){
            LOGGER.severe(e.getMessage());
            //e.printStackTrace();
        }
    }
    /**
     * Enseña el saludo.
     * @param saludo Es el saludo que recibe.
     */
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
    /**
     * Esta es la primer metodo que se ejectua para crear la ventana que se
     * utiliza para añadir parametros.
     */
    @Override
    public void init() {
        try{
            this.saludo=getParameters().getRaw().get(0);
        }catch (Exception e){
            LOGGER.severe(e.getMessage());
        }
    }
    /**
     * Inserta el saludo en esta clase como variable;
     * @param greeting el saludo
     */
    void setGreeting(String greeting) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.saludo=greeting;
    }
    
}
