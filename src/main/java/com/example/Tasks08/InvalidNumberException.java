package com.example.Tasks08;

class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

final class NumberParser {
    static int parsePositiveInt(String s) {

        int value;
        try {
            value = Integer.parseInt(s);
            if (value <= 0) {
                throw new IllegalArgumentException("non-positive: " + value);
            }
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Invalid number: '" + s + "'",
                    e);

        }
        return value;
    }
}