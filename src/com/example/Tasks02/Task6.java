package com.example.Tasks02;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = input.nextInt();

        while (number >= 0) {
            System.out.println(number);
            number--;
        }
    }
}
