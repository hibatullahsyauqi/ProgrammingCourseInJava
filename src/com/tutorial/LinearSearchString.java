package com.tutorial;

import java.util.Scanner;

public class LinearSearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char target = sc.next().charAt(0);
        System.out.println(search(name,target));
    }

    static int search(String str, char target) {
        if (str.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
