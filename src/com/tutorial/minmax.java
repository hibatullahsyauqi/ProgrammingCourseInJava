package com.tutorial;

import java.util.Arrays;
import java.util.Random;

public class minmax {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = rand.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Minmax(nums));
    }

    static String Minmax(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return "min is: " + min + ", max is: " + max;
    }
}
