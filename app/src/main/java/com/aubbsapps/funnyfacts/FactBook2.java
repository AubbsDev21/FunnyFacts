package com.aubbsapps.funnyfacts;

import java.util.Random;

/**
 * Created by Aubre on 2/1/2016.
 */
public class FactBook2  {

    String[] mFacts = {
           "NFL refs also receive Super Bowl rings.",
            "The volleyball comes from a basketball's bladder.",
            "The Pittsburgh Pirates' almost built a new stadium in the middle of a river.",
            "Despite running about three hours, actual playing time in a Major League Baseball game is under 18 minutes.",
            "Until 1936, the jump ball in basketball took place at center court after every single made basket.",
            " An incomplete forward pass in football used to earn teams a 15-yard penalty",
            "The Philadelphia Eagles and the Pittsburgh Steelers once combined to form the Steagles."
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
