package com.example.Tasks12;

@FunctionalInterface
interface PriceStrategy {
    double apply(double basePrice);
}

public class Task14 {

    static double calculatePrice(double basePrice, PriceStrategy strategy) {
        return strategy.apply(basePrice);
    }
    public static void main(String[] args) {
        PriceStrategy normal = price -> price;
        PriceStrategy student = price -> price - (price * 0.1);
        PriceStrategy vip = price -> price - (price * 0.2);
        PriceStrategy blackFriday = price -> price - (price * 0.3);

        System.out.println("Student discount: " + calculatePrice(100.0, student));
        System.out.println("VIP discount: " + calculatePrice(250.0, vip));
        System.out.println("BlackFriday discount: " + calculatePrice(399.0, blackFriday));
    }
}
