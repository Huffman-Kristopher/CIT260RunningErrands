/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.control;


import cit260.runningerrands.model.Email;
import runningerrands.RunningErrands;
/**
 *
 * @author Kris
 */
public class EmailControl {
    
    public enum Emails {
    youWon,
    bulkUp,
    hotSale,
    emptyFridge,
    moreFun,
    overdue,
    theUnDead,
    plagueOutbreak,
    grades,
    bankJob,
    joinOrDie,
    pets,
    lostBoat,
    yourHome,
    tickets,
    zooPass,
    graveRobbers,
    observeAndServe;
}
    
    public static Email[] createInbox(){
        Email[] email = new Email[17];
        
    Email youWon = new Email();
    youWon.setDays(0);
    youWon.setSubject("You Won!");
    youWon.setDescription("You have won! Dear Sir or Madam, you have won the Nigerian Lottery, $914123546541633 in moneys. Send Plase confirm of identity to reply of SSN and bank account number.");
    email[Emails.youWon.ordinal()] = youWon;
    
    Email bulkUp = new Email();
    bulkUp.setDays(0);
    bulkUp.setSubject("BuLk uP NoW fOr cHeAp");
    bulkUp.setDescription("Need to be bigger? Use SureGrow muscle enhancer. Only 59.99 per gram. Order Now.");
    email[Emails.bulkUp.ordinal()] = bulkUp;
    
    Email hotSale  = new Email();
    hotSale.setDays(0);
    hotSale.setSubject("Seasonal Hot Hot sale");
    hotSale.setDescription("The Mall has a new sale! All the Orphans need new shirts and video games. Make their hopeless lives better with giving them what they want.");
    email[Emails.hotSale.ordinal()] = hotSale;
    
    Email emptyFridge = new Email();
    emptyFridge.setDays(0);
    emptyFridge.setSubject("You're about to die");
    emptyFridge.setDescription("Warning SmartFridge has detected the following issues; You are low on the things required to keep you alive! MOUNTAIN DEW, DR. PEPPER, and BREAD!!! Don’t die go get your food.");
    email[Emails.emptyFridge.ordinal()] = emptyFridge;
    
    Email moreFun = new Email();
    moreFun.setDays(0);
    moreFun.setSubject("Fun at teh orphanage");
    moreFun.setDescription("Orphans are sad because they cannot have fun. Please buy them some stuff to play with.");
    email[Emails.moreFun.ordinal()] = moreFun;
    
    Email overdue = new Email();
    overdue.setDays(0);
    overdue.setSubject("Return your books");
    overdue.setDescription("Dear Sir or Madam, Your Copy of “The Ancient Spell Book” is overdue. Please return it. Tax forms are also available at the Library don’t forget to pay the government what you owe them.");
    email[Emails.overdue.ordinal()] = overdue;
    
    Email theUnDead = new Email();
    theUnDead.setDays(0);
    theUnDead.setSubject("Your Wife...");
    theUnDead.setDescription("This is your neighbor, I think I saw your spouse. Didn’t they die getting food poisoning from your seafood and pork meatloaf? Anyway it looked like they were coming back to your house from the cemetery. You might want to get ready.");
    email[Emails.theUnDead.ordinal()] = theUnDead;
    
    Email plagueOutbreak = new Email();
    plagueOutbreak.setDays(0);
    plagueOutbreak.setSubject("Viral outbreak you and your loved ones may die");
    plagueOutbreak.setDescription("Warning your neighborhood has had several monkeys escape from the disease testing area.  Come by the hospital to get your immunization, or don’t and take your chances with a disease that will kill and cripple you and all those you love.");
    email[Emails.plagueOutbreak.ordinal()] = plagueOutbreak;
    
    Email grades = new Email();
    grades.setDays(0);
    grades.setSubject("Grades");
    grades.setDescription("The semester is over at More For Us University. If you want to improve your life, and we know you do because you are taking classes from us, you need to have you grades finalized. If you would like to have your grades finalized, please return your text books to the school. We will not finalize your grades until they are returned.  The money you paid for the books will not be returned.");
    email[Emails.grades.ordinal()] = grades;
    
    Email bankJob = new Email();
    bankJob.setDays(0);
    bankJob.setSubject("Bank work...");
    bankJob.setDescription("It’s Nikolai, we're just waiting for you. You didn’t forget did you? Get your stuff together and meet us at the bank.");
    email[Emails.bankJob.ordinal()] = bankJob;
    
    Email joinOrDie = new Email();
    joinOrDie.setDays(0);
    joinOrDie.setSubject("Join or Die");
    joinOrDie.setDescription("It’s the annual Army recruitment event. Join the army or die by terrorists that come in and take over the city. It happened six times last year in your city. Visit the local army base and sign up now. You get a signing bonus of anything on the base you want, at the end of your term.");
    email[Emails.joinOrDie.ordinal()] = joinOrDie;
    
    Email pets = new Email();
    pets.setDays(0);
    pets.setSubject("Pets for kids that have no love");
    pets.setDescription("Children love pets, sadly orphans have no one that loves them. That means they have no pets. If you are a decent human you’ll get pets for the orphans.");
    email[Emails.pets.ordinal()] = pets;
    
    Email lostBoat = new Email();
    lostBoat.setDays(0);
    lostBoat.setSubject("Sailing away");
    lostBoat.setDescription("Your boat is floating away. The packing tape that you used to secure it to the marina has come undone. Please get something to keep it in place. Sincerely, Marina Mike");
    email[Emails.lostBoat.ordinal()] = lostBoat;
    
    Email yourHome = new Email();
    yourHome.setDays(0);
    yourHome.setSubject("Ugly House");
    yourHome.setDescription("The neighborhood association has decided that your house is too ugly to be seen here. We have delivered a pallet of wood for you to make into a fence. It must be at least 10 feet tall and have no gaps. Build the fence or you will be fined at the next home owners meeting.");
    email[Emails.yourHome.ordinal()] = yourHome;
    
    Email tickets = new Email();
    tickets.setDays(0);
    tickets.setSubject("Pay or go to Jail");
    tickets.setDescription("You have unpaid tickets. You will be arrested if you don’t come and pay them off.");
    email[Emails.tickets.ordinal()] = tickets;
    
    Email zooPass = new Email();
    zooPass.setDays(0);
    zooPass.setSubject("Zoo Passes");
    zooPass.setDescription("Your zoo membership is now active. Thank you for your donation of $12,000.00 We thought this might be a typo because the membership only requires a donation of $120.00, but we charged your account anyway. Come by you now get free admission to the zoo and the natural history museum. Enjoy the past or the present, orphans get free admission if accompanied by a member.");
    email[Emails.zooPass.ordinal()] = zooPass;
    
    Email graveRobbers = new Email();
    graveRobbers.setDays(0);
    graveRobbers.setSubject("Open Grave");
    graveRobbers.setDescription("I hate to give you this kind of news but, someone dug up your spouse’s grave. We can’t go near it to fix it because there might be a curse on it and our insurance will not cover that kind of thing. The city requires that all graves be covered so please come and fix it.");
    email[Emails.graveRobbers.ordinal()] = graveRobbers;
    
    Email observeAndServe = new Email();
    observeAndServe.setDays(0);
    observeAndServe.setSubject("Comunity Service!");
    observeAndServe.setDescription("The Volcano is erupting again please come by the observation center to find out ways you can help! We are located at the top of the volcano with our deck conveniently located directly over the top of the mouth of the volcano. Hope to see you soon.");
    email[Emails.observeAndServe.ordinal()] = observeAndServe;
    
    RunningErrands.setEmails(email);
    return email;
    }
}
