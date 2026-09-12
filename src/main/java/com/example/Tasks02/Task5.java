package com.example.Tasks02;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = input.nextLine();
        boolean found = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                found = true;
                System.out.println("'a' found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("'a' not found");
        }
    }
}
