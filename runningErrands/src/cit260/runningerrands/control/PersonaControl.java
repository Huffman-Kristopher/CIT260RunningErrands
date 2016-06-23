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
        batGirlFigurine,
        oilCan,
        tireIron,
        nerveGas,
        armyUniform,
        abramsTank,
        bookOfStamps,
        mail,
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
        shirt.setQuantityInStock();
        shirt.setStrength();
        item[Items.shirt.ordinal()] = shirt;
        
        Item videoGame = new Item();
        videoGame.setDescription("Video Game");
        videoGame.setRequiredAmount(0);
        videoGame.setQuantityInStock();
        videoGame.setStrength();
        item[1] = videoGame;
        
        Item leatherBag = new Item();
        leatherBag.setDescription("Fancy Leather Bag");
        leatherBag.setRequiredAmount(0);
        leatherBag.setQuantityInStock();
        leatherBag.setStrength();
        item[2] = leatherBag;
        
        Item mountainDew = new Item();
        mountainDew.setDescription("Mountain Dew");
        mountainDew.setRequiredAmount(0);
        mountainDew.setQuantityInStock();
        mountainDew.setStrength();
        item[3] = mountainDew;
        
        Item drPepper = new Item();
        drPepper.setDescription("Dr. Pepper");
        drPepper.setRequiredAmount(0);
        drPepper.setQuantityInStock();
        drPepper.setStrength();
        item[4] = drPepper;
        
        Item bread = new Item();
        bread.setDescription("Bread");
        bread.setRequiredAmount(0);
        bread.setQuantityInStock();
        bread.setStrength();
        item[5] = bread;
        
        Item gas = new Item();
        gas.setDescription("Gas");
        gas.setRequiredAmount(0);
        gas.setQuantityInStock();
        gas.setStrength();
        item[5] = gas;
        
        Item ar15 = new Item();
        ar15.setDescription("AR-15");
        ar15.setRequiredAmount(0);
        ar15.setQuantityInStock();
        ar15.setStrength();
        item[6] = ar15;
        
        Item bazooka = new Item();
        bazooka.setDescription("Bazooka");
        bazooka.setRequiredAmount(0);
        bazooka.setQuantityInStock();
        bazooka.setStrength();
        item[7] = bazooka;
        
        Item crossbow = new Item();
        crossbow.setDescription("Cross Bow");
        crossbow.setRequiredAmount(0);
        crossbow.setQuantityInStock();
        crossbow.setStrength();
        item[8] = crossbow;
        
        Item katana = new Item();
        katana.setDescription("Katana");
        katana.setRequiredAmount(0);
        katana.setQuantityInStock();
        katana.setStrength();
        item[9] = katana;
        
        Item nunchucks = new Item();
        nunchucks.setDescription("Nunchucks");
        nunchucks.setRequiredAmount(0);
        nunchucks.setQuantityInStock();
        nunchucks.setStrength();
        item[10] = nunchucks;
        
        Item bowstaff = new Item();
        bowstaff.setDescription("Bowstaff");
        bowstaff.setRequiredAmount(0);
        bowstaff.setQuantityInStock();
        bowstaff.setStrength();
        item[11] = bowstaff;
        
        Item throwingStars = new Item();
        throwingStars.setDescription("Throwing Stars");
        throwingStars.setRequiredAmount(0);
        throwingStars.setQuantityInStock();
        throwingStars.setStrength();
        item[12] = throwingStars;
        
        Item baseballBat = new Item();
        baseballBat.setDescription("Baseball Bat");
        baseballBat.setRequiredAmount(0);
        baseballBat.setQuantityInStock();
        baseballBat.setStrength();
        item[13] = baseballBat;
                
        Item dumbbells = new Item();
        dumbbells.setDescription("Dumbbells");
        dumbbells.setRequiredAmount(0);
        dumbbells.setQuantityInStock();
        dumbbells.setStrength();
        item[14] = dumbbells;
        
        Item dumbbells = new Item();
        dumbbells.setDescription("Dumbbells");
        dumbbells.setRequiredAmount(0);
        dumbbells.setQuantityInStock();
        dumbbells.setStrength();
        item[15] = dumbbells;
        
        Item dumbbells = new Item();
        dumbbells.setDescription("Dumbbells");
        dumbbells.setRequiredAmount(0);
        dumbbells.setQuantityInStock();
        dumbbells.setStrength();
        item[16] = dumbbells;
        
        Item dumbbells = new Item();
        dumbbells.setDescription("Dumbbells");
        dumbbells.setRequiredAmount(0);
        dumbbells.setQuantityInStock();
        dumbbells.setStrength();
        item[17] = dumbbells;
        
        Item dumbbells = new Item();
        dumbbells.setDescription("Dumbbells");
        dumbbells.setRequiredAmount(0);
        dumbbells.setQuantityInStock();
        dumbbells.setStrength();
        item[18] = dumbbells;
        
        Item dumbbells = new Item();
        dumbbells.setDescription("Dumbbells");
        dumbbells.setRequiredAmount(0);
        dumbbells.setQuantityInStock();
        dumbbells.setStrength();
        item[19] = dumbbells;
        

        Sporting Goods Store:
            Baseball Bat
            Dumbbells
            Golf Club
        Library:
            Ancient Spell Book
            Library Card
            Tax forms
        Church
            Holy Water
            Sacramental Wine
            Altar Boy Vestments
        Hospital
            Used needles
            Medicine
            Fresh Organs
        School:
            Textbook
            Report Card
        Bank:
            Bag of money
            Dye pack
            Loan application
        Comic Book Store:
            Dungeons & Dragons Book
            Superman Comic
            Bat Girl Figurine
        Car Repair Shop:
            Oil Can
            Tire Iron
        Army Base:
            Nerve Gas
            Army Uniform
            Arbams Tank
        Post Office:
            Book of Stamps
            Mail
        Fireworks Stand:
            Sparklers
            M-80
            Bottle Rockets
        Pet Store:
            Chinchilla
            Catnip
            Cobra
        Marina:
            Anchor
            Can of worms
        Home Improvement Store:
            Nail Gun
            Chainsaw
            Axe
            Nails
        Police Station:
            Cop Uniform
            Handcuffs
            Mug Shot
        Zoo:
            Giraffe
        Natural History Museum:
            TRex
            Mystical Egyptian Sceptor
            Catapult
        Cemetery:
            Headstone
            Corpse
            Grieving Widow
        Volcano:
            Bucket of Lava
        Pizza Parlor
            Pizza
            Pizza Cutter
    }
}
