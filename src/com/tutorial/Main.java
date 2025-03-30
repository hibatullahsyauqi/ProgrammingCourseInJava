package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // store 5 roll numbers
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // store the data of 5 students (roll number, name, marks)
        int[] rollNumbers = new int[5];
        String[] studentNames = new String[5];
        float[] marks = new float[5];
        // but this is not the best way to do this
        // Student[] students = new Student[5]; need to create a new class called Student
        Student oki = new Student();
        oki.rollNumber = 13;
        oki.name = "Oki";
        oki.marks = 88.5f;
        System.out.println(oki.rollNumber);
        System.out.println(oki.name);
        System.out.println(oki.marks);

    }

    // create a Student class
    static class Student {
        int rollNumber;
        String name;
        float marks;

        Student(int rollNumber, String name, float marks) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.marks = marks;
        }

        Student() {
            this (15, "default name", 97.5f);
        }
    }


}
