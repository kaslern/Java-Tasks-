package com.example.Tasks16;

import java.lang.reflect.Field;
import java.util.Objects;

public class PasswordValidator {
    public static boolean validate(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(PasswordValidation.class)) {
                PasswordValidation annotation = field.getAnnotation(PasswordValidation.class);
                field.setAccessible(true);
                try {
                    String password = (String) field.get(obj);
                    if (password == null || password.length() < annotation.minLength()) {
                        System.out.println("Password is too short or null");
                        return false;
                    }
                    if (annotation.requireDigit() && !password.matches(".*\\d.*")) {
                        return false;
                    }
                    if (annotation.requireSpecialChar() && !password.matches(".*[^a-zA-Z0-9].*")) {
                        return false;
                    }

                } catch (IllegalAccessException e) {
                    e.getMessage();
                }
            }
        }
        return true;
    }
}
