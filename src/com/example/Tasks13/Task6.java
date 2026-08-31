package com.example.Tasks13;

import java.util.Optional;

public class Task6 {
    public static void main(String[] args) {
        String[] nicki = {"Janek", null, "Ania", null, "Kuba"};
        for (int i = 0; i < nicki.length; i++) {
            Optional.ofNullable(nicki[i]).ifPresentOrElse(nick -> System.out.println("Znaleziono: " + nick),
                    () -> System.out.println("Brak nicka") );
        }
    }
}
