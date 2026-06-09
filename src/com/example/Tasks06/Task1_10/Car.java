package com.example.Tasks06.Task1_10;

public class Car {
    String brand;
    int yearOfProduction;

    public Car() {
        this("Unknown", 2000);
    }

    public Car(String brand, int yearOfProduction) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }

    public void showDiffrence() {
        String brand = "Local variable";

        System.out.println("Local brand: " + brand);
        System.out.println("Field brand: " + this.brand);
    }

    public void changeBrand(String brand) {
        this.brand = brand;
    }


}
