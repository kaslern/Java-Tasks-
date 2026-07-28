package com.example.Tasks12;

import java.util.function.BiPredicate;

public class Task7 {
    public static void main(String[] args) {
        BiPredicate<String, String> sameIgnoreCase =
                (string1, string2) -> string1.equalsIgnoreCase(string2);

        BiPredicate<String, String> isSuffix =
                (string1, string2) -> string1.toLowerCase().endsWith(string2.toLowerCase());

        System.out.println(sameIgnoreCase.test("programowanie", "PROGRAMOWANIE"));
        System.out.println(sameIgnoreCase.test("programowanie", "pisanie"));

        System.out.println(isSuffix.test("programowanie", "NIE"));
        System.out.println(isSuffix.test("programowanie", "tak"));
    }
}
