package com.example.Tasks05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of PLN for exchange");
        BigDecimal plnAmount = new BigDecimal(input.nextLine());
        System.out.println("Please enter the exchange rate for EUR");
        BigDecimal exchangeRate = new BigDecimal(input.nextLine());

        System.out.println("EUR amount is: " + plnAmount.divide(exchangeRate, 2, RoundingMode.HALF_UP));

    }

}
