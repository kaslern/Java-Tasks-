package com.example.Tasks02;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the password");
        String password = input.nextLine();

        while(!password.equals("java123")){
            System.out.println("Try again");
            password = input.nextLine();
        }

        System.out.println("Logged in");
    }
}
