package com.example.Tasks05;

import java.math.BigDecimal;

public class Task10 {
    public static void main(String[] args) {

        double double1 = 0.1;
        double double2 = 0.2;

        BigDecimal number1 = new BigDecimal("0.1");
        BigDecimal number2 = new BigDecimal("0.2");

        System.out.println("Double sum result is: " + (double1 + double2));
        System.out.println("BigDecimal sum result is: " + number1.add(number2));

    }
}
