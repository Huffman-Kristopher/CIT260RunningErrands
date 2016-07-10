/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;
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
        returnAncientBookofSpells.setObjectiveCompleteText("Congratulations! You returned the Ancient Spell Book. You have now completed this objective");
        returnAncientBookofSpells.setObjectiveCompleteFlag(false);
        objective[Objectives.returnAncientBookofSpells.ordinal()] = returnAncientBookofSpells;
        
        Objective returnLoanApplication = new Objective();
        returnLoanApplication.setObjectiveItem(items[Items.loanApplication.ordinal()]);
        returnLoanApplication.setObjectiveQtyRequired(1);
        returnLoanApplication.setObjectiveCompleteText("Congratulations! You returned the loanApplication. You have now completed this objective");
        returnLoanApplication.setObjectiveCompleteFlag(false);
        objective[Objectives.returnLoanApplication.ordinal()] = returnLoanApplication;
        
        Objective returnGrievingWidow = new Objective();
        returnGrievingWidow.setObjectiveItem(items[Items.grievingWidow.ordinal()]);
        returnGrievingWidow.setObjectiveQtyRequired(1);
        returnGrievingWidow.setObjectiveCompleteText("Congratulations! You returned the grievingWidow. You have now completed this objective");
        returnGrievingWidow.setObjectiveCompleteFlag(false);
        objective[Objectives.returnGrievingWidow.ordinal()] = returnGrievingWidow;
        
        Objective returnGiraffe = new Objective();
        returnGiraffe.setObjectiveItem(items[Items.giraffe.ordinal()]);
        returnGiraffe.setObjectiveQtyRequired(1);
        returnGiraffe.setObjectiveCompleteText("Congratulations! You returned the giraffe. You have now completed this objective");
        returnGiraffe.setObjectiveCompleteFlag(false);
        objective[Objectives.returnGiraffe.ordinal()] = returnGiraffe;
        
        Objective returnAbramsTank = new Objective();
        returnAbramsTank.setObjectiveItem(items[Items.abramsTank.ordinal()]);
        returnAbramsTank.setObjectiveQtyRequired(1);
        returnAbramsTank.setObjectiveCompleteText("Congratulations! You returned the abramsTank. You have now completed this objective");
        returnAbramsTank.setObjectiveCompleteFlag(false);
        objective[Objectives.returnAbramsTank.ordinal()] = returnAbramsTank;
        
        Objective returnAr15 = new Objective();
        returnAr15.setObjectiveItem(items[Items.ar15.ordinal()]);
        returnAr15.setObjectiveQtyRequired(1);
        returnAr15.setObjectiveCompleteText("Congratulations! You returned the ar15. You have now completed this objective");
        returnAr15.setObjectiveCompleteFlag(false);
        objective[Objectives.returnAr15.ordinal()] = returnAr15;
        
        Objective returnSacramentalWine = new Objective();
        returnSacramentalWine.setObjectiveItem(items[Items.sacramentalWine.ordinal()]);
        returnSacramentalWine.setObjectiveQtyRequired(1);
        returnSacramentalWine.setObjectiveCompleteText("Congratulations! You returned the sacramentalWine. You have now completed this objective");
        returnSacramentalWine.setObjectiveCompleteFlag(false);
        objective[Objectives.returnSacramentalWine.ordinal()] = returnSacramentalWine;
        
        Objective returnTaxForms = new Objective();
        returnTaxForms.setObjectiveItem(items[Items.taxForms.ordinal()]);
        returnTaxForms.setObjectiveQtyRequired(1);
        returnTaxForms.setObjectiveCompleteText("Congratulations! You returned the taxForms. You have now completed this objective");
        returnTaxForms.setObjectiveCompleteFlag(false);
        objective[Objectives.returnTaxForms.ordinal()] = returnTaxForms;
        
        Objective returnFreshOrgans = new Objective();
        returnFreshOrgans.setObjectiveItem(items[Items.freshOrgans.ordinal()]);
        returnFreshOrgans.setObjectiveQtyRequired(1);
        returnFreshOrgans.setObjectiveCompleteText("Congratulations! You returned the freshOrgans. You have now completed this objective");
        returnFreshOrgans.setObjectiveCompleteFlag(false);
        objective[Objectives.returnFreshOrgans.ordinal()] = returnFreshOrgans;
        
        Objective returnBucketOfLava = new Objective();
        returnBucketOfLava.setObjectiveItem(items[Items.bucketOfLava.ordinal()]);
        returnBucketOfLava.setObjectiveQtyRequired(1);
        returnBucketOfLava.setObjectiveCompleteText("Congratulations! You returned the bucketOfLava. You have now completed this objective");
        returnBucketOfLava.setObjectiveCompleteFlag(false);
        objective[Objectives.returnBucketOfLava.ordinal()] = returnBucketOfLava;
        
        Objective returnMysticalEgyptianSceptor = new Objective();
        returnMysticalEgyptianSceptor.setObjectiveItem(items[Items.mysticalEgyptianSceptor.ordinal()]);
        returnMysticalEgyptianSceptor.setObjectiveQtyRequired(1);
        returnMysticalEgyptianSceptor.setObjectiveCompleteText("Congratulations! You returned the mysticalEgyptianSceptor. You have now completed this objective");
        returnMysticalEgyptianSceptor.setObjectiveCompleteFlag(false);
        objective[Objectives.returnMysticalEgyptianSceptor.ordinal()] = returnMysticalEgyptianSceptor;
        
        Objective returnReportCard = new Objective();
        returnReportCard.setObjectiveItem(items[Items.reportCard.ordinal()]);
        returnReportCard.setObjectiveQtyRequired(1);
        returnReportCard.setObjectiveCompleteText("Congratulations! You returned the reportCard. You have now completed this objective");
        returnReportCard.setObjectiveCompleteFlag(false);
        objective[Objectives.returnReportCard.ordinal()] = returnReportCard;
        
        Objective returnKatana = new Objective();
        returnKatana.setObjectiveItem(items[Items.katana.ordinal()]);
        returnKatana.setObjectiveQtyRequired(1);
        returnKatana.setObjectiveCompleteText("Congratulations! You returned the katana. You have now completed this objective");
        returnKatana.setObjectiveCompleteFlag(false);
        objective[Objectives.returnKatana.ordinal()] = returnKatana;
        
        Objective returnDonuts = new Objective();
        returnDonuts.setObjectiveItem(items[Items.donuts.ordinal()]);
        returnDonuts.setObjectiveQtyRequired(1);
        returnDonuts.setObjectiveCompleteText("Congratulations! You returned the donuts. You have now completed this objective");
        returnDonuts.setObjectiveCompleteFlag(false);
        objective[Objectives.returnDonuts.ordinal()] = returnDonuts;
        
        Objective returnVideoGame = new Objective();
        returnVideoGame.setObjectiveItem(items[Items.videoGame.ordinal()]);
        returnVideoGame.setObjectiveQtyRequired(1);
        returnVideoGame.setObjectiveCompleteText("Congratulations! You returned the videoGame. You have now completed this objective");
        returnVideoGame.setObjectiveCompleteFlag(false);
        objective[Objectives.returnVideoGame.ordinal()] = returnVideoGame;
        
        RunningErrands.setObjective(objective);
        
        return objective;
    }
    
    public static boolean markObjectiveComplete (Objective objective) {
    
        objective.setObjectiveCompleteFlag(true);
        return true;
    }
    
}

