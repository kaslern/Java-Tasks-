package com.example.Tasks09;

import java.time.*;
import java.time.zone.ZoneRulesException;

public class Main {
    public static void main(String[] args) {

        testSameTimeZone();
        testNextDaySameTimeZone();
        testWarsawToNewYork();
        testSpringForward();
        testFallBack();
        testDateLineCrossing();
        testInvalidZone();
        testWarsawToKolkata();
        testWarsawToSingapore();
        testArrivalBeforeDeparture();
        testWarsawToLondonWinter();
        testLondonToWarsawWinter();

    }

    private static void testSameTimeZone() {
        ZonedDateTime departure =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 10, 0),
                        Airport.WAW);

        ZonedDateTime arrival =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 12, 30),
                        Airport.WAW);

        Flight flight =
                new Flight("RY202", Airport.WAW, Airport.WAW,
                        departure, arrival);

        System.out.println("=== testSameTimeZone ===");

        System.out.println("Duration: "
                + flight.calculateFlightDuration());
    }

    private static void testNextDaySameTimeZone() {
        ZonedDateTime departure =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 23, 0),
                        Airport.WAW);

        ZonedDateTime arrival =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 16, 1, 30),
                        Airport.WAW);

        Flight flight =
                new Flight("RY202", Airport.WAW, Airport.WAW,
                        departure, arrival);

        System.out.println("=== testNexDaySameTimeZone ===");

        System.out.println("Duration: "
                + flight.calculateFlightDuration());
    }

    private static void testWarsawToNewYork() {
        ZonedDateTime departure =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 10, 0),
                        Airport.WAW);

        ZonedDateTime arrival =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 14, 00),
                        Airport.NYC);

        Flight flight =
                new Flight("RY203", Airport.WAW, Airport.NYC,
                        departure, arrival);

        System.out.println("=== testWarsawToNewYork ===");

        System.out.println("Duration: "
                + flight.calculateFlightDuration());
    }

    private static void testSpringForward() {
        ZonedDateTime departure =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 3, 30, 1, 0),
                        Airport.WAW);

        ZonedDateTime arrival =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 3, 30, 5, 0),
                        Airport.WAW);

        Flight flight =
                new Flight("RY204", Airport.WAW, Airport.WAW,
                        departure, arrival);

        System.out.println("=== testSpringForward ===");

        System.out.println("Duration: "
                + flight.calculateFlightDuration());
    }

    private static void testFallBack() {
        ZonedDateTime departure =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 10, 26, 1, 0),
                        Airport.WAW);

        ZonedDateTime arrival =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 10, 26, 2, 30),
                        Airport.WAW);

        Flight flight =
                new Flight("RY205", Airport.WAW, Airport.WAW,
                        departure, arrival);

        System.out.println("===  testFallBack ===");

        System.out.println("Duration: "
                + flight.calculateFlightDuration());
    }

    private static void testDateLineCrossing() {
        ZonedDateTime departure =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 10, 0),
                        Airport.TKY);

        ZonedDateTime arrival =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 14, 18, 0),
                        Airport.LAX);

        Flight flight =
                new Flight("RY206", Airport.TKY, Airport.LAX,
                        departure, arrival);

        System.out.println("===  testDateLineCrossing ===");

        System.out.println("Duration: "
                + flight.calculateFlightDuration());
    }

    private static void testInvalidZone() {

        System.out.println("=== testInvalidZone ===");

        try {
            ZoneId.of("Invalid/Zone");

        } catch (ZoneRulesException e) {

            System.out.println("Invalid Zone");
        }
    }

    private static void testWarsawToKolkata() {
        ZonedDateTime departure =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 10, 0),
                        Airport.WAW);

        ZonedDateTime arrival =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 19, 0),
                        Airport.KOL);

        Flight flight =
                new Flight("RY207", Airport.WAW, Airport.KOL,
                        departure, arrival);

        System.out.println("=== testWarsawToKolkata ===");

        System.out.println("Duration: "
                + flight.calculateFlightDuration());
    }

    private static void testWarsawToSingapore() {
        ZonedDateTime departure =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 6, 0),
                        Airport.WAW);

        ZonedDateTime arrival =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 16, 6, 0),
                        Airport.SGA);

        Flight flight =
                new Flight("RY208", Airport.WAW, Airport.SGA,
                        departure, arrival);

        System.out.println("=== testWarsawToSingapore ===");

        System.out.println("Duration: "
                + flight.calculateFlightDuration());
    }

    private static void testArrivalBeforeDeparture() {
        ZonedDateTime departure =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 10, 0),
                        Airport.WAW);

        ZonedDateTime arrival =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 8, 0),
                        Airport.WAW);

        System.out.println("=== testArrivalBeforeDeparture ===");

        try {

            Flight flight =
                    new Flight("RY208", Airport.WAW, Airport.WAW,
                            departure, arrival);

        } catch (IllegalArgumentException e) {
            System.out.println("Arrival is before departure");
        }

    }

    private static void testWarsawToLondonWinter() {
        ZonedDateTime departure =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 8, 0),
                        Airport.WAW);

        ZonedDateTime arrival =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 12, 0),
                        Airport.LON);

        Flight flight =
                new Flight("RY209", Airport.WAW, Airport.LON,
                        departure, arrival);

        System.out.println("=== testWarsawToLondonWinter ===");

        System.out.println("Duration: "
                + flight.calculateFlightDuration());
    }

    private static void testLondonToWarsawWinter() {
        ZonedDateTime departure =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 8, 0),
                        Airport.LON);

        ZonedDateTime arrival =
                DateTimeFactory.create(
                        LocalDateTime.of(2025, 1, 15, 12, 0),
                        Airport.WAW);

        Flight flight =
                new Flight("RY209", Airport.LON, Airport.WAW,
                        departure, arrival);

        System.out.println("=== testLondonToWarsawWinter ===");

        System.out.println("Duration: "
                + flight.calculateFlightDuration());
    }


}
