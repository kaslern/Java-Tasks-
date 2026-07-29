package com.example.Tasks12;

import java.util.Arrays;
import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {

        Function<String, String> toLowerCase = string -> string.toLowerCase();
        Function<String, String> replace = string -> string.replace(" ", "");
        Function<String, String> normalizeLogin = toLowerCase.andThen(replace);

        String[] loginy = {"  Adam  ", "ANIA K  ", "  k o w a l "};
        String[] normalizedLogins = new String[loginy.length];

        for (int i = 0; i < loginy.length; i++) {
            normalizedLogins[i] = normalizeLogin.apply(loginy[i]);
            System.out.println(normalizedLogins[i]);
        }
    }
}
