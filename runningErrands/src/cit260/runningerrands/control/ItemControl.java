/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Persona;
import runningerrands.RunningErrands;

/**
 *
 * @author reddo
 */
public class ItemControl {
    
    
        public enum Items {
        secretRayGun,
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
    static Item[] createInventoryList() {
        
        Item[] item = new Item[66];

        Item secretRayGun = new Item();
        secretRayGun.setDescription("Secret Ray Gun");
        secretRayGun.setRequiredAmount(0);
        secretRayGun.setItemCost(0);
        secretRayGun.setItemValue(100000);
        secretRayGun.setItemQuantity(0);
        secretRayGun.setStrength(100000);
        secretRayGun.setItemNumber(0);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.secretRayGun.ordinal()] = secretRayGun;
        
        Item shirt = new Item();
        shirt.setDescription("Shirt");
        shirt.setRequiredAmount(0);
        shirt.setItemCost(0);
        shirt.setItemValue(0);
        shirt.setItemQuantity(0);
        shirt.setStrength(10);
        shirt.setItemNumber(1);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.shirt.ordinal()] = shirt;
        
        Item videoGame = new Item();
        videoGame.setDescription("Video Game");
        videoGame.setRequiredAmount(0);
        videoGame.setItemCost(0);
        videoGame.setItemValue(0);
        videoGame.setItemQuantity(0);
        videoGame.setStrength(10);
        videoGame.setItemNumber(2);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.videoGame.ordinal()] = videoGame;
        
        Item leatherBag = new Item();
        leatherBag.setDescription("Fancy Leather Bag");
        leatherBag.setRequiredAmount(0);
        leatherBag.setItemCost(0);
        leatherBag.setItemValue(0);
        leatherBag.setItemQuantity(0);
        leatherBag.setStrength(10);
        leatherBag.setItemNumber(3);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.leatherBag.ordinal()] = leatherBag;
        
        Item mountainDew = new Item();
        mountainDew.setDescription("Mountain Dew");
        mountainDew.setRequiredAmount(0);
        mountainDew.setItemCost(3);
        mountainDew.setItemValue(1);
        mountainDew.setItemQuantity(1);
        mountainDew.setStrength(10);
        mountainDew.setItemNumber(4);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.mountainDew.ordinal()] = mountainDew;
        
        Item drPepper = new Item();
        drPepper.setDescription("Dr. Pepper");
        drPepper.setRequiredAmount(0);
        drPepper.setItemCost(3);
        drPepper.setItemValue(1);
        drPepper.setItemQuantity(1);
        drPepper.setStrength(10);
        drPepper.setItemNumber(5);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.drPepper.ordinal()] = drPepper;
        
        Item bread = new Item();
        bread.setDescription("Bread");
        bread.setRequiredAmount(0);
        bread.setItemCost(0);
        bread.setItemValue(0);
        bread.setItemQuantity(0);
        bread.setStrength(10);
        bread.setItemNumber(6);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.bread.ordinal()] = bread;
        
        Item gas = new Item();
        gas.setDescription("Gas");
        gas.setRequiredAmount(0);
        gas.setItemCost(4);
        gas.setItemValue(0);
        gas.setItemQuantity(10);
        gas.setStrength(10);
        gas.setItemNumber(7);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.gas.ordinal()] = gas;
        
        Item ar15 = new Item();
        ar15.setDescription("AR-15");
        ar15.setRequiredAmount(0);
        ar15.setItemCost(0);
        ar15.setItemValue(0);
        ar15.setItemQuantity(0);
        ar15.setStrength(10);
        ar15.setItemNumber(8);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.ar15.ordinal()] = ar15;
        
        Item bazooka = new Item();
        bazooka.setDescription("Bazooka");
        bazooka.setRequiredAmount(0);
        bazooka.setItemCost(0);
        bazooka.setItemValue(0);
        bazooka.setItemQuantity(0);
        bazooka.setStrength(10);
        bazooka.setItemNumber(9);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.bazooka.ordinal()] = bazooka;
        
        Item crossbow = new Item();
        crossbow.setDescription("Crossbow");
        crossbow.setRequiredAmount(0);
        crossbow.setItemCost(0);
        crossbow.setItemValue(0);
        crossbow.setItemQuantity(0);
        crossbow.setStrength(10);
        crossbow.setItemNumber(10);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.crossbow.ordinal()] = crossbow;
        
        Item katana = new Item();
        katana.setDescription("Katana");
        katana.setRequiredAmount(0);
        katana.setItemCost(0);
        katana.setItemValue(0);
        katana.setItemQuantity(0);
        katana.setStrength(10);
        katana.setItemNumber(11);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.katana.ordinal()] = katana;
        
        Item nunchucks = new Item();
        nunchucks.setDescription("Nunchucks");
        nunchucks.setRequiredAmount(0);
        shirt.setItemCost(0);
        nunchucks.setItemValue(0);
        nunchucks.setItemQuantity(0);
        nunchucks.setStrength(10);
        nunchucks.setItemNumber(12);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.nunchucks.ordinal()] = nunchucks;
        
        Item bowstaff = new Item();
        bowstaff.setDescription("Bow Staff");
        bowstaff.setRequiredAmount(0);
        bowstaff.setItemCost(0);
        bowstaff.setItemValue(0);
        bowstaff.setItemQuantity(0);
        bowstaff.setStrength(10);
        bowstaff.setItemNumber(13);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.bowstaff.ordinal()] = bowstaff;
        
        Item throwingStars = new Item();
        throwingStars.setDescription("Throwing Stars");
        throwingStars.setRequiredAmount(0);
        throwingStars.setItemCost(0);
        throwingStars.setItemValue(0);
        throwingStars.setItemQuantity(0);
        throwingStars.setStrength(10);
        throwingStars.setItemNumber(14);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.throwingStars.ordinal()] = throwingStars;
        
        Item baseballBat = new Item();
        baseballBat.setDescription("Baseball Bat");
        baseballBat.setRequiredAmount(0);
        baseballBat.setItemCost(0);
        baseballBat.setItemValue(0);
        baseballBat.setItemQuantity(0);
        baseballBat.setStrength(10);
        baseballBat.setItemNumber(15);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.baseballBat.ordinal()] = baseballBat;
        
        Item dumbbells = new Item();
        dumbbells.setDescription("Dumbbells");
        dumbbells.setRequiredAmount(0);
        dumbbells.setItemCost(0);
        dumbbells.setItemValue(0);
        dumbbells.setItemQuantity(0);
        dumbbells.setStrength(10);
        dumbbells.setItemNumber(16);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.dumbbells.ordinal()] = dumbbells;
        
        Item golfClub = new Item();
        golfClub.setDescription("Golf Club");
        golfClub.setRequiredAmount(0);
        golfClub.setItemCost(0);
        golfClub.setItemValue(0);
        golfClub.setItemQuantity(0);
        golfClub.setStrength(10);
        golfClub.setItemNumber(17);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.golfClub.ordinal()] = golfClub;
        
        Item ancientSpellBook = new Item();
        ancientSpellBook.setDescription("Ancient Spell Book");
        ancientSpellBook.setRequiredAmount(0);
        ancientSpellBook.setItemCost(0);
        ancientSpellBook.setItemValue(0);
        ancientSpellBook.setItemQuantity(0);
        ancientSpellBook.setStrength(10);
        ancientSpellBook.setItemNumber(18);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.ancientSpellBook.ordinal()] = ancientSpellBook;
        
        Item libraryCard = new Item();
        libraryCard.setDescription("Library Card");
        libraryCard.setRequiredAmount(0);
        libraryCard.setItemCost(0);
        libraryCard.setItemValue(0);
        libraryCard.setItemQuantity(1);
        libraryCard.setStrength(10);
        libraryCard.setItemNumber(19);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.libraryCard.ordinal()] = libraryCard;
        
        Item taxForms = new Item();
        taxForms.setDescription("Tax Forms");
        taxForms.setRequiredAmount(0);
        taxForms.setItemCost(0);
        taxForms.setItemValue(0);
        taxForms.setItemQuantity(0);
        taxForms.setStrength(10);
        taxForms.setItemNumber(20);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.taxForms.ordinal()] = taxForms;
        
        Item holyWater = new Item();
        holyWater.setDescription("Holy Water");
        holyWater.setRequiredAmount(0);
        holyWater.setItemCost(0);
        holyWater.setItemValue(0);
        holyWater.setItemQuantity(0);
        holyWater.setStrength(10);
        holyWater.setItemNumber(21);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.holyWater.ordinal()] = holyWater;
        
        Item sacramentalWine = new Item();
        sacramentalWine.setDescription("Sacramental Wine");
        sacramentalWine.setRequiredAmount(0);
        sacramentalWine.setItemCost(0);
        sacramentalWine.setItemValue(0);
        sacramentalWine.setItemQuantity(0);
        sacramentalWine.setStrength(10);
        sacramentalWine.setItemNumber(22);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.sacramentalWine.ordinal()] = sacramentalWine;
        
        Item altarBoyVestments = new Item();
        altarBoyVestments.setDescription("Altar Boy Vestments");
        altarBoyVestments.setRequiredAmount(0);
        altarBoyVestments.setItemCost(0);
        altarBoyVestments.setItemValue(0);
        altarBoyVestments.setItemQuantity(0);
        altarBoyVestments.setStrength(10);
        altarBoyVestments.setItemNumber(23);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.altarBoyVestments.ordinal()] = altarBoyVestments;
        
        Item usedNeedles = new Item();
        usedNeedles.setDescription("Used Needles");
        usedNeedles.setRequiredAmount(0);
        usedNeedles.setItemCost(0);
        usedNeedles.setItemValue(0);
        usedNeedles.setItemQuantity(0);
        usedNeedles.setStrength(10);
        usedNeedles.setItemNumber(24);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.usedNeedles.ordinal()] = usedNeedles;
        
        Item medicine = new Item();
        medicine.setDescription("Medicine");
        medicine.setRequiredAmount(0);
        medicine.setItemCost(0);
        medicine.setItemValue(0);
        medicine.setItemQuantity(0);
        medicine.setStrength(10);
        medicine.setItemNumber(25);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.medicine.ordinal()] = medicine;
        
        Item freshOrgans = new Item();
        freshOrgans.setDescription("Fresh Organs");
        freshOrgans.setRequiredAmount(0);
        freshOrgans.setItemCost(0);
        freshOrgans.setItemValue(0);
        freshOrgans.setItemQuantity(0);
        freshOrgans.setStrength(10);
        freshOrgans.setItemNumber(26);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.freshOrgans.ordinal()] = freshOrgans;
        
        Item textbook = new Item();
        textbook.setDescription("Textbook");
        textbook.setRequiredAmount(0);
        textbook.setItemCost(0);
        textbook.setItemValue(0);
        textbook.setItemQuantity(0);
        textbook.setStrength(10);
        textbook.setItemNumber(27);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.textbook.ordinal()] = textbook;
        
        Item reportCard = new Item();
        reportCard.setDescription("Report Card");
        reportCard.setRequiredAmount(0);
        reportCard.setItemCost(0);
        reportCard.setItemValue(0);
        reportCard.setItemQuantity(0);
        reportCard.setStrength(10);
        reportCard.setItemNumber(28);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.reportCard.ordinal()] = reportCard;
        
        Item bagOfMoney = new Item();
        bagOfMoney.setDescription("Bag of Money");
        bagOfMoney.setRequiredAmount(0);
        bagOfMoney.setItemCost(0);
        bagOfMoney.setItemValue(0);
        bagOfMoney.setItemQuantity(0);
        bagOfMoney.setStrength(10);
        bagOfMoney.setItemNumber(29);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.bagOfMoney.ordinal()] = bagOfMoney;
        
        Item dyePack = new Item();
        dyePack.setDescription("Dye Pack");
        dyePack.setRequiredAmount(0);
        dyePack.setItemCost(0);
        dyePack.setItemValue(0);
        dyePack.setItemQuantity(0);
        dyePack.setStrength(10);
        dyePack.setItemNumber(30);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.dyePack.ordinal()] = dyePack;
        
        Item loanApplication = new Item();
        loanApplication.setDescription("Loan Application");
        loanApplication.setRequiredAmount(0);
        loanApplication.setItemCost(0);
        loanApplication.setItemValue(0);
        loanApplication.setItemQuantity(0);
        loanApplication.setStrength(10);
        loanApplication.setItemNumber(31);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.loanApplication.ordinal()] = loanApplication;
        
        Item supermanComic = new Item();
        supermanComic.setDescription("Superman Comic");
        supermanComic.setRequiredAmount(0);
        supermanComic.setItemCost(0);
        supermanComic.setItemValue(0);
        supermanComic.setItemQuantity(0);
        supermanComic.setStrength(10);
        supermanComic.setItemNumber(32);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.supermanComic.ordinal()] = supermanComic;
        
        Item mintYoda = new Item();
        mintYoda.setDescription("Yoda - Mint condition in box");
        mintYoda.setRequiredAmount(0);
        mintYoda.setItemCost(0);
        mintYoda.setItemValue(0);
        mintYoda.setItemQuantity(0);
        mintYoda.setStrength(10);
        mintYoda.setItemNumber(33);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.mintYoda.ordinal()] = shirt;
        
        Item oilCan = new Item();
        oilCan.setDescription("Oil Can");
        oilCan.setRequiredAmount(0);
        oilCan.setItemCost(0);
        oilCan.setItemValue(0);
        oilCan.setItemQuantity(0);
        oilCan.setStrength(10);
        oilCan.setItemNumber(34);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.oilCan.ordinal()] = oilCan;
        
        Item tireIron = new Item();
        tireIron.setDescription("Tire Iron");
        tireIron.setRequiredAmount(0);
        tireIron.setItemCost(0);
        tireIron.setItemValue(0);
        tireIron.setItemQuantity(0);
        tireIron.setStrength(10);
        tireIron.setItemNumber(35);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.tireIron.ordinal()] = tireIron;
        
        Item nerveGas = new Item();
        nerveGas.setDescription("Nerve Gas");
        nerveGas.setRequiredAmount(0);
        nerveGas.setItemCost(0);
        nerveGas.setItemValue(0);
        nerveGas.setItemQuantity(0);
        nerveGas.setStrength(10);
        nerveGas.setItemNumber(36);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.nerveGas.ordinal()] = nerveGas;
        
        Item armyUniform = new Item();
        armyUniform.setDescription("Army Uniform");
        armyUniform.setRequiredAmount(0);
        armyUniform.setItemCost(0);
        armyUniform.setItemValue(0);
        armyUniform.setItemQuantity(0);
        armyUniform.setStrength(10);
        armyUniform.setItemNumber(37);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.armyUniform.ordinal()] = armyUniform;
        
        Item abramsTank = new Item();
        abramsTank.setDescription("Abrams Tank");
        abramsTank.setRequiredAmount(0);
        abramsTank.setItemCost(0);
        abramsTank.setItemValue(0);
        abramsTank.setItemQuantity(0);
        abramsTank.setStrength(10);
        abramsTank.setItemNumber(38);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.abramsTank.ordinal()] = abramsTank;
        
        Item bookOfStamps = new Item();
        bookOfStamps.setDescription("Book of Stamps");
        bookOfStamps.setRequiredAmount(0);
        bookOfStamps.setItemCost(0);
        bookOfStamps.setItemValue(0);
        bookOfStamps.setItemQuantity(0);
        bookOfStamps.setStrength(10);
        bookOfStamps.setItemNumber(39);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.bookOfStamps.ordinal()] = bookOfStamps;
        
        Item junkMail = new Item();
        junkMail.setDescription("Junk Mail");
        junkMail.setRequiredAmount(0);
        junkMail.setItemCost(0);
        junkMail.setItemValue(0);
        junkMail.setItemQuantity(0);
        junkMail.setStrength(10);
        junkMail.setItemNumber(40);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.junkMail.ordinal()] = junkMail;
        
        Item sparklers = new Item();
        sparklers.setDescription("Sparklers");
        sparklers.setRequiredAmount(0);
        sparklers.setItemCost(0);
        sparklers.setItemValue(0);
        sparklers.setItemQuantity(0);
        sparklers.setStrength(10);
        sparklers.setItemNumber(41);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.sparklers.ordinal()] = sparklers;
        
        Item m80 = new Item();
        m80.setDescription("M-80");
        m80.setRequiredAmount(0);
        m80.setItemCost(0);
        m80.setItemValue(0);
        m80.setItemQuantity(0);
        m80.setStrength(10);
        m80.setItemNumber(42);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.m80.ordinal()] = m80;
        
        Item bottleRockets = new Item();
        bottleRockets.setDescription("Bottle Rockets");
        bottleRockets.setRequiredAmount(0);
        bottleRockets.setItemCost(0);
        bottleRockets.setItemValue(0);
        bottleRockets.setItemQuantity(0);
        bottleRockets.setStrength(10);
        bottleRockets.setItemNumber(43);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.bottleRockets.ordinal()] = bottleRockets;
        
        Item chinchilla = new Item();
        chinchilla.setDescription("Chinchilla");
        chinchilla.setRequiredAmount(0);
        chinchilla.setItemCost(0);
        chinchilla.setItemValue(0);
        chinchilla.setItemQuantity(0);
        chinchilla.setStrength(10);
        chinchilla.setItemNumber(44);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.chinchilla.ordinal()] = chinchilla;
        
        Item catnip = new Item();
        catnip.setDescription("Catnip");
        catnip.setRequiredAmount(0);
        catnip.setItemCost(0);
        catnip.setItemValue(0);
        catnip.setItemQuantity(0);
        catnip.setStrength(10);
        catnip.setItemNumber(45);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.catnip.ordinal()] = catnip;
        
        Item cobra = new Item();
        cobra.setDescription("Cobra");
        cobra.setRequiredAmount(0);
        cobra.setItemCost(0);
        cobra.setItemValue(0);
        cobra.setItemQuantity(0);
        cobra.setStrength(10);
        cobra.setItemNumber(46);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.cobra.ordinal()] = cobra;
        
        Item anchor = new Item();
        anchor.setDescription("Anchor");
        anchor.setRequiredAmount(0);
        anchor.setItemCost(0);
        anchor.setItemValue(0);
        anchor.setItemQuantity(0);
        anchor.setStrength(10);
        anchor.setItemNumber(47);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.anchor.ordinal()] = anchor;
        
        Item canOfWorms = new Item();
        canOfWorms.setDescription("Can of Worms");
        canOfWorms.setRequiredAmount(0);
        canOfWorms.setItemCost(0);
        canOfWorms.setItemValue(0);
        canOfWorms.setItemQuantity(0);
        canOfWorms.setStrength(10);
        canOfWorms.setItemNumber(48);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.canOfWorms.ordinal()] = canOfWorms;
        
        Item nailGun = new Item();
        nailGun.setDescription("Nail Gun");
        nailGun.setRequiredAmount(0);
        nailGun.setItemCost(0);
        nailGun.setItemValue(0);
        nailGun.setItemQuantity(0);
        nailGun.setStrength(10);
        nailGun.setItemNumber(49);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.nailGun.ordinal()] = nailGun;
        
        Item chainsaw = new Item();
        chainsaw.setDescription("Chainsaw");
        chainsaw.setRequiredAmount(0);
        chainsaw.setItemCost(0);
        chainsaw.setItemValue(0);
        chainsaw.setItemQuantity(0);
        chainsaw.setStrength(10);
        chainsaw.setItemNumber(50);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.chainsaw.ordinal()] = chainsaw;
        
        Item axe = new Item();
        axe.setDescription("Axe");
        axe.setRequiredAmount(0);
        axe.setItemCost(0);
        axe.setItemValue(0);
        axe.setItemQuantity(0);
        axe.setStrength(10);
        axe.setItemNumber(51);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.axe.ordinal()] = axe;
        
        Item nails = new Item();
        nails.setDescription("Nails");
        nails.setRequiredAmount(0);
        nails.setItemCost(0);
        nails.setItemValue(0);
        nails.setItemQuantity(0);
        nails.setStrength(10);
        nails.setItemNumber(52);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.nails.ordinal()] = nails;
        
        Item copUniform = new Item();
        copUniform.setDescription("Cop Uniform");
        copUniform.setRequiredAmount(0);
        copUniform.setItemCost(0);
        copUniform.setItemValue(0);
        copUniform.setItemQuantity(0);
        copUniform.setStrength(10);
        copUniform.setItemNumber(53);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.copUniform.ordinal()] = copUniform;
        
        Item handcuffs = new Item();
        handcuffs.setDescription("Handcuffs");
        handcuffs.setRequiredAmount(0);
        handcuffs.setItemCost(0);
        handcuffs.setItemValue(0);
        handcuffs.setItemQuantity(0);
        handcuffs.setStrength(10);
        handcuffs.setItemNumber(54);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.handcuffs.ordinal()] = handcuffs;
        
        Item mugShot = new Item();
        mugShot.setDescription("Mug Shot");
        mugShot.setRequiredAmount(0);
        mugShot.setItemCost(0);
        mugShot.setItemValue(0);
        mugShot.setItemQuantity(0);
        mugShot.setStrength(10);
        mugShot.setItemNumber(55);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.mugShot.ordinal()] = mugShot;
        
        Item giraffe = new Item();
        giraffe.setDescription("Giraffe");
        giraffe.setRequiredAmount(0);
        giraffe.setItemCost(0);
        giraffe.setItemValue(0);
        giraffe.setItemQuantity(0);
        giraffe.setStrength(10);
        giraffe.setItemNumber(56);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.giraffe.ordinal()] = giraffe;
        
        Item tRex = new Item();
        tRex.setDescription("Tyranosaurus Rex");
        tRex.setRequiredAmount(0);
        tRex.setItemCost(0);
        tRex.setItemValue(0);
        tRex.setItemQuantity(0);
        tRex.setStrength(10);
        tRex.setItemNumber(57);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.tRex.ordinal()] = tRex;
        
        Item mysticalEgyptianSceptor = new Item();
        mysticalEgyptianSceptor.setDescription("Egyption Sceptor");
        mysticalEgyptianSceptor.setRequiredAmount(0);
        mysticalEgyptianSceptor.setItemCost(0);
        mysticalEgyptianSceptor.setItemValue(0);
        mysticalEgyptianSceptor.setItemQuantity(0);
        mysticalEgyptianSceptor.setStrength(10);
        mysticalEgyptianSceptor.setItemNumber(58);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.mysticalEgyptianSceptor.ordinal()] = mysticalEgyptianSceptor;
        
        Item catapult = new Item();
        catapult.setDescription("Shirt");
        catapult.setRequiredAmount(0);
        catapult.setItemCost(0);
        catapult.setItemValue(0);
        catapult.setItemQuantity(0);
        catapult.setStrength(10);
        catapult.setItemNumber(59);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.catapult.ordinal()] = catapult;
        
        Item headstone = new Item();
        headstone.setDescription("Headstone");
        headstone.setRequiredAmount(0);
        headstone.setItemCost(0);
        headstone.setItemValue(0);
        headstone.setItemQuantity(0);
        headstone.setStrength(10);
        headstone.setItemNumber(60);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.headstone.ordinal()] = headstone;
        
        Item corpse = new Item();
        corpse.setDescription("Corpse");
        corpse.setRequiredAmount(0);
        corpse.setItemCost(0);
        corpse.setItemValue(0);
        corpse.setItemQuantity(0);
        corpse.setStrength(10);
        corpse.setItemNumber(61);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.corpse.ordinal()] = shirt;
        
        Item grievingWidow = new Item();
        grievingWidow.setDescription("Grieving Widow");
        grievingWidow.setRequiredAmount(0);
        grievingWidow.setItemCost(0);
        grievingWidow.setItemValue(0);
        grievingWidow.setItemQuantity(0);
        grievingWidow.setStrength(10);
        grievingWidow.setItemNumber(62);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.grievingWidow.ordinal()] = grievingWidow;
        
        Item bucketOfLava = new Item();
        bucketOfLava.setDescription("Bucket of Lava");
        bucketOfLava.setRequiredAmount(0);
        bucketOfLava.setItemCost(0);
        bucketOfLava.setItemValue(0);
        bucketOfLava.setItemQuantity(0);
        bucketOfLava.setStrength(10);
        bucketOfLava.setItemNumber(63);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.bucketOfLava.ordinal()] = bucketOfLava;
        
        Item pizza = new Item();
        pizza.setDescription("Pizza");
        pizza.setRequiredAmount(0);
        pizza.setItemCost(0);
        pizza.setItemValue(0);
        pizza.setItemQuantity(0);
        pizza.setStrength(10);
        pizza.setItemNumber(64);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.pizza.ordinal()] = pizza;
        
        Item pizzaCutter = new Item();
        pizzaCutter.setDescription("Pizza Cutter");
        pizzaCutter.setRequiredAmount(0);
        pizzaCutter.setItemCost(0);
        pizzaCutter.setItemValue(0);
        pizzaCutter.setItemQuantity(0);
        pizzaCutter.setStrength(10);
        pizzaCutter.setItemNumber(65);
        secretRayGun.setItemSellable("Y");
        secretRayGun.setItemInSellList("N");
        item[Items.pizzaCutter.ordinal()] = pizzaCutter;
        
        return item;
    }
    
    public static int sellItem (Item currentItem, int itemQuantity) {
        
        Persona persona = RunningErrands.getPersona();
        int currentOnHand = currentItem.getItemQuantity();
        int newOnHand = currentOnHand - itemQuantity;
        currentItem.setItemQuantity(newOnHand);
        int itemValue = currentItem.getItemValue();
        int totalSalePrice = itemValue * itemQuantity;
        int updatedBalance = PersonaControl.updatePersonaMoney(totalSalePrice);
        return totalSalePrice;

    }
}
