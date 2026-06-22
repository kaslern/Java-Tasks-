package com.example.Tasks03;

public class Task20 {
    public static void main(String[] args) {

        int[][] matrix = new int[5][5];


        int value = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
                value++;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nAfter swap:\n");

        int[] tempRow = matrix[0];
        matrix[0] = matrix[4];
        matrix[4] = tempRow;
        int temp;

        for (int i = 0; i < matrix.length; i++) {
            temp = matrix[i][i];
            matrix[i][i] = matrix[i][matrix.length - 1 - i];
            matrix[i][matrix.length - 1 - i] = temp;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
