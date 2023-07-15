package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button login;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = findViewById(R.id.txt_username);
        EditText password = findViewById(R.id.txt_password);
        login = findViewById(R.id.button);
        signup = findViewById(R.id.signup_reg);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equalsIgnoreCase("admin")
                        && password.getText().toString().equalsIgnoreCase("password")) {
                    Toast.makeText(Login.this,
                            "Anda berhasil Login", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Login.this,
                            "Username atau Password Anda salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(Login.this, Register.class);
                startActivity(register);
            }
        });
    }
}