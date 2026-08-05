package com.example.Tasks12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Laptop", 3500.0, 5),
                new Product("Myszka", 150.0, 4),
                new Product("Klawiatura", 250.0, 5),
                new Product("Monitor", 1200.0, 3),
                new Product("Słuchawki", 250.0, 4)
        ));

        System.out.println("Before sort: " + products);
        products.sort(Comparator.comparing((Product product) ->
                product.price()).thenComparing(product1 -> product1.rating(), Comparator.reverseOrder()));
        System.out.println("After sort: " + products);

    }
}
