package com.company;

import java.util.Random;

/**
 * Created by joey on 6/27/16.
 */
public class StopLight {
    String mLightColor;

    public StopLight() {
        Random random = new Random();
        int randomLightColor = random.nextInt(3) + 1;
        if (randomLightColor == 1){
            setLightColor("green");
        } else if (randomLightColor == 2){
            setLightColor("yellow");
        } else if (randomLightColor == 3){
            setLightColor("red");
        }
    }

    public boolean isRed() {
        if (mLightColor.equalsIgnoreCase("red")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isYellow() {
        if (mLightColor.equalsIgnoreCase("yellow")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isGreen() {
        if (mLightColor.equalsIgnoreCase("green")) {
            return true;
        } else {
            return false;
        }
    }

    public void setLightColor(String lightColor) {
        mLightColor = lightColor;
    }
}
