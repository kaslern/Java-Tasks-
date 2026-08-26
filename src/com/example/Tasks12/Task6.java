package com.example.Tasks12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task6 {
    public static void main(String[] args) {
        Predicate<String> isValidLogin = login -> login.matches("^[a-zA-Z][a-zA-Z0-9]{2,}$");
        String[] loginy = {"adam", "Ala123", "x", "User_01", "ADMIN", "gość"};

        List<String> validLogins = new ArrayList<>();

        for (String correctLogins : loginy) {
            if (isValidLogin.test(correctLogins)) {
                validLogins.add(correctLogins);
            }
        }
        System.out.println("List of correct logins: " + validLogins);
    }
}
