package com.example.Tasks13;

import java.util.Optional;

public class Task4 {
    static String generateDefault() {
        System.out.println("  >> Generuję wartość domyślną...");
        return "DOMYŚLNA";
    }

    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Istniejąca wartość");

        System.out.println("1. Test orElse:");
        System.out.println(opt.orElse(generateDefault()));

        System.out.println("2. Test orElseGet:");
        opt.orElseGet(() -> generateDefault());

        //orElse stosujemy dla prostych, domyślnych wartości (np. stały napis, gotowa liczba)
        //orElseGet - stostujemy kiedy wywolwyana metoda lub zapytanie jest kosztowne dla zasobów komputera a nie ma koniecznosci jego uzycia, bo np. Optional coś zawiera
    }
}
