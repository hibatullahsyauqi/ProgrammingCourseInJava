package com.myapps.objectorientedbeginner.overloadedconstructor;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("John");
        User user2 = new User("Patrick", "PStar@aol.com");
        User user3 = new User("Charles", "Charles@aol.com", 27);

        System.out.println(user1.userName);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.userName);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.userName);
        System.out.println(user3.email);
        System.out.println(user3.age);

    }
}
