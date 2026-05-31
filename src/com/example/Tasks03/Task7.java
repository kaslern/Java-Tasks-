package com.example.Tasks03;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int[] array = new int[input.nextInt()];
        System.out.println("Please enter the numbers");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int min = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Lowest number is: " + min);
    }
}
