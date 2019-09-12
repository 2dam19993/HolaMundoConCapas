/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas;

import holamundoconcapas.control.Controller;
import holamundoconcapas.model.ModelFactory;
import holamundoconcapas.view.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {
   public static void main (String[] args){
       Controller control = new Controller();
       ViewFactory viewf = new ViewFactory();
       ModelFactory modelf = new ModelFactory();
       control.run(modelf.getModel(), viewf.getView());
   }
}
