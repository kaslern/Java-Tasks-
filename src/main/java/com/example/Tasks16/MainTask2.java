package com.example.Tasks16;

public class MainTask2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        Calculator add = (number1, number2) -> number1 + number2;
        Calculator subtract = (number1, number2) -> number1 - number2;
        Calculator multiply = (number1, number2) -> number1 * number2;

        int addResult = add.count(10, 5);
        int subResult = subtract.count(10, 5);
        int multiplyResult = multiply.count(10, 5);

        System.out.println(vehicle.opis());
        System.out.println(car.opis());
        car.staraMetoda();
        car.nowaMetoda();
        System.out.println("Add result: " + addResult);
        System.out.println("Subtract result: " + subResult);
        System.out.println("Multiply result: " + multiplyResult);
    }
}
