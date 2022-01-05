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
            btnWA, btnWO, btnN,
            btnGA, btnGI, btnGU, btnGE, btnGO,
            btnZA, btnZI, btnZU, btnZE, btnZO,
            btnDA, btnDI, btnDU, btnDE, btnDO,
            btnBA, btnBI, btnBU, btnBE, btnBO,
            btnPA, btnPI, btnPU, btnPE, btnPO;
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

        btnSA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "さ";
                setBaca = "SA";
                setVoiceID = "10";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnSI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "し";
                setBaca = "SI";
                setVoiceID = "11";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnSU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "す";
                setBaca = "SU";
                setVoiceID = "12";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnSE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "せ";
                setBaca = "SE";
                setVoiceID = "13";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnSO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "そ";
                setBaca = "SO";
                setVoiceID = "14";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnTA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "た";
                setBaca = "TA";
                setVoiceID = "15";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnTI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ち";
                setBaca = "CHI";
                setVoiceID = "16";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnTU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "つ";
                setBaca = "TSU";
                setVoiceID = "17";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnTE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "て";
                setBaca = "TE";
                setVoiceID = "18";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnTO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "と";
                setBaca = "TO";
                setVoiceID = "19";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnNA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "な";
                setBaca = "NA";
                setVoiceID = "20";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnNI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "に";
                setBaca = "NI";
                setVoiceID = "21";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnNU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぬ";
                setBaca = "NU";
                setVoiceID = "22";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnNE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ね";
                setBaca = "NE";
                setVoiceID = "23";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnNO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "の";
                setBaca = "NO";
                setVoiceID = "24";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnHA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "は";
                setBaca = "HA";
                setVoiceID = "25";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnHI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ひ";
                setBaca = "HI";
                setVoiceID = "26";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnHU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ふ";
                setBaca = "FU";
                setVoiceID = "27";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnHE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "へ";
                setBaca = "HE";
                setVoiceID = "28";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnHO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ほ";
                setBaca = "HO";
                setVoiceID = "29";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnMA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ま";
                setBaca = "MA";
                setVoiceID = "30";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnMI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "み";
                setBaca = "MI";
                setVoiceID = "31";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnMU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "む";
                setBaca = "MU";
                setVoiceID = "32";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnME.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "め";
                setBaca = "ME";
                setVoiceID = "33";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnMO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "も";
                setBaca = "MO";
                setVoiceID = "34";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnYA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "や";
                setBaca = "YA";
                setVoiceID = "35";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnYU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ゆ";
                setBaca = "YU";
                setVoiceID = "36";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnYO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "よ";
                setBaca = "YO";
                setVoiceID = "37";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));



        btnRA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ら";
                setBaca = "RA";
                setVoiceID = "38";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnRI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "り";
                setBaca = "RI";
                setVoiceID = "39";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnRU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "る";
                setBaca = "RU";
                setVoiceID = "40";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnRE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "や";
                setBaca = "RE";
                setVoiceID = "41";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnRO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ろ";
                setBaca = "RO";
                setVoiceID = "42";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnWA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "わ";
                setBaca = "WA";
                setVoiceID = "43";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnWO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "を";
                setBaca = "WO";
                setVoiceID = "44";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnN.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ん";
                setBaca = "N";
                setVoiceID = "45";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnGA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "が";
                setBaca = "GA";
                setVoiceID = "46";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnGI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぎ";
                setBaca = "GI";
                setVoiceID = "47";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnGU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぐ";
                setBaca = "GU";
                setVoiceID = "48";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnGE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "げ";
                setBaca = "GE";
                setVoiceID = "48";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnGO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ご";
                setBaca = "GO";
                setVoiceID = "50";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnZA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ざ";
                setBaca = "ZA";
                setVoiceID = "51";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnZI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "じ";
                setBaca = "ZI";
                setVoiceID = "52";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnZU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ず";
                setBaca = "ZU";
                setVoiceID = "53";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnZE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぜ";
                setBaca = "ZE";
                setVoiceID = "54";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnZO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぞ";
                setBaca = "ZO";
                setVoiceID = "55";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnDA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "だ";
                setBaca = "DA";
                setVoiceID = "56";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnDI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぢ";
                setBaca = "DI";
                setVoiceID = "57";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnDU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "づ";
                setBaca = "DU";
                setVoiceID = "58";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnDE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "で";
                setBaca = "DE";
                setVoiceID = "59";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnDO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ど";
                setBaca = "DO";
                setVoiceID = "60";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnBA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ば";
                setBaca = "BA";
                setVoiceID = "61";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnBI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "び";
                setBaca = "BI";
                setVoiceID = "62";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnBU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぶ";
                setBaca = "BU";
                setVoiceID = "63";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnBE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "べ";
                setBaca = "BE";
                setVoiceID = "64";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnBO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぼ";
                setBaca = "BO";
                setVoiceID = "65";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnPA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぱ";
                setBaca = "PA";
                setVoiceID = "66";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnPI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぴ";
                setBaca = "PI";
                setVoiceID = "67";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnPU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぷ";
                setBaca = "PU";
                setVoiceID = "68";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnPE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぺ";
                setBaca = "PE";
                setVoiceID = "69";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnPO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ぽ";
                setBaca = "PO";
                setVoiceID = "70";
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
        btnYA = findViewById(R.id.buttonhiragana_ya);
        btnYU = findViewById(R.id.buttonhiragana_yu);
        btnYO = findViewById(R.id.buttonhiragana_yo);
        btnRA = findViewById(R.id.buttonhiragana_ra);
        btnRI = findViewById(R.id.buttonhiragana_ri);
        btnRU = findViewById(R.id.buttonhiragana_ru);
        btnRE = findViewById(R.id.buttonhiragana_re);
        btnRO = findViewById(R.id.buttonhiragana_ro);
        btnWA = findViewById(R.id.buttonhiragana_wo);
        btnWO = findViewById(R.id.buttonhiragana_wo);
        btnN = findViewById(R.id.buttonhiragana_n);
        btnGA = findViewById(R.id.buttonhiragana_ga);
        btnGI = findViewById(R.id.buttonhiragana_gi);
        btnGU = findViewById(R.id.buttonhiragana_gu);
        btnGE = findViewById(R.id.buttonhiragana_ge);
        btnGO = findViewById(R.id.buttonhiragana_go);
        btnZA = findViewById(R.id.buttonhiragana_za);
        btnZI = findViewById(R.id.buttonhiragana_zi);
        btnZU = findViewById(R.id.buttonhiragana_zu);
        btnZE = findViewById(R.id.buttonhiragana_ze);
        btnZO = findViewById(R.id.buttonhiragana_zo);
        btnDA = findViewById(R.id.buttonhiragana_da);
        btnDI = findViewById(R.id.buttonhiragana_di);
        btnDU = findViewById(R.id.buttonhiragana_du);
        btnDE = findViewById(R.id.buttonhiragana_de);
        btnDO = findViewById(R.id.buttonhiragana_do);
        btnBA = findViewById(R.id.buttonhiragana_ba);
        btnBI = findViewById(R.id.buttonhiragana_bi);
        btnBU = findViewById(R.id.buttonhiragana_bu);
        btnBE = findViewById(R.id.buttonhiragana_be);
        btnBO = findViewById(R.id.buttonhiragana_bo);
        btnPA = findViewById(R.id.buttonhiragana_pa);
        btnPI = findViewById(R.id.buttonhiragana_pi);
        btnPU = findViewById(R.id.buttonhiragana_pu);
        btnPE = findViewById(R.id.buttonhiragana_pe);
        btnPO = findViewById(R.id.buttonhiragana_po);
    }
}