package com.example.MathFunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Grade_Activity extends AppCompatActivity {

    EditText one,two;
    double num1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);

        one = (EditText) findViewById(R.id.Value);
        two = (EditText) findViewById(R.id.ValueTwo);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Double.parseDouble(one.getText().toString());

                if((num1<=100)&&(num1>=91))
                {
                    two.setText("AA");
                }
                if((num1<=90)&&(num1>=81))
                {
                    two.setText("AB");
                }
                if((num1<=80)&&(num1>=71))
                {
                    two.setText("BB");
                }
                if((num1<=70)&&(num1>=61))
                {
                    two.setText("BC");
                }
                if((num1<=60)&&(num1>=51))
                {
                    two.setText("CD");
                }
                if((num1<=50)&&(num1>=41))
                {
                    two.setText("DD");
                }
                if(num1<=40)
                {
                    two.setText("Fail");
                }
            }
        });
    }
}