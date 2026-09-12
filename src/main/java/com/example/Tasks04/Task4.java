package com.example.Tasks04;

public class Task4 {

    public static boolean isEven(int number) {

        return (number % 2 == 0);
    }

    public static void main(String[] args) {

        if (isEven(11)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number not even");
        }
    }
}
