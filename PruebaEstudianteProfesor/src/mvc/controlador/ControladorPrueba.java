/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controlador;
import mvc.modelo.Profesor;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorPrueba {
    private static ControladorPrueba instance;

    private ControladorPrueba() {
    }

    public static ControladorPrueba getInstance() {
        if (instance == null) {
            instance = new ControladorPrueba();
        }
        return instance;
    }
    
    private List<Profesor> profesores;
    
}
