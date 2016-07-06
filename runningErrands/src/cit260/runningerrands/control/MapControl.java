/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.control.ItemControl.Items;
import cit260.runningerrands.model.Item;
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
        persona.setLocation(newLocation);
        RunningErrands.setPersona(persona);
        
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
        Item[] item = RunningErrands.getItems();
        Scene startingScene = new Scene();
        
        startingScene.setDescription("Home");
        startingScene.setLocationSymbol("01");
        startingScene.setTravelTime(0);
        startingScene.setDistance(0);
        startingScene.setMenuOption1("Combat Menu");
        startingScene.setMenuOption2("Conversation Menu");
        startingScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.startingScene.ordinal()] = startingScene;
        
        Scene mallScene = new Scene();
        mallScene.setDescription("Mall");
        mallScene.setLocationSymbol("02");
        mallScene.setTravelTime(0);
        mallScene.setDistance(20);
        mallScene.setMenuOption1("Combat Menu");
        mallScene.setMenuOption2("Conversation Menu");
        mallScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.mallScene.ordinal()] = mallScene;
        
        Scene GroceryScene = new Scene();
        GroceryScene.setDescription("Grocery Store");
        GroceryScene.setLocationSymbol("03");
        GroceryScene.setTravelTime(0);
        GroceryScene.setDistance(40);
        GroceryScene.setMenuOption1("Combat Menu");
        GroceryScene.setMenuOption2("Conversation Menu");
        GroceryScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.GroceryScene.ordinal()] = GroceryScene;
        
        Scene gasScene = new Scene();
        gasScene.setDescription("Gas Station");
        gasScene.setLocationSymbol("04");
        gasScene.setTravelTime(0);
        gasScene.setDistance(50);
        gasScene.setMenuOption1("Combat Menu");
        gasScene.setMenuOption2("Conversation Menu");
        gasScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.gasScene.ordinal()] = gasScene;
        
        Scene gunShopScene = new Scene();
        gunShopScene.setDescription("Gun Shop");
        gunShopScene.setLocationSymbol("05");
        gunShopScene.setTravelTime(0);
        gunShopScene.setDistance(50);
        gunShopScene.setMenuOption1("Combat Menu");
        gunShopScene.setMenuOption2("Conversation Menu");
        gunShopScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.gunShopScene.ordinal()] = gunShopScene;
        
        Scene sportingScene = new Scene();
        sportingScene.setDescription("Sporting Goods Shop");
        sportingScene.setLocationSymbol("06");
        sportingScene.setTravelTime(0);
        sportingScene.setDistance(75);
        sportingScene.setMenuOption1("Combat Menu");
        sportingScene.setMenuOption2("Conversation Menu");
        sportingScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.sportingScene.ordinal()] = sportingScene;
        
        Scene libraryScene = new Scene();
        libraryScene.setDescription("Library");
        libraryScene.setLocationSymbol("07");
        libraryScene.setTravelTime(0);
        libraryScene.setDistance(7);
        libraryScene.setMenuOption1("Combat Menu");
        libraryScene.setMenuOption2("Conversation Menu");
        libraryScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.libraryScene.ordinal()] = libraryScene;
        
        Scene churchScene = new Scene();
        churchScene.setDescription("Church");
        churchScene.setLocationSymbol("08");
        churchScene.setTravelTime(0);
        churchScene.setDistance(0);
        churchScene.setMenuOption1("Combat Menu");
        churchScene.setMenuOption2("Conversation Menu");
        churchScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.churchScene.ordinal()] = churchScene;
        
        Scene hospitalScene = new Scene();
        hospitalScene.setDescription("Hospital");
        hospitalScene.setLocationSymbol("09");
        hospitalScene.setTravelTime(0);
        hospitalScene.setDistance(50);
        hospitalScene.setMenuOption1("Combat Menu");
        hospitalScene.setMenuOption2("Conversation Menu");
        hospitalScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.hospitalScene.ordinal()] = hospitalScene;
        
        Scene schoolScene = new Scene();
        schoolScene.setDescription("School");
        schoolScene.setLocationSymbol("10");
        schoolScene.setTravelTime(0);
        schoolScene.setDistance(5);
        schoolScene.setMenuOption1("Combat Menu");
        schoolScene.setMenuOption2("Conversation Menu");
        schoolScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.schoolScene.ordinal()] = schoolScene;
        
        Scene bankScene = new Scene();
        bankScene.setDescription("Bank");
        bankScene.setLocationSymbol("11");
        bankScene.setTravelTime(0);
        bankScene.setDistance(9);
        bankScene.setMenuOption1("Combat Menu");
        bankScene.setMenuOption2("Conversation Menu");
        bankScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.bankScene.ordinal()] = bankScene;
        
        Scene comicScene = new Scene();
        comicScene.setDescription("Comic Shop");
        comicScene.setLocationSymbol("12");
        comicScene.setTravelTime(0);
        comicScene.setDistance(20);
        comicScene.setMenuOption1("Combat Menu");
        comicScene.setMenuOption2("Conversation Menu");
        comicScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.comicScene.ordinal()] = comicScene;
        
        Scene repairScene = new Scene();
        repairScene.setDescription("Car Repair Shop");
        repairScene.setLocationSymbol("13");
        repairScene.setTravelTime(0);
        repairScene.setDistance(43);
        repairScene.setMenuOption1("Combat Menu");
        repairScene.setMenuOption2("Conversation Menu");
        repairScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.repairScene.ordinal()] = repairScene;
        
        Scene ninjaScene = new Scene();
        ninjaScene.setDescription("Martial Arts School");
        ninjaScene.setLocationSymbol("14");
        ninjaScene.setTravelTime(0);
        ninjaScene.setDistance(50);
        ninjaScene.setMenuOption1("Combat Menu");
        ninjaScene.setMenuOption2("Conversation Menu");
        ninjaScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.ninjaScene.ordinal()] = ninjaScene;
        
        Scene armyScene = new Scene();
        armyScene.setDescription("Army base");
        armyScene.setLocationSymbol("15");
        armyScene.setTravelTime(0);
        armyScene.setDistance(50);
        armyScene.setMenuOption1("Combat Menu");
        armyScene.setMenuOption2("Conversation Menu");
        armyScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.armyScene.ordinal()] = armyScene;
        
        Scene postScene = new Scene();
        postScene.setDescription("Post Office");
        postScene.setLocationSymbol("16");
        postScene.setTravelTime(0);
        postScene.setDistance(75);
        postScene.setMenuOption1("Combat Menu");
        postScene.setMenuOption2("Conversation Menu");
        postScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.postScene.ordinal()] = postScene;
        
        Scene fireworksScene = new Scene();
        fireworksScene.setDescription("Fireworks Stand");
        fireworksScene.setLocationSymbol("17");
        fireworksScene.setTravelTime(0);
        fireworksScene.setDistance(7);
        fireworksScene.setMenuOption1("Combat Menu");
        fireworksScene.setMenuOption2("Conversation Menu");
        fireworksScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.fireworksScene.ordinal()] = fireworksScene;
        
        Scene petScene = new Scene();
        petScene.setDescription("Pet Store");
        petScene.setLocationSymbol("18");
        petScene.setTravelTime(0);
        petScene.setDistance(19);
        petScene.setMenuOption1("Combat Menu");
        petScene.setMenuOption2("Conversation Menu");
        petScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.petScene.ordinal()] = petScene;
        
        Scene MarinaScene = new Scene();
        MarinaScene.setDescription("Marina");
        MarinaScene.setLocationSymbol("19");
        MarinaScene.setTravelTime(0);
        MarinaScene.setDistance(50);
        MarinaScene.setMenuOption1("Combat Menu");
        MarinaScene.setMenuOption2("Conversation Menu");
        MarinaScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.MarinaScene.ordinal()] = MarinaScene;
        
        Scene improvementScene = new Scene();
        improvementScene.setDescription("Home Improvement Store");
        improvementScene.setLocationSymbol("20");
        improvementScene.setTravelTime(0);
        improvementScene.setDistance(58);
        improvementScene.setMenuOption1("Combat Menu");
        improvementScene.setMenuOption2("Conversation Menu");
        improvementScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.improvementScene.ordinal()] = improvementScene;
        
        Scene policeScene = new Scene();
        policeScene.setDescription("Police Station");
        policeScene.setLocationSymbol("21");
        policeScene.setTravelTime(0);
        policeScene.setDistance(75);
        policeScene.setMenuOption1("Combat Menu");
        policeScene.setMenuOption2("Conversation Menu");
        policeScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.policeScene.ordinal()] = policeScene;
        
        Scene zooScene = new Scene();
        zooScene.setDescription("The Zoo");
        zooScene.setLocationSymbol("22");
        zooScene.setTravelTime(0);
        zooScene.setDistance(95);
        zooScene.setMenuOption1("Combat Menu");
        zooScene.setMenuOption2("Conversation Menu");
        zooScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.zooScene.ordinal()] = zooScene;
        
        Scene museumScene = new Scene();
        museumScene.setDescription("Natural History Museum");
        museumScene.setLocationSymbol("23");
        museumScene.setTravelTime(0);
        museumScene.setDistance(99);
        museumScene.setMenuOption1("Combat Menu");
        museumScene.setMenuOption2("Conversation Menu");
        museumScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.museumScene.ordinal()] = museumScene;
        
        Scene cemeteryScene = new Scene();
        cemeteryScene.setDescription("Cemetery");
        cemeteryScene.setLocationSymbol("24");
        cemeteryScene.setTravelTime(0);
        cemeteryScene.setDistance(33);
        cemeteryScene.setMenuOption1("Combat Menu");
        cemeteryScene.setMenuOption2("Conversation Menu");
        cemeteryScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.cemeteryScene.ordinal()] = cemeteryScene;
        
        Scene volcanoScene = new Scene();
        volcanoScene.setDescription("Volcano");
        volcanoScene.setLocationSymbol("25");
        volcanoScene.setTravelTime(0);
        volcanoScene.setDistance(127);
        volcanoScene.setMenuOption1("Combat Menu");
        volcanoScene.setMenuOption2("Conversation Menu");
        volcanoScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.volcanoScene.ordinal()] = volcanoScene;
        
        Scene pizzaScene = new Scene();
        pizzaScene.setDescription("Pizza Parlor");
        pizzaScene.setLocationSymbol("26");
        pizzaScene.setTravelTime(0);
        pizzaScene.setDistance(67);
        pizzaScene.setMenuOption1("Combat Menu");
        pizzaScene.setMenuOption2("Conversation Menu");
        pizzaScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.pizzaScene.ordinal()] = pizzaScene;
        
        Scene orphanScene = new Scene();
        orphanScene.setDescription("Orphanage");
        orphanScene.setLocationSymbol("27");
        orphanScene.setTravelTime(0);
        orphanScene.setDistance(127);
        orphanScene.setMenuOption1("Combat Menu");
        orphanScene.setMenuOption2("Conversation Menu");
        orphanScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.orphanScene.ordinal()] = orphanScene;
        
        Scene placeScene = new Scene();
        placeScene.setDescription("placeholder");
        placeScene.setLocationSymbol("28");
        placeScene.setTravelTime(0);
        placeScene.setDistance(127);
        placeScene.setMenuOption1("Combat Menu");
        placeScene.setMenuOption2("Conversation Menu");
        placeScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.placeScene.ordinal()] = placeScene;
        
         Scene holderScene = new Scene();
        holderScene.setDescription("placeholder");
        holderScene.setLocationSymbol("29");
        holderScene.setTravelTime(0);
        holderScene.setDistance(127);
        holderScene.setMenuOption1("Combat Menu");
        holderScene.setMenuOption2("Conversation Menu");
        holderScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.holderScene.ordinal()] = holderScene;
        
        Scene finishingScene = new Scene();
        finishingScene.setDescription("Finishing Scene");
        finishingScene.setLocationSymbol("30");
        finishingScene.setTravelTime(0);
        finishingScene.setDistance(127);
        finishingScene.setMenuOption1("Combat Menu");
        finishingScene.setMenuOption2("Conversation Menu");
        finishingScene.setMenuOption3("Buy/Sell Menu");
        scenes[LocationName.finishingScene.ordinal()] = finishingScene;        
        return scenes;
        
    }

    public static Scene[] assignItemToDeliver() {
        
        Scene[] scenes = RunningErrands.getScene();
        Item[] item = RunningErrands.getItems();
        
        Scene startingScene = scenes[LocationName.startingScene.ordinal()];
        startingScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene mallScene = scenes[LocationName.mallScene.ordinal()];
        mallScene.setItemToDeliver(item[Items.videoGame.ordinal()]);

        
        Scene GroceryScene = scenes[LocationName.GroceryScene.ordinal()];
        GroceryScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene gasScene = scenes[LocationName.gasScene.ordinal()];
        gasScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene gunShopScene = scenes[LocationName.gunShopScene.ordinal()];
        gunShopScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene sportingScene = scenes[LocationName.sportingScene.ordinal()];
        sportingScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene libraryScene = scenes[LocationName.libraryScene.ordinal()];
        libraryScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene churchScene = scenes[LocationName.churchScene.ordinal()];
        churchScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene hospitalScene = scenes[LocationName.hospitalScene.ordinal()];
        hospitalScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene schoolScene = scenes[LocationName.schoolScene.ordinal()];
        schoolScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene bankScene = scenes[LocationName.bankScene.ordinal()];
        bankScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene comicScene = scenes[LocationName.comicScene.ordinal()];
        comicScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene repairScene = scenes[LocationName.repairScene.ordinal()];
        repairScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene ninjaScene = scenes[LocationName.ninjaScene.ordinal()];
        ninjaScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene armyScene = scenes[LocationName.armyScene.ordinal()];
        armyScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene postScene = scenes[LocationName.postScene.ordinal()];
        postScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene fireworksScene = scenes[LocationName.fireworksScene.ordinal()];
        fireworksScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene petScene = scenes[LocationName.petScene.ordinal()];
        petScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene MarinaScene = scenes[LocationName.MarinaScene.ordinal()];
        MarinaScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene improvementScene = scenes[LocationName.improvementScene.ordinal()];
        improvementScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene policeScene = scenes[LocationName.policeScene.ordinal()];
        policeScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene zooScene = scenes[LocationName.zooScene.ordinal()];
        zooScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene museumScene = scenes[LocationName.museumScene.ordinal()];
        museumScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene cemeteryScene = scenes[LocationName.cemeteryScene.ordinal()];
        cemeteryScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene volcanoScene = scenes[LocationName.volcanoScene.ordinal()];
        volcanoScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene pizzaScene = scenes[LocationName.pizzaScene.ordinal()];
        pizzaScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene orphanScene = scenes[LocationName.orphanScene.ordinal()];
        orphanScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene placeScene = scenes[LocationName.placeScene.ordinal()];
        placeScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene holderScene = scenes[LocationName.holderScene.ordinal()];
        holderScene.setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        Scene finishingScene = scenes[LocationName.finishingScene.ordinal()];
        finishingScene.setItemToDeliver(item[Items.videoGame.ordinal()]);

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
