package com.example.MathFunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Even_Odd_Activity extends AppCompatActivity {

    EditText one,two;
    Button button;
    Double n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_odd);

        one = (EditText) findViewById(R.id.Value);
        two = (EditText) findViewById(R.id.ValueTwo);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = Double.parseDouble(one.getText().toString());

                if(n1%2==0)
                {
                    two.setText("Even");
                }
                else if(n1%2 != 0)
                {
                    two.setText("Odd");
                }
            }
        });

    }
}