package com.example.Tasks03;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int[] array = new int[input.nextInt()];
        System.out.println("Please enter the numbers for array");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Please enter number to find");
        int userChoice = input.nextInt();
        boolean found = false;

        for (int number : array) {
            if (userChoice == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
        input.close();
    }
}
