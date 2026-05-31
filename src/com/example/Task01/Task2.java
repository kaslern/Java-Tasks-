package com.example.Task01;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else  {
            System.out.println("The number is odd");
        }
        input.close();
    }
}
