package com.example.Tasks04;

public class Task9 {
    public static int factorialRec(int n) {
        if(n == 1)
            return 1;

        return n * factorialRec(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(factorialRec(5));
    }
}
