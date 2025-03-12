package com.myapps.weightconverter;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);


        // Declare variables

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Converter");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // Prompt for user choice
        System.out.print("Choose an option: ");
        choice = Integer.parseInt(scanner.nextLine());


        // Option 1 convert lbs to kgs
        if (choice == 1) {
            System.out.println("Enter the weight in lbs: ");
            weight = Double.parseDouble(scanner.nextLine());
            newWeight = weight * 0.453592;
            System.out.printf("%.2f lbs is %.2f kgs", weight, newWeight);
        }

        // Option 2 convert kgs to lbs
        else if (choice == 2) {
            System.out.println("Enter the weight in kgs: ");
            weight = Double.parseDouble(scanner.nextLine());
            newWeight = weight * 2.20462;
            System.out.printf("%.2f kgs is %.2f lbs", weight, newWeight);
        }

        // Else print not a valid choice
        else {
            System.out.println("That was not a valid choice!");
        }

        scanner.close();
    }
}
