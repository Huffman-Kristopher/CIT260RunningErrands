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
        returnAncientBookofSpells.setObjectiveCompleteText("Congratulations! You returned the Ancient Book of Spells. You have now completed this objective");
        returnAncientBookofSpells.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnAncientBookofSpells.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnAncientBookofSpells.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnAncientBookofSpells.setObjectiveCompleteFlag(false);
        objective[Objectives.returnAncientBookofSpells.ordinal()] = returnAncientBookofSpells;
        
        Objective returnLoanApplication = new Objective();
        returnLoanApplication.setObjectiveItem(items[Items.loanApplication.ordinal()]);
        returnLoanApplication.setObjectiveQtyRequired(1);
        returnLoanApplication.setObjectiveCompleteText("Congratulations! You returned the loanApplication. You have now completed this objective");
        returnLoanApplication.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnLoanApplication.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnLoanApplication.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnLoanApplication.setObjectiveCompleteFlag(false);
        objective[Objectives.returnLoanApplication.ordinal()] = returnLoanApplication;
        
        Objective returnGrievingWidow = new Objective();
        returnGrievingWidow.setObjectiveItem(items[Items.grievingWidow.ordinal()]);
        returnGrievingWidow.setObjectiveQtyRequired(1);
        returnGrievingWidow.setObjectiveCompleteText("Congratulations! You returned the grievingWidow. You have now completed this objective");
        returnGrievingWidow.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnGrievingWidow.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnGrievingWidow.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnGrievingWidow.setObjectiveCompleteFlag(false);
        objective[Objectives.returnGrievingWidow.ordinal()] = returnGrievingWidow;
        
        Objective returnGiraffe = new Objective();
        returnGiraffe.setObjectiveItem(items[Items.giraffe.ordinal()]);
        returnGiraffe.setObjectiveQtyRequired(1);
        returnGiraffe.setObjectiveCompleteText("Congratulations! You returned the giraffe. You have now completed this objective");
        returnGiraffe.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnGiraffe.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnGiraffe.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnGiraffe.setObjectiveCompleteFlag(false);
        objective[Objectives.returnGiraffe.ordinal()] = returnGiraffe;
        
        Objective returnAbramsTank = new Objective();
        returnAbramsTank.setObjectiveItem(items[Items.abramsTank.ordinal()]);
        returnAbramsTank.setObjectiveQtyRequired(1);
        returnAbramsTank.setObjectiveCompleteText("Congratulations! You returned the abramsTank. You have now completed this objective");
        returnAbramsTank.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnAbramsTank.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnAbramsTank.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnAbramsTank.setObjectiveCompleteFlag(false);
        objective[Objectives.returnAbramsTank.ordinal()] = returnAbramsTank;
        
        Objective returnAr15 = new Objective();
        returnAr15.setObjectiveItem(items[Items.ar15.ordinal()]);
        returnAr15.setObjectiveQtyRequired(1);
        returnAr15.setObjectiveCompleteText("Congratulations! You returned the ar15. You have now completed this objective");
        returnAncientBookofSpells.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnAncientBookofSpells.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnAncientBookofSpells.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnAr15.setObjectiveCompleteFlag(false);
        objective[Objectives.returnAr15.ordinal()] = returnAr15;
        
        Objective returnSacramentalWine = new Objective();
        returnSacramentalWine.setObjectiveItem(items[Items.sacramentalWine.ordinal()]);
        returnSacramentalWine.setObjectiveQtyRequired(1);
        returnSacramentalWine.setObjectiveCompleteText("Congratulations! You returned the sacramentalWine. You have now completed this objective");
        returnSacramentalWine.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnSacramentalWine.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnSacramentalWine.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnSacramentalWine.setObjectiveCompleteFlag(false);
        objective[Objectives.returnSacramentalWine.ordinal()] = returnSacramentalWine;
        
        Objective returnTaxForms = new Objective();
        returnTaxForms.setObjectiveItem(items[Items.taxForms.ordinal()]);
        returnTaxForms.setObjectiveQtyRequired(1);
        returnTaxForms.setObjectiveCompleteText("Congratulations! You returned the taxForms. You have now completed this objective");
        returnTaxForms.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnTaxForms.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnTaxForms.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnTaxForms.setObjectiveCompleteFlag(false);
        objective[Objectives.returnTaxForms.ordinal()] = returnTaxForms;
        
        Objective returnFreshOrgans = new Objective();
        returnFreshOrgans.setObjectiveItem(items[Items.freshOrgans.ordinal()]);
        returnFreshOrgans.setObjectiveQtyRequired(1);
        returnFreshOrgans.setObjectiveCompleteText("Congratulations! You returned the freshOrgans. You have now completed this objective");
        returnFreshOrgans.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnFreshOrgans.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnFreshOrgans.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnFreshOrgans.setObjectiveCompleteFlag(false);
        objective[Objectives.returnFreshOrgans.ordinal()] = returnFreshOrgans;
        
        Objective returnBucketOfLava = new Objective();
        returnBucketOfLava.setObjectiveItem(items[Items.bucketOfLava.ordinal()]);
        returnBucketOfLava.setObjectiveQtyRequired(1);
        returnBucketOfLava.setObjectiveCompleteText("Congratulations! You returned the bucketOfLava. You have now completed this objective");
        returnBucketOfLava.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnBucketOfLava.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnBucketOfLava.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnBucketOfLava.setObjectiveCompleteFlag(false);
        objective[Objectives.returnBucketOfLava.ordinal()] = returnBucketOfLava;
        
        Objective returnMysticalEgyptianSceptor = new Objective();
        returnMysticalEgyptianSceptor.setObjectiveItem(items[Items.mysticalEgyptianSceptor.ordinal()]);
        returnMysticalEgyptianSceptor.setObjectiveQtyRequired(1);
        returnMysticalEgyptianSceptor.setObjectiveCompleteText("Congratulations! You returned the mysticalEgyptianSceptor. You have now completed this objective");
        returnMysticalEgyptianSceptor.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnMysticalEgyptianSceptor.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnMysticalEgyptianSceptor.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnMysticalEgyptianSceptor.setObjectiveCompleteFlag(false);
        objective[Objectives.returnMysticalEgyptianSceptor.ordinal()] = returnMysticalEgyptianSceptor;
        
        Objective returnReportCard = new Objective();
        returnReportCard.setObjectiveItem(items[Items.reportCard.ordinal()]);
        returnReportCard.setObjectiveQtyRequired(1);
        returnReportCard.setObjectiveCompleteText("Congratulations! You returned the reportCard. You have now completed this objective");
        returnReportCard.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnReportCard.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnReportCard.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnReportCard.setObjectiveCompleteFlag(false);
        objective[Objectives.returnReportCard.ordinal()] = returnReportCard;
        
        Objective returnKatana = new Objective();
        returnKatana.setObjectiveItem(items[Items.katana.ordinal()]);
        returnKatana.setObjectiveQtyRequired(1);
        returnKatana.setObjectiveCompleteText("Congratulations! You returned the katana. You have now completed this objective");
        returnKatana.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnKatana.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnKatana.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnKatana.setObjectiveCompleteFlag(false);
        objective[Objectives.returnKatana.ordinal()] = returnKatana;
        
        Objective returnDonuts = new Objective();
        returnDonuts.setObjectiveItem(items[Items.donuts.ordinal()]);
        returnDonuts.setObjectiveQtyRequired(1);
        returnDonuts.setObjectiveCompleteText("Congratulations! You returned the donuts. You have now completed this objective");
        returnDonuts.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnDonuts.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnDonuts.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
        returnDonuts.setObjectiveCompleteFlag(false);
        objective[Objectives.returnDonuts.ordinal()] = returnDonuts;
        
        Objective returnVideoGame = new Objective();
        returnVideoGame.setObjectiveItem(items[Items.videoGame.ordinal()]);
        returnVideoGame.setObjectiveQtyRequired(1);
        returnVideoGame.setObjectiveCompleteText("Congratulations! You returned the videoGame. You have now completed this objective");
        returnVideoGame.setObjectiveNotEnoughText("I'm sorry. You do not have an Ancient Book of Spells. Please go find one and return it to us!");
        returnVideoGame.setObjectiveAlreadyHaveItemsText("Welcome back! Unfortunately, I do not have any more Ancient Books of Spells to give you.");
        returnVideoGame.setObjectiveGiveItemText("Thank you for visiting the Amazing Store of Comics! Why don't you take this Anceint Book of Spells? It really doesn't fit in our normal genre.");
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
            if (objective.isObjectiveCompletedTodayFlag()) {
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

