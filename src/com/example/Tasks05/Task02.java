package com.example.Tasks05;

import java.math.BigDecimal;

public class Task02 {
    public static void main(String[] args) {

        BigDecimal asString = new BigDecimal("10.5345");
        BigDecimal asDouble = new BigDecimal(10.5345);

        System.out.println("BigDecimal as string: " + asString);
        System.out.println("BigDecimal as double: " + asDouble);
    }
}
