package com.example.MathFunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Circum_Area_Activity extends AppCompatActivity {

    EditText first,second,third;
    Double ratio,circum,area;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circum_area);

        first = (EditText) findViewById(R.id.firstNumber);
        second = (EditText) findViewById(R.id.SecondNumber);
        third =(EditText) findViewById(R.id.AreaNumber);
        button = findViewById(R.id.button);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ratio = Double.parseDouble(first.getText().toString());

               circum = (2*3.14*ratio);
               area = (2*ratio*ratio);

               second.setText(Double.toString(circum));
               third.setText(Double.toString(area));
           }
       });


    }
}