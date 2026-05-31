package com.example.Tasks02;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " + i + " = " + (number * i));
        }

    }
}
