package com.example.Tasks08;

public class InvalidEmailFormatException extends  EmailValidationException {
    public InvalidEmailFormatException(String message) {
        super(message);
    }
}
