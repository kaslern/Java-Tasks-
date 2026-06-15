package com.example.Tasks06.Task18_19;

import java.math.BigDecimal;

public class Product {
    String productName;
    BigDecimal price;

    //Task18
    public Product(String name, BigDecimal price) {
        this.productName = name;
        this.price = price;
    }

    public void showProduct() {
        System.out.println("Product name: " + productName + " Price: " + price);
    }

    //Task19
    public void reducePrice(BigDecimal amount) {
        price = price.subtract(amount);
    }

    public void reducePrice(BigDecimal amount, String reason) {
        price = price.subtract(amount);
        System.out.println("Reason: " + reason);
    }
}
