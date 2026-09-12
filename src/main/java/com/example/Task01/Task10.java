package com.example.Task01;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the password");
        String password = input.nextLine();

        if (password.length() < 8) {
            System.out.println("Password too short");
        } else if (!Character.isUpperCase(password.charAt(0)) ) {
            System.out.println("First letter needs to be uppercase");
        } else {
            System.out.println("OK");
        }
        input.close();
    }
}
