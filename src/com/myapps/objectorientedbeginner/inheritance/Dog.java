package com.myapps.objectorientedbeginner.inheritance;

public class Dog extends Animal {
    // this will be the child class (subclass) of Animal class

    int lives = 1;

    void speak() {
        System.out.println("The dog goes *woof*");
    }
}
