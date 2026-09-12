package com.example.Tasks04;

public class Task11 {
    public static int biggestNumber(int[] table) {

        int maxNumber = table[0];

        for (int i = 0; i < table.length; i++) {

            if (table[i] > maxNumber) {
                maxNumber = table[i];
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {

        int[] numbers1 = {5, 10, 15, 20, 25};
        int[] numbers2 = {-5, -20, -40, -30};

        System.out.println(biggestNumber(numbers1));
        System.out.println(biggestNumber(numbers2));
    }
}
