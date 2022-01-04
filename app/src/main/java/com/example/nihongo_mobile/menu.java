package com.example.nihongo_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    Button btnHiragana, btnKatakana, btnPercakapan, btnBudaya, btnSoal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        getSupportActionBar().hide();
        btnHiragana = findViewById(R.id.button_hiragana);
        btnKatakana= findViewById(R.id.button_katakana);
        btnPercakapan = findViewById(R.id.button_percakapan);
        btnBudaya= findViewById(R.id.button_budaya);
        btnSoal = findViewById(R.id.button_soal);

        btnHiragana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_hiragana = new Intent(menu.this, hiragana.class);
                startActivity(intent_hiragana);
            }
        });
        btnKatakana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_katakana = new Intent(menu.this, splash_katakana.class);
                startActivity(intent_katakana);
            }
        });
        btnSoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_hiragana = new Intent(menu.this, halaman_soal.class);
                startActivity(intent_hiragana);
            }
        });
        btnBudaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_budaya = new Intent(menu.this, budaya_jepang.class);
                startActivity(intent_budaya);
            }
        });
        btnPercakapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                Intent intent_percakapan = new Intent(menu.this, halaman_percakapan.class);
                startActivity(intent_percakapan);
            }
        });

    }
}