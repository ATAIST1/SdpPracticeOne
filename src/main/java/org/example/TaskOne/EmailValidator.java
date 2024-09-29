package org.example.TaskOne;

public class EmailValidator {
    public boolean isValid(String email) {
        return email.contains("@") && email.contains(".");
    }

}
