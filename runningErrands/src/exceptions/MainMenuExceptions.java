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
public class MainMenuExceptions extends Exception{

    public MainMenuExceptions() {
    }

    public MainMenuExceptions(String message) {
        super(message);
    }

    public MainMenuExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public MainMenuExceptions(Throwable cause) {
        super(cause);
    }

    public MainMenuExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
