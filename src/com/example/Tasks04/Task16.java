package com.example.Tasks04;

public class Task16 {

    public static int digitSumRec(int number) {

        if (number == 0) {
            return 0;
        }

        return (number % 10) + digitSumRec((number / 10));
    }

    public static void main(String[] args) {

        System.out.println(digitSumRec(123));


    }

}
