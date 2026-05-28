package com.example.Tasks02;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word =  input.nextLine();

        for (int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }

    }
}
