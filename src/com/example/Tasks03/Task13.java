package com.example.Tasks03;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text");
        String text = input.nextLine();

        char[] chars = text.toCharArray();

        for (char letter : chars) {
            System.out.println(letter);
        }
    }
}
