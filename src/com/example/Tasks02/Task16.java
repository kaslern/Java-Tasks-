package com.example.Tasks02;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userNumber = input.nextInt();
        int digits = 0;


        while (userNumber > 0) {
            digits++;
            userNumber /= 10;
        }
        System.out.println("The digits of the number is " + digits);
    }
}
