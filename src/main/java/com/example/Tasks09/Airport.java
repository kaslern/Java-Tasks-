package com.example.Tasks09;

import java.time.ZoneId;

public enum Airport {
    WAW(ZoneId.of("Europe/Warsaw")),
    NYC(ZoneId.of("America/New_York")),
    TKY(ZoneId.of("Asia/Tokyo")),
    SGA(ZoneId.of("Asia/Singapore")),
    LON(ZoneId.of("Europe/London")),
    KOL(ZoneId.of("Asia/Kolkata")),
    LAX(ZoneId.of("America/Los_Angeles"));

    private final ZoneId zone;

    Airport(ZoneId zone) {
        this.zone = zone;
    }

    public ZoneId getZone() {
        return zone;
    }
}