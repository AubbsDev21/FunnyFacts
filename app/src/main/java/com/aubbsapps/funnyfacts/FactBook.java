package com.aubbsapps.funnyfacts;

import java.util.Random;

/**
 * Created by Aubre on 10/5/2015.
 */
public class FactBook {
    String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
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