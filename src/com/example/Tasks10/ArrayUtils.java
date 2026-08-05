package com.example.Tasks10;

import java.util.Objects;

public final class ArrayUtils {
    private ArrayUtils() {}
    public static <T> void swap(T[] array, int i, int j) {
        if (array == null) {
            throw new NullPointerException("Array cannot be NULL");
        }
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("Wrong array size");
        }
        if (i == j) {
            return;
        }
        T temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;

    }

    /**
     * @throws NullPointerException if array is null
     */
    public static <T> int indexOf(T[] array, T value) {
        Objects.requireNonNull(array, "Array cannot be null");
        if (value == null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (value.equals(array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * @throws NullPointerException if array is null
     */
    public static <T> int lastIndexOf(T[] array, T value) {
        Objects.requireNonNull(array, "Array cannot be null");
        if (value == null) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (value.equals(array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static <T> boolean arraysEqual(T[] array1, T[] array2) {
       if (array1 == null && array2 == null) {
           return true;
       }
       if (array1 == null || array2 == null) {
           return false;
       }
       if (array1.length != array2.length) {
           return false;
       }
        for (int i = 0; i < array1.length; i++) {
            if (!Objects.equals(array1[i], array2[i])) {
                return false;
            }
        }return true;
    }
}