package com.example.Tasks13;

import java.util.List;
import java.util.Optional;

public class Task9 {
    static String describeGrade(Optional<Integer> grade) {
        return grade
                .filter(g -> g >= 4)
                .map(g -> "Dobra ocena: " + g)
                .orElse("Pominięto");
    }

    public static void main(String[] args) {
        List<Optional<Integer>> oceny = List.of(
                Optional.of(5), Optional.of(3), Optional.empty(),
                Optional.of(4), Optional.of(2), Optional.of(5)
        );

        for (Optional<Integer> i : oceny) {
            System.out.println(describeGrade(i));
        }
    }
}
