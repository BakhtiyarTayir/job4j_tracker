package ru.job4j.early;


import static java.lang.Character.*;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32){
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        if (password.equals(password.toLowerCase())){
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }

        if (password.equals(password.toUpperCase())){
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }

        if (!isContainsDigit(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }

        if (!isContainsSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        if (isContainsSubStr(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }

        return password;
    }

    private static boolean isContainsSubStr(String password) {
        boolean result = false;
        String passLowerCase = password.toLowerCase();
        if (passLowerCase.contains("qwerty") ||
                passLowerCase.contains("12345") ||
                passLowerCase.contains("password") ||
                passLowerCase.contains("admin") ||
                passLowerCase.contains("user")
        ) {
            result = true;
        }
        return result;
    }

    private static boolean isContainsSymbol(String password) {
        char[] charPassword = password.toCharArray();
        boolean result = false;
        for (char ch : charPassword) {
            if (!isLetterOrDigit(ch)) {
                result = true;
            }
        }
        return result;
    }

    private static boolean isContainsDigit(String password) {
        char[] charPassword = password.toCharArray();
        boolean isNumber = false;
        for (char ch : charPassword) {
            if (isDigit(ch)) {
                isNumber = true;
            }
        }
        return isNumber;
    }


}