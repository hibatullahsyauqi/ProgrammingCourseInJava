package com.myapps.objectorientedbeginner.abstractmethodandclass;

public class Main {

    public static void main(String[] args) {

//        Shape shape = new Shape(); this won't work cause Shape class is an abstract class

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }

}
