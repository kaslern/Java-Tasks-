package com.example.Tasks02;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int startNumber = input.nextInt();
        System.out.println("Please enter second number: ");
        int endNumber = input.nextInt();

        for (int i = startNumber; i <= endNumber; i++) {

            if (i % 3 == 0 || i % 5 == 0) {

                System.out.println(i);
            }
        }
    }
}
