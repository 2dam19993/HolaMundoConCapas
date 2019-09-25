/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package holamundoconcapas.view;

/**
 * Es la factoria de vista que su funcion es retornar vistas.
 * This is the factory class of Views.
 * @author Ricardo Peinado Lastra
 */
public class ViewFactory {
    /**
     * Retorna implementaciones de la vista.
     * Returns the implementation of the View
     * @return Retorna una implementación de la vista
     */
    public View getView(){
        //Este contructor no lo he declarado yo ya que es un contructor implicito
        //return new ViewImplementation();
        //return new SwingViewImplementation();
        return new JavaFxViewImplementation();
    };
}
