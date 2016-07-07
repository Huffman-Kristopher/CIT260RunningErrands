/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerands.view;

import cit260.runningerrands.control.GameControl;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Scene;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import runningerrands.RunningErrands;

/**
 *
 * @author Kris
 */
public class PrintSceneListView extends View{
    public PrintSceneListView() {
        super("\n"
                  + "\n-------------------------"
                  + "\n| Print Scene List Menu     |" 
                  + "\n-------------------------"
                  + "\n - Please enter a name for the scene list file -"
                  + "\n-------------------------"
                  + "\n");
    }

    @Override
    public boolean doAction(String filePath) {
      StringBuilder line;
      String newLine = System.getProperty("line.separator");
        Scene[] scenes = RunningErrands.getScene();
        
        String sceneList = newLine + "      LIST OF SCENES" + newLine;
        line= new StringBuilder("                                                                             ");
        line.insert(0,"Symbol");
        line.insert(7, "Description");
        line.insert(30, "Menu Option 1");
        line.insert(50, "Menu Option 2");
        line.insert(70, "Menu Option 3");
        sceneList = sceneList + newLine + line.toString();
        
        for (Scene scene : scenes) {
           
            line= new StringBuilder("                                                                             ");
            line.insert(0,scene.getLocationSymbol());
            line.insert(7,scene.getDescription());
            line.insert(30,scene.getMenuOption1());
            line.insert(50,scene.getMenuOption2());
            line.insert(70,scene.getMenuOption3());
            
            sceneList = sceneList + newLine + line.toString();
            
        }
        try(PrintWriter output = new PrintWriter(filePath)){
            output.println(sceneList);
            return true;
        } catch (Exception ex){
            ErrorView.display("PrintSceneListView", ex.getMessage());
        }
    return true;
    
    }
}
