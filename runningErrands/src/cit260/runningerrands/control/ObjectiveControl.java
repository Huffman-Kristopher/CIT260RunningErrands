/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;
import cit260.runningerands.view.WinGameMenu;
import cit260.runningerrands.control.ItemControl.Items;
import cit260.runningerrands.model.Item;
import cit260.runningerrands.model.Objective;
import cit260.runningerrands.model.Scene;
import runningerrands.RunningErrands;
/**
 *
 * @author Kristopher Huffman and Kirk Brown
 */
public class ObjectiveControl {

    public enum Objectives {
        
        returnAncientBookofSpells,
        returnLoanApplication,
        returnGrievingWidow,
        returnGiraffe,
        returnAbramsTank,
        returnAr15,
        returnSacramentalWine,
        returnTaxForms,
        returnFreshOrgans,
        returnBucketOfLava,
        returnMysticalEgyptianSceptor,
        returnReportCard,
        returnKatana,
        returnDonuts,
        returnVideoGame
        
    }
    
    public static Objective[] createObjectiveList() {
        
        Objective[] objective = new Objective[15];
        Scene[] scene = RunningErrands.getScene();
        Item[] items = RunningErrands.getItems();
        
        Objective returnAncientBookofSpells = new Objective();
        returnAncientBookofSpells.setObjectiveItem(items[Items.ancientBookofSpells.ordinal()]);
        returnAncientBookofSpells.setObjectiveQtyRequired(1);
        returnAncientBookofSpells.setObjectiveCompleteText("Congratulations! You returned the Ancient Book of Spells. You have now completed this objective.");
        returnAncientBookofSpells.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnAncientBookofSpells.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnAncientBookofSpells.setObjectiveGiveItemText("Thanks for visiting the Amazing Store of Comics! You look like a nerd, here you can use this for your D&D parties or something. You have received an Ancient Book of Spells.");
        returnAncientBookofSpells.setObjectiveCompleteFlag(false);
        objective[Objectives.returnAncientBookofSpells.ordinal()] = returnAncientBookofSpells;
        
        Objective returnLoanApplication = new Objective();
        returnLoanApplication.setObjectiveItem(items[Items.loanApplication.ordinal()]);
        returnLoanApplication.setObjectiveQtyRequired(1);
        returnLoanApplication.setObjectiveCompleteText("Congratulations! You returned the loan application. You have now completed this objective.");
        returnLoanApplication.setObjectiveNotEnoughText("I'm sorry. You dont have a Loan application. Please go find one and return it to us!");
        returnLoanApplication.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, you don't need another application.");
        returnLoanApplication.setObjectiveGiveItemText("Thank you but you dont qualify for a loan. You're not the type we give money to. Here is an application for a secured loan.");
        returnLoanApplication.setObjectiveCompleteFlag(false);
        objective[Objectives.returnLoanApplication.ordinal()] = returnLoanApplication;
        
        Objective returnGrievingWidow = new Objective();
        returnGrievingWidow.setObjectiveItem(items[Items.grievingWidow.ordinal()]);
        returnGrievingWidow.setObjectiveQtyRequired(1);
        returnGrievingWidow.setObjectiveCompleteText("Congratulations! You returned the grieving widow. You have now completed this objective.");
        returnGrievingWidow.setObjectiveNotEnoughText("I'm sorry. Look for the Grieving Widow. Please go find her and return her to us!");
        returnGrievingWidow.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, There are no more griving widows here.");
        returnGrievingWidow.setObjectiveGiveItemText("Please! Take this grieving widow away! Get her out of here, she is bringing everyone down.");
        returnGrievingWidow.setObjectiveCompleteFlag(false);
        objective[Objectives.returnGrievingWidow.ordinal()] = returnGrievingWidow;
        
        Objective returnGiraffe = new Objective();
        returnGiraffe.setObjectiveItem(items[Items.giraffe.ordinal()]);
        returnGiraffe.setObjectiveQtyRequired(1);
        returnGiraffe.setObjectiveCompleteText("Congratulations! You returned the giraffe. You have now completed this objective.");
        returnGiraffe.setObjectiveNotEnoughText("I'm sorry. We want a giraffe and you dont have one!");
        returnGiraffe.setObjectiveAlreadyHaveItemsText("Welcome back! Uhhh we dont have any more giraffes you took our only one.");
        returnGiraffe.setObjectiveGiveItemText("Here's a giraffe. Its all I have right now.");
        returnGiraffe.setObjectiveCompleteFlag(false);
        objective[Objectives.returnGiraffe.ordinal()] = returnGiraffe;
        
        Objective returnAbramsTank = new Objective();
        returnAbramsTank.setObjectiveItem(items[Items.abramsTank.ordinal()]);
        returnAbramsTank.setObjectiveQtyRequired(1);
        returnAbramsTank.setObjectiveCompleteText("Congratulations! You returned the Abrams Tank. You have now completed this objective.");
        returnAbramsTank.setObjectiveNotEnoughText("I'm sorry. I want an Abrams Tank. Please go find one and return it to us!");
        returnAbramsTank.setObjectiveAlreadyHaveItemsText("Welcome back! That was the last tank we had. So get lost bub.");
        returnAbramsTank.setObjectiveGiveItemText("Hmm. We want to give you something, but what do we have? Oh, you can take that Abrams tank. We don't need it.");
        returnAbramsTank.setObjectiveCompleteFlag(false);
        objective[Objectives.returnAbramsTank.ordinal()] = returnAbramsTank;
        
        Objective returnAr15 = new Objective();
        returnAr15.setObjectiveItem(items[Items.ar15.ordinal()]);
        returnAr15.setObjectiveQtyRequired(1);
        returnAr15.setObjectiveCompleteText("Congratulations! You returned the AR-15. You have now completed this objective.");
        returnAr15.setObjectiveNotEnoughText("I'm sorry. You dont have the AR-15 we are looking for!");
        returnAr15.setObjectiveAlreadyHaveItemsText("Welcome back! We dont have anymore, OUT, O. U. T. out, so get outta here.");
        returnAr15.setObjectiveGiveItemText("Here is a shiney new AR-15, fully automatic and with all the accessories you can hold! And it only weights 124 lbs.");
        returnAr15.setObjectiveCompleteFlag(false);
        objective[Objectives.returnAr15.ordinal()] = returnAr15;
        
        Objective returnSacramentalWine = new Objective();
        returnSacramentalWine.setObjectiveItem(items[Items.sacramentalWine.ordinal()]);
        returnSacramentalWine.setObjectiveQtyRequired(1);
        returnSacramentalWine.setObjectiveCompleteText("Congratulations! You returned the sacramental wine. You have now completed this objective.");
        returnSacramentalWine.setObjectiveNotEnoughText("I'm sorry. We need wine for... Sacrament. Yeah, that's what we need it for. You don't have it so find some!");
        returnSacramentalWine.setObjectiveAlreadyHaveItemsText("You're not a drunkard are you, I see you already have the wine.");
        returnSacramentalWine.setObjectiveGiveItemText("Here is the sacred wine of long fermentation and blessings of inebriation," + "\n prepared for its strength in fortitude with slight notes of strawberry and mint.");
        returnSacramentalWine.setObjectiveCompleteFlag(false);
        objective[Objectives.returnSacramentalWine.ordinal()] = returnSacramentalWine;
        
        Objective returnTaxForms = new Objective();
        returnTaxForms.setObjectiveItem(items[Items.taxForms.ordinal()]);
        returnTaxForms.setObjectiveQtyRequired(1);
        returnTaxForms.setObjectiveCompleteText("Congratulations! You returned the tax forms. You have now completed this objective.");
        returnTaxForms.setObjectiveNotEnoughText("I'm sorry. We need your papers, tax papers that is!");
        returnTaxForms.setObjectiveAlreadyHaveItemsText("You can only get one set of tax forms. Fill them out and turn them in.");
        returnTaxForms.setObjectiveGiveItemText("Take this... Tax forms, all that money you worked so hard for is about to disapear.");
        returnTaxForms.setObjectiveCompleteFlag(false);
        objective[Objectives.returnTaxForms.ordinal()] = returnTaxForms;
        
        Objective returnFreshOrgans = new Objective();
        returnFreshOrgans.setObjectiveItem(items[Items.freshOrgans.ordinal()]);
        returnFreshOrgans.setObjectiveQtyRequired(1);
        returnFreshOrgans.setObjectiveCompleteText("Congratulations! You returned the fresh organs. You have now completed this objective.");
        returnFreshOrgans.setObjectiveNotEnoughText("We need organs, and unless we can have yours you need to find us some!");
        returnFreshOrgans.setObjectiveAlreadyHaveItemsText("You have already harvested as much as you can for here. Organs dont really regrow.");
        returnFreshOrgans.setObjectiveGiveItemText("Here. Have some fresh organs. Now we can have our organ balloon animal party... I mean help people by giving them transplants.");
        returnFreshOrgans.setObjectiveCompleteFlag(false);
        objective[Objectives.returnFreshOrgans.ordinal()] = returnFreshOrgans;
        
        Objective returnBucketOfLava = new Objective();
        returnBucketOfLava.setObjectiveItem(items[Items.bucketOfLava.ordinal()]);
        returnBucketOfLava.setObjectiveQtyRequired(1);
        returnBucketOfLava.setObjectiveCompleteText("Congratulations! You returned the bucket of lava. You have now completed this objective.");
        returnBucketOfLava.setObjectiveNotEnoughText("I said a bucket of Lava!");
        returnBucketOfLava.setObjectiveAlreadyHaveItemsText("Buckets of Lava are really hard to come by, I think you have more than enough.");
        returnBucketOfLava.setObjectiveGiveItemText("Why don't you take this bucket of lava? Be careful though, I'm not sure how it's not melting the bucket.");
        returnBucketOfLava.setObjectiveCompleteFlag(false);
        objective[Objectives.returnBucketOfLava.ordinal()] = returnBucketOfLava;
        
        Objective returnMysticalEgyptianSceptor = new Objective();
        returnMysticalEgyptianSceptor.setObjectiveItem(items[Items.mysticalEgyptianSceptor.ordinal()]);
        returnMysticalEgyptianSceptor.setObjectiveQtyRequired(1);
        returnMysticalEgyptianSceptor.setObjectiveCompleteText("Congratulations! You returned the mystical Egyptian sceptor. You have now completed this objective.");
        returnMysticalEgyptianSceptor.setObjectiveNotEnoughText("The curse cannot be done or undone with out the scepter!");
        returnMysticalEgyptianSceptor.setObjectiveAlreadyHaveItemsText("There was only one of these made, and you have it.");
        returnMysticalEgyptianSceptor.setObjectiveGiveItemText("You feel a slight tingling in your hand as you take the mystical Egyption scepter you find laying on the ground" + "\n and a voice whispers to your mind now you are mine.");
        returnMysticalEgyptianSceptor.setObjectiveCompleteFlag(false);
        objective[Objectives.returnMysticalEgyptianSceptor.ordinal()] = returnMysticalEgyptianSceptor;
        
        Objective returnReportCard = new Objective();
        returnReportCard.setObjectiveItem(items[Items.reportCard.ordinal()]);
        returnReportCard.setObjectiveQtyRequired(1);
        returnReportCard.setObjectiveCompleteText("Congratulations! You returned the report card. You have now completed this objective.");
        returnReportCard.setObjectiveNotEnoughText("We want to see your grades!");
        returnReportCard.setObjectiveAlreadyHaveItemsText("You only get one copy over your report card.");
        returnReportCard.setObjectiveGiveItemText("Here's your report card. Your grades aren't as good as you made them sound.");
        returnReportCard.setObjectiveCompleteFlag(false);
        objective[Objectives.returnReportCard.ordinal()] = returnReportCard;
        
        Objective returnKatana = new Objective();
        returnKatana.setObjectiveItem(items[Items.katana.ordinal()]);
        returnKatana.setObjectiveQtyRequired(1);
        returnKatana.setObjectiveCompleteText("Congratulations! You returned the katana. You have now completed this objective.");
        returnKatana.setObjectiveNotEnoughText("Are you a ninja? I dont think so, real ninjas use katanas!");
        returnKatana.setObjectiveAlreadyHaveItemsText("There can be only one... Katana that is.");
        returnKatana.setObjectiveGiveItemText("This was once pulled from a stone by the Samurai Keanu Reaves" + "\n in ancient Brazil to fight rabid chickens. Chicken killer is now yours.");
        returnKatana.setObjectiveCompleteFlag(false);
        objective[Objectives.returnKatana.ordinal()] = returnKatana;
        
        Objective returnDonuts = new Objective();
        returnDonuts.setObjectiveItem(items[Items.donuts.ordinal()]);
        returnDonuts.setObjectiveQtyRequired(1);
        returnDonuts.setObjectiveCompleteText("Congratulations! You returned the donuts. You have now completed this objective.");
        returnDonuts.setObjectiveNotEnoughText("So help me if you dont have donuts! Go get some unless your ready to face your maker.");
        returnDonuts.setObjectiveAlreadyHaveItemsText("You got the last of the donuts already.");
        returnDonuts.setObjectiveGiveItemText("Perfect, slightly crisp with soft fluffy centers, covered in rich, smooth chocolate. The donut of perfection is yours.");
        returnDonuts.setObjectiveCompleteFlag(false);
        objective[Objectives.returnDonuts.ordinal()] = returnDonuts;
        
        Objective returnVideoGame = new Objective();
        returnVideoGame.setObjectiveItem(items[Items.videoGame.ordinal()]);
        returnVideoGame.setObjectiveQtyRequired(1);
        returnVideoGame.setObjectiveCompleteText("Congratulations! You returned the Running Errands video game. You have now completed this objective.");
        returnVideoGame.setObjectiveNotEnoughText("Running Errands the game has released and you didnt get it on the first day it came out! Go get it!");
        returnVideoGame.setObjectiveAlreadyHaveItemsText("There is so much demand you can only have one copy of the Running Errands video game.");
        returnVideoGame.setObjectiveGiveItemText("You have received the collectors edition Running Errands the game. The package includes a poster of bucket of lava and grieving widow.");
        returnVideoGame.setObjectiveCompleteFlag(false);
        objective[Objectives.returnVideoGame.ordinal()] = returnVideoGame;
        
        RunningErrands.setObjective(objective);
        
        return objective;
    }
    
    public static Objective[] resetObjectiveCompletedTodayFlag() {
        
        Objective[] objective = RunningErrands.getObjective();
        
        objective[0].setObjectiveCompletedTodayFlag(false);
        objective[1].setObjectiveCompletedTodayFlag(false);
        objective[2].setObjectiveCompletedTodayFlag(false);
        objective[3].setObjectiveCompletedTodayFlag(false);
        objective[4].setObjectiveCompletedTodayFlag(false);
        objective[5].setObjectiveCompletedTodayFlag(false);
        objective[6].setObjectiveCompletedTodayFlag(false);
        objective[7].setObjectiveCompletedTodayFlag(false);
        objective[8].setObjectiveCompletedTodayFlag(false);
        objective[9].setObjectiveCompletedTodayFlag(false);
        objective[10].setObjectiveCompletedTodayFlag(false);
        objective[11].setObjectiveCompletedTodayFlag(false);
        objective[12].setObjectiveCompletedTodayFlag(false);
        objective[13].setObjectiveCompletedTodayFlag(false);
        objective[14].setObjectiveCompletedTodayFlag(false);
        return objective;
    }
    
    public static int countObjectivcesCompleted() {
        
        Objective[] objectives = RunningErrands.getObjective();
        int objectivesCompleted = 0;
        for (Objective objective : objectives) {
            if (objective.isObjectiveCompleteFlag()) {
                objectivesCompleted = objectivesCompleted + 1;
            }
            else {
                objectivesCompleted = objectivesCompleted;
            }
            
        }
        return objectivesCompleted;
        
    }
    
    public static int countTotalObjectivces() {
        
        Objective[] objectives = RunningErrands.getObjective();
        int totalObjectives = 0;
        for (Objective objective : objectives) {
            
                totalObjectives = totalObjectives + 1;
            
            }
        
        return totalObjectives;
        
    }    
    
    public static String checkObjectiveCompletedToday() {
        
        Objective[] objectives = RunningErrands.getObjective();
        String objectiveCompleted = "No objectives completed today.";
        for (Objective objective : objectives) {
            if (objective.isObjectiveCompletedTodayFlag()) {
                objectiveCompleted = objective.getObjectiveCompleteText();
            }
            else {
                objectiveCompleted = objectiveCompleted;
            }
            
        }
        return objectiveCompleted;
}
    
    
    public static boolean markObjectiveComplete (Objective objective) {
    
        objective.setObjectiveCompleteFlag(true);
        objective.setObjectiveCompletedTodayFlag(true);
        return true;
    }
    
    public static boolean checkWinCondition() {
        
        int totalObjectives = ObjectiveControl.countTotalObjectivces();
        int objectivesCompleted = countObjectivcesCompleted();
        if (objectivesCompleted == totalObjectives) {
            WinGameMenu winGameMenu = new WinGameMenu();
            winGameMenu.display();
            return true;
        }
        else {
            return false;
        }
    }
    
}

