package com.example.Tasks10;

import java.util.Objects;

public final class MinMax {
    private MinMax() {}
    /**
     * @throws NullPointerException if array or any element is null
     * @throws IllegalArgumentException if array is empty
     */
    public static <T extends Comparable<? super T>> Pair<T,T> minMax(T[] array) {
        Objects.requireNonNull(array, "Array cannot be null");
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        T min = array[0];
        T max = array[0];
        for (T elements : array) {
            Objects.requireNonNull(elements, "Element cannot be null");
            if (elements.compareTo(max) > 0) {
                max = elements;
            }
            if (elements.compareTo(min) < 0) {
                min = elements;
            }
        }
        return Pair.of(min, max);
    }


}