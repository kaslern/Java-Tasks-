package com.example.Tasks04;

import java.util.Arrays;

public class Task13 {
    public static int[] reversedTab(int[] tab) {

        int[] newTab = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {

            newTab[i] = tab[tab.length - 1 - i];
        }
        return newTab;
    }

    public static void main(String[] args) {

        int[] table1 = {5, 10, 15, 20, 25};

        System.out.println(Arrays.toString(table1));

        System.out.println(Arrays.toString(reversedTab(table1)));
    }

}
