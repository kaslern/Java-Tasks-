package com.example.Tasks16;

public class Car extends Vehicle {
    @Override
    public String opis() {
        return "This is Car";
    }

    @Override
    @Deprecated(since = "1.0", forRemoval = true)
    public void staraMetoda() {
        System.out.println("Example");
    }

    public void nowaMetoda() {
        System.out.println("New method");
    }
}
