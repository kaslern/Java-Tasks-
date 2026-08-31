package com.example.Task01;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if (age < 12) {
            System.out.println("You are a child");
        }else if (age < 18) {
            System.out.println("You are a teenager");
        }else if (age < 65) {
            System.out.println("You are an adult");
        }else {
            System.out.println("You are a senior");
        }
    }
}
