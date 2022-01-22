package com.example.MathFunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SumNumber_Activity extends AppCompatActivity {
    EditText s1,s2,s3;
    double num1,num2,num3;
    EditText first,second,third;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_number);

        first =(EditText) findViewById(R.id.firstNumber);
        second = (EditText) findViewById(R.id.secondNumber);
        third = findViewById(R.id.Result);
        b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(first.getText().toString());
                num2 = Double.parseDouble(second.getText().toString());

                num3 = num1+num2;

                third.setText(Double.toString(num3));
            }
        });







    }
}