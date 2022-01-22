package com.example.MathFunction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sum,product,circumArea,EvenOdd,Vote,PrimeNumber,Grading,Fact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sum = findViewById(R.id.SumView);
        product = findViewById(R.id.ProductView);
        circumArea = findViewById(R.id.CAreaView);
        EvenOdd = findViewById(R.id.EOView);
        Vote = findViewById(R.id.VoteView);
        PrimeNumber = findViewById(R.id.PrimeView);
        Grading = findViewById(R.id.GradeView);
        Fact = findViewById(R.id.Factorial);


    sum.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),SumNumber_Activity.class));
        }
    });
    product.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),Product_number_Activity.class));
        }
    });

    circumArea.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),Circum_Area_Activity.class));
        }
    });

    EvenOdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),Even_Odd_Activity.class));
        }
    });

    Vote.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),Vote_Eligible_Activity.class));
        }
    });

    PrimeNumber.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),Prime_Number_Activity.class));
        }
    });

    Grading.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),Grade_Activity.class));
        }
    });
    Fact.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),Factorial_Activity.class));
        }
    });

    }
    

}