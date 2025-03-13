package com.myapps.objectorientedbeginner;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // this is an object
        Random random = new Random(); // this is also an object

        Car car = new Car(); // instantiate a Car object based on Car class' attributes
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isElectric);

    }
}
