package com.example.Tasks17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    @Test
    void shouldAcceptValidEmail() {
        assertDoesNotThrow(() -> UserValidator.validateEmail("test@example.com"));
    }

    @Test
    void shouldThrowExceptionWhenEmailDoesNotContainAt() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> UserValidator.validateEmail("testexample.com"));
        assertEquals("Email must contain '@'", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenEmailIsEmpty() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> UserValidator.validateEmail(""));
        assertEquals("Email cannot be empty", exception.getMessage());

    }

    @Test
    void shouldThrowExceptionWhenEmailIsNull() {
        NullPointerException exception =
                assertThrows(NullPointerException.class, () -> UserValidator.validateEmail(null));
        assertEquals("Email cannot be null", exception.getMessage());
    }




}