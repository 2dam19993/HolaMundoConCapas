/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package holamundoconcapas.model;

/**
 * Esta clase implementa la interfaz Modelo.
 * This class implements the Model interface.
 * @author Ricardo Peinado Lastra
 */
public class ModelImplementation implements Model{
    //@Override estamos redefiniciendo el metodo
    /**
     * Retorna el saludo.
     * This method returns the greeting.
     * @return Retorna un saludo.
     */
    @Override
    public String getGreeting() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Hola mundo";
    }
    
}
