package com.myapps.objectorientedbeginner.staticmethodandclass;

public class Main {
    public static void main(String[] args) {

        Friend friend1 = new Friend("John");
        Friend friend2 = new Friend("Jane");
        Friend friend3 = new Friend("Joe");


        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);

        Friend.showFriend(); // static calls from the class

        // number of friends is a shared resource
    }
}
