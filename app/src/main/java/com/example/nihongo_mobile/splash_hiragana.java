package com.example.nihongo_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class splash_hiragana extends AppCompatActivity {

    TextView tvjp, tvromaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_katakana);
        getSupportActionBar().hide();
        tvjp = findViewById(R.id.tvJp);
        tvromaj = findViewById(R.id.tvromaj);
        tvjp.setText("ひらがな");
        tvromaj.setText("Hiragana");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent akhirSplash = new Intent(splash_hiragana.this, hiragana.class);
                startActivity(akhirSplash);
                finish();
            }
        }, 100);
    }
}