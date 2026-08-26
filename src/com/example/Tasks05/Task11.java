package com.example.Tasks05;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text");
        String text = input.nextLine();

        System.out.println("Text length is: " + text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        StringBuilder sb = new StringBuilder(text);
        System.out.println("Original String: " + sb);
        StringBuilder reversed = sb.reverse();
        System.out.println("Reversed String: " + reversed);
    }
}
