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
public class GamblingControlExceptions extends Exception{

    public GamblingControlExceptions() {
    }

    public GamblingControlExceptions(String message) {
        super(message);
    }

    public GamblingControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public GamblingControlExceptions(Throwable cause) {
        super(cause);
    }

    public GamblingControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
