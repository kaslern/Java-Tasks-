package com.example.Tasks05;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task01 {
    public static void main(String[] args) {

        BigDecimal number1 = new BigDecimal("10.50");
        BigDecimal number2 = new BigDecimal("2.25");

        BigDecimal sumResult = number1.add(number2);
        BigDecimal diffResult = number1.subtract(number2);
        BigDecimal multiplyResult = number1.multiply(number2);
        BigDecimal divideResult = number1.divide(number2, 3, RoundingMode.HALF_UP);

        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtract result: " + diffResult);
        System.out.println("Multiply result: " + multiplyResult);
        System.out.println("Divide result: " + divideResult);


    }
}
