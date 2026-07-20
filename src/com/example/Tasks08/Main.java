package com.example.Tasks08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Task1
        //System.out.println("Please enter the password");
        //String pwd = input.nextLine();
        //PasswordValidator.validate(pwd);

        //Task2
        //NumberParser.parsePositiveInt("kot");

        //Task3
        BankAccount account1 = new BankAccount(5000);
        try {
            account1.withdraw(6000);
        }
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction finished");
        }

        //Task4
        CommandProcessor.demo();

        //Task5
        EmailValidator.validate("dfssdfsdf");


    }
}
