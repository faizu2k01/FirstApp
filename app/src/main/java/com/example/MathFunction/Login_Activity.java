package com.example.MathFunction;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Login_Activity extends AppCompatActivity {


    TextView  newuserTake;
    EditText emailTake, pass2Take;
    Button button2Take;
    DBhelper DB;
    String one, two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);


        newuserTake = findViewById(R.id.newuser);
        emailTake = findViewById(R.id.email2);
        pass2Take = findViewById(R.id.pass2);
        button2Take = findViewById(R.id.button2);

        DB = new DBhelper(this);





        button2Take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                one = emailTake.getText().toString();
                two = pass2Take.getText().toString();

                if((one.equals(""))||(two.equals("")))
                {
                    emailTake.setError("please enter email");
                    pass2Take.setError("please enter password");
                }
                else
                {
                  boolean result = DB.fetchPasswordEmail(one,two);


                    if(result == true)
                    {
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        Toast.makeText(Login_Activity.this,"User Match",Toast.LENGTH_SHORT).show();
                    }
                    else {


                        Toast.makeText(Login_Activity.this, "No such User Register your self", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });


        newuserTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), Register_Activity.class));
            }
        });


    }
}

