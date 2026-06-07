package com.example.Tasks05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of products");
        int numberOfProducts = input.nextInt();
        input.nextLine();

        BigDecimal total = BigDecimal.ZERO;

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.println("Enter the price for product " + i);
            BigDecimal price = new BigDecimal(input.nextLine());
            total = total.add(price);
        }

        BigDecimal average =
                total.divide(BigDecimal.valueOf(numberOfProducts), 2, RoundingMode.HALF_UP);

        System.out.println("Average price is: " + average);

    }
}
