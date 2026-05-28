package com.example.Tasks02;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number of grades");
        int gradeNumber = input.nextInt();
        System.out.println("Please enter grades");
        double grades;
        double sum = 0;
        double average;
        
        for (int i = 1; i <= gradeNumber; i++) {
            grades = input.nextDouble();
            sum += grades;
        }
        average = sum / gradeNumber;
        System.out.println("Average grade is " + average);
    }
}
