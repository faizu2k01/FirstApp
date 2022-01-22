package com.example.MathFunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Vote_Eligible_Activity extends AppCompatActivity {

    EditText f,g;
    Button button;
    Double d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_eligible);

        f = (EditText) findViewById(R.id.ValueTwo);
        g = (EditText) findViewById(R.id.Value);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                d = Double.parseDouble(f.getText().toString());

                if(d>=18)
                {
                    g.setText("Eligible");
                }
                else
                {
                    g.setText("Not Eligible");
                }

            }
        });
    }
}