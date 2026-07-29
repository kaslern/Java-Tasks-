package com.example.Tasks13;

import java.util.Optional;

public class Task2 {

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

    public static void main(String[] args) {
        Optional<String> cityWA = findCityByCode("WA");
        Optional<String> cityKR = findCityByCode("PO");
        Optional<String> cityGD = findCityByCode("GD");

        if (cityWA.isPresent()) {
            System.out.println("City found: " + cityWA.get());
        } else {
            System.out.println("City not found");
        }

        if (cityKR.isPresent()) {
            System.out.println("City found: " + cityKR.get());
        } else {
            System.out.println("City not found" );
        }

        if (cityGD.isPresent()) {
            System.out.println("City found: " + cityGD.get());
        } else {
            System.out.println("City not found");
        }
    }

}
