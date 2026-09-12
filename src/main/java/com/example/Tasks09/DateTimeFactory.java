package com.example.Tasks09;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class DateTimeFactory {
    public static ZonedDateTime create(LocalDateTime dateTime, Airport airport) {
        return ZonedDateTime.of(dateTime, airport.getZone());
    }
}
