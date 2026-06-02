package com.example.Tasks02;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int max = number;

        do {
            number = input.nextInt();
            {
                if (number == 0)
                    break;
            }

            if (number > max) {
                max = number;
            }

        } while (true);

        System.out.println("The maximum number is " + max);
    }
}
