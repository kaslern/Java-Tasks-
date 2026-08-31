package com.example.Tasks16;

public class User {
    @PasswordValidation(minLength = 10, requireSpecialChar = true)
    String password;

    public User(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
