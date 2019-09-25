/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package holamundoconcapas.model;

import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Es la clase que implementa la interfaz Modelo
 * @author Ricardo Peinado Lastra
 */
public class FileModelImplement implements Model{
    //private static final Logger LOGGER = Logger.getLogger("holamundoconcapas.model.FileModelImplement");
    /**
     * Es el metodo que recoge el saludo del las propiedades.
     * @return Retorna el saludo.
     */
    @Override
    public String getGreeting() {
        
        return ResourceBundle.getBundle("holamundoconcapas.model.SaludoProperty").getString("saludo");
        
        //ResourceBundle resourceBundle= new ResourceBundle();
    }
    
}
