package com.example.Tasks16;

public class TestLombok1 {
    public static void main(String[] args) {
        UserLombok user1 = new UserLombok();
        user1.setFirstName("Anna");
        user1.setLastName("Nowak");
        user1.setAge(30);

        UserLombok user2 = new UserLombok("Peter"); // @RequiredArgsConstructor
        UserLombok user3 = new UserLombok("Anna", "Nowak", 30); // @AllArgsConstructor

        System.out.println("User 1 toString: " + user1);
        System.out.println("User 1 first name: " + user1.getFirstName());
        System.out.println("Is user1 equal to user3? " + user1.equals(user3));

    }
}
