package com.example.Tasks12;

import java.util.List;
import java.util.function.Consumer;

public class Task8 {
    static void printWithNumbers(List<String> lines, Consumer<String> consumer) {
        for (int i = 0; i < lines.size(); i++) {
            int number = i + 1;
            String text = lines.get(i);
            consumer.accept(number + ") " + text);
        }
    }

    public static void main(String[] args) {
        List<String> lines = List.of("Java", "Python", "C++", "JavaScript");
        Consumer<String> logger = line -> System.out.println(line);

        printWithNumbers(lines, logger);
    }
}
