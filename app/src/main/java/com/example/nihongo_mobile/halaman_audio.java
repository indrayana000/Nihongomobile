package com.example.nihongo_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class halaman_audio extends AppCompatActivity {
    Button btnAudio;
    String huruf, baca, idSuara, titleText;
    TextView tvHuruf, tvBaca;
    ImageView imgTitle;
    int voiceId;
    MediaPlayer mp;
    ArrayList<Integer> voices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_audio);
        getSupportActionBar().hide();
        btnAudio = findViewById(R.id.button_play);
        tvHuruf = findViewById(R.id.textViewHurufJepang);
        tvBaca = findViewById(R.id.textViewRomaji);
        imgTitle = findViewById(R.id.imgTitle);

        titleText = getIntent().getExtras().getString("tipe").toString();
        idSuara = getIntent().getExtras().getString("voiceId").toString();
        voiceId = Integer.valueOf(idSuara);
        voices = new ArrayList<>();
        declareAudio();
        changeTitle(titleText);
        huruf = getIntent().getExtras().getString("huruf").toString();
        baca = getIntent().getExtras().getString("baca").toString();

        tvHuruf.setText(huruf);
        tvBaca.setText(baca);


        mp = MediaPlayer.create(getApplicationContext(), voices.get(voiceId));
        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mp.seekTo(0);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mp.seekTo(0);
                        }
                    });
                    mp.start();
                }catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(), "error: " + e, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
    protected void changeTitle(String insertTitle){
        if(insertTitle.equals("Katakana")){
            imgTitle.setImageResource(R.drawable.katakana);
        }else{
            imgTitle.setImageResource(R.drawable.hiragana);
        }
    }
    protected void declareAudio(){
        try {
            voices.add(0, R.raw.a);
            voices.add(1, R.raw.i);
            voices.add(2, R.raw.u);
            voices.add(3, R.raw.e);
            voices.add(4, R.raw.o);
            voices.add(5, R.raw.ka);
            voices.add(6, R.raw.ki);
            voices.add(7, R.raw.ku);
            voices.add(8, R.raw.ke);
            voices.add(9, R.raw.ko);

        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error + " + e, Toast.LENGTH_SHORT).show();
        }
    }
}