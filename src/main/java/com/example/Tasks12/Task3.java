package com.example.Tasks12;

import java.util.Scanner;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:");
        String input = scanner.nextLine();
        Function<String, Integer> lengthWithoutSpaces =
                string -> string.replace(" ", "").length();
        Function<String, Integer> countVowels = text -> {
            int count = 0;
            String vowelsList = "aeiouyAEIOUY"; // samogłoski

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (vowelsList.indexOf(c) != -1) {
                    count++;
                }
            }
            return count;
        };
        System.out.println("Text length without spaces: " + lengthWithoutSpaces.apply(input));
        System.out.println("Vowels numbers in text: " + countVowels.apply(input));
    }
}
