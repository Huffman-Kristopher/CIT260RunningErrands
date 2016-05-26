/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author reddo
 */
public class CharacterControl {
            
    public int calculatehealth(int age) {
        int characterHealth;
                
        if (age < 1 || age > 120 ) { //numberPick is too big
            return -1;
        }
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 9);
        characterHealth = (age * 3) + randomNumber;
        return characterHealth;
        
    }
}
