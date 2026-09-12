package com.example.Tasks07;

public class Product {
    String name;
    Category category;

    public Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product: " + name +
                " Category: " + category;
    }
}
