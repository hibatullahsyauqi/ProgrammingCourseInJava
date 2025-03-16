package com.myapps.stars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int totalLines = 2 * n - 1;
        while (i <= totalLines) {
            int stars = (i <= n) ? i : totalLines - i + 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
