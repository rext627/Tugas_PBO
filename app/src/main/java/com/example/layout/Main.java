package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    Button linear, relative, login, view, negara, kalkulator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.btnLinear);
        relative = findViewById(R.id.btnRelative);
        login = findViewById(R.id.btnLogin);
        view = findViewById(R.id.btnView);
        negara = findViewById(R.id.btnNegara);
        kalkulator = findViewById(R.id.btnKalkulator);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linearlayout = new Intent(Main.this, LinearLayout.class);
                startActivity(linearlayout);
            }
        });
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relativelayout = new Intent(Main.this, RelativeLayout.class);
                startActivity(relativelayout);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menulogin = new Intent(Main.this, Login.class);
                startActivity(menulogin);
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewData = new Intent(Main.this, ListDataActivity.class);
                startActivity(viewData);
            }
        });
        kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kalkulator = new Intent(Main.this, Kalkulator.class);
                startActivity(kalkulator);
            }
        });
        negara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuNegara = new Intent(Main.this, ListViewActivity.class);
                startActivity(menuNegara);
            }
        });
    }
}