package com.example.Task01;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day");
        int day = input.nextInt();
        System.out.println("Enter a month");
        int month = input.nextInt();
        System.out.println("Enter a year");
        int year = input.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");

        } else if (month == 2) {

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

                if (day >= 1 && day <= 29) {
                    System.out.println("Date correct");
                } else {
                    System.out.println("Invalid date");
                }

            } else {

                if (day >= 1 && day <= 28) {
                    System.out.println("Date correct");
                } else {
                    System.out.println("Invalid date");
                }
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day >= 1 && day <= 31) {
                System.out.println("Date correct");
            }  else {
                System.out.println("Invalid date");
            }
        } else {
            if (day >= 1 && day <= 30) {
                System.out.println("Date correct");
            } else {
                System.out.println("Invalid date");
            }
        }
        input.close();
    }
}





