package com.widiarifki.newfunfacts;

import java.util.Random;

/**
 * Created by Widia Rifkianti on 25/02/2016.
 */
public class FactBook {

    // Members
    public String[] facts = {
            "Ants stretch when they wake up in the morning",
            "Ostriches can run faster than horses",
            "Olympic gold medals are actually made mostly of silver",
            "You are born with 300 bones; by the time you are an adult you will have 206",
            "It takes about 8 minutes for the Sun to reach the Earth",
            "Some bamboo plants can grow almost a meter in just one day",
            "The state of florida is bigger than England",
            "Some penguins can leap 2-3 meter iout of the water",
            "On average, it takes 66 days to form a new habit",
            "Mammoths still walked in the earth when Great Pyramid was being built."
    };

    // Methods
    public String getFact(){
        // Pick random number
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        // Pick fact based on given random number
        return facts[randomNumber];
    }

}
