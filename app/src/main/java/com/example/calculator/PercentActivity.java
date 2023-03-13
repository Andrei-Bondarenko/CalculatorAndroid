package com.example.calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class PercentActivity extends AppCompatActivity {
    StorySingleton storySingleton = StorySingleton.getInstance();
    PercentCalculator calculator = new PercentCalculator();
    private PercentButtons buttons = new PercentButtons();
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
    Button button_plus_percent;
    Button button_divide_percent;
    Button button_minus_percent;
    Button button_ravno;
    Button button_point;
    Button button_multiply_percent;
    Button button_delete;
    Button button_back;
    Button button_story;
    String calculatorNumber;
    String calculatorOperation;
    String checkTextView = "";
    String text = "";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");

        setContentView(R.layout.activity_percent);
        textView = findViewById(R.id.textView);
        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(view -> {
            textView.setText(textView.getText() + "0");
            calculatorNumber = "0";
            buttons.buttonPercentHandler(calculatorNumber);
        });
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view -> {
            textView.setText(textView.getText() + "1");
            calculatorNumber = "1";
            buttons.buttonPercentHandler(calculatorNumber);
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            textView.setText(textView.getText() + "2");
            calculatorNumber = "2";
            buttons.buttonPercentHandler(calculatorNumber);
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> {
            textView.setText(textView.getText() + "3");
            calculatorNumber = "3";
            buttons.buttonPercentHandler(calculatorNumber);
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            textView.setText(textView.getText() + "4");
            calculatorNumber = "4";
            buttons.buttonPercentHandler(calculatorNumber);
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(view -> {
            textView.setText(textView.getText() + "5");
            calculatorNumber = "5";
            buttons.buttonPercentHandler(calculatorNumber);
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(view -> {
            textView.setText(textView.getText() + "6");
            calculatorNumber = "6";
            buttons.buttonPercentHandler(calculatorNumber);
        });
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(view -> {
            textView.setText(textView.getText() + "7");
            calculatorNumber = "7";
            buttons.buttonPercentHandler(calculatorNumber);
        });
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(view -> {
            textView.setText(textView.getText() + "8");
            calculatorNumber = "8";
            buttons.buttonPercentHandler(calculatorNumber);
        });
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(view -> {
            textView.setText(textView.getText() + "9");
            calculatorNumber = "9";
            buttons.buttonPercentHandler(calculatorNumber);
        });
        button_plus_percent = findViewById(R.id.button_plus_percent);
        button_plus_percent.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (checkTextView.compareTo("") != 0) {
                calculatorOperation = "+";
                if (buttons.buttonPercentOperationHandler(calculatorOperation, checkTextView)) {
                    text = textView.getText().toString().substring(0, textView.getText().length() - 1);
                    textView.setText(text + calculatorOperation);
                }else textView.setText(textView.getText() + calculatorOperation);
            }
        });
        button_minus_percent = findViewById(R.id.button_minus_percent);
        button_minus_percent.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (checkTextView.compareTo("") != 0) {
                calculatorOperation = "";
                if (buttons.buttonPercentOperationHandler(calculatorOperation, checkTextView)){
                    text = textView.getText().toString().substring(0, textView.getText().length() - 1);
                textView.setText(text + calculatorOperation);
                }
                else textView.setText(textView.getText() + calculatorOperation);
            }
        });
        button_multiply_percent = findViewById(R.id.button_multiply_percent);
        button_multiply_percent.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (checkTextView.compareTo("") != 0) {
                calculatorOperation = "*";
                if (buttons.buttonPercentOperationHandler(calculatorOperation, checkTextView)){
                    text = textView.getText().toString().substring(0, textView.getText().length() - 1);
                    textView.setText(text + calculatorOperation);
                }
                else textView.setText(textView.getText() + calculatorOperation);
            }
        });
        button_divide_percent = findViewById(R.id.button_divide_percent);
        button_divide_percent.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (checkTextView.compareTo("") != 0) {
                calculatorOperation = "/";
                if (buttons.buttonPercentOperationHandler(calculatorOperation, checkTextView)) {
                    text = textView.getText().toString().substring(0, textView.getText().length() - 1);
                    textView.setText(text + calculatorOperation);
                }
                else textView.setText(textView.getText() + calculatorOperation);
            }
        });
        button_point = findViewById(R.id.button_point);
        button_point.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (buttons.buttonPercentPointHandler(checkTextView) == 1) textView.setText("0.");
            else if (buttons.buttonPercentPointHandler(checkTextView) == 2)
                textView.setText(textView.getText() + ".");
            else if (buttons.buttonPercentPointHandler(checkTextView) == 3)
                textView.setText(textView.getText() + "0.");
        });
        button_ravno = findViewById(R.id.button_ravno);
        button_ravno.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (buttons.buttonPercentRavnoHandler(checkTextView))
                textView.setText(calculator.answer);
            storySingleton.setStoryEntry(calculator.answer);
        });
        button_delete = findViewById(R.id.button_delete);
        button_delete.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            text = textView.getText().toString().substring(0, textView.getText().length() - 1);
            if (buttons.buttonDeletePercentHandler(checkTextView) == 1) textView.setText(text);
        });
        button_delete.setOnLongClickListener(view -> {
            textView.setText("");
            return true;
        });
        button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
        button_story = findViewById(R.id.button_story);
        button_story.setOnClickListener(view -> {
            Intent intent = new Intent(this, StoryActivity.class);
            startActivity(intent);
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