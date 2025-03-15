package com.myapps.objectorientedbeginner.abstractmethodandclass;

public abstract class Shape {

    abstract double area(); // abstract method

    void display() {
        System.out.println("This is a shape"); // concrete method
    }
}
