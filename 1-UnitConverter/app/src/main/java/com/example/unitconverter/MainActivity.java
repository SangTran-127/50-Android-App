package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcomeText, resultText;
    Button submitBtn;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeText = findViewById(R.id.welcome);
        resultText = findViewById(R.id.result_textView);
        submitBtn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText);

        submitBtn.setOnClickListener((view)-> {
             double kiloEnter = Double.parseDouble(editText.getText().toString());
             double result = convertToPounds(kiloEnter);
             resultText.setText(""+result);
        });
    }

    public double convertToPounds(double kilos) {
        return kilos * 2.20462;
    }

}