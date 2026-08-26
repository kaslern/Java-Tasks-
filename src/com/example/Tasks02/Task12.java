package com.example.Tasks02;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number;
        int sum = 0;

        do {
            number = input.nextInt();
            if (number == 0 ){
                break;
            }
            if (number > 0) {
                sum += number;
            }

        } while (true);

        System.out.println("The sum is " + sum);

    }
}
