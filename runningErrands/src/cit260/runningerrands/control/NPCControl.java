/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;

import cit260.runningerrands.model.Npc;
import runningerrands.RunningErrands;

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
        ,shamWowGuy
        ,crazyCatLady
        ,nikolai
        ,plagueMonkey
        ,sergy
        ,hannibal
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
        docent.setNpcName("Tutankhamun");
        docent.setNpcDescription("This big bad Pharaoh dude is seems big and bad, but he's a kid at heart. He " 
                + "\nmay have died three thousand years ago, but he's got the forces of the " 
                + "\nunderworld to back him up now. He is lacking in weapons, but won't hesitate " 
                + "\nto swing his gold plated sarcophogous at you!");
        docent.setNpcHealth(140);
        docent.setNpcStrength(110);
        npcs[NPCList.docent.ordinal()] = docent;
        
        Npc ghost = new Npc();
        ghost.setNpcName("Peeves");
        ghost.setNpcDescription("This poltergeist loves to haunt the halls of Hogwarts and scare the students " 
                + "\nby flying out of walls and tables, but he's a teddy beart at heart. He has no " 
                + "\nweapon of is own, but he'll grab whatever is nearby to attack.");
        ghost.setNpcHealth(55);
        ghost.setNpcStrength(75);
        npcs[NPCList.ghost.ordinal()] = ghost;
        
        Npc joe = new Npc();
        joe.setNpcName("Joe");
        joe.setNpcDescription("Joe was once ready to throw himself into the volcano, but has since found new " 
                + "\ninspiration. The natives think him a god, so they'll protect him at all costs. " 
                + "\nWatch out for the lava! He always has a bucket or two around him ready to " 
                + "\nthrow on his enemies.");
        joe.setNpcHealth(100);
        joe.setNpcStrength(105);
        npcs[NPCList.joe.ordinal()] = joe;
        
        Npc shamWowGuy = new Npc();
        shamWowGuy.setNpcName("Sham-Wow Guy");
        shamWowGuy.setNpcDescription("The epitome of all late night TV salesmen, the Sham-Wow Guy's sole weapon is " 
                + "\nhis voice. Once you've heard it once, his offers of \"But wait! There's more!\" " 
                + "\nwill haunt your nightmares for years to come.");
        shamWowGuy.setNpcHealth(50);
        shamWowGuy.setNpcStrength(75);
        npcs[NPCList.shamWowGuy.ordinal()] = shamWowGuy;
        
        Npc crazyCatLady = new Npc();
        crazyCatLady.setNpcName("Crazy Cat Lady");
        crazyCatLady.setNpcDescription("Not only does she own over thirty cats, she'll spend hours telling you about " 
                + "\nthe organic, gluten-free, vegetarian food she makes for them from scratch. If " 
                + "\nshe catches you in the potato chip aisle, a lecture on starches and saturated " 
                + "\nfats is sure to ensue. Forget weapons, she'll swing her forty pound buckets of " 
                + "\ncat litter at you!");
        crazyCatLady.setNpcHealth(40);
        crazyCatLady.setNpcStrength(30);
        npcs[NPCList.crazyCatLady.ordinal()] = crazyCatLady;
        
        Npc nikolai = new Npc();
        nikolai.setNpcName("Nikolai");
        nikolai.setNpcDescription("Nikolai was a Spetsnaz office in the former Soviet Union, left to fend for " 
                + "\nhimself when it collapsed. Now, he's an international arms dealer, always " 
                + "\nwilling to sell any weapon he can get his hands on.");
        nikolai.setNpcHealth(100);
        nikolai.setNpcStrength(100);
        npcs[NPCList.nikolai.ordinal()] = nikolai;
        
        Npc plagueMonkey = new Npc();
        plagueMonkey.setNpcName("Plague Monkey");
        plagueMonkey.setNpcDescription("A troop of monkeys escaped from a local research facility. Rumor has it that " 
                + "\nthey were testing a new manmade plague created by combining the Black Plague, " 
                + "\nEbola, Zika, and Avian Flu. Get touched by one of these and you're sure to not " 
                + "\nlive long.");
        plagueMonkey.setNpcHealth(65);
        plagueMonkey.setNpcStrength(125);
        npcs[NPCList.plagueMonkey.ordinal()] = plagueMonkey;
        
        Npc sergy = new Npc();
        sergy.setNpcName("Sergy");
        sergy.setNpcDescription("Sergy claims he was in the GRU with Nikolai, but in reality he buys all his " 
                + "\nweapons on Craig's List. Although he's just as likely to run as to attack, he " 
                + "\nalso has the biggest weapons around.");
        sergy.setNpcHealth(80);
        sergy.setNpcStrength(70);
        npcs[NPCList.sergy.ordinal()] = sergy;
        
        Npc hannibal = new Npc();
        hannibal.setNpcName("Hannibal Lector");
        hannibal.setNpcDescription("Hannibal Lector has already been sentenced to multiple life terms in prison. " 
                + "\nBut a recent escape has him wandering free, trying to stay out of the " 
                + "\nlimelight. Never accept his invitation to join him for dinner.");
        hannibal.setNpcHealth(125);
        hannibal.setNpcStrength(77);
        npcs[NPCList.hannibal.ordinal()] = hannibal;
        
        Npc ceasar = new Npc();
        ceasar.setNpcName("Julius Ceasar");
        ceasar.setNpcDescription("Ceasar is a former ruling Emperor of Rome, during its heyday. Unfortunately, " 
                + "\nthe warning that could have saved his throne - \"Beware the ides of March\" - " 
                + "\ndidn't come across clearly. Now he wanders the Earth avoiding places like " 
                + "\nSt. Louis, for fear of encountering the Eyes in the Arch. Walk softly and "
                + "\nyou'll be able to sneak up on this hard of hearing villian.");
        ceasar.setNpcHealth(60);
        ceasar.setNpcStrength(150);
        npcs[NPCList.ceasar.ordinal()] = ceasar;
        
        Npc godfather = new Npc();
        godfather.setNpcName("Vito Corleone");
        godfather.setNpcDescription("Vito, or \"Godfather\" as he is known to his crime family, fears no one. The " 
                + "\npolice are in his pocket, and no crime is committed without his permission. " 
                + "\nBeware the strength of his family, as you'll have to go through them to get him.");
        godfather.setNpcHealth(200);
        godfather.setNpcStrength(250);
        npcs[NPCList.godfather.ordinal()] = godfather;
        
        Npc jimbob = new Npc();
        jimbob.setNpcName("JimBob");
        jimbob.setNpcDescription("JimBob hails from the deep south, where you keep your shotguns in the back " 
                + "\nwindow of your pickup, fireworks are used to blow up real things, and overalls " 
                + "\nare formal attire if you put a tie over your t-shirt. He may not seem like the " 
                + "\nsharpest crayon in the box, but he knows how to use that shotgun.");
        jimbob.setNpcHealth(40);
        jimbob.setNpcStrength(50);
        npcs[NPCList.jimbob.ordinal()] = jimbob;
        
        Npc adolf = new Npc();
        adolf.setNpcName("Adolf Hitler");
        adolf.setNpcDescription("Hitler's mind is a haven for all ideas barbaric. He has a talent for getting " 
                + "\npeople to do things that they know very well would garner them the death " 
                + "\npenalty anywhere else, but they'll do it for him because of his hypnotic " 
                + "\nmotivational speaking style. Get past his minions and you'll encounter frail " 
                + "\nman, hardly able to defend himself.");
        adolf.setNpcHealth(20);
        adolf.setNpcStrength(20);
        npcs[NPCList.adolf.ordinal()] = adolf;
        
        Npc vlad = new Npc();
        vlad.setNpcName("Vlad the Impaler");
        vlad.setNpcDescription("Vlad \"The Impaler\", of the House of Drăculești, ruled Romania centuries ago. " 
                + "\nThey say his antics eventually lead to the legend of Dracula and vampires. The " 
                + "\nfact you're encountering him several hundred years later might just lead you " 
                + "\nto believe they are real. Shine a little sunlight and you'll win this one.");
        vlad.setNpcHealth(75);
        vlad.setNpcStrength(95);
        npcs[NPCList.vlad.ordinal()] = vlad;
        
        Npc khan = new Npc();
        khan.setNpcName("Temüjin");
        khan.setNpcDescription("Temüjin, also known as Genghis Khan, created the Mongolian empire in the early " 
                + "\n13th century. His empire eventually grew to cover nearly all of Europe and " 
                + "\nAsia, but not without major bloodshed and cruelty. It was thought that he died " 
                + "\nwhen he fell off his horse while hunting, but... he is here in front of you now!");
        khan.setNpcHealth(100);
        khan.setNpcStrength(100);
        npcs[NPCList.khan.ordinal()] = khan;
        
        Npc nsync = new Npc();
        nsync.setNpcName("NSync");
        nsync.setNpcDescription("Justin, Joey, Lance, Chris, and J.C. may be able to sing, but if they corner " 
                + "\nyou, they'll force you to listen to Bye, Bye, Bye until you lose your mind.");
        nsync.setNpcHealth(30);
        nsync.setNpcStrength(15);
        npcs[NPCList.nsync.ordinal()] = nsync;
        
        Npc zeus = new Npc();
        zeus.setNpcName("Zeus");
        zeus.setNpcDescription("Zeus, the Greek king of the gods, comes armed with thunder and lightning - and " 
                + "\nnot the kiss your biceps kind. This is the strike you down and fry you like an " 
                + "\negg lightning. Strike fast, and strike early. And pray to Heavenly Father that " 
                + "\nyou survive.");
        zeus.setNpcHealth(195);
        zeus.setNpcStrength(300);
        npcs[NPCList.zeus.ordinal()] = zeus;
        
        Npc dracula = new Npc();
        dracula.setNpcName("Dracula");
        dracula.setNpcDescription("Once one of the most widely feared villians in all of legend, literature, and " 
                + "\nlore, his daughter brought him down a few notches. Now remembered more for his " 
                + "\nvehement denials of saying \"Bleh, bleh, bleh!\", he is still a compatent foe. " 
                + "\nFight him with light, watch your neck.");
        dracula.setNpcHealth(115);
        dracula.setNpcStrength(135);
        npcs[NPCList.dracula.ordinal()] = dracula;
        
        RunningErrands.setNpc(npcs);
        return npcs;
        
    }
}
