package com.example.Tasks06.Task1_10;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 2021);
        Car car2 = new Car();
        Car car3 = new Car("AUDI", 2019);
        Car car4 = new Car("Mercedes", 2015);
        Car car5 = new Car();


        System.out.println(car1.brand + " " + car1.yearOfProduction);
        System.out.println(car2.brand + " " + car2.yearOfProduction);
        System.out.println(car3.brand + " " + car3.yearOfProduction);
        System.out.println(car4.brand + " " + car4.yearOfProduction);

        car1.showDiffrence();
        car1.changeBrand("Opel");
        System.out.println(car1.brand);

        System.out.println(car5.brand + " " + car5.yearOfProduction);
    }
}
