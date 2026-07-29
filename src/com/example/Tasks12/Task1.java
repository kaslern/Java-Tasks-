package com.example.Tasks12;

public class Task1 {
    public static void main(String[] args) {

        Runnable runnable1 = () -> System.out.println("Startuje program");
        Runnable runnable2 = () -> System.out.println("Kończe program.");

        runnable1.run();
        runnable2.run();
    }
}

