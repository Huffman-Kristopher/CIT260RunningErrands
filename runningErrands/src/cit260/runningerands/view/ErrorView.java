/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import java.io.PrintWriter;
import runningerrands.RunningErrands;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = RunningErrands.getOutFile();
    private static final PrintWriter logFile = RunningErrands.getLogFile();
    public static void display(String className, String errorMessage){
        
        errorFile.println(errorMessage);
    // log Error
    logFile.println(className + " - " + errorMessage);
    
    }
}
