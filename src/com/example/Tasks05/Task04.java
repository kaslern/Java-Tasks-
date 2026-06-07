package com.example.Tasks05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the price");
        BigDecimal price = new BigDecimal(input.nextLine());
        System.out.println("Please enter the discount percent");
        BigDecimal discount = new BigDecimal(input.nextLine());

        BigDecimal discountDivider = new BigDecimal("100");
        BigDecimal percentSwitch = discount.divide(discountDivider);

        BigDecimal discountValue = price.multiply(percentSwitch);
        BigDecimal priceAfterDiscount = price.subtract(discountValue);

        System.out.println("Price after discount: " + priceAfterDiscount.setScale(2, RoundingMode.HALF_UP));


    }
}
