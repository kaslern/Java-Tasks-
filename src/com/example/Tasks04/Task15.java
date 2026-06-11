package com.example.Tasks04;

public class Task15 {
    public static int numbersSum(int number) {

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            sum += digit;

            number = number / 10;

        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(numbersSum(25));
    }
}
