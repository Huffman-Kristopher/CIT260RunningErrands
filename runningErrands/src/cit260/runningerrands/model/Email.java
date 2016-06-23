/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import java.io.Serializable;

/**
 *
 * @author reddo
 */
public enum Email implements Serializable {
    
    placeholder("This is the email message");
    
    private final String message;            

    Email(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
            
}
