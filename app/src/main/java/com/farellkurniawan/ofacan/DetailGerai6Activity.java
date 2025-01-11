package com.farellkurniawan.ofacan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailGerai6Activity extends AppCompatActivity {

    Button btninccard1, btndeccard1, btninccard2, btndeccard2, btninccard3, btndeccard3, btninccard4, btndeccard4, btninccard5, btndeccard5;
    Button btninccard6, btndeccard6, btninccard7, btndeccard7, btninccard8, btndeccard8;
    TextView tvdisplaycard1, tvdisplaycard2, tvdisplaycard3, tvdisplaycard4, tvdisplaycard5, tvdisplaycard6, tvdisplaycard7, tvdisplaycard8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_gerai6);

        btninccard1 = findViewById(R.id.btn_inc_card_1_gerai_6_dtl);
        btndeccard1 = findViewById(R.id.btn_dec_card_1_gerai_6_dtl);
        tvdisplaycard1 = findViewById(R.id.tv_dislpay_card_1_gerai_6_dtl);

        btninccard2 = findViewById(R.id.btn_inc_card_2_gerai_6_dtl);
        btndeccard2 = findViewById(R.id.btn_dec_card_2_gerai_6_dtl);
        tvdisplaycard2 = findViewById(R.id.tv_dislpay_card_2_gerai_6_dtl);

        btninccard3 = findViewById(R.id.btn_inc_card_3_gerai_6_dtl);
        btndeccard3 = findViewById(R.id.btn_dec_card_3_gerai_6_dtl);
        tvdisplaycard3 = findViewById(R.id.tv_dislpay_card_3_gerai_6_dtl);

        btninccard4 = findViewById(R.id.btn_inc_card_4_gerai_6_dtl);
        btndeccard4 = findViewById(R.id.btn_dec_card_4_gerai_6_dtl);
        tvdisplaycard4 = findViewById(R.id.tv_dislpay_card_4_gerai_6_dtl);

        btninccard5 = findViewById(R.id.btn_inc_card_5_gerai_6_dtl);
        btndeccard5 = findViewById(R.id.btn_dec_card_5_gerai_6_dtl);
        tvdisplaycard5 = findViewById(R.id.tv_dislpay_card_5_gerai_6_dtl);

        btninccard6 = findViewById(R.id.btn_inc_card_6_gerai_6_dtl);
        btndeccard6 = findViewById(R.id.btn_dec_card_6_gerai_6_dtl);
        tvdisplaycard6 = findViewById(R.id.tv_dislpay_card_6_gerai_6_dtl);

        btninccard7 = findViewById(R.id.btn_inc_card_7_gerai_6_dtl);
        btndeccard7 = findViewById(R.id.btn_dec_card_7_gerai_6_dtl);
        tvdisplaycard7 = findViewById(R.id.tv_dislpay_card_7_gerai_6_dtl);

        btninccard8 = findViewById(R.id.btn_inc_card_8_gerai_6_dtl);
        btndeccard8 = findViewById(R.id.btn_dec_card_8_gerai_6_dtl);
        tvdisplaycard8 = findViewById(R.id.tv_dislpay_card_8_gerai_6_dtl);

        btninccard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard1.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                tvdisplaycard1.setText(String.valueOf(value));
            }
        });

        btndeccard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard1.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                tvdisplaycard1.setText(String.valueOf(value));
            }
        });

        btninccard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard2.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                tvdisplaycard2.setText(String.valueOf(value));
            }
        });

        btninccard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard3.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                tvdisplaycard3.setText(String.valueOf(value));
            }
        });

        btndeccard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard3.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                tvdisplaycard3.setText(String.valueOf(value));
            }
        });

        btninccard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard4.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                tvdisplaycard4.setText(String.valueOf(value));
            }
        });

        btndeccard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard4.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                tvdisplaycard4.setText(String.valueOf(value));
            }
        });

        btninccard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard5.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                tvdisplaycard5.setText(String.valueOf(value));
            }
        });

        btndeccard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard5.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                tvdisplaycard5.setText(String.valueOf(value));
            }
        });

        btninccard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard6.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                tvdisplaycard6.setText(String.valueOf(value));
            }
        });

        btndeccard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard6.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                tvdisplaycard6.setText(String.valueOf(value));
            }
        });

        btninccard7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard7.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                tvdisplaycard7.setText(String.valueOf(value));
            }
        });

        btndeccard7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard7.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                tvdisplaycard7.setText(String.valueOf(value));
            }
        });

        btninccard8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard8.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                tvdisplaycard8.setText(String.valueOf(value));
            }
        });

        btndeccard8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = tvdisplaycard8.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                tvdisplaycard8.setText(String.valueOf(value));
            }
        });


    }
}