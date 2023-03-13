package com.example.calculator;

import static android.content.ContentValues.TAG;

import android.util.Log;

public class Buttons {
    private Calculator calculator = Calculator.getInstance();
    CheckOperationButtons checkOpBtn = new CheckOperationButtons();
    String lastOperation = "";
    String beforeLastOperation = "";
    String text = "";
    public double num1 = 0;
    public double num2 = 0;
    int operationCount = 0;
    String number1 = "";
    String number2 = "";
    String number3 = "";

    public void buttonNumberHandler(String calculatorNumberHandler) {
        if (operationCount == 0) {
            number1 += calculatorNumberHandler;
            if (lastOperation.equals(".")) num1 = Double.parseDouble(number1);
            else num1 = Integer.parseInt(number1);
            calculator.firstNumber = num1;
        } else if (operationCount >= 1) {
            if (beforeLastOperation.compareTo("") == 0 || beforeLastOperation.compareTo("=") == 0 || beforeLastOperation.compareTo(".") == 0) {
                number2 += calculatorNumberHandler;
                if (lastOperation.equals(".")) num2 = Double.parseDouble(number2);
                else num2 = Integer.parseInt(number2);
                calculator.secondNumber = num2;
                calculator.chooseOperation(lastOperation);
                num1 = calculator.operation;
                calculator.firstNumber = num1;
            } else if (beforeLastOperation.compareTo("") != 0 || beforeLastOperation.compareTo("=") != 0 || beforeLastOperation.compareTo(".") != 0) {
                calculator.chooseBeforeOperation(beforeLastOperation);
                number3 += "0";
                if (lastOperation.equals(".")) num2 = Double.parseDouble(number3);
                else num2 = Integer.parseInt(number3);
                calculator.firstNumber = num1;
                calculator.secondNumber = num2;
                calculator.chooseOperation(lastOperation);
                num1 = calculator.operation;
                calculator.firstNumber = num1;
            }
        }
    }

    public boolean buttonOperationHandler(String calculatorOperation, String checkTextView) {
        if (!checkOpBtn.toCheckOperationButtons(checkTextView)) {
            Log.d(TAG, "buttonOperationHandler: true ");
            text = checkTextView.substring(0, checkTextView.length() - 1);
            calculator.firstNumber = num1;
            beforeLastOperation = lastOperation;
            calculator.beforeLastOperation = beforeLastOperation;
            lastOperation = calculatorOperation;
            calculator.lastOperation = lastOperation;
            text += lastOperation;
            operationCount++;
            return true;
        } else {
            Log.d(TAG, "buttonOperationHandler: false ");
            operationCount++;
            beforeLastOperation = lastOperation;
            calculator.beforeLastOperation = beforeLastOperation;
            lastOperation = calculatorOperation;
            calculator.lastOperation = lastOperation;
            return false;
        }
    }

    public int buttonPointHandler(String checkTextView) {
        if (checkOpBtn.toCheckOperationButtons(checkTextView)) {
            if (checkTextView.compareTo("") == 0){
                lastOperation = ".";
                return 1;
            }
            else if (checkTextView.compareTo("") != 0 || number2.compareTo("") != 0) {
                beforeLastOperation = lastOperation;
                lastOperation = ".";
                return 2;
            } else if (number2.compareTo("") == 0) {
                number2 += "0";
                beforeLastOperation = lastOperation;
                lastOperation = ".";
                return 3;
            }
        }
        return 0;
    }

    public boolean buttonRavnoHandler(String checkTextView) {
        if (checkOpBtn.toCheckOperationButtons(checkTextView)) {
            beforeLastOperation = lastOperation;
            calculator.beforeLastOperation = beforeLastOperation;
            lastOperation = "=";
            calculator.lastOperation = lastOperation;
            number1 = "";
            number2 = "";
            number3 = "";
            num1 = calculator.operation;
            num2 = 0;
            operationCount = 0;
            return true;
        } else return false;
    }

    public int buttonDeleteHandler(String checkTextView) {
        if (checkTextView.compareTo("") != 0) return 1;
         else {
            beforeLastOperation = "";
            calculator.beforeLastOperation = beforeLastOperation;
            lastOperation = "";
            calculator.lastOperation = lastOperation;
            number1 = "";
            number2 = "";
            number3 = "";
            num1 = 0;
            num2 = 0;
            operationCount = 0;
        }
        return 2;
    }
}
