package com.example.Tasks10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("============TASK1=================");
        task1Test();
        System.out.println("============TASK2=================");
        task2Test();
        System.out.println("============TASK3=================");
        task3Test();
        System.out.println("============TASK4=================");
        task4Test();
        System.out.println("============TASK5=================");
        task5Test();
        System.out.println("============TASK6=================");
        task6Test();
    }

    public static void task1Test() {
        Pair<Integer, String> p1 = Pair.of(1, "a");
        Pair<Integer, String> p2 = Pair.of(1, "a");
        Pair<Integer, String> p3 = Pair.of(1, "b");
        Pair<Integer, String> p4 = Pair.of(null, "x");
        Pair<String, String> p5 = Pair.of("A", "B");

        System.out.println("Equals P1 with P2: " + p1.equals(p2));
        System.out.println("Hashcode of P1 and P2: " + (p1.hashCode() == p2.hashCode()));
        System.out.println("Equals P1 with P3: " + p1.equals(p3));
        System.out.println("toString test: " + p4);
        System.out.println("Getter test: " + p4.first());

        // p5.first = "B"; BŁĄD KOMPILACJI: Pola są private i final, brak setterów, pola są niezmienne
    }

    public static void task2Test() {
        String[] stringArray = {"A", "B", "C"};
        Integer[] intArray = {1, 2, 3};

        System.out.println("Array before swap: " + Arrays.toString(stringArray));
        ArrayUtils.swap(stringArray, 0, 2);
        System.out.println("Array after swap: " + Arrays.toString(stringArray));

        System.out.println("TEST1: Try invalid index swap");
        try {
            ArrayUtils.swap(intArray, -1, 0);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println("TEST2: Try invalid index swap");
        try {
            ArrayUtils.swap(intArray, 0, 3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println("TEST3: Try invalid index swap");
        try {
            ArrayUtils.swap(intArray, -1, 0);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println("TEST4: Null array");
        try {
            ArrayUtils.swap(null, 0, 2);
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println("TEST5: Array same index swap");
        System.out.println("Array before: " + Arrays.toString(stringArray));
        ArrayUtils.swap(stringArray, 1, 1);
        System.out.println("Array after: " + Arrays.toString(stringArray));
    }

    public static void task3Test() {
        Integer[] intArray = {1, 2, 3, 4};
        Stats<Integer> stats = new Stats<>(intArray);
        System.out.println("Mean: " + stats.mean());
        System.out.println("Variance: " + stats.variance());
        Double[] x = {2.0, 2.0};
        Double[] y = {2.001, 1.999};
        Stats<Double> statsX = new Stats<>(x);
        Stats<Double> statsY = new Stats<>(y);
        System.out.println("Has same mean (X vs Y): " + statsX.hasSameMean(statsY, 0.01));
        System.out.println("Test for create empty array");
        try {
            Integer[] emptyArray = {};
            Stats<Integer> statsEmpty = new Stats<>(emptyArray);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void task4Test() {
        System.out.println("TEST1: String array");
        String[] stringArray = {"aa", "b", "ccc"};
        Pair<String, String> stringResult = MinMax.minMax(stringArray);
        System.out.println("Min: " + stringResult.first() + " Max: " + stringResult.second());

        System.out.println("TEST2: Number array");
        Integer[] intArray = {5, 5, -1, 10, 10};
        Pair<Integer, Integer> integerResult = MinMax.minMax(intArray);
        System.out.println("Min: " + integerResult.first() + " Max: " + integerResult.second());

        System.out.println("TEST3: One number array");
        Integer[] oneNumberArray = {42};
        Pair<Integer, Integer> oneNumberResult = MinMax.minMax(oneNumberArray);
        System.out.println("Min: " + oneNumberResult.first() + " Max: " + oneNumberResult.second());

        System.out.println("TEST4: Array with null");
        try {
            Integer[] arrayWithNull = {1, null, 2};
            MinMax.minMax(arrayWithNull);
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void task5Test() {
        String[] stringArray = {null, "a", null, "b", "a"};
        System.out.println("First index of null: " + ArrayUtils.indexOf(stringArray, null));
        System.out.println("Last index of null: " + ArrayUtils.lastIndexOf(stringArray, null));
        System.out.println("First index of 'a': " + ArrayUtils.indexOf(stringArray, "a"));
        System.out.println("Last index of 'a': " + ArrayUtils.lastIndexOf(stringArray, "a"));
        System.out.println("No such element index: " + ArrayUtils.lastIndexOf(stringArray, "zzz"));

    }

    public static void task6Test() {
        Integer[] sameArray1 = {1, null, 3};
        Integer[] sameArray2 = {1, null, 3};
        Integer[] diffArray = {1, 2, 3};
        String[] testArray = {"x"};
        String[] nullArray = {};
        System.out.println("Test for same arrays: " + ArrayUtils.arraysEqual(sameArray1, sameArray2));
        System.out.println("Test for different arrays: " + ArrayUtils.arraysEqual(sameArray1, diffArray));
        System.out.println("Test compare one null array: " + ArrayUtils.arraysEqual(testArray, nullArray));
        System.out.println("Test compare two null array: " + ArrayUtils.arraysEqual(nullArray, nullArray));

    }
}
