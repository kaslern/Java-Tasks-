package com.example.Tasks08;

import java.util.regex.Pattern;

// TODO: zdefiniuj własne wyjątki domenowe (nazwy wymyśl sam/a)
// np. bazowy wyjątek walidacji + osobne podtypy dla różnych przyczyn błędu

public final class EmailValidator {
    private EmailValidator() {}

    // TODO: zdefiniuj wzorzec, np.:
    private static final Pattern EMAIL =
            Pattern.compile("^[\\w.+\\-]+@[\\w\\-]+\\.[a-zA-Z]{2,}$");

    public static void validate(String email) {

        if (email == null) {
            throw new EmptyEmailException("email is null");
        }

        if (email.isBlank()){
            throw new EmptyEmailException("email is empty");
        }

        if (EMAIL.matcher(email).matches() == false) {
            throw new InvalidEmailFormatException("Wrong e-mail format");
        }


        // TODO: walidacja wg opisu; rzucaj własne wyjątki domenowe z jasnym komunikatem
    }
}