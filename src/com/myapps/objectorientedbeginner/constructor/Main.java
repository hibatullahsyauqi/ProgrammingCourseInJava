package com.myapps.objectorientedbeginner.constructor;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Patrick", 23, 3.5);
        Student student2 = new Student("Charlie", 22, 3.6);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);

        student1.Study();
        student2.Study();
    }
}
