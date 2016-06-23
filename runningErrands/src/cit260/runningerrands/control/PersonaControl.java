/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;
import cit260.runningerrands.model.Investment;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Persona;
import java.util.concurrent.ThreadLocalRandom;
import runningerrands.RunningErrands;

/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class PersonaControl {

           
    public static void createPersona(char gender) {
        
        Persona persona = new Persona();
        Investment investment = new Investment();
        persona.setGender(gender);
        persona.setDay(1);
        persona.setGambledToday(false);
        RunningErrands.setPersona(persona); // Save the character
        RunningErrands.setInvestment(investment); // Save the investment
        Item[] inventoryList = PersonaControl.createInventoryList();
        persona.setItem(inventoryList);

    }
    
    public static void setPersonaCareer (String career) {
        
        Persona persona = RunningErrands.getPersona();
        persona.setCareer(career);
        int salary = 0;
        switch (career) {
            case "Janitor": //open map.
                salary = 300;
                break;
            case "Mail Clerk": //open map.
                salary = 500;
                break;
            case "Pizza Deliverer": //open map.
                salary = 250;
                break;
            case "Auto Mechanic": //open map.
                salary = 800;
                break;
            case "Secretary": //open map.
                salary = 600;
                break;
            case "Nurse": //open map.
                salary = 1000;
                break;
            case "Hair Dresser": //open map.
                salary = 400;
                break;
            case "Teacher": //open map.
                salary = 450;
                break;
            case "CEO"://
                salary = 1000000;
                break;
            case "Megastar"://
                salary = 2000000;
                break;
        }
        persona.setSalary(salary);
        int money = salary / 2;
        persona.setMoney(money);
        RunningErrands.setPersona(persona); // Save the character
        
    }

    public static void setPersonaAge (int age) {
        
        Persona persona = RunningErrands.getPersona();
        persona.setAge(age);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 9);
        int personaHealth = (age * 3) + randomNumber;
        persona.setHealth(personaHealth);
        RunningErrands.setPersona(persona); // Save the character
    }
    
    public static void setPersonaName (String name) {
        
        Persona persona = RunningErrands.getPersona();
        persona.setPersonaName(name);
        RunningErrands.setPersona(persona); // Save the character
        
    }
    
    public static int updatePersonaMoney(int depositAmount) {
        
        Persona persona = RunningErrands.getPersona();
        int currentBalance = persona.getMoney();
        int newBalance = (depositAmount + currentBalance);
        persona.setMoney(newBalance);
        int updatedBalance = persona.getMoney();
        return updatedBalance;
    }

    public static void addOneDay() {
        Persona persona = RunningErrands.getPersona();
        Investment investment = RunningErrands.getInvestment();
        int currentDay = persona.getDay();
        int newDay = currentDay + 1;
        persona.setDay(newDay);
        int investmentReturn = investment.getInvestReturn();
        int investmentMatureDay = investment.getInvestMatureDay();
        int personaCurrentMoney = persona.getMoney();
        int personaSalary = persona.getSalary();
        int personaNewMoney = personaCurrentMoney + personaSalary;
        persona.setMoney(personaNewMoney);
        persona.setGambledToday(false);
        if (investmentMatureDay == newDay ) {
            personaCurrentMoney = persona.getMoney();
            personaNewMoney = personaCurrentMoney + investmentReturn;
            persona.setMoney(personaNewMoney);
            investment = new Investment();
            RunningErrands.setInvestment(investment);
        }
    }
    public enum Items {
        shirt,
        videoGame, 
        leatherBag, 
        mountainDew, 
        drPepper,
        bread,
        gas,
        ar15,
        bazooka, 
        crossbow,
        katana,
        nunchucks,
        bowstaff,
        throwingStars,
        baseballBat,
        dumbbells,
        golfClub,
        ancientSpellBook,
        libraryCard,
        taxForms,
        holyWater,
        sacramentalWine,
        altarBoyVestments,
        usedNeedles,
        medicine,
        freshOrgans,
        textbook,
        reportCard,
        bagOfMoney,
        dyePack,
        loanApplication,
        supermanComic,
        mintYoda,
        oilCan,
        tireIron,
        nerveGas,
        armyUniform,
        abramsTank,
        bookOfStamps,
        junkMail,
        sparklers,
        m80,
        bottleRockets,
        chinchilla,
        catnip,
        cobra,
        anchor,
        canOfWorms,
        nailGun,
        chainsaw,
        axe,
        nails,
        copUniform,
        handcuffs,
        mugShot,
        giraffe,
        tRex,
        mysticalEgyptianSceptor,
        catapult,
        headstone,
        corpse,
        grievingWidow,
        bucketOfLava,
        pizza,
        pizzaCutter;
    }
    private static Item[] createInventoryList() {
        
        Item[] item = new Item[75];
        
        Item shirt = new Item();
        shirt.setDescription("Shirt");
        shirt.setRequiredAmount(0);
        shirt.setItemQuantity(0);
        shirt.setStrength(10);
        item[Items.shirt.ordinal()] = shirt;
        
        Item videoGame = new Item();
        videoGame.setDescription("Video Game");
        videoGame.setRequiredAmount(0);
        videoGame.setItemQuantity(0);
        videoGame.setStrength(10);
        item[Items.videoGame.ordinal()] = videoGame;
        
        Item leatherBag = new Item();
        leatherBag.setDescription("Fancy Leather Bag");
        leatherBag.setRequiredAmount(0);
        leatherBag.setItemQuantity(0);
        leatherBag.setStrength(10);
        item[Items.leatherBag.ordinal()] = leatherBag;
        
        Item mountainDew = new Item();
        mountainDew.setDescription("Mountain Dew");
        mountainDew.setRequiredAmount(0);
        mountainDew.setItemQuantity(0);
        mountainDew.setStrength(10);
        item[Items.mountainDew.ordinal()] = mountainDew;
        
        Item drPepper = new Item();
        drPepper.setDescription("Dr. Pepper");
        drPepper.setRequiredAmount(0);
        drPepper.setItemQuantity(0);
        drPepper.setStrength(10);
        item[Items.drPepper.ordinal()] = drPepper;
        
        Item bread = new Item();
        bread.setDescription("Bread");
        bread.setRequiredAmount(0);
        bread.setItemQuantity(0);
        bread.setStrength(10);
        item[Items.bread.ordinal()] = bread;
        
        Item gas = new Item();
        gas.setDescription("Gas");
        gas.setRequiredAmount(0);
        gas.setItemQuantity(0);
        gas.setStrength(10);
        item[Items.gas.ordinal()] = gas;
        
        Item ar15 = new Item();
        ar15.setDescription("AR-15");
        ar15.setRequiredAmount(0);
        ar15.setItemQuantity(0);
        ar15.setStrength(10);
        item[Items.ar15.ordinal()] = ar15;
        
        Item bazooka = new Item();
        bazooka.setDescription("Bazooka");
        bazooka.setRequiredAmount(0);
        bazooka.setItemQuantity(0);
        bazooka.setStrength(10);
        item[Items.bazooka.ordinal()] = bazooka;
        
        Item crossbow = new Item();
        crossbow.setDescription("Crossbow");
        crossbow.setRequiredAmount(0);
        crossbow.setItemQuantity(0);
        crossbow.setStrength(10);
        item[Items.crossbow.ordinal()] = crossbow;
        
        Item katana = new Item();
        katana.setDescription("Katana");
        katana.setRequiredAmount(0);
        katana.setItemQuantity(0);
        katana.setStrength(10);
        item[Items.katana.ordinal()] = katana;
        
        Item nunchucks = new Item();
        nunchucks.setDescription("Nunchucks");
        nunchucks.setRequiredAmount(0);
        nunchucks.setItemQuantity(0);
        nunchucks.setStrength(10);
        item[Items.nunchucks.ordinal()] = nunchucks;
        
        Item bowstaff = new Item();
        bowstaff.setDescription("Bow Staff");
        bowstaff.setRequiredAmount(0);
        bowstaff.setItemQuantity(0);
        bowstaff.setStrength(10);
        item[Items.bowstaff.ordinal()] = bowstaff;
        
        Item throwingStars = new Item();
        throwingStars.setDescription("Throwing Stars");
        throwingStars.setRequiredAmount(0);
        throwingStars.setItemQuantity(0);
        throwingStars.setStrength(10);
        item[Items.throwingStars.ordinal()] = throwingStars;
        
        Item baseballBat = new Item();
        baseballBat.setDescription("Baseball Bat");
        baseballBat.setRequiredAmount(0);
        baseballBat.setItemQuantity(0);
        baseballBat.setStrength(10);
        item[Items.baseballBat.ordinal()] = baseballBat;
        
        Item dumbbells = new Item();
        dumbbells.setDescription("Dumbbells");
        dumbbells.setRequiredAmount(0);
        dumbbells.setItemQuantity(0);
        dumbbells.setStrength(10);
        item[Items.dumbbells.ordinal()] = dumbbells;
        
        Item golfClub = new Item();
        golfClub.setDescription("Golf Club");
        golfClub.setRequiredAmount(0);
        golfClub.setItemQuantity(0);
        golfClub.setStrength(10);
        item[Items.golfClub.ordinal()] = golfClub;
        
        Item ancientSpellBook = new Item();
        ancientSpellBook.setDescription("Ancient Spell Book");
        ancientSpellBook.setRequiredAmount(0);
        ancientSpellBook.setItemQuantity(0);
        ancientSpellBook.setStrength(10);
        item[Items.shirt.ordinal()] = ancientSpellBook;
        
        Item libraryCard = new Item();
        libraryCard.setDescription("Library Card");
        libraryCard.setRequiredAmount(0);
        libraryCard.setItemQuantity(0);
        libraryCard.setStrength(10);
        item[Items.libraryCard.ordinal()] = libraryCard;
        
        Item taxForms = new Item();
        taxForms.setDescription("Tax Forms");
        taxForms.setRequiredAmount(0);
        taxForms.setItemQuantity(0);
        taxForms.setStrength(10);
        item[Items.taxForms.ordinal()] = taxForms;
        
        Item holyWater = new Item();
        holyWater.setDescription("Holy Water");
        holyWater.setRequiredAmount(0);
        holyWater.setItemQuantity(0);
        holyWater.setStrength(10);
        item[Items.holyWater.ordinal()] = holyWater;
        
        Item sacramentalWine = new Item();
        sacramentalWine.setDescription("Sacramental Wine");
        sacramentalWine.setRequiredAmount(0);
        sacramentalWine.setItemQuantity(0);
        sacramentalWine.setStrength(10);
        item[Items.sacramentalWine.ordinal()] = sacramentalWine;
        
        Item altarBoyVestments = new Item();
        altarBoyVestments.setDescription("Altar Boy Vestments");
        altarBoyVestments.setRequiredAmount(0);
        altarBoyVestments.setItemQuantity(0);
        altarBoyVestments.setStrength(10);
        item[Items.altarBoyVestments.ordinal()] = altarBoyVestments;
        
        Item usedNeedles = new Item();
        usedNeedles.setDescription("Used Needles");
        usedNeedles.setRequiredAmount(0);
        usedNeedles.setItemQuantity(0);
        usedNeedles.setStrength(10);
        item[Items.usedNeedles.ordinal()] = usedNeedles;
        
        Item medicine = new Item();
        medicine.setDescription("Medicine");
        medicine.setRequiredAmount(0);
        medicine.setItemQuantity(0);
        medicine.setStrength(10);
        item[Items.medicine.ordinal()] = medicine;
        
        Item freshOrgans = new Item();
        freshOrgans.setDescription("Fresh Organs");
        freshOrgans.setRequiredAmount(0);
        freshOrgans.setItemQuantity(0);
        freshOrgans.setStrength(10);
        item[Items.freshOrgans.ordinal()] = freshOrgans;
        
        Item textbook = new Item();
        textbook.setDescription("Textbook");
        textbook.setRequiredAmount(0);
        textbook.setItemQuantity(0);
        textbook.setStrength(10);
        item[Items.textbook.ordinal()] = textbook;
        
        Item reportCard = new Item();
        reportCard.setDescription("Report Card");
        reportCard.setRequiredAmount(0);
        reportCard.setItemQuantity(0);
        reportCard.setStrength(10);
        item[Items.reportCard.ordinal()] = reportCard;
        
        Item bagOfMoney = new Item();
        bagOfMoney.setDescription("Bag of Money");
        bagOfMoney.setRequiredAmount(0);
        bagOfMoney.setItemQuantity(0);
        bagOfMoney.setStrength(10);
        item[Items.bagOfMoney.ordinal()] = bagOfMoney;
        
        Item dyePack = new Item();
        dyePack.setDescription("Dye Pack");
        dyePack.setRequiredAmount(0);
        dyePack.setItemQuantity(0);
        dyePack.setStrength(10);
        item[Items.dyePack.ordinal()] = dyePack;
        
        Item loanApplication = new Item();
        loanApplication.setDescription("Loan Application");
        loanApplication.setRequiredAmount(0);
        loanApplication.setItemQuantity(0);
        loanApplication.setStrength(10);
        item[Items.loanApplication.ordinal()] = loanApplication;
        
        Item supermanComic = new Item();
        supermanComic.setDescription("Superman Comic");
        supermanComic.setRequiredAmount(0);
        supermanComic.setItemQuantity(0);
        supermanComic.setStrength(10);
        item[Items.supermanComic.ordinal()] = supermanComic;
        
        Item mintYoda = new Item();
        mintYoda.setDescription("Yoda - Mint condition in box");
        mintYoda.setRequiredAmount(0);
        mintYoda.setItemQuantity(0);
        mintYoda.setStrength(10);
        item[Items.shirt.ordinal()] = shirt;
        
        Item oilCan = new Item();
        oilCan.setDescription("Oil Can");
        oilCan.setRequiredAmount(0);
        oilCan.setItemQuantity(0);
        oilCan.setStrength(10);
        item[Items.oilCan.ordinal()] = oilCan;
        
        Item tireIron = new Item();
        tireIron.setDescription("Tire Iron");
        tireIron.setRequiredAmount(0);
        tireIron.setItemQuantity(0);
        tireIron.setStrength(10);
        item[Items.tireIron.ordinal()] = tireIron;
        
        Item nerveGas = new Item();
        nerveGas.setDescription("Nerve Gas");
        nerveGas.setRequiredAmount(0);
        nerveGas.setItemQuantity(0);
        nerveGas.setStrength(10);
        item[Items.nerveGas.ordinal()] = nerveGas;
        
        Item armyUniform = new Item();
        armyUniform.setDescription("Army Uniform");
        armyUniform.setRequiredAmount(0);
        armyUniform.setItemQuantity(0);
        armyUniform.setStrength(10);
        item[Items.armyUniform.ordinal()] = armyUniform;
        
        Item abramsTank = new Item();
        abramsTank.setDescription("Abrams Tank");
        abramsTank.setRequiredAmount(0);
        abramsTank.setItemQuantity(0);
        abramsTank.setStrength(10);
        item[Items.abramsTank.ordinal()] = abramsTank;
        
        Item bookOfStamps = new Item();
        bookOfStamps.setDescription("Book of Stamps");
        bookOfStamps.setRequiredAmount(0);
        bookOfStamps.setItemQuantity(0);
        bookOfStamps.setStrength(10);
        item[Items.bookOfStamps.ordinal()] = bookOfStamps;
        
        Item junkMail = new Item();
        junkMail.setDescription("Junk Mail");
        junkMail.setRequiredAmount(0);
        junkMail.setItemQuantity(0);
        junkMail.setStrength(10);
        item[Items.junkMail.ordinal()] = junkMail;
        
        Item sparklers = new Item();
        sparklers.setDescription("Sparklers");
        sparklers.setRequiredAmount(0);
        sparklers.setItemQuantity(0);
        sparklers.setStrength(10);
        item[Items.sparklers.ordinal()] = sparklers;
        
        Item m80 = new Item();
        m80.setDescription("M-80");
        m80.setRequiredAmount(0);
        m80.setItemQuantity(0);
        m80.setStrength(10);
        item[Items.m80.ordinal()] = m80;
        
        Item bottleRockets = new Item();
        bottleRockets.setDescription("Bottle Rockets");
        bottleRockets.setRequiredAmount(0);
        bottleRockets.setItemQuantity(0);
        bottleRockets.setStrength(10);
        item[Items.bottleRockets.ordinal()] = bottleRockets;
        
        Item chinchilla = new Item();
        chinchilla.setDescription("Chinchilla");
        chinchilla.setRequiredAmount(0);
        chinchilla.setItemQuantity(0);
        chinchilla.setStrength(10);
        item[Items.chinchilla.ordinal()] = chinchilla;
        
        Item catnip = new Item();
        catnip.setDescription("Catnip");
        catnip.setRequiredAmount(0);
        catnip.setItemQuantity(0);
        catnip.setStrength(10);
        item[Items.catnip.ordinal()] = catnip;
        
        Item cobra = new Item();
        cobra.setDescription("Cobra");
        cobra.setRequiredAmount(0);
        cobra.setItemQuantity(0);
        cobra.setStrength(10);
        item[Items.cobra.ordinal()] = cobra;
        
        Item anchor = new Item();
        anchor.setDescription("Anchor");
        anchor.setRequiredAmount(0);
        anchor.setItemQuantity(0);
        anchor.setStrength(10);
        item[Items.anchor.ordinal()] = anchor;
        
        Item canOfWorms = new Item();
        canOfWorms.setDescription("Can of Worms");
        canOfWorms.setRequiredAmount(0);
        canOfWorms.setItemQuantity(0);
        canOfWorms.setStrength(10);
        item[Items.canOfWorms.ordinal()] = canOfWorms;
        
        Item nailGun = new Item();
        nailGun.setDescription("Nail Gun");
        nailGun.setRequiredAmount(0);
        nailGun.setItemQuantity(0);
        nailGun.setStrength(10);
        item[Items.nailGun.ordinal()] = nailGun;
        
        Item chainsaw = new Item();
        chainsaw.setDescription("Chainsaw");
        chainsaw.setRequiredAmount(0);
        chainsaw.setItemQuantity(0);
        chainsaw.setStrength(10);
        item[Items.chainsaw.ordinal()] = chainsaw;
        
        Item axe = new Item();
        axe.setDescription("Axe");
        axe.setRequiredAmount(0);
        axe.setItemQuantity(0);
        axe.setStrength(10);
        item[Items.axe.ordinal()] = axe;
        
        Item nails = new Item();
        nails.setDescription("Nails");
        nails.setRequiredAmount(0);
        nails.setItemQuantity(0);
        nails.setStrength(10);
        item[Items.nails.ordinal()] = nails;
        
        Item copUniform = new Item();
        copUniform.setDescription("Cop Uniform");
        copUniform.setRequiredAmount(0);
        copUniform.setItemQuantity(0);
        copUniform.setStrength(10);
        item[Items.copUniform.ordinal()] = copUniform;
        
        Item handcuffs = new Item();
        handcuffs.setDescription("Handcuffs");
        handcuffs.setRequiredAmount(0);
        handcuffs.setItemQuantity(0);
        handcuffs.setStrength(10);
        item[Items.handcuffs.ordinal()] = handcuffs;
        
        Item mugShot = new Item();
        mugShot.setDescription("Mug Shot");
        mugShot.setRequiredAmount(0);
        mugShot.setItemQuantity(0);
        mugShot.setStrength(10);
        item[Items.mugShot.ordinal()] = mugShot;
        
        Item giraffe = new Item();
        giraffe.setDescription("Giraffe");
        giraffe.setRequiredAmount(0);
        giraffe.setItemQuantity(0);
        giraffe.setStrength(10);
        item[Items.giraffe.ordinal()] = giraffe;
        
        Item tRex = new Item();
        tRex.setDescription("Tyranosaurus Rex");
        tRex.setRequiredAmount(0);
        tRex.setItemQuantity(0);
        tRex.setStrength(10);
        item[Items.tRex.ordinal()] = tRex;
        
        Item mysticalEgyptianSceptor = new Item();
        mysticalEgyptianSceptor.setDescription("Mystical Egyption Sceptor");
        mysticalEgyptianSceptor.setRequiredAmount(0);
        mysticalEgyptianSceptor.setItemQuantity(0);
        mysticalEgyptianSceptor.setStrength(10);
        item[Items.mysticalEgyptianSceptor.ordinal()] = mysticalEgyptianSceptor;
        
        Item catapult = new Item();
        catapult.setDescription("Shirt");
        catapult.setRequiredAmount(0);
        catapult.setItemQuantity(0);
        catapult.setStrength(10);
        item[Items.catapult.ordinal()] = catapult;
        
        Item headstone = new Item();
        headstone.setDescription("Headstone");
        headstone.setRequiredAmount(0);
        headstone.setItemQuantity(0);
        headstone.setStrength(10);
        item[Items.headstone.ordinal()] = headstone;
        
        Item corpse = new Item();
        corpse.setDescription("Corpse");
        corpse.setRequiredAmount(0);
        corpse.setItemQuantity(0);
        corpse.setStrength(10);
        item[Items.corpse.ordinal()] = shirt;
        
        Item grievingWidow = new Item();
        grievingWidow.setDescription("Grieving Widow");
        grievingWidow.setRequiredAmount(0);
        grievingWidow.setItemQuantity(0);
        grievingWidow.setStrength(10);
        item[Items.grievingWidow.ordinal()] = grievingWidow;
        
        Item bucketOfLava = new Item();
        bucketOfLava.setDescription("Bucket of Lava");
        bucketOfLava.setRequiredAmount(0);
        bucketOfLava.setItemQuantity(0);
        bucketOfLava.setStrength(10);
        item[Items.bucketOfLava.ordinal()] = bucketOfLava;
        
        Item pizza = new Item();
        pizza.setDescription("Pizza");
        pizza.setRequiredAmount(0);
        pizza.setItemQuantity(0);
        pizza.setStrength(10);
        item[Items.pizza.ordinal()] = pizza;
        
        Item pizzaCutter = new Item();
        pizzaCutter.setDescription("Pizza Cutter");
        pizzaCutter.setRequiredAmount(0);
        pizzaCutter.setItemQuantity(0);
        pizzaCutter.setStrength(10);
        item[Items.pizzaCutter.ordinal()] = pizzaCutter;
        
        return item;
    }
}
