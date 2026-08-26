package com.example.Tasks05;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter String 1");
        String text1 = input.nextLine();
        System.out.println("Please enter String 2");
        String text2 = input.nextLine();

        System.out.println("Case-sensitive comparison: " + text1.equals(text2));
        System.out.println("Case-insensitive comparison: " + text1.equalsIgnoreCase(text2));

    }
}
