package com.example.MathFunction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register_Activity extends AppCompatActivity {

    String n,e,m,g,p,c,buf1,buf2,insert;
    DBhelper DB;
    Button buttonTaken;
    EditText nameTaken,emailTaken,mobileTaken,genderTeken,passTaken,confirmPassTaken;

    Cursor res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        buttonTaken = findViewById(R.id.button1);
        nameTaken =(EditText) findViewById(R.id.fullname);
        emailTaken = (EditText) findViewById(R.id.email);
        mobileTaken = (EditText) findViewById(R.id.mobile);
        genderTeken = (EditText) findViewById(R.id.gender);
        passTaken = (EditText) findViewById(R.id.pass);
        confirmPassTaken =(EditText) findViewById(R.id.confimpass);

        DB = new DBhelper(this);




        buttonTaken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n = nameTaken.getText().toString();
                e = emailTaken.getText().toString();
                m = mobileTaken.getText().toString();
                g = genderTeken.getText().toString();
                p = passTaken.getText().toString();
                c = confirmPassTaken.getText().toString();


                if ((n.equals("")) || (e.equals("")) || (m.equals("")) || (g.equals("")) || (p.equals("")) || (c.equals(""))) {
                    nameTaken.setError("Something missing");
                } else {
                    insert = DB.insertData(n, e, m, g, p, c);

                    if (insert == "Execute") {
                        Toast.makeText(Register_Activity.this, "Registration Complete", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        nameTaken.setText("");
                        emailTaken.setText("");
                        mobileTaken.setText("");
                        genderTeken.setText("");
                        passTaken.setText("");
                        confirmPassTaken.setText("");

                    } else if (insert == "Failed") {
                        Toast.makeText(Register_Activity.this, "Not Registerd", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



    }






}