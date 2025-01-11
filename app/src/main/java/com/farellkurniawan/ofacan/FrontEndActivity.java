package com.farellkurniawan.ofacan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontEndActivity extends AppCompatActivity {

    Button btnloginfrontend, btnregisterfrontend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontend);

        btnloginfrontend = (Button) findViewById(R.id.btn_login_frontend);
        btnregisterfrontend = (Button) findViewById(R.id.btn_register_frontend);

        btnloginfrontend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnloginfrontend = new Intent(FrontEndActivity.this, LoginActivity.class);
                startActivity(btnloginfrontend);
            }
        });

        btnregisterfrontend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnregisterfrontend = new Intent(FrontEndActivity.this, RegisterActivity.class);
                startActivity(btnregisterfrontend);
            }
        });
    }
}