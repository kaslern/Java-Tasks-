package com.example.Tasks12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Task5 {
    public static void main(String[] args) {
        UnaryOperator<List<Integer>> removeNegatives = list -> {
            list.removeIf( n -> n < 0);
            return list;
        };

        BinaryOperator<Integer> maxOp = (a, b) -> a > b ? a : b;

        List<Integer> nums = new ArrayList<>(Arrays.asList(3, -1, 7, -5, 10, 0));
        System.out.println("List before remove: " + nums);
        removeNegatives.apply(nums);
        System.out.println("List after remove: " + nums);

        int max = nums.get(0);
        for (Integer num : nums) {
            max = maxOp.apply(max, num);
        }
        System.out.println("Maximum: " + max);
    }

}
