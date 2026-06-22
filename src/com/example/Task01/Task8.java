package com.example.Task01;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose category");
        String category = input.nextLine();
        category = category.toLowerCase();

        switch (category) {
            case "food" -> System.out.println("5%");
            case "books", "clothes" -> System.out.println("8%");
            case "services", "electronics" -> System.out.println("23%");
            default -> System.out.println("Invalid category");
        }
        input.close();
    }
}
