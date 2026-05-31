package com.example.Tasks03;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = i + 1;
        }

        for ( int number :  array ) {
            System.out.print(number + " ");
        }
    }
}
