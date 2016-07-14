/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.control.ItemControl.Items;
import cit260.runningerrands.control.NPCControl.NPCList;
import cit260.runningerrands.control.ObjectiveControl.Objectives;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Location;
import cit260.runningerrands.model.Map;
import cit260.runningerrands.model.Npc;
import cit260.runningerrands.model.Objective;
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

    public static Scene[] createScenes() {
        
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
        startingScene.setConversationMenuType("Receive");
        startingScene.setBribeAttemptedToday(false);
        scenes[LocationName.startingScene.ordinal()] = startingScene;
        
        Scene mallScene = new Scene();
        mallScene.setDescription("Mall");
        mallScene.setLocationSymbol("02");
        mallScene.setTravelTime(0);
        mallScene.setDistance(20);
        mallScene.setMenuOption1("Combat Menu");
        mallScene.setMenuOption2("Conversation Menu");
        mallScene.setMenuOption3("Buy/Sell Menu");
        mallScene.setConversationMenuType("Receive");
        mallScene.setBribeAttemptedToday(false);
        scenes[LocationName.mallScene.ordinal()] = mallScene;
        
        Scene GroceryScene = new Scene();
        GroceryScene.setDescription("Grocery Store");
        GroceryScene.setLocationSymbol("03");
        GroceryScene.setTravelTime(0);
        GroceryScene.setDistance(40);
        GroceryScene.setMenuOption1("Combat Menu");
        GroceryScene.setMenuOption2("Conversation Menu");
        GroceryScene.setMenuOption3("Buy/Sell Menu");
        GroceryScene.setConversationMenuType("Receive");
        GroceryScene.setBribeAttemptedToday(false);
        scenes[LocationName.GroceryScene.ordinal()] = GroceryScene;
        
        Scene gasScene = new Scene();
        gasScene.setDescription("Gas Station");
        gasScene.setLocationSymbol("04");
        gasScene.setTravelTime(0);
        gasScene.setDistance(50);
        gasScene.setMenuOption1("Combat Menu");
        gasScene.setMenuOption2("Conversation Menu");
        gasScene.setMenuOption3("Buy/Sell Menu");
        gasScene.setConversationMenuType("Receive");
        gasScene.setBribeAttemptedToday(false);
        scenes[LocationName.gasScene.ordinal()] = gasScene;
        
        Scene gunShopScene = new Scene();
        gunShopScene.setDescription("Gun Shop");
        gunShopScene.setLocationSymbol("05");
        gunShopScene.setTravelTime(0);
        gunShopScene.setDistance(50);
        gunShopScene.setMenuOption1("Combat Menu");
        gunShopScene.setMenuOption2("Conversation Menu");
        gunShopScene.setMenuOption3("Buy/Sell Menu");
        gunShopScene.setConversationMenuType("Give");
        gunShopScene.setBribeAttemptedToday(false);
        scenes[LocationName.gunShopScene.ordinal()] = gunShopScene;
        
        Scene sportingScene = new Scene();
        sportingScene.setDescription("Sporting Goods Shop");
        sportingScene.setLocationSymbol("06");
        sportingScene.setTravelTime(0);
        sportingScene.setDistance(75);
        sportingScene.setMenuOption1("Combat Menu");
        sportingScene.setMenuOption2("Conversation Menu");
        sportingScene.setMenuOption3("Buy/Sell Menu");
        sportingScene.setConversationMenuType("Receive");
        sportingScene.setBribeAttemptedToday(false);
        scenes[LocationName.sportingScene.ordinal()] = sportingScene;
        
        Scene libraryScene = new Scene();
        libraryScene.setDescription("Library");
        libraryScene.setLocationSymbol("07");
        libraryScene.setTravelTime(0);
        libraryScene.setDistance(7);
        libraryScene.setMenuOption1("Combat Menu");
        libraryScene.setMenuOption2("Conversation Menu");
        libraryScene.setMenuOption3("Buy/Sell Menu");
        libraryScene.setConversationMenuType("Give");
        libraryScene.setBribeAttemptedToday(false);
        scenes[LocationName.libraryScene.ordinal()] = libraryScene;
        
        Scene churchScene = new Scene();
        churchScene.setDescription("Church");
        churchScene.setLocationSymbol("08");
        churchScene.setTravelTime(0);
        churchScene.setDistance(0);
        churchScene.setMenuOption1("Combat Menu");
        churchScene.setMenuOption2("Conversation Menu");
        churchScene.setMenuOption3("Buy/Sell Menu");
        churchScene.setConversationMenuType("Give");
        churchScene.setBribeAttemptedToday(false);
        scenes[LocationName.churchScene.ordinal()] = churchScene;
        
        Scene hospitalScene = new Scene();
        hospitalScene.setDescription("Hospital");
        hospitalScene.setLocationSymbol("09");
        hospitalScene.setTravelTime(0);
        hospitalScene.setDistance(50);
        hospitalScene.setMenuOption1("Combat Menu");
        hospitalScene.setMenuOption2("Conversation Menu");
        hospitalScene.setMenuOption3("Buy/Sell Menu");
        hospitalScene.setConversationMenuType("Give");
        hospitalScene.setBribeAttemptedToday(false);
        scenes[LocationName.hospitalScene.ordinal()] = hospitalScene;
        
        Scene schoolScene = new Scene();
        schoolScene.setDescription("School");
        schoolScene.setLocationSymbol("10");
        schoolScene.setTravelTime(0);
        schoolScene.setDistance(5);
        schoolScene.setMenuOption1("Combat Menu");
        schoolScene.setMenuOption2("Conversation Menu");
        schoolScene.setMenuOption3("Buy/Sell Menu");
        schoolScene.setConversationMenuType("Receive");
        schoolScene.setBribeAttemptedToday(false);
        scenes[LocationName.schoolScene.ordinal()] = schoolScene;
        
        Scene bankScene = new Scene();
        bankScene.setDescription("Bank");
        bankScene.setLocationSymbol("11");
        bankScene.setTravelTime(0);
        bankScene.setDistance(9);
        bankScene.setMenuOption1("Combat Menu");
        bankScene.setMenuOption2("Conversation Menu");
        bankScene.setMenuOption3("Buy/Sell Menu");
        bankScene.setConversationMenuType("Give");
        bankScene.setBribeAttemptedToday(false);
        scenes[LocationName.bankScene.ordinal()] = bankScene;
        
        Scene comicScene = new Scene();
        comicScene.setDescription("Comic Shop");
        comicScene.setLocationSymbol("12");
        comicScene.setTravelTime(0);
        comicScene.setDistance(20);
        comicScene.setMenuOption1("Combat Menu");
        comicScene.setMenuOption2("Conversation Menu");
        comicScene.setMenuOption3("Buy/Sell Menu");
        comicScene.setConversationMenuType("Receive");
        comicScene.setBribeAttemptedToday(false);
        scenes[LocationName.comicScene.ordinal()] = comicScene;
        
        Scene repairScene = new Scene();
        repairScene.setDescription("Car Repair Shop");
        repairScene.setLocationSymbol("13");
        repairScene.setTravelTime(0);
        repairScene.setDistance(43);
        repairScene.setMenuOption1("Combat Menu");
        repairScene.setMenuOption2("Conversation Menu");
        repairScene.setMenuOption3("Buy/Sell Menu");
        repairScene.setConversationMenuType("Receive");
        repairScene.setBribeAttemptedToday(false);
        scenes[LocationName.repairScene.ordinal()] = repairScene;
        
        Scene ninjaScene = new Scene();
        ninjaScene.setDescription("Martial Arts School");
        ninjaScene.setLocationSymbol("14");
        ninjaScene.setTravelTime(0);
        ninjaScene.setDistance(50);
        ninjaScene.setMenuOption1("Combat Menu");
        ninjaScene.setMenuOption2("Conversation Menu");
        ninjaScene.setMenuOption3("Buy/Sell Menu");
        ninjaScene.setConversationMenuType("Give");
        ninjaScene.setBribeAttemptedToday(false);
        scenes[LocationName.ninjaScene.ordinal()] = ninjaScene;
        
        Scene armyScene = new Scene();
        armyScene.setDescription("Army base");
        armyScene.setLocationSymbol("15");
        armyScene.setTravelTime(0);
        armyScene.setDistance(50);
        armyScene.setMenuOption1("Combat Menu");
        armyScene.setMenuOption2("Conversation Menu");
        armyScene.setMenuOption3("Buy/Sell Menu");
        armyScene.setConversationMenuType("Give");
        armyScene.setBribeAttemptedToday(false);
        scenes[LocationName.armyScene.ordinal()] = armyScene;
        
        Scene postScene = new Scene();
        postScene.setDescription("Post Office");
        postScene.setLocationSymbol("16");
        postScene.setTravelTime(0);
        postScene.setDistance(75);
        postScene.setMenuOption1("Combat Menu");
        postScene.setMenuOption2("Conversation Menu");
        postScene.setMenuOption3("Buy/Sell Menu");
        postScene.setConversationMenuType("Give");
        postScene.setBribeAttemptedToday(false);
        scenes[LocationName.postScene.ordinal()] = postScene;
        
        Scene fireworksScene = new Scene();
        fireworksScene.setDescription("Fireworks Stand");
        fireworksScene.setLocationSymbol("17");
        fireworksScene.setTravelTime(0);
        fireworksScene.setDistance(7);
        fireworksScene.setMenuOption1("Combat Menu");
        fireworksScene.setMenuOption2("Conversation Menu");
        fireworksScene.setMenuOption3("Buy/Sell Menu");
        fireworksScene.setConversationMenuType("Receive");
        fireworksScene.setBribeAttemptedToday(false);
        scenes[LocationName.fireworksScene.ordinal()] = fireworksScene;
        
        Scene petScene = new Scene();
        petScene.setDescription("Pet Store");
        petScene.setLocationSymbol("18");
        petScene.setTravelTime(0);
        petScene.setDistance(19);
        petScene.setMenuOption1("Combat Menu");
        petScene.setMenuOption2("Conversation Menu");
        petScene.setMenuOption3("Buy/Sell Menu");
        petScene.setConversationMenuType("Receive");
        petScene.setBribeAttemptedToday(false);
        scenes[LocationName.petScene.ordinal()] = petScene;
        
        Scene MarinaScene = new Scene();
        MarinaScene.setDescription("Marina");
        MarinaScene.setLocationSymbol("19");
        MarinaScene.setTravelTime(0);
        MarinaScene.setDistance(50);
        MarinaScene.setMenuOption1("Combat Menu");
        MarinaScene.setMenuOption2("Conversation Menu");
        MarinaScene.setMenuOption3("Buy/Sell Menu");
        MarinaScene.setConversationMenuType("Give");
        MarinaScene.setBribeAttemptedToday(false);
        scenes[LocationName.MarinaScene.ordinal()] = MarinaScene;
        
        Scene improvementScene = new Scene();
        improvementScene.setDescription("Home Improvement Store");
        improvementScene.setLocationSymbol("20");
        improvementScene.setTravelTime(0);
        improvementScene.setDistance(58);
        improvementScene.setMenuOption1("Combat Menu");
        improvementScene.setMenuOption2("Conversation Menu");
        improvementScene.setMenuOption3("Buy/Sell Menu");
        improvementScene.setConversationMenuType("Receive");
        improvementScene.setBribeAttemptedToday(false);
        scenes[LocationName.improvementScene.ordinal()] = improvementScene;
        
        Scene policeScene = new Scene();
        policeScene.setDescription("Police Station");
        policeScene.setLocationSymbol("21");
        policeScene.setTravelTime(0);
        policeScene.setDistance(75);
        policeScene.setMenuOption1("Combat Menu");
        policeScene.setMenuOption2("Conversation Menu");
        policeScene.setMenuOption3("Buy/Sell Menu");
        policeScene.setConversationMenuType("Give");
        policeScene.setBribeAttemptedToday(false);
        scenes[LocationName.policeScene.ordinal()] = policeScene;
        
        Scene zooScene = new Scene();
        zooScene.setDescription("The Zoo");
        zooScene.setLocationSymbol("22");
        zooScene.setTravelTime(0);
        zooScene.setDistance(95);
        zooScene.setMenuOption1("Combat Menu");
        zooScene.setMenuOption2("Conversation Menu");
        zooScene.setMenuOption3("Buy/Sell Menu");
        zooScene.setConversationMenuType("Give");
        zooScene.setBribeAttemptedToday(false);
        scenes[LocationName.zooScene.ordinal()] = zooScene;
        
        Scene museumScene = new Scene();
        museumScene.setDescription("Natural History Museum");
        museumScene.setLocationSymbol("23");
        museumScene.setTravelTime(0);
        museumScene.setDistance(99);
        museumScene.setMenuOption1("Combat Menu");
        museumScene.setMenuOption2("Conversation Menu");
        museumScene.setMenuOption3("Buy/Sell Menu");
        museumScene.setConversationMenuType("Give");
        museumScene.setBribeAttemptedToday(false);
        scenes[LocationName.museumScene.ordinal()] = museumScene;
        
        Scene cemeteryScene = new Scene();
        cemeteryScene.setDescription("Cemetery");
        cemeteryScene.setLocationSymbol("24");
        cemeteryScene.setTravelTime(0);
        cemeteryScene.setDistance(33);
        cemeteryScene.setMenuOption1("Combat Menu");
        cemeteryScene.setMenuOption2("Conversation Menu");
        cemeteryScene.setMenuOption3("Buy/Sell Menu");
        cemeteryScene.setConversationMenuType("Receive");
        cemeteryScene.setBribeAttemptedToday(false);
        scenes[LocationName.cemeteryScene.ordinal()] = cemeteryScene;
        
        Scene volcanoScene = new Scene();
        volcanoScene.setDescription("Volcano");
        volcanoScene.setLocationSymbol("25");
        volcanoScene.setTravelTime(0);
        volcanoScene.setDistance(127);
        volcanoScene.setMenuOption1("Combat Menu");
        volcanoScene.setMenuOption2("Conversation Menu");
        volcanoScene.setMenuOption3("Buy/Sell Menu");
        volcanoScene.setConversationMenuType("Receive");
        volcanoScene.setBribeAttemptedToday(false);
        scenes[LocationName.volcanoScene.ordinal()] = volcanoScene;
        
        Scene pizzaScene = new Scene();
        pizzaScene.setDescription("Pizza Parlor");
        pizzaScene.setLocationSymbol("26");
        pizzaScene.setTravelTime(0);
        pizzaScene.setDistance(67);
        pizzaScene.setMenuOption1("Combat Menu");
        pizzaScene.setMenuOption2("Conversation Menu");
        pizzaScene.setMenuOption3("Buy/Sell Menu");
        pizzaScene.setConversationMenuType("Give");
        pizzaScene.setBribeAttemptedToday(false);
        scenes[LocationName.pizzaScene.ordinal()] = pizzaScene;
        
        Scene orphanScene = new Scene();
        orphanScene.setDescription("Orphanage");
        orphanScene.setLocationSymbol("27");
        orphanScene.setTravelTime(0);
        orphanScene.setDistance(127);
        orphanScene.setMenuOption1("Combat Menu");
        orphanScene.setMenuOption2("Conversation Menu");
        orphanScene.setMenuOption3("Buy/Sell Menu");
        orphanScene.setConversationMenuType("Receive");
        orphanScene.setBribeAttemptedToday(false);
        scenes[LocationName.orphanScene.ordinal()] = orphanScene;
        
        Scene asylumScene = new Scene();
        asylumScene.setDescription("Insane Asylum");
        asylumScene.setLocationSymbol("28");
        asylumScene.setTravelTime(0);
        asylumScene.setDistance(127);
        asylumScene.setMenuOption1("Combat Menu");
        asylumScene.setMenuOption2("Conversation Menu");
        asylumScene.setMenuOption3("Buy/Sell Menu");
        asylumScene.setConversationMenuType("Give");
        asylumScene.setBribeAttemptedToday(false);
        scenes[LocationName.asylumScene.ordinal()] = asylumScene;
        
         Scene accountantScene = new Scene();
        accountantScene.setDescription("Accountant");
        accountantScene.setLocationSymbol("29");
        accountantScene.setTravelTime(0);
        accountantScene.setDistance(127);
        accountantScene.setMenuOption1("Combat Menu");
        accountantScene.setMenuOption2("Conversation Menu");
        accountantScene.setMenuOption3("Buy/Sell Menu");
        accountantScene.setConversationMenuType("Receive");
        accountantScene.setBribeAttemptedToday(false);
        scenes[LocationName.accountantScene.ordinal()] = accountantScene;
        
        Scene redBoxScene = new Scene();
        redBoxScene.setDescription("RedBox");
        redBoxScene.setLocationSymbol("30");
        redBoxScene.setTravelTime(0);
        redBoxScene.setDistance(127);
        redBoxScene.setMenuOption1("Combat Menu");
        redBoxScene.setMenuOption2("Conversation Menu");
        redBoxScene.setMenuOption3("Buy/Sell Menu");
        redBoxScene.setConversationMenuType("Give");
        redBoxScene.setBribeAttemptedToday(false);
        scenes[LocationName.redBoxScene.ordinal()] = redBoxScene;        
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
        asylumScene,
        accountantScene, 
        redBoxScene
        
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
        locations[5][2].setScene(scenes[LocationName.asylumScene.ordinal()]);
        locations[5][3].setScene(scenes[LocationName.accountantScene.ordinal()]);
        locations[5][4].setScene(scenes[LocationName.redBoxScene.ordinal()]);
        map.setLocations(locations);
        RunningErrands.setLocations(locations);
        
    }

    public static void assignObjectivesToScenes() {
        Scene[] scenes = RunningErrands.getScene();
        Objective[] objectives = RunningErrands.getObjective();
        Npc[] npcs = RunningErrands.getNpc();
        Item[] item = RunningErrands.getItems();
        
        scenes[LocationName.startingScene.ordinal()].setObjective(objectives[Objectives.returnVideoGame.ordinal()]);
        scenes[LocationName.mallScene.ordinal()].setObjective(objectives[Objectives.returnFreshOrgans.ordinal()]);
        scenes[LocationName.GroceryScene.ordinal()].setObjective(objectives[Objectives.returnDonuts.ordinal()]);
        scenes[LocationName.gasScene.ordinal()].setObjective(objectives[Objectives.returnAbramsTank.ordinal()]);
        scenes[LocationName.gunShopScene.ordinal()].setObjective(objectives[Objectives.returnAr15.ordinal()]);
        scenes[LocationName.sportingScene.ordinal()].setObjective(objectives[Objectives.returnKatana.ordinal()]);
        scenes[LocationName.libraryScene.ordinal()].setObjective(objectives[Objectives.returnAncientBookofSpells.ordinal()]);
        scenes[LocationName.churchScene.ordinal()].setObjective(objectives[Objectives.returnSacramentalWine.ordinal()]);
        scenes[LocationName.hospitalScene.ordinal()].setObjective(objectives[Objectives.returnFreshOrgans.ordinal()]);
        scenes[LocationName.schoolScene.ordinal()].setObjective(objectives[Objectives.returnReportCard.ordinal()]);
        scenes[LocationName.bankScene.ordinal()].setObjective(objectives[Objectives.returnLoanApplication.ordinal()]);
        scenes[LocationName.comicScene.ordinal()].setObjective(objectives[Objectives.returnAncientBookofSpells.ordinal()]);
        scenes[LocationName.repairScene.ordinal()].setObjective(objectives[Objectives.returnAr15.ordinal()]);
        scenes[LocationName.ninjaScene.ordinal()].setObjective(objectives[Objectives.returnKatana.ordinal()]);
        scenes[LocationName.armyScene.ordinal()].setObjective(objectives[Objectives.returnAbramsTank.ordinal()]);
        scenes[LocationName.postScene.ordinal()].setObjective(objectives[Objectives.returnTaxForms.ordinal()]);
        scenes[LocationName.fireworksScene.ordinal()].setObjective(objectives[Objectives.returnLoanApplication.ordinal()]);
        scenes[LocationName.petScene.ordinal()].setObjective(objectives[Objectives.returnGiraffe.ordinal()]);
        scenes[LocationName.MarinaScene.ordinal()].setObjective(objectives[Objectives.returnBucketOfLava.ordinal()]);
        scenes[LocationName.improvementScene.ordinal()].setObjective(objectives[Objectives.returnMysticalEgyptianSceptor.ordinal()]);
        scenes[LocationName.policeScene.ordinal()].setObjective(objectives[Objectives.returnDonuts.ordinal()]);
        scenes[LocationName.zooScene.ordinal()].setObjective(objectives[Objectives.returnGiraffe.ordinal()]);
        scenes[LocationName.museumScene.ordinal()].setObjective(objectives[Objectives.returnMysticalEgyptianSceptor.ordinal()]);
        scenes[LocationName.cemeteryScene.ordinal()].setObjective(objectives[Objectives.returnGrievingWidow.ordinal()]);
        scenes[LocationName.volcanoScene.ordinal()].setObjective(objectives[Objectives.returnBucketOfLava.ordinal()]);
        scenes[LocationName.pizzaScene.ordinal()].setObjective(objectives[Objectives.returnReportCard.ordinal()]);
        scenes[LocationName.orphanScene.ordinal()].setObjective(objectives[Objectives.returnSacramentalWine.ordinal()]);
        scenes[LocationName.asylumScene.ordinal()].setObjective(objectives[Objectives.returnGrievingWidow.ordinal()]);
        scenes[LocationName.accountantScene.ordinal()].setObjective(objectives[Objectives.returnTaxForms.ordinal()]);
        scenes[LocationName.redBoxScene.ordinal()].setObjective(objectives[Objectives.returnVideoGame.ordinal()]);

        scenes[LocationName.startingScene.ordinal()].setNpc(npcs[NPCList.adolf.ordinal()]);
        scenes[LocationName.mallScene.ordinal()].setNpc(npcs[NPCList.shamWowGuy.ordinal()]);
        scenes[LocationName.GroceryScene.ordinal()].setNpc(npcs[NPCList.crazyCatLady.ordinal()]);
        scenes[LocationName.gasScene.ordinal()].setNpc(npcs[NPCList.zeus.ordinal()]);
        scenes[LocationName.gunShopScene.ordinal()].setNpc(npcs[NPCList.shopkeeper.ordinal()]);
        scenes[LocationName.sportingScene.ordinal()].setNpc(npcs[NPCList.dracula.ordinal()]);
        scenes[LocationName.libraryScene.ordinal()].setNpc(npcs[NPCList.hannibal.ordinal()]);
        scenes[LocationName.churchScene.ordinal()].setNpc(npcs[NPCList.priest.ordinal()]);
        scenes[LocationName.hospitalScene.ordinal()].setNpc(npcs[NPCList.vlad.ordinal()]);
        scenes[LocationName.schoolScene.ordinal()].setNpc(npcs[NPCList.principal.ordinal()]);
        scenes[LocationName.bankScene.ordinal()].setNpc(npcs[NPCList.babyFace.ordinal()]);
        scenes[LocationName.comicScene.ordinal()].setNpc(npcs[NPCList.wizard.ordinal()]);
        scenes[LocationName.repairScene.ordinal()].setNpc(npcs[NPCList.nikolai.ordinal()]);
        scenes[LocationName.ninjaScene.ordinal()].setNpc(npcs[NPCList.ninja.ordinal()]);
        scenes[LocationName.armyScene.ordinal()].setNpc(npcs[NPCList.soldier.ordinal()]);
        scenes[LocationName.postScene.ordinal()].setNpc(npcs[NPCList.khan.ordinal()]);
        scenes[LocationName.fireworksScene.ordinal()].setNpc(npcs[NPCList.jimbob.ordinal()]);
        scenes[LocationName.petScene.ordinal()].setNpc(npcs[NPCList.nsync.ordinal()]);
        scenes[LocationName.MarinaScene.ordinal()].setNpc(npcs[NPCList.pirate.ordinal()]);
        scenes[LocationName.improvementScene.ordinal()].setNpc(npcs[NPCList.plagueMonkey.ordinal()]);
        scenes[LocationName.policeScene.ordinal()].setNpc(npcs[NPCList.officer.ordinal()]);
        scenes[LocationName.zooScene.ordinal()].setNpc(npcs[NPCList.giraffe.ordinal()]);
        scenes[LocationName.museumScene.ordinal()].setNpc(npcs[NPCList.docent.ordinal()]);
        scenes[LocationName.cemeteryScene.ordinal()].setNpc(npcs[NPCList.ghost.ordinal()]);
        scenes[LocationName.volcanoScene.ordinal()].setNpc(npcs[NPCList.joe.ordinal()]);
        scenes[LocationName.pizzaScene.ordinal()].setNpc(npcs[NPCList.godfather.ordinal()]);
        scenes[LocationName.orphanScene.ordinal()].setNpc(npcs[NPCList.orphan.ordinal()]);
        scenes[LocationName.asylumScene.ordinal()].setNpc(npcs[NPCList.doctor.ordinal()]);
        scenes[LocationName.accountantScene.ordinal()].setNpc(npcs[NPCList.sergy.ordinal()]);
        scenes[LocationName.redBoxScene.ordinal()].setNpc(npcs[NPCList.ceasar.ordinal()]);
        
        scenes[LocationName.startingScene.ordinal()].setItemToReceive(item[Items.videoGame.ordinal()]);
        scenes[LocationName.mallScene.ordinal()].setItemToReceive(item[Items.freshOrgans.ordinal()]);
        scenes[LocationName.GroceryScene.ordinal()].setItemToReceive(item[Items.donuts.ordinal()]);
        scenes[LocationName.gasScene.ordinal()].setItemToReceive(item[Items.abramsTank.ordinal()]);
        scenes[LocationName.gunShopScene.ordinal()].setItemToDeliver(item[Items.ar15.ordinal()]);
        scenes[LocationName.sportingScene.ordinal()].setItemToReceive(item[Items.katana.ordinal()]);
        scenes[LocationName.libraryScene.ordinal()].setItemToReceive(item[Items.ancientBookofSpells.ordinal()]);
        scenes[LocationName.churchScene.ordinal()].setItemToDeliver(item[Items.sacramentalWine.ordinal()]);
        scenes[LocationName.hospitalScene.ordinal()].setItemToDeliver(item[Items.freshOrgans.ordinal()]);
        scenes[LocationName.schoolScene.ordinal()].setItemToReceive(item[Items.reportCard.ordinal()]);
        scenes[LocationName.bankScene.ordinal()].setItemToDeliver(item[Items.loanApplication.ordinal()]);
        scenes[LocationName.comicScene.ordinal()].setItemToReceive(item[Items.ancientBookofSpells.ordinal()]);
        scenes[LocationName.repairScene.ordinal()].setItemToReceive(item[Items.ar15.ordinal()]);
        scenes[LocationName.ninjaScene.ordinal()].setItemToDeliver(item[Items.katana.ordinal()]);
        scenes[LocationName.armyScene.ordinal()].setItemToDeliver(item[Items.abramsTank.ordinal()]);
        scenes[LocationName.postScene.ordinal()].setItemToDeliver(item[Items.taxForms.ordinal()]);
        scenes[LocationName.fireworksScene.ordinal()].setItemToReceive(item[Items.loanApplication.ordinal()]);
        scenes[LocationName.petScene.ordinal()].setItemToReceive(item[Items.giraffe.ordinal()]);
        scenes[LocationName.MarinaScene.ordinal()].setItemToDeliver(item[Items.bucketOfLava.ordinal()]);
        scenes[LocationName.improvementScene.ordinal()].setItemToReceive(item[Items.mysticalEgyptianSceptor.ordinal()]);
        scenes[LocationName.policeScene.ordinal()].setItemToDeliver(item[Items.donuts.ordinal()]);
        scenes[LocationName.zooScene.ordinal()].setItemToDeliver(item[Items.giraffe.ordinal()]);
        scenes[LocationName.museumScene.ordinal()].setItemToDeliver(item[Items.mysticalEgyptianSceptor.ordinal()]);
        scenes[LocationName.cemeteryScene.ordinal()].setItemToReceive(item[Items.grievingWidow.ordinal()]);
        scenes[LocationName.volcanoScene.ordinal()].setItemToReceive(item[Items.bucketOfLava.ordinal()]);
        scenes[LocationName.pizzaScene.ordinal()].setItemToDeliver(item[Items.reportCard.ordinal()]);
        scenes[LocationName.orphanScene.ordinal()].setItemToReceive(item[Items.sacramentalWine.ordinal()]);
        scenes[LocationName.asylumScene.ordinal()].setItemToDeliver(item[Items.grievingWidow.ordinal()]);
        scenes[LocationName.accountantScene.ordinal()].setItemToReceive(item[Items.taxForms.ordinal()]);
        scenes[LocationName.redBoxScene.ordinal()].setItemToDeliver(item[Items.videoGame.ordinal()]);
        
        scenes[LocationName.startingScene.ordinal()].setCombatWinItem(item[Items.bowstaff.ordinal()]);
        scenes[LocationName.mallScene.ordinal()].setCombatWinItem(item[Items.nunchucks.ordinal()]);
        scenes[LocationName.GroceryScene.ordinal()].setCombatWinItem(item[Items.supermanComic.ordinal()]);
        scenes[LocationName.gasScene.ordinal()].setCombatWinItem(item[Items.throwingStars.ordinal()]);
        scenes[LocationName.gunShopScene.ordinal()].setCombatWinItem(item[Items.altarBoyVestments.ordinal()]);
        scenes[LocationName.sportingScene.ordinal()].setCombatWinItem(item[Items.mintYoda.ordinal()]);
        scenes[LocationName.libraryScene.ordinal()].setCombatWinItem(item[Items.bookOfStamps.ordinal()]);
        scenes[LocationName.churchScene.ordinal()].setCombatWinItem(item[Items.armyUniform.ordinal()]);
        scenes[LocationName.hospitalScene.ordinal()].setCombatWinItem(item[Items.bottleRockets.ordinal()]);
        scenes[LocationName.schoolScene.ordinal()].setCombatWinItem(item[Items.chinchilla.ordinal()]);
        scenes[LocationName.bankScene.ordinal()].setCombatWinItem(item[Items.canOfWorms.ordinal()]);
        scenes[LocationName.comicScene.ordinal()].setCombatWinItem(item[Items.usedNeedles.ordinal()]);
        scenes[LocationName.repairScene.ordinal()].setCombatWinItem(item[Items.nerveGas.ordinal()]);
        scenes[LocationName.ninjaScene.ordinal()].setCombatWinItem(item[Items.holyWater.ordinal()]);
        scenes[LocationName.armyScene.ordinal()].setCombatWinItem(item[Items.dumbbells.ordinal()]);
        scenes[LocationName.postScene.ordinal()].setCombatWinItem(item[Items.bagOfMoney.ordinal()]);
        scenes[LocationName.fireworksScene.ordinal()].setCombatWinItem(item[Items.textbook.ordinal()]);
        scenes[LocationName.petScene.ordinal()].setCombatWinItem(item[Items.catnip.ordinal()]);
        scenes[LocationName.MarinaScene.ordinal()].setCombatWinItem(item[Items.tireIron.ordinal()]);
        scenes[LocationName.improvementScene.ordinal()].setCombatWinItem(item[Items.m80.ordinal()]);
        scenes[LocationName.policeScene.ordinal()].setCombatWinItem(item[Items.chainsaw.ordinal()]);
        scenes[LocationName.zooScene.ordinal()].setCombatWinItem(item[Items.headstone.ordinal()]);
        scenes[LocationName.museumScene.ordinal()].setCombatWinItem(item[Items.pizzaCutter.ordinal()]);
        scenes[LocationName.cemeteryScene.ordinal()].setCombatWinItem(item[Items.catapult.ordinal()]);
        scenes[LocationName.volcanoScene.ordinal()].setCombatWinItem(item[Items.tRex.ordinal()]);
        scenes[LocationName.pizzaScene.ordinal()].setCombatWinItem(item[Items.handcuffs.ordinal()]);
        scenes[LocationName.orphanScene.ordinal()].setCombatWinItem(item[Items.axe.ordinal()]);
        scenes[LocationName.asylumScene.ordinal()].setCombatWinItem(item[Items.corpse.ordinal()]);
        scenes[LocationName.accountantScene.ordinal()].setCombatWinItem(item[Items.junkMail.ordinal()]);
        scenes[LocationName.redBoxScene.ordinal()].setCombatWinItem(item[Items.bazooka.ordinal()]);
        
        RunningErrands.setScene(scenes);
        
    }
    
    private static Location[][] createLocations() {
        
        Location[][] locations = new Location[5][4];
        RunningErrands.setLocations(locations);
        return locations;
    }
    
    public Scene getSceneFromLocationSymbol(String locationSymbol) {
        
        Scene[] scenes = RunningErrands.getScene();
        Scene sceneFromLocationSymbol = null;
        for (Scene scene : scenes) {
            if (scene.getLocationSymbol() == locationSymbol) {
                sceneFromLocationSymbol = scene;
            }
            else {
                /** Do nothing **/
            }
        }
        
        return sceneFromLocationSymbol;
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
