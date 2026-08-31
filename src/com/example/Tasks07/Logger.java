package com.example.Tasks07;

public enum Logger {
    INSTANCE;

    public void log(String message) {
        System.out.println(message);
    }
}
