package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        StopLight stopLight1 = new StopLight();
        Car car1 = new Car("Black", "BMW", 300);

        for (int i = 0; i < 30; i++) {
            if (stopLight1.isGreen()){
                car1.go();
                stopLight1.setLightColor("yellow");
            } else if(stopLight1.isYellow()){
                car1.slow();
                stopLight1.setLightColor("red");
            } else if(stopLight1.isRed()){
                car1.stop();
                stopLight1.setLightColor("green");
            }
            System.out.println();
        }

        for (int i = 0; i <= 60; i++) {
            Car newCar = new Car();
            Random rand = new Random();
            int jerk = rand.nextInt(10) + 1;
            if(i % 3 == 0){
                newCar.stop();
                System.out.println("Car number" + i + " has stopped!");
            } else if (jerk == 1){
                System.out.println("Some jerk ran the light!");
            }
            System.out.println();
        }
    }
}
