package com.example.Tasks16;

public class TestLombok2 {
    public static void main(String[] args) {

        // 1. Test @Data
        ItemData itemData = new ItemData();
        itemData.setId(1);
        itemData.setName("Monitor");
        System.out.println("ItemData: " + itemData); // Automatyczny @ToString
        System.out.println("ItemData name getter: " + itemData.getName());

        // 2. Test @Value (Klasa niemutowalna)
        // @Value tworzy konstruktor dla wszystkich pól i nie posiada setterów
        ItemValue itemValue = new ItemValue(2, "Keyboard");
        System.out.println("ItemValue: " + itemValue);
        System.out.println("ItemValue id getter: " + itemValue.getId());
        // itemValue.setName("New Name"); // BŁĄD KOMPILACJI: brak settera!

        // 3. Test @Builder oraz @Singular
        Order order1 = Order.builder()
                .orderId(101)
                .product("Laptop")   // Pojedyncze dodanie dzięki @Singular
                .product("Mouse")    // Kolejny element listy
                .build();
        System.out.println("Order 1: " + order1);

        // 4. Test toBuilder = true
        // Klonujemy order1, zmieniając tylko id i dodając nowy produkt:
        Order order2 = order1.toBuilder()
                .orderId(102)
                .product("Headphones")
                .build();
        System.out.println("Order 2 (kopia ze zmianami): " + order2);

        // 5. Test builderMethodName i buildMethodName
        CustomDevice device = CustomDevice.newBuilder() // zamiast .builder()
                .model("Laptop Pro")
                .price(3500.0)
                .create();                              // zamiast .build()

        System.out.println("Custom Device: " + device);
    }
}