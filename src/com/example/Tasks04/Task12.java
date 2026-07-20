package com.example.Tasks04;

public class Task12 {
    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Is number prime: " + isPrime(4));
    }
}
