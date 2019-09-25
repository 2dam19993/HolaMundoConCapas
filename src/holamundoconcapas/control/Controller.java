/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package holamundoconcapas.control;

import holamundoconcapas.model.Model;
import holamundoconcapas.view.View;
import java.util.logging.Logger;

/**
 * Es el controlador de la aplicación HolaMundoConCapas.
 * This is the controller of the application.
 * @author Ricardo Peinado Lastra
 */
public class Controller {
    //Estatico es unico y final es que no va a cambiar
    //Lo sacamos de arriba el paquete .Nombre de la clase
    private static final Logger LOGGER = Logger.getLogger("holamundoconcapas.control.Controller");
    /**
     * Llama el metodo showGreeting de la implementación View mostrando el
     * saludo sacado de la implementación del modelo con el metodo getGreeting.
     * This method callls the method showGreeting of the viewImplementation 
     * showing the greeting and geeting the greeting with getGreeting method.
     * @param model Devuelve una clase ModelImplementation con la interfaz model implementada.
     * @param view Devuelve una clase ViewImplementation con la interfaz View  implementada.
     */
    public void run(Model model,View view){
        try{
            LOGGER.info("Empezando el metodo run.");
            view.showGreeting(model.getGreeting());
            LOGGER.info("Terminando el metodo run.");
        }catch (Exception e){
            LOGGER.severe(e.getMessage());
        }
    }
}
