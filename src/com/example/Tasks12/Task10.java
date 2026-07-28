package com.example.Tasks12;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class Task10 {
    public static void main(String[] args) {
        Supplier<String> codeSupplier = () -> {
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 6; i++) {
                int index = random.nextInt(chars.length());
                sb.append(chars.charAt(index));
            }
            return sb.toString();
        };

        String[] codes = new String[10];
        for (int i = 0; i < codes.length; i++) {
            codes[i] = codeSupplier.get();
        }
        System.out.println(Arrays.toString(codes));
    }
}
