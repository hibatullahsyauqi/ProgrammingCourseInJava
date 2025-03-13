package com.myapps.objectorientedbeginner.classandobject;

public class Car { // this is a class called Car

    String make = "Ford";
    String model = "Mustang";
    int year = 2019;
    double price = 58000.99;
    boolean isElectric = false;

    // actions can be defined by using methods
    boolean isRunning = false;
    void start() {
        isRunning = true;
        System.out.println("You started the engine.");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stopped the engine.");
    }

    void drive() {
        System.out.println("You drive the " + model + ".");
    }

    void brake() {
        System.out.println("You brake the " + model + ".");
    }
}
