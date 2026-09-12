package com.example.Tasks05;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task18 {
    public static void main(String[] args) {

        BigDecimal[] prices = {
                new BigDecimal("10"),
                new BigDecimal("15.5"),
                new BigDecimal("123.456")
        };

        for (BigDecimal price : prices) {
            System.out.println(price.setScale(2, RoundingMode.HALF_DOWN) + " zł");
        }
    }
}
