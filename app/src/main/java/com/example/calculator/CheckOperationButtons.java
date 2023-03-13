package com.example.calculator;

public class CheckOperationButtons {
    char lastChar = '\u0000';

    public boolean toCheckOperationButtons(String checkTextView) {
        if (checkTextView.compareTo("") != 0) {
            lastChar = checkTextView.charAt(checkTextView.length() - 1);
            return lastChar != '+' && lastChar != '-' && lastChar != '*' && lastChar != '/' && lastChar != '.';
        }
        return false;

    }
}
