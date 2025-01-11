package com.farellkurniawan.ofacan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btnloginlg, tvbtnregisterlglayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnloginlg = (Button) findViewById(R.id.btn_login_lg_layout);
        tvbtnregisterlglayout = (Button) findViewById(R.id.tv_btn_register_lg_layout);

        btnloginlg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnloginlg = new Intent(LoginActivity.this, MajorActivity.class);
                startActivity(btnloginlg);
            }
        });

        tvbtnregisterlglayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tvbtnregisterlglayout = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(tvbtnregisterlglayout);
            }
        });
    }
}