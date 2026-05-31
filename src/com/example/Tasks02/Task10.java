package com.example.Tasks02;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        for (int i = number + 1; ; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
