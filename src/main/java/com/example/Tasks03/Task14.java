package com.example.Tasks03;

public class Task14 {
    public static void main(String[] args) {

        int[][] numbers = new int[3][3];
        int value = 1;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = value;
                value++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
