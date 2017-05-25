package com.simplechat.ricar.simplechat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SingUpActivity extends AppCompatActivity {

    private EditText username, pasword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        username = (EditText)findViewById(R.id.etUserS);
        pasword = (EditText)findViewById(R.id.etPassS);

    }

    public void ssingUp(View view) {
    }
}
