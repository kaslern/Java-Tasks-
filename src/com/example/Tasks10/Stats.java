package com.example.Tasks10;

import java.util.Objects;

public final class Stats<T extends Number> {
    private final T[] data;

    public Stats(T[] data) {
        Objects.requireNonNull(data, "Array cannot be null");
        if (data.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        this.data = data.clone();
    }

    public double mean() {
        double sum = 0;
        for (T numbers : data) {
            sum += numbers.doubleValue();
        }
        return sum / data.length;
    }

    public double variance() {
        double avg = mean();
        double sumOfSquares = 0;
        for (T numbers : data) {
           double difference = numbers.doubleValue() - avg;
           sumOfSquares += difference * difference;
        } return sumOfSquares / data.length;
    }

    public boolean hasSameMean(Stats<?> other, double eps) {
        return Math.abs(mean() - other.mean()) <= eps;
    }

}
