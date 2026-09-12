package com.example.Tasks04;

public class Task17 {
    public static int gcdIter(int number1, int number2) {

        while (number2 != 0) {

            int temp = number1 % number2;

            number1 = number2;

            number2 = temp;
        }
        return number1;
    }

    public static void main(String[] args) {

        System.out.println(gcdIter(48, 18));
    }
}
