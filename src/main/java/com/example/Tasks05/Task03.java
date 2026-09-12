package com.example.Tasks05;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task03 {
    public static void main(String[] args) {

        BigDecimal number1 = new BigDecimal("10.56789");

        System.out.println(number1.setScale(2, RoundingMode.HALF_UP));
    }
}
