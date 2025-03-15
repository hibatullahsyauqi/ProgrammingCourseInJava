package com.myapps.objectorientedbeginner.abstractmethodandclass;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
    }

    @Override
    double area() {
        return length * width;
    }
}
