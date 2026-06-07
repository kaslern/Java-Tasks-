package com.example.Tasks05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter price");
        BigDecimal price = new BigDecimal(input.nextLine());

        System.out.println(price.setScale(2, RoundingMode.CEILING));
    }
}
