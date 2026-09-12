package com.example.Tasks04;

import java.util.Scanner;

public class Task19 {

    public static void menu() {
        System.out.println();
        System.out.println("Calculator:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("0 - Exit");
    }

    public static int add(int number1, int number2) {

        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {

        return number1 - number2;
    }

    public static int multiply(int number1, int number2) {

        return number1 * number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoice = -1;

        while (userChoice != 0) {

            menu();
            userChoice = input.nextInt();

            switch (userChoice) {

                case 1 -> {
                    System.out.println("Please enter first number");
                    int number1 = input.nextInt();
                    System.out.println("Please enter second number");
                    int number2 = input.nextInt();
                    System.out.println("Result: " + add(number1, number2));
                }
                case 2 -> {
                    System.out.println("Please enter first number");
                    int number1 = input.nextInt();
                    System.out.println("Please enter second number");
                    int number2 = input.nextInt();
                    System.out.println("Result: " + subtract(number1, number2));
                }
                case 3 -> {
                    System.out.println("Please enter first number");
                    int number1 = input.nextInt();
                    System.out.println("Please enter second number");
                    int number2 = input.nextInt();
                    System.out.println("Result: " + multiply(number1, number2));
                }

                case 0 -> System.out.println("Calculator closed");

                default -> System.out.println("Unknown choice");
            }


        }

    }

}

