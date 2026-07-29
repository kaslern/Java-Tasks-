package com.example.Tasks13;

import java.util.Optional;

public class Task10 {
    static Optional<String> findInCache(String key) {
        System.out.println("Szukam w cache...");
        return "A".equals(key) ? Optional.of("Wynik z Cache") : Optional.empty();
    }

    static Optional<String> findInDatabase(String key) {
        System.out.println("Szukam w bazie...");
        return "B".equals(key) ? Optional.of("Wynik z bazy") : Optional.empty();
    }

    static Optional<String> findDefault(String key) {
        System.out.println("Biorę domyślną...");
        return Optional.of("Wartość domyślna");
    }

    static String findValue(String key) {
        return findInCache(key)
                .or(() -> findInDatabase(key))
                .or(() -> findDefault(key))
                .orElse("Brak");
    }

    public static void main(String[] args) {
        System.out.println(findValue("A"));
        System.out.println("======================");
        System.out.println(findValue("B"));
        System.out.println("======================");
        System.out.println(findValue("C"));
    }

}
