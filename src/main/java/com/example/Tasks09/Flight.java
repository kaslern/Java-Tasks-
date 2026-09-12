package com.example.Tasks09;

import java.time.Duration;
import java.time.ZonedDateTime;

public class Flight {
    private final String flightNumber;
    private final Airport departureAirport;
    private final Airport arrivalAirport;
    private final ZonedDateTime departureTime;
    private final ZonedDateTime arrivalTime;

    public Flight(String flightNumber, Airport departureAirport, Airport arrivalAirport, ZonedDateTime departureTime, ZonedDateTime arrivalTime) {
        if (!arrivalTime.toInstant().isAfter(departureTime.toInstant())) {
            throw new IllegalArgumentException("Arrival time must be after departure time");
        }
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public ZonedDateTime getDepartureTime() {
        return departureTime;
    }

    public ZonedDateTime getArrivalTime() {
        return arrivalTime;
    }

    public Duration calculateFlightDuration() {
        return Duration.between(departureTime, arrivalTime);
    }
}
