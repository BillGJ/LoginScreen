package com.ebillson.loginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        etUsername = (EditText)findViewById(R.id.etUsername);

    }

    public  void onLogin(View view){


        Toast.makeText(LoginActivity.this,"Hello "+etUsername.getText().toString()+" .You logged in succesfully",Toast.LENGTH_LONG).show();

    }


}
