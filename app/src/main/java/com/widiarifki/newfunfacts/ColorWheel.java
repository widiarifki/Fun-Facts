package com.widiarifki.newfunfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Widia Rifkianti on 26/02/2016.
 */
public class ColorWheel {

    // Members
    public String[] colors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#838cc7",
            "#53bbb4",
            "#51b46d",
            "#e0ab18"
    };

    // Methods
    public int getColor(){
        // Pick random number
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);

        // Pick color based on given random number
        String color = colors[randomNumber];

        // Convert hexa code of color into integer representation (that android needs) using method from class Color
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
