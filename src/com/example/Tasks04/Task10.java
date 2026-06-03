package com.example.Tasks04;

public class Task10 {
    public static int tableSum(int[] tab) {

        int sum = 0;

        for (int i = 0; i < tab.length; i++) {

            sum += tab[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(tableSum(numbers));
    }
}
