package com.example.Task01;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        System.out.println("Choose an operation (+, -, *, /, %)");
        String operator = input.next();

        switch (operator) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> {
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                }else  {
                    System.out.println(a / b);
                }
            }
            case "%" -> System.out.println(a % b);
            default -> System.out.println("Wrong input");
        }
        input.close();
    }
}
