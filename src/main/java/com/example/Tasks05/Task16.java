package com.example.Tasks05;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter text");
        String text = input.nextLine();

        System.out.println("Is your text start with 'Java' " + text.startsWith("Java"));
        System.out.println("Is your text end with '2025' " + text.endsWith("2025"));
    }
}
