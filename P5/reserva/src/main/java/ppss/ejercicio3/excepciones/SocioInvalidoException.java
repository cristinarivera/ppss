/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppss.ejercicio3.excepciones;

/**
 *
 * @author Cristina Rivera Baydal ( crb13@alu.ua.es )
 */
public class SocioInvalidoException extends Exception {
    /**
     * Constructs an instance of <code>JDBCException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public SocioInvalidoException(String msg) {
        super(msg);
    }
}
