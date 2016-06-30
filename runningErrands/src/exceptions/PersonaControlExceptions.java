/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Kris
 */
public class PersonaControlExceptions extends Exception{

    public PersonaControlExceptions() {
    }

    public PersonaControlExceptions(String message) {
        super(message);
    }

    public PersonaControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonaControlExceptions(Throwable cause) {
        super(cause);
    }

    public PersonaControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
