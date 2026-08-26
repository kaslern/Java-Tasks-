package com.example.Tasks05;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();

        sentence = sentence.replace(" ", "_");
        sentence = sentence.replace(",", "");

        System.out.println(sentence);
    }
}
