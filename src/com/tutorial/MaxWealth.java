package com.tutorial;

public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maxWealth(int[][] accounts) {
        // person as row
        // account as column
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // we have sum of account of person
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
