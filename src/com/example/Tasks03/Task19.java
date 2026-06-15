package com.example.Tasks03;

public class Task19 {
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];

        int value = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
                value++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < matrix.length; i++){
            System.out.println(matrix[i][i]);
        }

    }
}
