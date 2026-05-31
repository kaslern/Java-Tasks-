package com.example.Tasks02;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctLogin = "admin";
        String correctPassword = "admin";
        String login;
        String password;
        boolean loggedIn = false;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter login: ");
            login = input.nextLine();
            System.out.print("Enter password: ");
            password = input.nextLine();


            if (login.equals(correctLogin) && password.equals(correctPassword)) {
                loggedIn = true;
                System.out.println("You are logged in");
                break;
            }
        }
        if (!loggedIn) {
            System.out.println("Account locked");
        }
    }
}
