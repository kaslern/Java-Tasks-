package com.example.Tasks03;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[2][3];

        for (int i = 0; i < matrix.length; i++) {

            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter number for row " + (i + 1) + ", column " + (j + 1));
                matrix[i][j] = input.nextInt();
                sum += matrix[i][j];
            }

            System.out.println("Sum of row: " + (i + 1) + " is: " + sum);
        }
    }
}
