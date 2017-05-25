package com.simplechat.ricar.simplechat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText username, pasword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.etUser);
        pasword = (EditText)findViewById(R.id.etPass);

    }

    public void login(View view) {

        //Toast.makeText(this, "login", Toast.LENGTH_SHORT).show();
    }

    public void singUp(View view) {

        Intent intent = new Intent(this, SingUpActivity.class);
        startActivity(intent);
        //Toast.makeText(this, "singup", Toast.LENGTH_SHORT).show();
    }
}
