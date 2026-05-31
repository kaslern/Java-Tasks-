package com.example.Tasks02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}
