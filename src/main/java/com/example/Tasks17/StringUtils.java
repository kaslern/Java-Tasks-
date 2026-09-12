package com.example.Tasks17;

public class StringUtils {
    static public boolean isPalindrome(String text) {
        if (text == null || text.isBlank()) {
            return true;
        }
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
}
