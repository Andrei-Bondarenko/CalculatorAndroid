package com.example.calculator;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Calculator calculator;
    private static final String TAG = "";
    TextView textView;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button_plus;
    Button button_delenie;
    Button button_minus;
    Button button_ravno;
    Button button_point;
    Button button_umnojenie;
    String lastOperation = "";

    int result = 0;
    String tvValue = "";
    double num1 = 0;
    double num2 = 0;
    int operationCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");

        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(view -> {
            if (operationCount == 0) {
            textView.setText(textView.getText() + "0");
            tvValue = textView.getText().toString();
                num1 = Integer.parseInt(tvValue);
            }
            else if (operationCount >= 1) {
                tvValue = "";
                tvValue += "0";
                textView.setText(textView.getText() + tvValue);
                num2 = Integer.parseInt(tvValue);
                switch (lastOperation) {
                    case "+":
                        calculator.toAdd(num1, num2, result);
                        break;
                    case "-":
                        calculator.toSubtract(num1, num2, result);
                        break;
                    case "*":
                        calculator.toMultiply(num1, num2, result);
                        break;
                    case "/":
                        calculator.toDivide(num1, num2, result);
                        break;
                }
                num1 = result;
            }
        });
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view -> {
            if (operationCount == 0) {
                textView.setText(textView.getText() + "1");
                tvValue = textView.getText().toString();
                num1 = Integer.parseInt(tvValue);
            }
            else if (operationCount >= 1) {
                tvValue = "";
                tvValue += "1";
                textView.setText(textView.getText() + tvValue);
                num2 = Integer.parseInt(tvValue);
                switch (lastOperation) {
                    case "+":
                        calculator.toAdd(num1, num2, result);
                        break;
                    case "-":
                        calculator.toSubtract(num1, num2, result);
                        break;
                    case "*":
                        calculator.toMultiply(num1, num2, result);
                        break;
                    case "/":
                        calculator.toDivide(num1, num2, result);
                        break;
                }
                num1 = result;
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            if (operationCount == 0) {
                textView.setText(textView.getText() + "2");
                tvValue = textView.getText().toString();
                num1 = Integer.parseInt(tvValue);
            }
            else if (operationCount >= 1) {
                tvValue = "";
                tvValue += "2";
                textView.setText(textView.getText() + tvValue);
                num2 = Integer.parseInt(tvValue);
                switch (lastOperation) {
                    case "+":
                        calculator.toAdd(num1, num2, result);
                        break;
                    case "-":
                        calculator.toSubtract(num1, num2, result);
                        break;
                    case "*":
                        calculator.toMultiply(num1, num2, result);
                        break;
                    case "/":
                        calculator.toDivide(num1, num2, result);
                        break;
                }
                num1 = result;
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> {
            if (operationCount == 0) {
                textView.setText(textView.getText() + "3");
                tvValue = textView.getText().toString();
                num1 = Integer.parseInt(tvValue);
            }
            else if (operationCount >= 1) {
                tvValue = "";
                tvValue += "3";
                textView.setText(textView.getText() + tvValue);
                num2 = Integer.parseInt(tvValue);
                switch (lastOperation) {
                    case "+":
                        calculator.toAdd(num1, num2, result);
                        break;
                    case "-":
                        calculator.toSubtract(num1, num2, result);
                        break;
                    case "*":
                        calculator.toMultiply(num1, num2, result);
                        break;
                    case "/":
                        calculator.toDivide(num1, num2, result);
                        break;
                }
                num1 = result;
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            if (operationCount == 0) {
                textView.setText(textView.getText() + "4");
                tvValue = textView.getText().toString();
                num1 = Integer.parseInt(tvValue);
            }
            else if (operationCount >= 1) {
                tvValue = "";
                tvValue += "4";
                textView.setText(textView.getText() + tvValue);
                num2 = Integer.parseInt(tvValue);
                switch (lastOperation) {
                    case "+":
                        calculator.toAdd(num1, num2, result);
                        break;
                    case "-":
                        calculator.toSubtract(num1, num2, result);
                        break;
                    case "*":
                        calculator.toMultiply(num1, num2, result);
                        break;
                    case "/":
                        calculator.toDivide(num1, num2, result);
                        break;
                }
                num1 = result;
            }
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(view -> {
            if (operationCount == 0) {
                textView.setText(textView.getText() + "5");
                tvValue = textView.getText().toString();
                num1 = Integer.parseInt(tvValue);
            }
            else if (operationCount >= 1) {
                tvValue = "";
                tvValue += "5";
                textView.setText(textView.getText() + tvValue);
                num2 = Integer.parseInt(tvValue);
                switch (lastOperation) {
                    case "+":
                        calculator.toAdd(num1, num2, result);
                        break;
                    case "-":
                        calculator.toSubtract(num1, num2, result);
                        break;
                    case "*":
                        calculator.toMultiply(num1, num2, result);
                        break;
                    case "/":
                        calculator.toDivide(num1, num2, result);
                        break;
                }
                num1 = result;
            }
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(view -> {
            if (operationCount == 0) {
                textView.setText(textView.getText() + "6");
                tvValue = textView.getText().toString();
                num1 = Integer.parseInt(tvValue);
            }
            else if (operationCount >= 1) {
                tvValue = "";
                tvValue += "6";
                textView.setText(textView.getText() + tvValue);
                num2 = Integer.parseInt(tvValue);
                switch (lastOperation) {
                    case "+":
                        calculator.toAdd(num1, num2, result);
                        break;
                    case "-":
                        calculator.toSubtract(num1, num2, result);
                        break;
                    case "*":
                        calculator.toMultiply(num1, num2, result);
                        break;
                    case "/":
                        calculator.toDivide(num1, num2, result);
                        break;
                }
                num1 = result;
            }
        });
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(view -> {
            if (operationCount == 0) {
                textView.setText(textView.getText() + "7");
                tvValue = textView.getText().toString();
                num1 = Integer.parseInt(tvValue);
            }
            else if (operationCount >= 1) {
                tvValue = "";
                tvValue += "7";
                textView.setText(textView.getText() + tvValue);
                num2 = Integer.parseInt(tvValue);
                switch (lastOperation) {
                    case "+":
                        calculator.toAdd(num1, num2, result);
                        break;
                    case "-":
                        calculator.toSubtract(num1, num2, result);
                        break;
                    case "*":
                        calculator.toMultiply(num1, num2, result);
                        break;
                    case "/":
                        calculator.toDivide(num1, num2, result);
                        break;
                }
                num1 = result;
            }
        });
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(view -> {
            if (operationCount == 0) {
                textView.setText(textView.getText() + "8");
                tvValue = textView.getText().toString();
                num1 = Integer.parseInt(tvValue);
            }
            else if (operationCount >= 1) {
                tvValue = "";
                tvValue += "8";
                textView.setText(textView.getText() + tvValue);
                num2 = Integer.parseInt(tvValue);
                switch (lastOperation) {
                    case "+":
                        calculator.toAdd(num1, num2, result);
                        break;
                    case "-":
                        calculator.toSubtract(num1, num2, result);
                        break;
                    case "*":
                        calculator.toMultiply(num1, num2, result);
                        break;
                    case "/":
                        calculator.toDivide(num1, num2, result);
                        break;
                }
                num1 = result;
            }
        });
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(view -> {
            if (operationCount == 0) {
                textView.setText(textView.getText() + "9");
                tvValue = textView.getText().toString();
                num1 = Integer.parseInt(tvValue);
            }
            else if (operationCount >= 1) {
                tvValue = "";
                tvValue += "9";
                textView.setText(textView.getText() + tvValue);
                num2 = Integer.parseInt(tvValue);
                switch (lastOperation) {
                    case "+":
                        calculator.toAdd(num1, num2, result);
                        break;
                    case "-":
                        calculator.toSubtract(num1, num2, result);
                        break;
                    case "*":
                        calculator.toMultiply(num1, num2, result);
                        break;
                    case "/":
                        calculator.toDivide(num1, num2, result);
                        break;
                }
                num1 = result;
            }
        });
        button_plus = findViewById(R.id.button_plus);
        button_plus.setOnClickListener(view -> {
            textView.setText(textView.getText() + " + ");
            operationCount++;
            lastOperation = "+";
        });
        button_minus = findViewById(R.id.button_minus);
        button_minus.setOnClickListener(view -> {
            textView.setText(textView.getText() + " - ");
            operationCount++;
            lastOperation = "-";
            calculator.toSubtract(num1, num2, result);
        });
        button_delenie = findViewById(R.id.button_delenie);
        button_delenie.setOnClickListener(view -> {
            operationCount++;
            textView.setText(textView.getText() + " / ");
            lastOperation = "/";
            calculator.toDivide(num1, num2, result);
        });
        button_umnojenie = findViewById(R.id.button_umnojenie);
        button_umnojenie.setOnClickListener(view -> {
            textView.setText(textView.getText() + " * ");
            operationCount++;
            lastOperation = "*";
        });
        button_point = findViewById(R.id.button_point);
        button_point.setOnClickListener(view -> {
            textView.setText(textView.getText() + ".");
        });
        button_ravno = findViewById(R.id.button_ravno);
        button_ravno.setOnClickListener(view -> {
            textView.setText(textView.getText() + " = ");
            if (lastOperation.equals("-")) ;
            else if (lastOperation.equals("+")) ;
            else if (lastOperation.equals("*")) ;
            else if (lastOperation.equals("/")) ;
            else if (lastOperation.equals(".")) ;
            lastOperation = "=";
        });
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: ");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle
            outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}