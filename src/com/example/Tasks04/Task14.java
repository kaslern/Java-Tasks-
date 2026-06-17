package com.example.Tasks04;

import java.util.Arrays;

public class Task14 {
    public static int[] tableMerge(int[] table1, int[] table2) {

        int[] mergedTab = new int[table1.length + table2.length];

        for (int i = 0; i < table1.length; i++) {

            mergedTab[i] = table1[i];
        }

        for (int i = 0; i < table2.length; i++) {

            mergedTab[table1.length + i] = table2[i];
        }
        return mergedTab;
    }

    public static void main(String[] args) {

        int[] numbers1 = {5, 10, 15, 20, 25};
        int[] numbers2 = {50, 60, 70, 80,};

        System.out.println(Arrays.toString(tableMerge(numbers1, numbers2)));
    }
}
