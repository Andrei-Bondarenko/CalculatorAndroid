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

public class MainActivity extends AppCompatActivity {

StorySingleton storySingleton = StorySingleton.getInstance();
    Calculator calculator = Calculator.getInstance();
    private Buttons buttons = new Buttons();
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
    Button button_delete;
    Button button_percent;
    Button button_story;
    String calculatorNumber;
    String calculatorOperation;
    String checkTextView = "";
    String text = "";
    ;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");

        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(view -> {
            textView.setText(textView.getText() + "0");
            calculatorNumber = "0";
            buttons.buttonNumberHandler(calculatorNumber);
        });
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view -> {
            textView.setText(textView.getText() + "1");
            calculatorNumber = "1";
            buttons.buttonNumberHandler(calculatorNumber);
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            textView.setText(textView.getText() + "2");
            calculatorNumber = "2";
            buttons.buttonNumberHandler(calculatorNumber);
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> {
            textView.setText(textView.getText() + "3");
            calculatorNumber = "3";
            buttons.buttonNumberHandler(calculatorNumber);
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            textView.setText(textView.getText() + "4");
            calculatorNumber = "4";
            buttons.buttonNumberHandler(calculatorNumber);
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(view -> {
            textView.setText(textView.getText() + "5");
            calculatorNumber = "5";
            buttons.buttonNumberHandler(calculatorNumber);
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(view -> {
            textView.setText(textView.getText() + "6");
            calculatorNumber = "6";
            buttons.buttonNumberHandler(calculatorNumber);
        });
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(view -> {
            textView.setText(textView.getText() + "7");
            calculatorNumber = "7";
            buttons.buttonNumberHandler(calculatorNumber);
        });
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(view -> {
            textView.setText(textView.getText() + "8");
            calculatorNumber = "8";
            buttons.buttonNumberHandler(calculatorNumber);
        });
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(view -> {
            textView.setText(textView.getText() + "9");
            calculatorNumber = "9";
            buttons.buttonNumberHandler(calculatorNumber);
        });
        button_plus = findViewById(R.id.button_plus);
        button_plus.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (checkTextView.compareTo("") != 0) {
                calculatorOperation = "+";
                if (buttons.buttonOperationHandler(calculatorOperation, checkTextView)) {
                    text = textView.getText().toString().substring(0, textView.getText().length() - 1);
                    textView.setText(text + calculatorOperation);
                } else textView.setText(textView.getText() + calculatorOperation);
            }
        });
        button_minus = findViewById(R.id.button_minus);
        button_minus.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (checkTextView.compareTo("") != 0) {
                calculatorOperation = "-";
                if (buttons.buttonOperationHandler(calculatorOperation, checkTextView)) {
                    text = textView.getText().toString().substring(0, textView.getText().length() - 1);
                    textView.setText(text + calculatorOperation);
                } else textView.setText(textView.getText() + calculatorOperation);
            }
        });
        button_umnojenie = findViewById(R.id.button_umnojenie);
        button_umnojenie.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (checkTextView.compareTo("") != 0) {
                calculatorOperation = "*";
                if (buttons.buttonOperationHandler(calculatorOperation, checkTextView)) {
                    text = textView.getText().toString().substring(0, textView.getText().length() - 1);
                    textView.setText(text + calculatorOperation);
                } else textView.setText(textView.getText() + calculatorOperation);
            }
        });
        button_delenie = findViewById(R.id.button_delenie);
        button_delenie.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (checkTextView.compareTo("") != 0) {
                calculatorOperation = "/";
                if (buttons.buttonOperationHandler(calculatorOperation, checkTextView)) {
                    text = textView.getText().toString().substring(0, textView.getText().length() - 1);
                    textView.setText(text + calculatorOperation);
                } else textView.setText(textView.getText() + calculatorOperation);
            }
        });

        button_point = findViewById(R.id.button_point);
        button_point.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (buttons.buttonPointHandler(checkTextView) == 1) textView.setText("0.");
            else if (buttons.buttonPointHandler(checkTextView) == 2)
                textView.setText(textView.getText() + ".");
            else if (buttons.buttonPointHandler(checkTextView) == 3)
                textView.setText(textView.getText() + "0.");
        });

        button_ravno = findViewById(R.id.button_ravno);
        button_ravno.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            if (buttons.buttonRavnoHandler(checkTextView)){
                Log.d(TAG, calculator.answer);
                textView.setText(calculator.answer);
            storySingleton.setStoryEntry(calculator.answer);
            }
        });

        button_delete = findViewById(R.id.button_delete);
        button_delete.setOnClickListener(view -> {
            checkTextView = textView.getText().toString();
            text = textView.getText().toString().substring(0, textView.getText().length() - 1);
            if (buttons.buttonDeleteHandler(checkTextView) == 1) textView.setText(text);
        });

        button_delete.setOnLongClickListener(view -> {
            checkTextView = textView.getText().toString();
            textView.setText("");
            buttons.buttonDeleteHandler(checkTextView);
            return true;
        });

        button_percent = findViewById(R.id.button_percent);
        button_percent.setOnClickListener(view -> {
            Intent intent = new Intent(this,PercentActivity.class);
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