package com.example.nihongo_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class splash_katakana extends AppCompatActivity {
    TextView tvjp, tvromaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_katakana);
        getSupportActionBar().hide();
        tvjp = findViewById(R.id.tvJp);
        tvromaj = findViewById(R.id.tvromaj);
        tvjp.setText("カタカナ");
        tvromaj.setText("Katakana");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent akhirSplash = new Intent(splash_katakana.this, katakana.class);
                startActivity(akhirSplash);
                finish();
            }
        }, 100);
    }
}