/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningerrands.model;

import java.io.Serializable;

/**
 *
 * @author reddo
 */
public enum Email implements Serializable {
    
    YouWon("You have won! Dear Sir or Madam, you have won the Nigerian Lottery, $914123546541633 in moneys. Send Plase confirm of identity to reply of SSN and bank account number."),
    BulkUp("Need to be bigger? Use SureGrow muscle enhancer. Only 59.99 per gram. Order Now."),
    HotSale ("The Mall has a new sale! All the Orphans need new shirts and video games. Make their hopeless lives better with giving them what they want."),
    EmptyFridge("Warning SmartFridgehas detected the following issues; You are low on the things required to keep you alive! MOUNTAIN DEW, DR. PEPPER, and BREAD!!! Don’t die go get your food."),
    MoreFun("Orphans are sad because they cannot have fun. Please buy them some stuff to play with."),
    Overdue("Dear Sir or Madam, Your Copy of “The Ancient Spell Book” is overdue. Please return it. Tax forms are also available at the Library don’t forget to pay the government what you owe them."),
    TheUnDead("This is your neighbor, I think I saw your spouse. Didn’t they die getting food poisoning from your seafood and pork meatloaf? Anyway it looked like they were coming back to your house from the cemetery. You might want to get ready."),
    PlagueOutbreak("Warning your neighborhood has had several monkeys escape from the disease testing area.  Come by the hospital to get your immunization, or don’t and take your chances with a disease that will kill and cripple you and all those you love."),
    Grades("The semester is over at More For Us University. If you want to improve your life, and we know you do because you are taking classes from us, you need to have you grades finalized. If you would like to have your grades finalized, please return your text books to the school. We will not finalize your grades until they are returned.  The money you paid for the books will not be returned."),
    BankJob("It’s Nikolai, were just waiting for you. You didn’t forget did you? Get your stuff together and meet us at the bank."),
    JoinOrDie("It’s the annual Army recruitment event. Join the army or die by terrorists that come in and take over the city. It happened six times last year in your city. Visit the local army base and sign up now. You get a signing bonus of anything on the base you want, at the end of your term."),
    Pets("Children love pets, sadly orphans have no one that loves them. That means they have no pets. If you are a decent human you’ll get pets for the orphans."),
    LostBoat("Your boat is floating away. The packing tape that you used to secure it to the marina has come undone. Please get something to keep it in place. Sincerely, Marina Mike"),
    YourHome("The neighborhood association has decided that your house is too ugly to be seen here. We have delivered a pallet of wood for you to make into a fence. It must be at least 10 feet tall and have no gaps. Build the fence or you will be fined at the next home owners meeting."),
    Tickets("You have unpaid tickets. You will be arrested if you don’t come and pay them off."),
    ZooPass("Your zoo membership is now active. Thank you for your donation of $12,000.00 We thought this might be a typo because the membership only requires a donation of $120.00, but we charged your account anyway. Come by you now get free admission to the zoo and the natural history museum. Enjoy the past or the present, orphans get free admission if accompanied by a member."),
    GraveRobbers("I hate to give you this kind of news but, someone dug up your spouse’s grave. We can’t go near it to fix it because there might be a curse on it and our insurance will not cover that kind of thing. The city requires that all graves be covered so please come and fix it."),
    ObserveAndServe("The Volcano is erupting again please come by the observation center to find out ways you can help! We are located at the top of the volcano with our deck conveniently located directly over the top of the mouth of the volcano. Hope to see you soon.");

    private final String message;            

    Email(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
            
}
