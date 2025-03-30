package com.tutorial;

public class EvenDigits {
    public static void main(String[] args) {
        int[] array = {1234, 873, 23, 286, 973264, 872, 9823};
        System.out.println(findEvenDigit(array));
    }

    static int findEvenDigit(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (hasEvenDigits(array[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean hasEvenDigits(int num) {
        int digits = 0;
        while (num > 0) {
            num /= 10;
            digits++;
        }
        return digits % 2 == 0;
    }
}
