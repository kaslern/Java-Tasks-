package com.example.Tasks07;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Planet {
    EARTH(new BigDecimal("500.42"), new BigDecimal("12.475")),
    MERCURY(new BigDecimal("41.54"), new BigDecimal("25.454")),
    VENUS(new BigDecimal("100.545"), new BigDecimal("68.45")),
    JUPITER(new BigDecimal("25.4"), new BigDecimal("2147.245"));

    private final BigDecimal massTons;
    private final BigDecimal radiusKilometers;

    Planet(BigDecimal massTons, BigDecimal radiusKilometers) {
        this.massTons = massTons;
        this.radiusKilometers = radiusKilometers;
    }

    public BigDecimal getMassTons() {
        return massTons;
    }

    public BigDecimal getRadiusKilometers() {
        return radiusKilometers;
    }

    public BigDecimal getDensity() {
        return getMassTons().divide(getRadiusKilometers(),2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Planet: " + this.name() +
                " Density: " + this.getDensity();
    }
}
