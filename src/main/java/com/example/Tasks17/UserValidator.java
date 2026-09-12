package com.example.Tasks17;

public class UserValidator {

    public static void validateEmail(String email) {

        if (email == null) {
            throw new NullPointerException("Email cannot be null");
        }

        if (email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }

        if (!(email.contains("@"))) {
            throw new IllegalArgumentException("Email must contain '@'");
        }
    }
}
