package com.example.Task01;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj swój wiek: ");
        int wiek = scan.nextInt();

        if (wiek >= 18){
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }
        scan.close();
    }
}
