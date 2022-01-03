package com.example.nihongo_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class hiragana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiragana);

        getSupportActionBar().hide();
    }
}