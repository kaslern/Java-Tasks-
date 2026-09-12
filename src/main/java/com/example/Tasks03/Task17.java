package com.example.Tasks03;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[2][3];

        for (int i = 0; i < matrix[0].length; i++){

            int sum = 0;

            for (int j = 0; j < matrix.length; j++ ){
                System.out.println("Enter the number for row " + (j+1) + " column " + (i+1) );
                matrix[j][i] = input.nextInt();
                sum += matrix[j][i];
            }
            System.out.println("Sum of column: " + (i + 1) + " is: " + sum);
        }
    }
}
