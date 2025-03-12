package com.myapps.shoppingcart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        price = Double.parseDouble(scanner.nextLine());
        System.out.print("How many would you like to buy?: ");
        quantity = Integer.parseInt(scanner.nextLine());
        total = price * quantity;

        System.out.println("=".repeat(40));
        System.out.println("You have bought " + quantity + " of " + item + "/s");
        System.out.println("Your total is " + currency + total);
        scanner.close();
    }
}
