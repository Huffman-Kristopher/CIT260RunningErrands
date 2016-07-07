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
public class PurchaseExceptions extends Exception{

    public PurchaseExceptions() {
    }

    public PurchaseExceptions(String message) {
        super(message);
    }

    public PurchaseExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public PurchaseExceptions(Throwable cause) {
        super(cause);
    }

    public PurchaseExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
