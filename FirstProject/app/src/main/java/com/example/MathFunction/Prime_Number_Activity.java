package com.example.MathFunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Prime_Number_Activity extends AppCompatActivity {

    EditText one,two;
    Button button;
    Double num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_number);

        one = (EditText) findViewById(R.id.Value);
        two = (EditText) findViewById(R.id.ValueTwo);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Double.parseDouble(one.getText().toString());
                if(primeOrnot(num1))
                {
                    two.setText("Prime number");
                }
                else
                {
                    two.setText("Not prime");
                }

            }
        });
    }

        public static boolean primeOrnot(double n)
        {
            if(n==1)
            {
                return false;
            }
            if((n==2)||(n==3))
            {
                return true;
            }
            if((n%2==0)&&(n%3)==0)
            {
                return false;
            }
            for(int i= 5;i<n;i=i+7)
            {

                if(((n%i)==0)||(n%i+6)==0)
                {
                    return false;
                }
            }
            return true;

        }


}