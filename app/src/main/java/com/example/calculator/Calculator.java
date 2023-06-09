package com.example.calculator;

import android.util.Log;

import java.util.ArrayList;

public class Calculator {
    private static final String TAG = "";
    double firstNumber;
    double secondNumber;
    double operation;
    String lastOperation;
    String beforeLastOperation;
    String answer;
    private static Calculator instance;

    private Calculator() {
    }

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    public void chooseOperation(String lastOperation) {
        switch (lastOperation) {
            case "+":
                toAdd(firstNumber, secondNumber);
                break;
            case "-":
                toSubtract(firstNumber, secondNumber);
                break;
            case "*":
                toMultiply(firstNumber, secondNumber);
                break;
            case "/":
                toDivide(firstNumber, secondNumber);
                break;
        }
    }

    public void chooseBeforeOperation(String beforeLastOperation) {
        switch (beforeLastOperation) {
            case "+":
                toAdd(firstNumber, secondNumber);
                break;
            case "-":
                toSubtract(firstNumber, secondNumber);
                break;
            case "*":
                toMultiply(firstNumber, secondNumber);
                break;
            case "/":
                toDivide(firstNumber, secondNumber);
                break;
        }
    }

    public void toAdd(double firstNumber, double secondNumber) {
        operation = firstNumber + secondNumber;
        answer = firstNumber + " + " + secondNumber + " = " + operation;
        Log.d(TAG,  answer);
    }

    public void toSubtract(double firstNumber, double secondNumber) {
        operation = firstNumber - secondNumber;
        answer = firstNumber + " - " + secondNumber + " = " + operation;
    }

    public void toMultiply(double firstNumber, double secondNumber) {
        operation = firstNumber * secondNumber;
        answer = firstNumber + " * " + secondNumber + " = " + operation;
    }

    public void toDivide(double firstNumber, double secondNumber) {
        operation = firstNumber / secondNumber;
        answer = firstNumber + " / " + secondNumber + " = " + operation;
    }


}
