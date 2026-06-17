package com.example.Tasks08;

public class EmptyEmailException extends EmailValidationException {
    public EmptyEmailException(String message) {
        super(message);
    }
}
