package com.example.nihongo_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hiragana extends AppCompatActivity {
    Button btnA, btnI, btnU, btnE, btnO,
            btnKA, btnKI, btnKU, btnKE, btnKO,
            btnSA, btnSI, btnSU, btnSE, btnSO,
            btnTA, btnTI, btnTU, btnTE, btnTO,
            btnNA, btnNI, btnNU, btnNE, btnNO,
            btnHA, btnHI, btnHU, btnHE, btnHO,
            btnMA, btnMI, btnMU, btnME, btnMO,
            btnYA, btnYU, btnYO,
            btnRA, btnRI, btnRU, btnRE, btnRO,
            bntWA, btnWO, btnN,
            btnGA, btnGI, btnGU, btnGE, btnGO,
            btnZA, btnZI, btnZU, btnZE, btnZO,
            btnDA, btnDI, btnDU, btnDE, btnDO,
            btnBA, btnBI, btnBU, btnBE, btnBO;
    String setHuruf, setBaca, setVoiceID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiragana);
        getSupportActionBar().hide();
        declareButton();

        btnA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "あ";
                setBaca = "A";
                setVoiceID = "0";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "い";
                setBaca = "I";
                setVoiceID = "1";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "う";
                setBaca = "U";
                setVoiceID = "2";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "え";
                setBaca = "E";
                setVoiceID = "3";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "お";
                setBaca = "O";
                setVoiceID = "4";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnKA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "か";
                setBaca = "KA";
                setVoiceID = "5";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnKI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "き";
                setBaca = "KI";
                setVoiceID = "6";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnKU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "く";
                setBaca = "KU";
                setVoiceID = "7";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnKE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "け";
                setBaca = "KE";
                setVoiceID = "8";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnKO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "こ";
                setBaca = "KO";
                setVoiceID = "9";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

    }
    protected void pindahHalaman(String huruf, String baca, String voiceId){
        try {
            Intent pindahBaca = new Intent(hiragana.this, halaman_audio.class);
            pindahBaca.putExtra("huruf", huruf);
            pindahBaca.putExtra("baca", baca);
            pindahBaca.putExtra("voiceId", voiceId);
            pindahBaca.putExtra("tipe", "Hiragana");
            startActivity(pindahBaca);
        }catch(Exception e){

        }
    }
    protected void declareButton(){
        btnA = findViewById(R.id.buttonhiragana_a);
        btnI = findViewById(R.id.buttonhiragana_i);
        btnU = findViewById(R.id.buttonhiragana_u);
        btnE = findViewById(R.id.buttonhiragana_e);
        btnO = findViewById(R.id.buttonhiragana_o);
        btnKA = findViewById(R.id.buttonhiragana_ka);
        btnKI = findViewById(R.id.buttonhiragana_ki);
        btnKU = findViewById(R.id.buttonhiragana_ku);
        btnKE = findViewById(R.id.buttonhiragana_ke);
        btnKO = findViewById(R.id.buttonhiragana_ko);
        btnSA = findViewById(R.id.buttonhiragana_sa);
        btnSI = findViewById(R.id.buttonhiragana_si);
        btnSU = findViewById(R.id.buttonhiragana_su);
        btnSE = findViewById(R.id.buttonhiragana_se);
        btnSO = findViewById(R.id.buttonhiragana_so);
        btnTA = findViewById(R.id.buttonhiragana_ta);
        btnTI = findViewById(R.id.buttonhiragana_ti);
        btnTU = findViewById(R.id.buttonhiragana_tu);
        btnTE = findViewById(R.id.buttonhiragana_te);
        btnTO = findViewById(R.id.buttonhiragana_to);
        btnNA = findViewById(R.id.buttonhiragana_na);
        btnNI = findViewById(R.id.buttonhiragana_ni);
        btnNU = findViewById(R.id.buttonhiragana_nu);
        btnNE = findViewById(R.id.buttonhiragana_ne);
        btnNO = findViewById(R.id.buttonhiragana_no);
        btnHA = findViewById(R.id.buttonhiragana_ha);
        btnHI = findViewById(R.id.buttonhiragana_hi);
        btnHU = findViewById(R.id.buttonhiragana_hu);
        btnHE = findViewById(R.id.buttonhiragana_he);
        btnHO = findViewById(R.id.buttonhiragana_ho);
        btnMA = findViewById(R.id.buttonhiragana_ma);
        btnMI = findViewById(R.id.buttonhiragana_mi);
        btnMU = findViewById(R.id.buttonhiragana_mu);
        btnME = findViewById(R.id.buttonhiragana_me);
        btnMO = findViewById(R.id.buttonhiragana_mo);
        btnRA = findViewById(R.id.buttonhiragana_ra);
        btnRI = findViewById(R.id.buttonhiragana_ri);
        btnRU = findViewById(R.id.buttonhiragana_ru);
        btnRE = findViewById(R.id.buttonhiragana_re);
        btnRO = findViewById(R.id.buttonhiragana_ro);
    }
}