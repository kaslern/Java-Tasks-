package com.example.Tasks12;

@FunctionalInterface
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}

public class Task12 {
    public static void main(String[] args) {
        TriFunction<Double, Double, Double, Double> weightedAverage = (ocena, waga, maxWaga) ->
                (ocena * waga) / maxWaga;

        double[] oceny = {3.0, 4.5, 5.0};
        double[] wagi  = {1.0, 2.0, 3.0};

        double sumaWag = 0;
        for (double w : wagi) {
            sumaWag += w;
        }

        double avg = 0;
        for (int i = 0; i < oceny.length; i++) {
            avg += weightedAverage.apply(oceny[i], wagi[i], sumaWag);
        }
        System.out.println(avg);
    }
}
