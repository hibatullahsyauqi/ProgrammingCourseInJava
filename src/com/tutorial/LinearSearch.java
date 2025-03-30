package com.tutorial;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] nums = new int[9];
        System.out.println("Enter 9 numbers: ");
        for (int i = 0; i < 9; i++) {
            nums[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(nums));
        System.out.print("Enter the target number: ");
        int target = Integer.parseInt(scanner.nextLine());
        int ans = linearSearch(nums, target);
        if (ans == -1) {
            System.out.println("Target number not found");
        }
        else {
            System.out.println("Your target number is in the index " + ans);
        }
    }

    static int linearSearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}