package com.example.Tasks03;

public class Task5 {
    public static void main(String[] args) {

        int[] numbers = { 5, 10, 15, 20, 25};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println(average);
    }
}
