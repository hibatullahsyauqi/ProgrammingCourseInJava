package com.object_oriented_java.constructorexample;

// class polos tanpa constructor
//class Polos {
//    String dataString;
//    int dataInteger;
//}

// class dengan constructor
class Mahasiswa {
    String name;
    String idNumber;
    String major;

    // constructor dipanggil saat object pertama kali diinstansiasi, instead of just the class (new Blablabla())
    // bahkan bisa langsung pass in parameter
    Mahasiswa(String name, String idNumber, String major) {
        this.name = name;
        this.idNumber = idNumber;
        this.major = major;

        System.out.println(name);
        System.out.println(idNumber);
        System.out.println(major);
    }
}

public class Constructor {
    public static void main(String[] args) {

//        Polos objectPolos = new Polos();
        Mahasiswa mahasiswa_1 = new Mahasiswa("Andy", "2749902", "Physics");
        Mahasiswa mahasiswa_2 = new Mahasiswa("Reza", "9862347", "Psychology");
    }
}
