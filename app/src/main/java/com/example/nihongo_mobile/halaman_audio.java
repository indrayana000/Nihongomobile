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
            voices.add(10, R.raw.sa);
            voices.add(11, R.raw.shi);
            voices.add(12, R.raw.su);
            voices.add(13, R.raw.se);
            voices.add(14, R.raw.so);
            voices.add(15, R.raw.to);
            voices.add(16, R.raw.chi);
            voices.add(17, R.raw.tsu);
            voices.add(18, R.raw.te);
            voices.add(19, R.raw.to);
            voices.add(20, R.raw.no);
            voices.add(21, R.raw.ni);
            voices.add(22, R.raw.nu);
            voices.add(23, R.raw.ne);
            voices.add(24, R.raw.no);
            voices.add(25, R.raw.ho);
            voices.add(26, R.raw.hi);
            voices.add(27, R.raw.fu);
            voices.add(28, R.raw.he);
            voices.add(29, R.raw.ho);
            voices.add(30, R.raw.ma);
            voices.add(31, R.raw.mi);
            voices.add(32, R.raw.mu);
            voices.add(33, R.raw.me);
            voices.add(34, R.raw.mo);
            voices.add(35, R.raw.yo);
            voices.add(36, R.raw.yu);
            voices.add(37, R.raw.yo);
            voices.add(38, R.raw.ra);
            voices.add(39, R.raw.ri);
            voices.add(40, R.raw.ru);
            voices.add(41, R.raw.re);
            voices.add(42, R.raw.ro);
            voices.add(43, R.raw.wo);
            voices.add(44, R.raw.wo);
            voices.add(45, R.raw.n);
            voices.add(46, R.raw.ga);
            voices.add(47, R.raw.gi);
            voices.add(48, R.raw.gu);
            voices.add(49, R.raw.ge);
            voices.add(50, R.raw.go);
            voices.add(51, R.raw.za);
            voices.add(52, R.raw.ji);
            voices.add(53, R.raw.zu);
            voices.add(54, R.raw.ze);
            voices.add(55, R.raw.ze);
            voices.add(56, R.raw.da);
            voices.add(57, R.raw.dji);
            voices.add(58, R.raw.dzu);
            voices.add(59, R.raw.de);
            voices.add(60, R.raw.doo);
            voices.add(61, R.raw.ba);
            voices.add(62, R.raw.bi);
            voices.add(63, R.raw.bu);
            voices.add(64, R.raw.be);
            voices.add(65, R.raw.bo);
            voices.add(66, R.raw.pa);
            voices.add(67, R.raw.pi);
            voices.add(68, R.raw.pu);
            voices.add(69, R.raw.pe);
            voices.add(70, R.raw.po);


        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error + " + e, Toast.LENGTH_SHORT).show();
        }
    }
}