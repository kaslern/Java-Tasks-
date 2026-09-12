package com.example.Tasks05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = input.nextLine();
        System.out.println("Enter product price");
        BigDecimal productPrice = new BigDecimal(input.nextLine());

        System.out.println("Product: " + productName + ", " + "price: " +
                productPrice.setScale(2, RoundingMode.HALF_UP)
                + " PLN");

    }
}
