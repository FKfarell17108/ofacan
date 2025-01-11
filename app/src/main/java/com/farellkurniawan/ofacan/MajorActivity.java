package com.farellkurniawan.ofacan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MajorActivity extends AppCompatActivity {

    Button btndtlgerai1, btndtlgerai2, btndtlgerai3, btndtlgerai4, btndtlgerai5, btndtlgerai6, btndtlgerai7, btndtlgerai8, btndtlgerai9, btndtlgerai10, btndtlgerai11, btndtlgerai12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);

        btndtlgerai1 = (Button) findViewById(R.id.btn_dtl_gerai_1_major);
        btndtlgerai2 = (Button) findViewById(R.id.btn_dtl_gerai_2_major);
        btndtlgerai3 = (Button) findViewById(R.id.btn_dtl_gerai_3_major);
        btndtlgerai4 = (Button) findViewById(R.id.btn_dtl_gerai_4_major);
        btndtlgerai5 = (Button) findViewById(R.id.btn_dtl_gerai_5_major);
        btndtlgerai6 = (Button) findViewById(R.id.btn_dtl_gerai_6_major);
        btndtlgerai7 = (Button) findViewById(R.id.btn_dtl_gerai_7_major);
        btndtlgerai8 = (Button) findViewById(R.id.btn_dtl_gerai_8_major);
        btndtlgerai9 = (Button) findViewById(R.id.btn_dtl_gerai_9_major);
        btndtlgerai10 = (Button) findViewById(R.id.btn_dtl_gerai_10_major);
        btndtlgerai11 = (Button) findViewById(R.id.btn_dtl_gerai_11_major);
        btndtlgerai12 = (Button) findViewById(R.id.btn_dtl_gerai_12_major);

        btndtlgerai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai1 = new Intent(MajorActivity.this, DetailGerai1Activity.class);
                startActivity(btndtlgerai1);
            }
        });

        btndtlgerai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai2 = new Intent(MajorActivity.this, DetailGerai2Activity.class);
                startActivity(btndtlgerai2);
            }
        });

        btndtlgerai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai3 = new Intent(MajorActivity.this, DetailGerai3Activity.class);
                startActivity(btndtlgerai3);
            }
        });

        btndtlgerai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai4 = new Intent(MajorActivity.this, DetailGerai4Activity.class);
                startActivity(btndtlgerai4);
            }
        });

        btndtlgerai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai5 = new Intent(MajorActivity.this, DetailGerai5Activity.class);
                startActivity(btndtlgerai5);
            }
        });

        btndtlgerai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai6 = new Intent(MajorActivity.this, DetailGerai6Activity.class);
                startActivity(btndtlgerai6);
            }
        });

        btndtlgerai7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai7 = new Intent(MajorActivity.this, DetailGerai7Activity.class);
                startActivity(btndtlgerai7);
            }
        });

        btndtlgerai8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai8 = new Intent(MajorActivity.this, DetailGerai8Activity.class);
                startActivity(btndtlgerai8);
            }
        });

        btndtlgerai9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai9 = new Intent(MajorActivity.this, DetailGerai9Activity.class);
                startActivity(btndtlgerai9);
            }
        });

        btndtlgerai10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai10 = new Intent(MajorActivity.this, DetailGerai10Activity.class);
                startActivity(btndtlgerai10);
            }
        });

        btndtlgerai11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai11 = new Intent(MajorActivity.this, DetailGerai11Activity.class);
                startActivity(btndtlgerai11);
            }
        });

        btndtlgerai12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndtlgerai12 = new Intent(MajorActivity.this, DetailGerai12Activity.class);
                startActivity(btndtlgerai12);
            }
        });
    }
}