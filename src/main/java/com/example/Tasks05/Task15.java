package com.example.Tasks05;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
