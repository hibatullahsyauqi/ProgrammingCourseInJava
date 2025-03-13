package com.myapps.objectorientedbeginner.constructor;

public class Student {

//    String name = "Spongebob"; // this will result in identical students!
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa) { // this is a Constructor!
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void Study() {
        System.out.println(name + " is studying.");
    }
}
