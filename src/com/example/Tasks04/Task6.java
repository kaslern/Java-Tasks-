package com.example.Tasks04;

import java.util.Scanner;

public class Task6 {

    public static String ageCategory(int age) {

        if (age < 12) {
            return "Child";
        } else if
        (age < 18) {
            return "Teenager";
        } else if
        (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter age");

        System.out.println(ageCategory(input.nextInt()));
    }
}
