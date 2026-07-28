package com.example.Tasks12;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Task9 {
    static void printReport(Map<String, Integer> map, BiConsumer<String, Integer> consumer) {
        for (Map.Entry<String, Integer> wpis : map.entrySet()) {
            consumer.accept(wpis.getKey(), wpis.getValue());
        }
    }

    public static void main(String[] args) {
        BiConsumer<String, Integer> reporter = (key, value) ->
                System.out.println("Produkt: " + key + ", " + "sztuk: " + value);

        Map<String, Integer> productToQty = new HashMap<>();
        productToQty.put("Jabłka", 15);
        productToQty.put("Kawa", 3);
        productToQty.put("Mleko", 8);
        productToQty.put("Czekolada", 5);


        printReport(productToQty, reporter);
    }


}
