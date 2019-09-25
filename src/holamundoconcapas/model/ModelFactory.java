/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package holamundoconcapas.model;

/**
 * Esta clase es una Factoria con la función devolver ModelosImplementados.
 * This class is the factory of the Model that return Models Implementations.
 * @author Ricardo Peinado Lastra
 */
public class ModelFactory {
    /**
     * Es el metodo que crea y retorna los Modelos.
     * This method return a Model implementaton like a Model Class
     * @return Retorna un modelo que esta implementado.
     */
    public Model getModel(){
        //return new ModelImplementation();
        return new FileModelImplement();
    };
}
