package com.aubbsapps.funnyfacts;

import java.util.Random;

/**
 * Created by Aubre on 2/1/2016.
 */
public class FactBook4 {
    String[] mFacts = {
            "Avocados are poisonous to birds.",
            "Babies that are breastfed are more likely to be slimmer as adults than those that are not breastfed.",
            "Astronauts cannot burp in space.",
            "Beavers can swim half a mile underwater on one gulp of air.",
            "Bill Gates designed a traffic control system for Seattle when he was only 15!",
            "Butterflies taste with their feet.",
            "C3PO is the first character to speak in Star Wars.",
            "Cashew nut shells contain oil that is extremely irritating to human skin."
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
