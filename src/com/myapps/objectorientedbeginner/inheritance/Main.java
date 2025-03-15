package com.myapps.objectorientedbeginner.inheritance;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        dog.eat();
        cat.eat();

        Plant plant = new Plant();

        System.out.println(plant.isAlive);

        plant.photosynthesize();
    }
}
