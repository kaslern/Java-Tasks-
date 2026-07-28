package com.example.Task01;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Choose a year");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year is a leap year");
        }else {
            System.out.println("The year is not a leap year");
        }
        input.close();
    }
}
