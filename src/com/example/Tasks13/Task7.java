package com.example.Tasks13;

import java.util.Optional;

public class Task7 {
    static Optional<String> extractLogin(Optional<String> email) {
        return email
                .map(e -> e.split("@")[0])
                .map(e -> e.toUpperCase());
    }

    public static void main(String[] args) {
        System.out.println(extractLogin(Optional.of("jan.kowalski@example.com")));
        System.out.println(extractLogin(Optional.empty()));
    }
}
