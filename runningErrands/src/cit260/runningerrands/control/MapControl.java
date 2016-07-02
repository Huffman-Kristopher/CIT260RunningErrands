/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Location;
import cit260.runningerrands.model.Map;
import cit260.runningerrands.model.Persona;
import cit260.runningerrands.model.Scene;
import exceptions.MapControlExceptions;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class MapControl {

    
    public static void movePersonaToStartingLocation() {
               
        Persona persona = RunningErrands.getPersona();
        Location[][] locations = RunningErrands.getLocations();
        Location startingLocation = locations[0][0];
        persona.setLocation(startingLocation);
        RunningErrands.setPersona(persona);
        
    }

    public static void movePersonaToNewLocation(String symbol) {
        
        Persona persona = RunningErrands.getPersona();
        Location[][] locations = RunningErrands.getLocations();
        Map map = RunningErrands.getMap();
        Location newLocation = map.getLocationFromSymbol(symbol);
        symbol = newLocation.getScene().getLocationSymbol();
        persona.setLocation(newLocation);
        RunningErrands.setPersona(persona);
        symbol = persona.getLocation().getScene().getLocationSymbol();
        
    }
    
    static Map createMap() {
        Map map = new Map(6,5);
        RunningErrands.setMap(map);
        MapControl.createLocations();
        Scene[] scenes = createScenes();
        RunningErrands.setScene(scenes);
        assignScenesToLocations(map, scenes);
        return map;
    }

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[30];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Home");
        startingScene.setLocationSymbol("01");
        startingScene.setTravelTime(0);
        startingScene.setDistance(0);
        scenes[LocationName.startingScene.ordinal()] = startingScene;
        
        Scene mallScene = new Scene();
        mallScene.setDescription(
                "Mall");
        mallScene.setLocationSymbol("02");
        mallScene.setTravelTime(0);
        mallScene.setDistance(20);
        scenes[LocationName.mallScene.ordinal()] = mallScene;
        
        Scene GroceryScene = new Scene();
        GroceryScene.setDescription(
                "Grocery Store");
        GroceryScene.setLocationSymbol("03");
        GroceryScene.setTravelTime(0);
        GroceryScene.setDistance(40);
        scenes[LocationName.GroceryScene.ordinal()] = GroceryScene;
        
        Scene gasScene = new Scene();
        gasScene.setDescription(
                "Gas Station");
        gasScene.setLocationSymbol("04");
        gasScene.setTravelTime(0);
        gasScene.setDistance(50);
        scenes[LocationName.gasScene.ordinal()] = gasScene;
        
        Scene gunShopScene = new Scene();
        gunShopScene.setDescription(
                "Gun Shop");
        gunShopScene.setLocationSymbol("05");
        gunShopScene.setTravelTime(0);
        gunShopScene.setDistance(50);
        scenes[LocationName.gunShopScene.ordinal()] = gunShopScene;
        
        Scene sportingScene = new Scene();
        sportingScene.setDescription(
                "Sporting Goods Shop");
        sportingScene.setLocationSymbol("06");
        sportingScene.setTravelTime(0);
        sportingScene.setDistance(75);
        scenes[LocationName.sportingScene.ordinal()] = sportingScene;
        
        Scene libraryScene = new Scene();
        libraryScene.setDescription(
                "Library");
        libraryScene.setLocationSymbol("07");
        libraryScene.setTravelTime(0);
        libraryScene.setDistance(7);
        scenes[LocationName.libraryScene.ordinal()] = libraryScene;
        
        Scene churchScene = new Scene();
        churchScene.setDescription(
                "Church");
        churchScene.setLocationSymbol("08");
        churchScene.setTravelTime(0);
        churchScene.setDistance(0);
        scenes[LocationName.churchScene.ordinal()] = churchScene;
        
        Scene hospitalScene = new Scene();
        hospitalScene.setDescription(
                "Hospital");
        hospitalScene.setLocationSymbol("09");
        hospitalScene.setTravelTime(0);
        hospitalScene.setDistance(50);
        scenes[LocationName.hospitalScene.ordinal()] = hospitalScene;
        
        Scene schoolScene = new Scene();
        schoolScene.setDescription(
                "School");
        schoolScene.setLocationSymbol("10");
        schoolScene.setTravelTime(0);
        schoolScene.setDistance(5);
        scenes[LocationName.schoolScene.ordinal()] = schoolScene;
        
        Scene bankScene = new Scene();
        bankScene.setDescription(
                "Bank");
        bankScene.setLocationSymbol("11");
        bankScene.setTravelTime(0);
        bankScene.setDistance(9);
        scenes[LocationName.bankScene.ordinal()] = bankScene;
        
        Scene comicScene = new Scene();
        comicScene.setDescription(
                "Comic Shop");
        comicScene.setLocationSymbol("12");
        comicScene.setTravelTime(0);
        comicScene.setDistance(20);
        scenes[LocationName.comicScene.ordinal()] = comicScene;
        
        Scene repairScene = new Scene();
        repairScene.setDescription(
                "Car Repair Shop");
        repairScene.setLocationSymbol("13");
        repairScene.setTravelTime(0);
        repairScene.setDistance(43);
        scenes[LocationName.repairScene.ordinal()] = repairScene;
        
        Scene ninjaScene = new Scene();
        ninjaScene.setDescription(
                "Martial Arts School");
        ninjaScene.setLocationSymbol("14");
        ninjaScene.setTravelTime(0);
        ninjaScene.setDistance(50);
        scenes[LocationName.ninjaScene.ordinal()] = ninjaScene;
        
        Scene armyScene = new Scene();
        armyScene.setDescription(
                "Army base");
        armyScene.setLocationSymbol("15");
        armyScene.setTravelTime(0);
        armyScene.setDistance(50);
        scenes[LocationName.armyScene.ordinal()] = armyScene;
        
        Scene postScene = new Scene();
        postScene.setDescription(
                "Post Office");
        postScene.setLocationSymbol("16");
        postScene.setTravelTime(0);
        postScene.setDistance(75);
        scenes[LocationName.postScene.ordinal()] = postScene;
        
        Scene fireworksScene = new Scene();
        fireworksScene.setDescription(
                "Fireworks Stand");
        fireworksScene.setLocationSymbol("17");
        fireworksScene.setTravelTime(0);
        fireworksScene.setDistance(7);
        scenes[LocationName.fireworksScene.ordinal()] = fireworksScene;
        
        Scene petScene = new Scene();
        petScene.setDescription(
                "Pet Store");
        petScene.setLocationSymbol("18");
        petScene.setTravelTime(0);
        petScene.setDistance(19);
        scenes[LocationName.petScene.ordinal()] = petScene;
        
        Scene MarinaScene = new Scene();
        MarinaScene.setDescription(
                "Marina");
        MarinaScene.setLocationSymbol("19");
        MarinaScene.setTravelTime(0);
        MarinaScene.setDistance(50);
        scenes[LocationName.MarinaScene.ordinal()] = MarinaScene;
        
        Scene improvementScene = new Scene();
        improvementScene.setDescription(
                "Home Improvement Store");
        improvementScene.setLocationSymbol("20");
        improvementScene.setTravelTime(0);
        improvementScene.setDistance(58);
        scenes[LocationName.improvementScene.ordinal()] = improvementScene;
        
        Scene policeScene = new Scene();
        policeScene.setDescription(
                "Police Station");
        policeScene.setLocationSymbol("21");
        policeScene.setTravelTime(0);
        policeScene.setDistance(75);
        scenes[LocationName.policeScene.ordinal()] = policeScene;
        
        Scene zooScene = new Scene();
        zooScene.setDescription(
                "The Zoo");
        zooScene.setLocationSymbol("22");
        zooScene.setTravelTime(0);
        zooScene.setDistance(95);
        scenes[LocationName.zooScene.ordinal()] = zooScene;
        
        Scene museumScene = new Scene();
        museumScene.setDescription(
                "Natural History Museum");
        museumScene.setLocationSymbol("23");
        museumScene.setTravelTime(0);
        museumScene.setDistance(99);
        scenes[LocationName.museumScene.ordinal()] = museumScene;
        
        Scene cemeteryScene = new Scene();
        cemeteryScene.setDescription(
                "Cemetery");
        cemeteryScene.setLocationSymbol("24");
        cemeteryScene.setTravelTime(0);
        cemeteryScene.setDistance(33);
        scenes[LocationName.cemeteryScene.ordinal()] = cemeteryScene;
        
        Scene volcanoScene = new Scene();
        volcanoScene.setDescription(
                "Volcano");
        volcanoScene.setLocationSymbol("25");
        volcanoScene.setTravelTime(0);
        volcanoScene.setDistance(127);
        scenes[LocationName.volcanoScene.ordinal()] = volcanoScene;
        
        Scene pizzaScene = new Scene();
        pizzaScene.setDescription(
                "Pizza Parlor");
        pizzaScene.setLocationSymbol("26");
        pizzaScene.setTravelTime(0);
        pizzaScene.setDistance(67);
        scenes[LocationName.pizzaScene.ordinal()] = pizzaScene;
        
        Scene orphanScene = new Scene();
        orphanScene.setDescription(
                "Orphanage");
        orphanScene.setLocationSymbol("27");
        orphanScene.setTravelTime(0);
        orphanScene.setDistance(127);
        scenes[LocationName.orphanScene.ordinal()] = orphanScene;
        
        Scene placeScene = new Scene();
        placeScene.setDescription(
                "placeholder");
        placeScene.setLocationSymbol("28");
        placeScene.setTravelTime(0);
        placeScene.setDistance(127);
        scenes[LocationName.placeScene.ordinal()] = placeScene;
        
         Scene holderScene = new Scene();
        holderScene.setDescription(
                "placeholder");
        holderScene.setLocationSymbol("29");
        holderScene.setTravelTime(0);
        holderScene.setDistance(127);
        scenes[LocationName.holderScene.ordinal()] = holderScene;
        
        Scene finishingScene = new Scene();
        finishingScene.setDescription(
                "Finishing Scene");
        finishingScene.setLocationSymbol("30");
        finishingScene.setTravelTime(0);
        finishingScene.setDistance(127);
        scenes[LocationName.finishingScene.ordinal()] = finishingScene;        
        return scenes;
        
    }

    public enum LocationName {
        
        startingScene,
        mallScene,
        GroceryScene,
        gasScene,
        gunShopScene,
        sportingScene,
        libraryScene, 
        churchScene, 
        hospitalScene, 
        schoolScene, 
        bankScene, 
        comicScene, 
        repairScene, 
        ninjaScene, 
        armyScene, 
        postScene, 
        fireworksScene, 
        petScene, 
        MarinaScene, 
        improvementScene, 
        policeScene, 
        zooScene, 
        museumScene, 
        cemeteryScene, 
        volcanoScene, 
        pizzaScene, 
        orphanScene, 
        placeScene,
        holderScene, 
        finishingScene
        
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[LocationName.startingScene.ordinal()]);
        locations[0][1].setScene(scenes[LocationName.mallScene.ordinal()]);
        locations[0][2].setScene(scenes[LocationName.GroceryScene.ordinal()]);
        locations[0][3].setScene(scenes[LocationName.gasScene.ordinal()]);
        locations[0][4].setScene(scenes[LocationName.gunShopScene.ordinal()]);
        locations[1][0].setScene(scenes[LocationName.sportingScene.ordinal()]);
        locations[1][1].setScene(scenes[LocationName.libraryScene.ordinal()]);
        locations[1][2].setScene(scenes[LocationName.churchScene.ordinal()]);
        locations[1][3].setScene(scenes[LocationName.hospitalScene.ordinal()]);
        locations[1][4].setScene(scenes[LocationName.schoolScene.ordinal()]);
        locations[2][0].setScene(scenes[LocationName.bankScene.ordinal()]);
        locations[2][1].setScene(scenes[LocationName.comicScene.ordinal()]);
        locations[2][2].setScene(scenes[LocationName.repairScene.ordinal()]);
        locations[2][3].setScene(scenes[LocationName.ninjaScene.ordinal()]);
        locations[2][4].setScene(scenes[LocationName.armyScene.ordinal()]);
        locations[3][0].setScene(scenes[LocationName.postScene.ordinal()]);
        locations[3][1].setScene(scenes[LocationName.fireworksScene.ordinal()]);
        locations[3][2].setScene(scenes[LocationName.petScene.ordinal()]);
        locations[3][3].setScene(scenes[LocationName.MarinaScene.ordinal()]);
        locations[3][4].setScene(scenes[LocationName.improvementScene.ordinal()]);
        locations[4][0].setScene(scenes[LocationName.policeScene.ordinal()]);
        locations[4][1].setScene(scenes[LocationName.zooScene.ordinal()]);
        locations[4][2].setScene(scenes[LocationName.museumScene.ordinal()]);
        locations[4][3].setScene(scenes[LocationName.cemeteryScene.ordinal()]);
        locations[4][4].setScene(scenes[LocationName.volcanoScene.ordinal()]);
        locations[5][0].setScene(scenes[LocationName.pizzaScene.ordinal()]);
        locations[5][1].setScene(scenes[LocationName.orphanScene.ordinal()]);
        locations[5][2].setScene(scenes[LocationName.placeScene.ordinal()]);
        locations[5][3].setScene(scenes[LocationName.holderScene.ordinal()]);
        locations[5][4].setScene(scenes[LocationName.finishingScene.ordinal()]);
        map.setLocations(locations);
        RunningErrands.setLocations(locations);
        
    }
    
    private static Location[][] createLocations() {
        
        Location[][] locations = new Location[5][4];
        RunningErrands.setLocations(locations);
        return locations;
    }
    
    public void calculateTravel(double dollarsSpent, double fuelPrice, double mpg)
            throws MapControlExceptions {
        double distanceToLocation = 250; //needs to be pulled from map data
        double distanceAbleToTravel = (dollarsSpent / fuelPrice) * mpg;
                
        if (dollarsSpent < 1.50 || dollarsSpent > 1000) { 
            throw new MapControlExceptions("Value is and invalid amount of money.");
        }
        if (distanceAbleToTravel < distanceToLocation ) {
            throw new MapControlExceptions("You don't have the fuel to make it!");
        }
    }        
            
}
