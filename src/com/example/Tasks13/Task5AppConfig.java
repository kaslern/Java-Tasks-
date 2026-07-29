package com.example.Tasks13;

import java.util.Map;
import java.util.Optional;

public class Task5AppConfig {
    static String getRequired(String key) {
        Map<String, String> config = Map.of(
                "db.url", "jdbc:mysql://localhost:3306/app",
                "db.user", "admin"
        );
        return Optional.ofNullable(config.get(key))
                .orElseThrow(() -> new IllegalArgumentException("Brak klucza: " + key));
    }

    public static void main(String[] args) {
        System.out.println(getRequired("db.url"));

        try {
            getRequired("db.password");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
