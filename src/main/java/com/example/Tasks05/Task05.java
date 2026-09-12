package com.example.Tasks05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter netto price:");
        BigDecimal nettoPrice = new BigDecimal(input.nextLine());
        BigDecimal vatPercentage = new BigDecimal("23");

        BigDecimal vatRate = vatPercentage.divide(BigDecimal.valueOf(100));
        BigDecimal vatAmount = nettoPrice.multiply(vatRate);
        BigDecimal grossPrice = vatAmount.add(nettoPrice);

        System.out.println("Price with vat is: " + grossPrice.setScale(2, RoundingMode.HALF_UP));
    }
}
