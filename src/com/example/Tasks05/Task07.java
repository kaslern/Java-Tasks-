package com.example.Tasks05;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task07 {
    public static void main(String[] args) {

        BigDecimal[] prices = {
                new BigDecimal("550.99"),
                new BigDecimal("123.34"),
                new BigDecimal("376.43"),
        };

        BigDecimal total = BigDecimal.ZERO;

        for (BigDecimal price : prices) {
            total = total.add(price);
        }

        System.out.println("Total cart value is: " + total.setScale(2, RoundingMode.HALF_UP));
    }
}
