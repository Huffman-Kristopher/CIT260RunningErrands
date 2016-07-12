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
        ,wizard
        ,priest
        ,orphan
        ,doctor
        ,officer
        ,principal
        ,babyFace
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
        ,sergy
        ,hanibal
        ,ceasar
        ,godfather
        ,jimbob
        ,adolf
        ,vlad
        ,khan
        ,nsync
        ,zeus
        ,dracula;
        
    }
    
        public static Npc[] createNPCList() {
        /** NPC health is always 100 on this list. If the value goes down in combat, it resets with the add new day function**/
        Npc[] npcs = new Npc[30];
        
        Npc shopkeeper = new Npc();
        shopkeeper.setNpcName("Jeebs");
        shopkeeper.setNpcDescription("Jeebs runs a small pawn shop full of jewelry, electronics, and collectibles. " 
                + "\nHowever, it's his \"special\" weapons for which he is known. He is waiting for "
                + "\nyou with his alien ray gun he calls a \"reverberating carbonizer\"." );
        shopkeeper.setNpcHealth(80);
        shopkeeper.setNpcStrength(300);
        npcs[NPCList.shopkeeper.ordinal()] = shopkeeper;
        
        Npc wizard = new Npc();
        wizard.setNpcName("Sauron");
        wizard.setNpcDescription("Sauron is a special one. He enjoys walking around in a suit of armor that looks " 
                + "\nlike Shredder got in a fight with a can opener. His all seeing eye would be a " 
                + "\nbit scarier if it's wasn't a lazy eye. He's excited to face you down with his " 
                + "\nsword and mace.");
        wizard.setNpcHealth(150);
        wizard.setNpcStrength(225);
        npcs[NPCList.wizard.ordinal()] = wizard;
        
        Npc priest = new Npc();
        priest.setNpcName("Sergius");
        priest.setNpcDescription("Sergius is a priest whose eye is on becoming Pope. No matter what it takes. " 
                + "\nRumor has it he is willing to commit any sin - including murder - to reach his " 
                + "\ngoal. He stands ready with his vial of Holy Water that many suspect is really " 
                + "\npoison.");
        priest.setNpcHealth(75);
        priest.setNpcStrength(90);
        npcs[NPCList.priest.ordinal()] = priest;
        
        Npc orphan = new Npc();
        orphan.setNpcName("Tom Riddle");
        orphan.setNpcDescription("Tom Riddle is a young man with massive goals of world domination. He considers " 
                + "\nhimself better than all other witches and wizards, and dabbles on the dark side " 
                + "\na bit. Kill him quickly, he's quick to return from the brink of death. Be " 
                + "\ncareful facing him - he's known to be ruthless with his wand.");
        orphan.setNpcHealth(200);
        orphan.setNpcStrength(150);
        npcs[NPCList.orphan.ordinal()] = orphan;
        
        Npc doctor = new Npc();
        doctor.setNpcName("Dr. K");
        doctor.setNpcDescription("Jack Kevorkian, a local doctor for the sick and weak, is known more for the " 
                + "\nnumber of his patients that have died than for the ones that lived. He is " 
                + "\nexperienced in killing and making it look like suicide. Watch out for his " 
                + "\nneedle and IV bag!");
        doctor.setNpcHealth(70);
        doctor.setNpcStrength(60);
        npcs[NPCList.doctor.ordinal()] = doctor;
        
        Npc officer = new Npc();
        officer.setNpcName("Martin Riggs");
        officer.setNpcDescription("Riggs, as he is known, is famous for his abnormal methods while investigating criminals. " 
                + "\nWind up on his suspect list and you're likely to face your maker sooner than a " 
                + "\njudge. He has many favorite weapons, but today you face his 9mm.");
        officer.setNpcHealth(100);
        officer.setNpcStrength(110);
        npcs[NPCList.officer.ordinal()] = officer;
        
        Npc principal = new Npc();
        principal.setNpcName("Snape");
        principal.setNpcDescription("Once merely an overlooked teacher, Professor Snape is now the top man at " 
                + "\nHogwarts. Although he's just as likely to run from danger, he is also known " 
                + "\nfor his wicked use of the dark arts in his spells.");
        principal.setNpcHealth(120);
        principal.setNpcStrength(90);
        npcs[NPCList.principal.ordinal()] = principal;
        
        Npc babyFace = new Npc();
        babyFace.setNpcName("George Nelson");
        babyFace.setNpcDescription("George \"Baby Face\" Nelson is famous both for his bank robbing history, and " 
                + "\nfor the fact that he looks like a six foot tall 5 year old. Watch out! If you " 
                + "\ncall him Baby Face, he's liable to blow his top - and your house. He loves his " 
                + "\nTommy Gun and shoots more for quanity, not quality.");
        babyFace.setNpcHealth(90);
        babyFace.setNpcStrength(60);
        npcs[NPCList.babyFace.ordinal()] = babyFace;
        
        Npc ninja = new Npc();
        ninja.setNpcName("Shredder");
        ninja.setNpcDescription("Ever seen a suit of armor crossed with robot wars? You wind up with protective " 
                + "\narmor with pokey spikes all over the place. Toss in a matching attitude and " 
                + "\nyou've got Shredder. He's more likely to sic his fellow ninjas on you than to " 
                + "\nuse his katana.");
        ninja.setNpcHealth(80);
        ninja.setNpcStrength(126);
        npcs[NPCList.ninja.ordinal()] = ninja;
        
        Npc soldier = new Npc();
        soldier.setNpcName("Stalin");
        soldier.setNpcDescription("Stalin is the King of Cruel. Having organized the murder of more people than " 
                + "\nanyone in history, he's not afraid to take you out. And he's not likely to " 
                + "\nstand down.");
        soldier.setNpcHealth(50);
        soldier.setNpcStrength(110);
        npcs[NPCList.soldier.ordinal()] = soldier;
        
        Npc pirate = new Npc();
        pirate.setNpcName("Blackbeard");
        pirate.setNpcDescription("Aye, matey! This here's Captain Blackbeard and he's yer worst nightmare. He'll " 
                + "\nslice you open and throw you overboard. His leadership style of \"Do it or I'll " 
                + "\nkill you\" doesn't exactly lend itself to loyalty, but his sword will make you " 
                + "\nregret crossing him.");
        pirate.setNpcHealth(40);
        pirate.setNpcStrength(175);
        npcs[NPCList.pirate.ordinal()] = pirate;
        
        Npc giraffe = new Npc();
        giraffe.setNpcName("Geoffrey");
        giraffe.setNpcDescription("Perhaps the most diabolical giraffe in history, this villian will trap you in a " 
                + "\ngiant building of overpriced toys with half a dozen toddlers, then take your " 
                + "\nwallet. If his high prices don't kill you, their screams of want will!");
        giraffe.setNpcHealth(60);
        giraffe.setNpcStrength(40);
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
