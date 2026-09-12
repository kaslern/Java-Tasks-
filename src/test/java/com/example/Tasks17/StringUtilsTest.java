package com.example.Tasks17;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Nested
    class StandardWords {
        @Test
        void shouldBePalindromeStandardText() {
        String text = "kajak";
        assertTrue(StringUtils.isPalindrome(text));
        }

        @Test
        void shouldNotBePalindrome() {
            String text = "java";
            assertFalse(StringUtils.isPalindrome(text));
        }

        @Test
        void shouldBePalindromeIgnoringCase() {
            String text = "Kajak";
            assertTrue(StringUtils.isPalindrome(text));
        }
    }

    @Nested
    class EdgeCases {
        @Test
        void shouldBePalindromeNull() {
            String text = null;
            assertTrue(StringUtils.isPalindrome(text));
        }

        @Test
        void shouldBePalindromeEmpty() {
            String text = "";
            assertTrue(StringUtils.isPalindrome(text));
        }
    }
}