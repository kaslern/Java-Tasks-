package com.example.Tasks13;

import java.util.Optional;

public class Task3 {
    static Optional<String> findCityByCode(String code) {
        if ("WA".equals(code)) {
            String city = "Warszawa";
            return Optional.of(city);
        }
        if ("KR".equals(code)) {
            String city = "Krakow";
            return Optional.of(city);
        }
        if ("GD".equals(code)) {
            String city = "Gdansk";
            return Optional.of(city);
        }

        return Optional.empty();
    }

    static String getCityOrDefault(String code) {
        return findCityByCode(code).orElse("Unknown City");
    }

    public static void main(String[] args) {
        String city1 = getCityOrDefault("WA");
        String city2 = getCityOrDefault("XX");
        String city3 = getCityOrDefault(null);

        System.out.println("WA: " + city1);
        System.out.println("XX: " + city2);
        System.out.println("null: " + city3);

    }
}
