/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class FileModelImplement implements Model{

    @Override
    public String getGreeting() {
         return ResourceBundle.getBundle("holamundoconcapas.model.SaludoProperty").getString("saludo");
     //ResourceBundle resourceBundle= new ResourceBundle();
    }
    
}
