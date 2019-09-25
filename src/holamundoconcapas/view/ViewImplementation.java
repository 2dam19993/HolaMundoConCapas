/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package holamundoconcapas.view;

/**
 * Es una clase que implementa la vista.
 * This class is the implementation of the view.
 * @author Ricardo Peinado Lastra
 */
public class ViewImplementation implements View {
    //definimos los metodos declarados en la interfaz
    /**
     * Enseña el saludo.
     * Show the greeting
     * @param saludo Es el saludo que recibe.
     */
    @Override
    public void showGreeting(String saludo) {
        //Bloque de metodo
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //mostrar mensaje
        System.out.println(saludo);
    }
    
}
