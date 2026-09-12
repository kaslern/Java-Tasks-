package com.example.Tasks04;

public class Task8 {

    public static int factorialIter (int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        System.out.println(factorialIter(5));
    }

}
