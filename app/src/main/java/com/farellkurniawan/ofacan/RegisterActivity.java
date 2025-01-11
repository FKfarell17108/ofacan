package com.farellkurniawan.ofacan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    Button tvbtnloginrglayout, btnregisterrglayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tvbtnloginrglayout = (Button) findViewById(R.id.tv_btn_login_rg_layout);
        btnregisterrglayout = (Button) findViewById(R.id.btn_register_rg_layout);

        tvbtnloginrglayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tvbtnloginrglayout = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(tvbtnloginrglayout);
            }
        });

        btnregisterrglayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnregisterrglayout = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(btnregisterrglayout);
            }
        });
    }
}