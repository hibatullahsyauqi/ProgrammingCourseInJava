package com.myapps.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fn, fn1, fn2, n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci of: ");
        n = scanner.nextInt();
        fn2 = 0;
        fn1 = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println("Fibonacci number 1: " + fn2);
            } else if (i == 1) {
                System.out.println("Fibonacci number 2: " + fn1);
            } else {
                fn = fn1 + fn2;
                System.out.println("Fibonacci number " + (i + 1) + ": " + fn);
                fn2 = fn1;
                fn1 = fn;
            }
        }
    }
}