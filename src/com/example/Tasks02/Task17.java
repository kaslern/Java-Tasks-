package com.example.Tasks02;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the base number");
        int base = input.nextInt();
        System.out.println("Please enter the exponent");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(result);
    }
}
