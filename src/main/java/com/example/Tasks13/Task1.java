package com.example.Tasks13;

import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("test");
        Optional<String> opt2 = Optional.ofNullable(null);
        Optional<String> opt3 = Optional.empty();

        System.out.println(opt1.isPresent());
        System.out.println(opt2.isPresent());
        System.out.println(opt3.isPresent());

        // Optional.of(null) - Rzuci NullPointerException
        // Optional.ofNullable(null) - zwróci false dla isPresent()

    }
}
