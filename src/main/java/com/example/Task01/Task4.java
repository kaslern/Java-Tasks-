package com.example.Task01;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature");
        double temperature = input.nextDouble();

        if (temperature < 0) {
            System.out.println("Very cold");
        } else if (temperature <= 15) {
            System.out.println("Cold");
        } else if (temperature <= 25) {
            System.out.println("Warm");
        } else {
            System.out.println("Very hot");
        }
        input.close();
    }
}
