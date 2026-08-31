package com.example.Tasks16;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("TajneHaslo123!");
        User user2 = new User("Krotkie1!");
        User user3 = new User("HasloBezZnaku1234");

        System.out.println("User 1: " + PasswordValidator.validate(user1));
        System.out.println("User 2: " + PasswordValidator.validate(user2));
        System.out.println("User 3: " + PasswordValidator.validate(user3));
    }
}
