/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Location;
import cit260.runningerrands.model.Map;
import cit260.runningerrands.model.Scene;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class MapControl {


    static void movePersonaToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Map createMap() {
        Map map = new Map(20,20);
        Scene[] scenes = createScenes();
        assignScenesToLocations(map, scenes);
        return map;
    }

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "This is your Home");
        startingScene.setLocationSymbol("ST");
        startingScene.setTravelTime(0);
        startingScene.setDistance(0);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene objectiveScene = new Scene();
        objectiveScene.setDescription(
                "This is where things are done");
        objectiveScene.setLocationSymbol("OS");
        objectiveScene.setTravelTime(0);
        objectiveScene.setDistance(0);
        scenes[SceneType.objective.ordinal()] = objectiveScene;
        
        Scene shopScene = new Scene();
        shopScene.setDescription(
                "This is a shop, buy some stuff");
        shopScene.setLocationSymbol("SS");
        shopScene.setTravelTime(0);
        shopScene.setDistance(0);
        scenes[SceneType.shop.ordinal()] = shopScene;
        
        Scene finishingScene = new Scene();
        finishingScene.setDescription(
                "Starting Scene description");
        finishingScene.setLocationSymbol("FN");
        finishingScene.setTravelTime(240);
        finishingScene.setDistance(50);
        scenes[SceneType.finish.ordinal()] = finishingScene;
        
        return scenes;
    }

    public enum SceneType {
        start,
        objective,
        shop,
        finish;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.shop.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.objective.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.shop.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.shop.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.objective.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.objective.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.objective.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.objective.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.objective.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.objective.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.objective.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.objective.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.objective.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.objective.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.objective.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.shop.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.shop.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.objective.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.objective.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.shop.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.objective.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.objective.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.objective.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.objective.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.shop.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.objective.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.finish.ordinal()]);
    }
    
    public boolean calculateTravel(double dollarsSpent, double fuelPrice, double mpg) {
        double distanceToLocation = 250; //needs to be pulled from map data
        double distanceAbleToTravel = (dollarsSpent / fuelPrice) * mpg;
                
        if (dollarsSpent < 1.50 || dollarsSpent > 1000) { 
            return false;
        }
        if (distanceAbleToTravel < distanceToLocation ) {
            return false;
        }
        return true;
    }        
            
}
