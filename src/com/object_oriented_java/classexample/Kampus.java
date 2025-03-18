package com.object_oriented_java.classexample;
// membuat class sebagai template

class Mahasiswa {
    String name;
    String idCard;
    String major;
    double gpa;
    int age;
}

public class Kampus {
    public static void main(String[] args) {
        // instansiasi object

        Mahasiswa mahasiswa1 = new Mahasiswa();

        // kita bisa loh punya mahasiswa2, 3, 4, dll!
        mahasiswa1.name = "Dale";
        mahasiswa1.idCard = "12345";
        mahasiswa1.major = "Physics";
        mahasiswa1.gpa = 3.45;
        mahasiswa1.age = 19;
        System.out.println(mahasiswa1.name);

        // kinda hard right? we have a solution for that, using constructor!!!
    }
}
