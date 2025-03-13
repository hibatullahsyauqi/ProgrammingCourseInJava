package com.myapps.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result = 0;

        System.out.print("Please enter the first number: ");
        num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Please enter an operator (+, -, *, /, ^, %): ");
        operator = scanner.nextLine().charAt(0);
        System.out.print("Please enter the second number: ");
        num2 = Double.parseDouble(scanner.nextLine());

        switch(operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Division by zero!");
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            case '%' -> result = num1 % num2;
            default -> System.out.println("Invalid operator");
        }
        System.out.println("Result: " + result);
    }
}
