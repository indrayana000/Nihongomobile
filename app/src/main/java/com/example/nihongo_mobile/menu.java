package com.example.nihongo_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        getSupportActionBar().hide();
    }
}