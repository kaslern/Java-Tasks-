package com.example.Tasks07;

public enum Calculation {
    ADD {
        @Override
        int calculate(int number1, int number2){
            return number1 + number2;
        }
    },
    SUBTRACT {
        @Override
        int calculate(int number1, int number2){
            return number1 - number2;
        }
    },
    MULTIPLY {
        @Override
        int calculate(int number1, int number2){
            return number1 * number2;
        }
    },
    DIVIDE{
        @Override
        int calculate(int number1, int number2){
            return number1 / number2;
        }
    };

    abstract int calculate(int number1, int number2);
}
