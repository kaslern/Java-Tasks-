package com.example.Tasks03;

import java.util.Arrays;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int max = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter number for row " + (i + 1) + ", column " + (j + 1));
                matrix[i][j] = input.nextInt();
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Row: " + maxRow);
        System.out.println("Column: " + maxColumn);

        int[] numbers = new int[9];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                numbers[index] = matrix[i][j];
                index++;
            }
        }
        Arrays.sort(numbers);
        System.out.println("Third highest number is: " + numbers[numbers.length - 3]);
    }
}
