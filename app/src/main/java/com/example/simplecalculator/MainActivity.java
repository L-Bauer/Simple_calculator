package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondNumber = findViewById(R.id.number2);
        final RadioGroup operators = findViewById(R.id.operators);
        final RadioButton add = findViewById(R.id.add);
        final RadioButton subtract = findViewById(R.id.subtract);
        final Button equals = findViewById(R.id.equals);
        final TextView result = findViewById(R.id.result);

    }
}