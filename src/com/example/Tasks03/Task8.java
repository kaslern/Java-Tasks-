package com.example.Tasks03;

import java.util.Scanner;

public class Task8 {
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
        int counter = 0;

        for (int number : array) {
            if (userChoice == number) {
                counter++;
            }
        }
        System.out.println("Number appears " + counter + " times");
    }
}
