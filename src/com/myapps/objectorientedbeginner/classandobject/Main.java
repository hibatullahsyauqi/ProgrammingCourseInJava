package com.myapps.objectorientedbeginner.classandobject;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // this is an object
        Random random = new Random(); // this is also an object

        Car car1 = new Car(); // instantiate a Car object based on Car class' attributes
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1.isElectric);

        System.out.println("=".repeat(20));

        Car car2 = new Car();
        System.out.println(car2.make); // this will output the same as car1...
        // KINDA LAME -> USE CONSTRUCTORS
    }
}
