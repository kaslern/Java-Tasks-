package com.example.Task01;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = input.nextInt();

        String check = age >= 18 ? "Adult" : "Not adult";
        System.out.println(check);
    }
}
