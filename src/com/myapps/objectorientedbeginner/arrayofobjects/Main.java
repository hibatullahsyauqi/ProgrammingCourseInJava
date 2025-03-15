package com.myapps.objectorientedbeginner.arrayofobjects;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mustang", "Black");
        Car car2 = new Car("Corvette", "Teal");
        Car car3 = new Car("Charger", "Yellow");
        
        Car[] cars = {car1, car2, car3};

        for (Car car : cars) {
            car.drive();
        }
    }
}
