package com.example.Tasks06.Task18_19;

public class Shop {
    String name;
    Product[] products;

    public Shop(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public void showProducts() {
        for (Product product : products)
        product.showProduct();
    }

}
