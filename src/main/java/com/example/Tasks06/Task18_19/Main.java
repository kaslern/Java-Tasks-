package com.example.Tasks06.Task18_19;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //Task18
        Product product1 = new Product("Milka", BigDecimal.valueOf(10.50));
        Product product2 = new Product("Cola", BigDecimal.valueOf(13.30));
        Product product3 = new Product("Chipsy", BigDecimal.valueOf(8.49));

        product1.showProduct();
        product2.showProduct();
        product3.showProduct();

        //Task19

        product1.reducePrice(new BigDecimal("3.49"));
        product1.showProduct();
        product2.reducePrice(new BigDecimal("5.49"));
        product2.showProduct();

        product1.reducePrice(new BigDecimal("2.59"), "Promotion");
        product1.showProduct();
        product2.reducePrice(new BigDecimal("5.98"), "Late date");

        // Task20

        Product[] products = {product1, product2, product3};

        Shop shop1 = new Shop("Żabka", products);

        System.out.println("Product list from shop: " + shop1.name);
        shop1.showProducts();

    }


}
