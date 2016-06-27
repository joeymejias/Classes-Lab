package com.company;

/**
 * Created by joey on 6/27/16.
 */
public class Car {
    String mColor;
    String mBrand;
    int mTopSpeed;

    public Car(){
    }

    public Car(String color, String brand, int topSpeed){
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
    }

    public void go(){
        System.out.println("Vroom, vroom!");
    }

    public void slow(){
        System.out.println("Slow down, skippy!");
    }

    public void stop(){
        System.out.println("Bro, just stop.");
    }

    public String getColor() {
        return mColor;
    }

    public String getBrand() {
        return mBrand;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public void setColor(String mColor) {
        this.mColor = mColor;
    }

    public void setBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public void setTopSpeed(int mTopSpeed) {
        this.mTopSpeed = mTopSpeed;
    }
}
