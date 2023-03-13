package com.example.calculator;

public class PercentCalculator {
    double firstNumber;
    double secondNumber;
    double operation;
    String lastOperation;
    String beforeLastOperation;
    String answer;

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
        operation = (firstNumber / 100 * secondNumber) + firstNumber;
        answer = firstNumber + " + " + secondNumber + "% = " + operation;
    }

    public void toSubtract(double firstNumber, double secondNumber) {
        operation = firstNumber - (firstNumber / 100 * secondNumber);
        answer = firstNumber + " - " + secondNumber + "% = " + operation;
    }

    public void toMultiply(double firstNumber, double secondNumber) {
        operation = firstNumber * (firstNumber / 100 * secondNumber);
        answer = firstNumber + " * " + secondNumber + "% = " + operation;
    }

    public void toDivide(double firstNumber, double secondNumber) {
        operation = firstNumber / (firstNumber / 100 * secondNumber);
        answer = firstNumber + " / " + secondNumber + "% = " + operation;
    }
}
