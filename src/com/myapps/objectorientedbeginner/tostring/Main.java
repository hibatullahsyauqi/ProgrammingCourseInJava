package com.myapps.objectorientedbeginner.tostring;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chevrolet", "Corvette", 2024, "Blue");
        System.out.println(car1); // outputs hashcode without toString()
        System.out.println(car2);

    }
}
