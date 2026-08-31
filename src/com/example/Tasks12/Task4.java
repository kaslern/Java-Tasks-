package com.example.Tasks12;

import java.util.function.BiFunction;

public class Task4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (number1, number2) -> number1 + number2;
        BiFunction<Integer, Integer, Integer> subtract = (number1, number2) -> number1 - number2;
        BiFunction<Integer, Integer, Integer> multiply = (number1, number2) -> number1 * number2;
        BiFunction<Integer, Integer, Integer> divide = (number1, number2) -> number1 / number2;

        System.out.println(calculate(5, 5, add));
        System.out.println(calculate(6, 5, subtract));
        System.out.println(calculate(5, 5, multiply));
        System.out.println(calculate(5, 5, divide));
        System.out.println(calculate(5, 5, (a, b) -> a+b));
    }

    static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> calc) {
        return calc.apply(a, b);
    }
}
