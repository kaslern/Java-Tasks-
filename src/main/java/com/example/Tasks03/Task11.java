package com.example.Tasks03;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int[] numbers = new int[input.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the number " + (i+1) + " for array");
            numbers[i] = input.nextInt();
        }

        int temp = numbers[0];

        numbers[0] = numbers[numbers.length - 1];

        numbers[numbers.length - 1] = temp;

        for(int number : numbers){
            System.out.println(number);
        }
    }
}
