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
        Map map = new Map(6,5);
        Scene[] scenes = createScenes();
        assignScenesToLocations(map, scenes);
        return map;
    }

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Home");
        startingScene.setLocationSymbol("01");
        startingScene.setTravelTime(0);
        startingScene.setDistance(0);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene mallScene = new Scene();
        mallScene.setDescription(
                "Mall");
        mallScene.setLocationSymbol("02");
        mallScene.setTravelTime(0);
        mallScene.setDistance(20);
        scenes[SceneType.objective.ordinal()] = mallScene;
        
        Scene GroceryScene = new Scene();
        GroceryScene.setDescription(
                "Grocery Store");
        GroceryScene.setLocationSymbol("03");
        GroceryScene.setTravelTime(0);
        GroceryScene.setDistance(40);
        scenes[SceneType.shop.ordinal()] = GroceryScene;
        
        Scene gasScene = new Scene();
        gasScene.setDescription(
                "Gas Station");
        gasScene.setLocationSymbol("04");
        gasScene.setTravelTime(0);
        gasScene.setDistance(50);
        scenes[SceneType.shop.ordinal()] = gasScene;
        
        Scene gunShopScene = new Scene();
        gunShopScene.setDescription(
                "Gun Shop");
        gunShopScene.setLocationSymbol("05");
        gunShopScene.setTravelTime(0);
        gunShopScene.setDistance(50);
        scenes[SceneType.shop.ordinal()] = gunShopScene;
        
        Scene sportingScene = new Scene();
        sportingScene.setDescription(
                "Sporting Goods Shop");
        sportingScene.setLocationSymbol("06");
        sportingScene.setTravelTime(0);
        sportingScene.setDistance(75);
        scenes[SceneType.shop.ordinal()] = sportingScene;
        
        Scene libraryScene = new Scene();
        libraryScene.setDescription(
                "Library");
        libraryScene.setLocationSymbol("07");
        libraryScene.setTravelTime(0);
        libraryScene.setDistance(7);
        scenes[SceneType.objective.ordinal()] = libraryScene;
        
        Scene churchScene = new Scene();
        churchScene.setDescription(
                "Church");
        churchScene.setLocationSymbol("08");
        churchScene.setTravelTime(0);
        churchScene.setDistance(0);
        scenes[SceneType.objective.ordinal()] = churchScene;
        
        Scene hospitalScene = new Scene();
        hospitalScene.setDescription(
                "Hospital");
        hospitalScene.setLocationSymbol("09");
        hospitalScene.setTravelTime(0);
        hospitalScene.setDistance(50);
        scenes[SceneType.objective.ordinal()] = hospitalScene;
        
        Scene schoolScene = new Scene();
        schoolScene.setDescription(
                "School");
        schoolScene.setLocationSymbol("10");
        schoolScene.setTravelTime(0);
        schoolScene.setDistance(5);
        scenes[SceneType.objective.ordinal()] = schoolScene;
        
        Scene bankScene = new Scene();
        bankScene.setDescription(
                "Bank");
        bankScene.setLocationSymbol("11");
        bankScene.setTravelTime(0);
        bankScene.setDistance(9);
        scenes[SceneType.objective.ordinal()] = bankScene;
        
        Scene comicScene = new Scene();
        comicScene.setDescription(
                "Comic Shop");
        comicScene.setLocationSymbol("12");
        comicScene.setTravelTime(0);
        comicScene.setDistance(20);
        scenes[SceneType.shop.ordinal()] = comicScene;
        
        Scene repairScene = new Scene();
        repairScene.setDescription(
                "Car Repair Shop");
        repairScene.setLocationSymbol("13");
        repairScene.setTravelTime(0);
        repairScene.setDistance(43);
        scenes[SceneType.shop.ordinal()] = repairScene;
        
        Scene ninjaScene = new Scene();
        ninjaScene.setDescription(
                "Martial Arts School");
        ninjaScene.setLocationSymbol("14");
        ninjaScene.setTravelTime(0);
        ninjaScene.setDistance(50);
        scenes[SceneType.shop.ordinal()] = ninjaScene;
        
        Scene armyScene = new Scene();
        armyScene.setDescription(
                "Army base");
        armyScene.setLocationSymbol("15");
        armyScene.setTravelTime(0);
        armyScene.setDistance(50);
        scenes[SceneType.objective.ordinal()] = armyScene;
        
        Scene postScene = new Scene();
        postScene.setDescription(
                "Post Office");
        postScene.setLocationSymbol("16");
        postScene.setTravelTime(0);
        postScene.setDistance(75);
        scenes[SceneType.shop.ordinal()] = postScene;
        
        Scene fireworksScene = new Scene();
        fireworksScene.setDescription(
                "Fireworks Stand");
        fireworksScene.setLocationSymbol("17");
        fireworksScene.setTravelTime(0);
        fireworksScene.setDistance(7);
        scenes[SceneType.shop.ordinal()] = fireworksScene;
        
        Scene petScene = new Scene();
        petScene.setDescription(
                "Pet Store");
        petScene.setLocationSymbol("18");
        petScene.setTravelTime(0);
        petScene.setDistance(19);
        scenes[SceneType.shop.ordinal()] = petScene;
        
        Scene MarinaScene = new Scene();
        MarinaScene.setDescription(
                "Marina");
        MarinaScene.setLocationSymbol("19");
        MarinaScene.setTravelTime(0);
        MarinaScene.setDistance(50);
        scenes[SceneType.objective.ordinal()] = MarinaScene;
        
        Scene improvementScene = new Scene();
        improvementScene.setDescription(
                "Home Improvement Store");
        improvementScene.setLocationSymbol("20");
        improvementScene.setTravelTime(0);
        improvementScene.setDistance(58);
        scenes[SceneType.shop.ordinal()] = improvementScene;
        
        Scene policeScene = new Scene();
        policeScene.setDescription(
                "Police Station");
        policeScene.setLocationSymbol("21");
        policeScene.setTravelTime(0);
        policeScene.setDistance(75);
        scenes[SceneType.objective.ordinal()] = policeScene;
        
        Scene zooScene = new Scene();
        zooScene.setDescription(
                "The Zoo");
        zooScene.setLocationSymbol("22");
        zooScene.setTravelTime(0);
        zooScene.setDistance(95);
        scenes[SceneType.objective.ordinal()] = zooScene;
        
        Scene museumScene = new Scene();
        museumScene.setDescription(
                "Natural History Museum");
        museumScene.setLocationSymbol("23");
        museumScene.setTravelTime(0);
        museumScene.setDistance(99);
        scenes[SceneType.shop.ordinal()] = museumScene;
        
        Scene cemeteryScene = new Scene();
        cemeteryScene.setDescription(
                "Cemetery");
        cemeteryScene.setLocationSymbol("24");
        cemeteryScene.setTravelTime(0);
        cemeteryScene.setDistance(33);
        scenes[SceneType.objective.ordinal()] = cemeteryScene;
        
        Scene volcanoScene = new Scene();
        volcanoScene.setDescription(
                "Volcano");
        volcanoScene.setLocationSymbol("25");
        volcanoScene.setTravelTime(0);
        volcanoScene.setDistance(127);
        scenes[SceneType.finish.ordinal()] = volcanoScene;
        
        Scene pizzaScene = new Scene();
        pizzaScene.setDescription(
                "Pizza Parlor");
        pizzaScene.setLocationSymbol("26");
        pizzaScene.setTravelTime(0);
        pizzaScene.setDistance(67);
        scenes[SceneType.shop.ordinal()] = pizzaScene;
        
        Scene orphanScene = new Scene();
        orphanScene.setDescription(
                "Orphanage");
        orphanScene.setLocationSymbol("27");
        orphanScene.setTravelTime(0);
        orphanScene.setDistance(127);
        scenes[SceneType.objective.ordinal()] = orphanScene;
        
        Scene placeScene = new Scene();
        placeScene.setDescription(
                "placeholder");
        placeScene.setLocationSymbol("27");
        placeScene.setTravelTime(0);
        placeScene.setDistance(127);
        scenes[SceneType.ph.ordinal()] = placeScene;
        
         Scene holderScene = new Scene();
        holderScene.setDescription(
                "placeholder");
        holderScene.setLocationSymbol("27");
        holderScene.setTravelTime(0);
        holderScene.setDistance(127);
        scenes[SceneType.ph.ordinal()] = holderScene;
        return scenes;
        
    }

    public enum SceneType {
        start,
        objective,
        shop,
        combat,
        ph,
        finish;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.objective.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.shop.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.shop.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.shop.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.shop.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.objective.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.objective.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.objective.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.objective.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.objective.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.shop.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.shop.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.shop.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.objective.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.shop.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.shop.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.shop.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.objective.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.shop.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.objective.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.objective.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.shop.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.objective.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.shop.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.objective.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.objective.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.ph.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.ph.ordinal()]);
        
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
