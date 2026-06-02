package com.example.Tasks03;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = input.nextLine();
        text = text.toLowerCase();
        text = text.replace(" ", "");
        boolean isPalindrome = true;

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not palindrom");
        }
    }
}
