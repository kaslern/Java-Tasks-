package com.example.Tasks05;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter price 1");
        BigDecimal price1 = new BigDecimal(input.nextLine());
        System.out.println("Please enter price 2");
        BigDecimal price2 = new BigDecimal(input.nextLine());

        int comparePrices = price1.compareTo(price2);
       // System.out.println(comparePrices);

        if (comparePrices < 0) {
            System.out.println("Price 2 is greater");
        } else if (comparePrices > 0) {
            System.out.println("Price 1 is greater");
        } else {
            System.out.println("Prices are the same");
        }
    }
}
