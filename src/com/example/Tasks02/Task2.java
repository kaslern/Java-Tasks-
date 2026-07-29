package com.example.Tasks02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);;
            }
        }
    }
}
