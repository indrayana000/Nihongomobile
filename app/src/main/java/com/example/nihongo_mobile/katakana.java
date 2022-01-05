package com.example.nihongo_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class katakana extends AppCompatActivity {
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
        setContentView(R.layout.activity_katakana);
        getSupportActionBar().hide();
        declareButton();

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ア";
                setBaca = "A";
                setVoiceID = "0";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        });

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "イ";
                setBaca = "I";
                setVoiceID = "1";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        });
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ウ";
                setBaca = "U";
                setVoiceID = "2";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "エ";
                setBaca = "E";
                setVoiceID = "3";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        });
        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "オ";
                setBaca = "O";
                setVoiceID = "4";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        });

        btnKA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "カ";
                setBaca = "KA";
                setVoiceID = "5";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnKI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "キ";
                setBaca = "KI";
                setVoiceID = "6";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnKU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ク";
                setBaca = "KU";
                setVoiceID = "7";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnKE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ケ";
                setBaca = "KE";
                setVoiceID = "8";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnKO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "コ";
                setBaca = "KO";
                setVoiceID = "9";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

    }
    protected void pindahHalaman(String huruf, String baca, String voiceId){
        try {
            Intent pindahBaca = new Intent(katakana.this, halaman_audio.class);
            pindahBaca.putExtra("huruf", huruf);
            pindahBaca.putExtra("baca", baca);
            pindahBaca.putExtra("voiceId", voiceId);
            pindahBaca.putExtra("tipe", "Katakana");
            startActivity(pindahBaca);
        }catch(Exception e){

        }

    }
    protected void declareButton(){
        btnA = findViewById(R.id.buttonkatakana_a);
        btnI = findViewById(R.id.buttonkatakana_i);
        btnU = findViewById(R.id.buttonkatakana_u);
        btnE = findViewById(R.id.buttonkatakana_e);
        btnO = findViewById(R.id.buttonkatakana_o);
        btnKA = findViewById(R.id.buttonkatakana_ka);
        btnKI = findViewById(R.id.buttonkatakana_ki);
        btnKU = findViewById(R.id.buttonkatakana_ku);
        btnKE = findViewById(R.id.buttonkatakana_ke);
        btnKO = findViewById(R.id.buttonkatakana_ko);
        btnSA = findViewById(R.id.buttonkatakana_sa);
        btnSI = findViewById(R.id.buttonkatakana_si);
        btnSU = findViewById(R.id.buttonkatakana_su);
        btnSE = findViewById(R.id.buttonkatakana_se);
        btnSO = findViewById(R.id.buttonkatakana_so);
        btnTA = findViewById(R.id.buttonkatakana_ta);
        btnTI = findViewById(R.id.buttonkatakana_ti);
        btnTU = findViewById(R.id.buttonkatakana_tu);
        btnTE = findViewById(R.id.buttonkatakana_te);
        btnTO = findViewById(R.id.buttonkatakana_to);
        btnNA = findViewById(R.id.buttonkatakana_na);
        btnNI = findViewById(R.id.buttonkatakana_ni);
        btnNU = findViewById(R.id.buttonkatakana_nu);
        btnNE = findViewById(R.id.buttonkatakana_ne);
        btnNO = findViewById(R.id.buttonkatakana_no);
        btnHA = findViewById(R.id.buttonkatakana_ha);
        btnHI = findViewById(R.id.buttonkatakana_hi);
        btnHU = findViewById(R.id.buttonkatakana_hu);
        btnHE = findViewById(R.id.buttonkatakana_he);
        btnHO = findViewById(R.id.buttonkatakana_ho);
        btnMA = findViewById(R.id.buttonkatakana_ma);
        btnMI = findViewById(R.id.buttonkatakana_mi);
        btnMU = findViewById(R.id.buttonkatakana_mu);
        btnME = findViewById(R.id.buttonkatakana_me);
        btnMO = findViewById(R.id.buttonkatakana_mo);
        btnRA = findViewById(R.id.buttonkatakana_ra);
        btnRI = findViewById(R.id.buttonkatakana_ri);
        btnRU = findViewById(R.id.buttonkatakana_ru);
        btnRE = findViewById(R.id.buttonkatakana_re);
        btnRO = findViewById(R.id.buttonkatakana_ro);
    }
}