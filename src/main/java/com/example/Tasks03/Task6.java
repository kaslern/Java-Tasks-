package com.example.Tasks03;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int[] array = new int[input.nextInt()];
        System.out.println("Please enter the numbers");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int max = array[0];

        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Highest number is: " + max);
    }
}
