package org.example;

public class EmailValidator {
    public boolean isValid(String email) {
        return email.contains("@") && email.contains(".");
    }

}
