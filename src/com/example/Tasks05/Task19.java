package com.example.Tasks05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter bill amount");
        BigDecimal billAmount = new BigDecimal(input.nextLine());
        System.out.println("Enter amount of people to split");
        int people = input.nextInt();

        if (people <= 0) {
            System.out.println("Enter correct number of people");
            return;
        }

        System.out.println("Amount to pay for each person is " +
                billAmount.divide(BigDecimal.valueOf(people), 2, RoundingMode.HALF_UP));
    }
}
