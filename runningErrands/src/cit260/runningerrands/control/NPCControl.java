/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Npc;

/**
 *
 *  @author Kristopher Huffman And Kirk Brown
 */
public class NPCControl {
    
    public enum NPCList {
    
        shopkeeper
        ,librarian
        ,priest
        ,orphan
        ,receptionist
        ,officer
        ,principal
        ,bankTeller
        ,ninja
        ,soldier
        ,pirate
        ,giraffe
        ,docent
        ,ghost
        ,joe
        ,marinaMike
        ,guru
        ,nikolai
        ,plagueMonkey
        ,sergy;
        
    }
    
        public static Npc[] createNPCList() {
        
        Npc[] npcs = new Npc[20];
        
        Npc shopkeeper = new Npc();
        shopkeeper.setNpcName("Shopkeeper");
        shopkeeper.setNpcDescription("He manages the store");
        shopkeeper.setNpcHealth(100);
        shopkeeper.setNpcStrength(100);
        npcs[NPCList.shopkeeper.ordinal()] = shopkeeper;
        
        Npc librarian = new Npc();
        librarian.setNpcName("Librarian");
        librarian.setNpcDescription("She runs the Library");
        librarian.setNpcHealth(100);
        librarian.setNpcStrength(100);
        npcs[NPCList.librarian.ordinal()] = librarian;
        
        Npc priest = new Npc();
        priest.setNpcName("Priest");
        priest.setNpcDescription("He preaches");
        priest.setNpcHealth(100);
        priest.setNpcStrength(100);
        npcs[NPCList.priest.ordinal()] = priest;
        
        Npc orphan = new Npc();
        orphan.setNpcName("Orphan");
        orphan.setNpcDescription("Has no one to love him");
        orphan.setNpcHealth(100);
        orphan.setNpcStrength(100);
        npcs[NPCList.orphan.ordinal()] = orphan;
        
        Npc receptionist = new Npc();
        receptionist.setNpcName("Receptionist");
        receptionist.setNpcDescription("Greets you as you enter");
        receptionist.setNpcHealth(100);
        receptionist.setNpcStrength(100);
        npcs[NPCList.receptionist.ordinal()] = receptionist;
        
        Npc officer = new Npc();
        officer.setNpcName("Officer");
        officer.setNpcDescription("He will taze you");
        officer.setNpcHealth(100);
        officer.setNpcStrength(100);
        npcs[NPCList.officer.ordinal()] = officer;
        
        Npc principal = new Npc();
        principal.setNpcName("Principal");
        principal.setNpcDescription("Runs the school");
        principal.setNpcHealth(100);
        principal.setNpcStrength(100);
        npcs[NPCList.principal.ordinal()] = principal;
        
        Npc bankTeller = new Npc();
        bankTeller.setNpcName("Bank Teller");
        bankTeller.setNpcDescription("Grants access to your money");
        bankTeller.setNpcHealth(100);
        bankTeller.setNpcStrength(100);
        npcs[NPCList.bankTeller.ordinal()] = bankTeller;
        
        Npc ninja = new Npc();
        ninja.setNpcName("Ninja");
        ninja.setNpcDescription("Can't find him");
        ninja.setNpcHealth(100);
        ninja.setNpcStrength(100);
        npcs[NPCList.ninja.ordinal()] = ninja;
        
        Npc soldier = new Npc();
        soldier.setNpcName("Soldier");
        soldier.setNpcDescription("Shoots...everything");
        soldier.setNpcHealth(100);
        soldier.setNpcStrength(100);
        npcs[NPCList.soldier.ordinal()] = soldier;
        
        Npc pirate = new Npc();
        pirate.setNpcName("Pirate");
        pirate.setNpcDescription("He manages the store");
        pirate.setNpcHealth(100);
        pirate.setNpcStrength(100);
        npcs[NPCList.pirate.ordinal()] = pirate;
        
        Npc giraffe = new Npc();
        giraffe.setNpcName("Giraffe");
        giraffe.setNpcDescription("Yell at him... His head is way up there");
        giraffe.setNpcHealth(100);
        giraffe.setNpcStrength(100);
        npcs[NPCList.giraffe.ordinal()] = giraffe;
        
        Npc docent = new Npc();
        docent.setNpcName("Docent");
        docent.setNpcDescription("Boring, but knows everything...");
        docent.setNpcHealth(100);
        docent.setNpcStrength(100);
        npcs[NPCList.docent.ordinal()] = docent;
        
        Npc ghost = new Npc();
        ghost.setNpcName("Ghost");
        ghost.setNpcDescription("Woooooooo");
        ghost.setNpcHealth(100);
        ghost.setNpcStrength(100);
        npcs[NPCList.ghost.ordinal()] = ghost;
        
        Npc joe = new Npc();
        joe.setNpcName("Joe");
        joe.setNpcDescription("It's him vs. the Volcano");
        joe.setNpcHealth(100);
        joe.setNpcStrength(100);
        npcs[NPCList.joe.ordinal()] = joe;
        
        Npc marinaMike = new Npc();
        marinaMike.setNpcName("Marina Mike");
        marinaMike.setNpcDescription("Runs the Marina");
        marinaMike.setNpcHealth(100);
        marinaMike.setNpcStrength(100);
        npcs[NPCList.marinaMike.ordinal()] = marinaMike;
        
        Npc guru = new Npc();
        guru.setNpcName("Guru");
        guru.setNpcDescription("He knows all");
        guru.setNpcHealth(100);
        guru.setNpcStrength(100);
        npcs[NPCList.guru.ordinal()] = guru;
        
        Npc nikolai = new Npc();
        nikolai.setNpcName("Nikolai");
        nikolai.setNpcDescription("Russian arms dealer");
        nikolai.setNpcHealth(100);
        nikolai.setNpcStrength(100);
        npcs[NPCList.nikolai.ordinal()] = nikolai;
        
        Npc plagueMonkey = new Npc();
        plagueMonkey.setNpcName("Plague Monkey");
        plagueMonkey.setNpcDescription("He manages the store");
        plagueMonkey.setNpcHealth(100);
        plagueMonkey.setNpcStrength(100);
        npcs[NPCList.plagueMonkey.ordinal()] = plagueMonkey;
        
        Npc sergy = new Npc();
        sergy.setNpcName("Sergy");
        sergy.setNpcDescription("Russian thug");
        sergy.setNpcHealth(100);
        sergy.setNpcStrength(100);
        npcs[NPCList.sergy.ordinal()] = sergy;
        
        return npcs;
        
    }
}
