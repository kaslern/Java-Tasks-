package com.example.Tasks07;

public enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public double calculate(double number1, double number2) {
        return switch (this) {

            case ADD -> (number1 + number2);
            case SUBTRACT -> (number1 - number2);
            case MULTIPLY -> (number1 * number2);
            case DIVIDE -> (number1 / number2);

        };
    }
}
