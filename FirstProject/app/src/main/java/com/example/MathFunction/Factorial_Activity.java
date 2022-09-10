package com.example.MathFunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Factorial_Activity extends AppCompatActivity {

    EditText one,two;
   static double num1,factorial,num2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);

        one = (EditText) findViewById(R.id.Value);
        two = (EditText) findViewById(R.id.ValueTwo);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Double.parseDouble(one.getText().toString());
                num2 = Fact(num1);


                two.setText(Double.toString(num2));
            }
        });
    }

    public static double Fact(double n)
    {
        factorial =1;
        for(double i=1;i<=num1;i++)
        {
            factorial = i*factorial;
        }
        return factorial;
    }

}