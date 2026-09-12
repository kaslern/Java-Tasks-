package com.example.Tasks03;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int size = input.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] arraySum = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter number " + (i+1) + " for array 1");
            array1[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter number " + (i+1) + " for array 2");
            array2[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            arraySum[i] = array1[i] + array2[i];
        }


        for (int sum : arraySum) {
            System.out.println(sum);
        }

    }
}
