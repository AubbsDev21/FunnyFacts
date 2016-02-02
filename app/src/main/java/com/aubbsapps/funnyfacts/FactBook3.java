package com.aubbsapps.funnyfacts;

import java.util.Random;

/**
 * Created by Aubre on 2/1/2016.
 */
public class FactBook3 {
    String[] mFacts = {
           "John Carpenter was offered the job of directing ‘Top Gun’. He turned it down.",
            "Arnold Schwarzenegger has won a Golden Globe for acting.",
            "How many times has a Canadian been nominated for the Best Actor Oscar in the last 60 years? Once.",
            "The Shining’ was nominated for two Razzies in 1980. Including worst director.",
            "Steven Seagal once broke Sean Connery’s wrist.",
            "After ‘Jaws’ and ‘Close Encounters of the Third Kind’, Steven Spielberg desperately wanted to direct a James Bond film. He approached the producers. They said no.",
            "Kiefer Sutherland has a twin sister, who looks just like him but with lipstick on."
    };
    //member variable (properties or things about the object)
    //Method (abilities: things the object can do)
    public String getFact() {


        //The button was click so updated the factlabel with the new one
        String fact = "";

        //A random section genarter that sectionsa random fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
