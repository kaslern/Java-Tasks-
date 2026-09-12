package com.example.Tasks16;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PasswordValidation {
    int minLength() default 8;
    boolean requireDigit() default true;
    boolean requireSpecialChar() default false;
}
