/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    public View getView(){
        //Este contructor no lo he declarado yo ya que es un contructor implicito
        //return new ViewImplementation();
        //return new SwingViewImplementation();
        return new JavaFxViewImplementation();
    };
}
