package com.example.gauthierbonvarlet.nox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SuccessLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_login);

        Bundle inBundle = getIntent().getExtras();
        String name = inBundle.get("name").toString();
        String surname = inBundle.get("surname").toString();
        TextView myTextView = (TextView) findViewById(R.id.nameandsurname);
        myTextView.setText("Hi" + " " + name + " " + surname + "! " + "Welcome to NoX");
    }





}



