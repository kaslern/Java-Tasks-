package com.example.Tasks08;

public final class PasswordValidator {
    private PasswordValidator() {
    }

    public static void validate(String password) {
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password cannot be empty or shorter than 8 characters");
        }

        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        if (!hasDigit) {
            throw new IllegalArgumentException("No digit in password");
        }

    }
}