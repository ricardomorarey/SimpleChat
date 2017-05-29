package com.simplechat.ricar.simplechat;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private EditText username, pasword;

    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.etUser);
        pasword = (EditText)findViewById(R.id.etPass);

        firebaseAuth = FirebaseAuth.getInstance();
        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null){
                    Toast.makeText(LoginActivity.this, "El usuario ya ha iniciado sesion", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity.this, "El usuario salió de la sesión", Toast.LENGTH_SHORT).show();
                }
            }
        };

    }

    @Override
    protected void onStart() {
        super.onStart();
        firebaseAuth.addAuthStateListener(authStateListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (authStateListener != null){
            firebaseAuth.removeAuthStateListener(authStateListener);
        }
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
