package com.example.Tasks05;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sentence");
        String sentence = input.nextLine();
        System.out.println("Please enter a word to find");
        String word = input.nextLine();

        System.out.println(sentence.contains(word));
        System.out.println(sentence.indexOf(word));
    }
}
