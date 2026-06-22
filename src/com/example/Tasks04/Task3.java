package com.example.Tasks04;

public class Task3 {

    public static int biggerNumber(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static void main(String[] args) {

        int result = biggerNumber(5, 10);

        System.out.println(result);
    }
}
