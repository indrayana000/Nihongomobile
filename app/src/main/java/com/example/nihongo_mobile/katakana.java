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

        btnSA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "サ";
                setBaca = "SA";
                setVoiceID = "10";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnSI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "シ";
                setBaca = "SI";
                setVoiceID = "11";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnSU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ス";
                setBaca = "SU";
                setVoiceID = "12";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnSE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "セ";
                setBaca = "SE";
                setVoiceID = "13";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnSO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ソ";
                setBaca = "SO";
                setVoiceID = "14";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnTA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "タ";
                setBaca = "TA";
                setVoiceID = "15";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnTI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "チ";
                setBaca = "CHI";
                setVoiceID = "16";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnTU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ツ";
                setBaca = "TSU";
                setVoiceID = "17";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnTE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "テ";
                setBaca = "TE";
                setVoiceID = "18";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnTO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ト";
                setBaca = "TO";
                setVoiceID = "19";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnNA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ナ";
                setBaca = "NA";
                setVoiceID = "20";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnNI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ニ";
                setBaca = "NI";
                setVoiceID = "21";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnNU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ヌ";
                setBaca = "NU";
                setVoiceID = "22";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnNE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ネ";
                setBaca = "NE";
                setVoiceID = "23";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnNO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ノ";
                setBaca = "NO";
                setVoiceID = "24";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnHA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ハ";
                setBaca = "HA";
                setVoiceID = "25";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnHI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ヒ";
                setBaca = "HI";
                setVoiceID = "26";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnHU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "フ";
                setBaca = "FU";
                setVoiceID = "27";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnHE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ヘ";
                setBaca = "HE";
                setVoiceID = "28";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnHO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ホ";
                setBaca = "HO";
                setVoiceID = "29";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnMA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "マ";
                setBaca = "MA";
                setVoiceID = "30";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnMI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ミ";
                setBaca = "MI";
                setVoiceID = "31";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnMU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ム";
                setBaca = "MU";
                setVoiceID = "32";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnME.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "メ";
                setBaca = "ME";
                setVoiceID = "33";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnMO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "モ";
                setBaca = "MO";
                setVoiceID = "34";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));


        btnYA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ヤ";
                setBaca = "YA";
                setVoiceID = "35";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnYU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ユ";
                setBaca = "YU";
                setVoiceID = "36";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnYO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ヨ";
                setBaca = "YO";
                setVoiceID = "37";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));



        btnRA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ラ";
                setBaca = "RA";
                setVoiceID = "38";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnRI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "リ";
                setBaca = "RI";
                setVoiceID = "39";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnRU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ル";
                setBaca = "RU";
                setVoiceID = "40";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnRE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "レ";
                setBaca = "RE";
                setVoiceID = "41";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnRO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ロ";
                setBaca = "RO";
                setVoiceID = "42";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnWA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ワ";
                setBaca = "WA";
                setVoiceID = "43";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnWO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ヲ";
                setBaca = "WO";
                setVoiceID = "44";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnN.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ン";
                setBaca = "N";
                setVoiceID = "45";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnGA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ガ";
                setBaca = "GA";
                setVoiceID = "46";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnGI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ギ";
                setBaca = "GI";
                setVoiceID = "47";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnGU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "グ";
                setBaca = "GU";
                setVoiceID = "48";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnGE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ゲ";
                setBaca = "GE";
                setVoiceID = "49";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnGO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ゴ";
                setBaca = "GO";
                setVoiceID = "50";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));



        btnZA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ザ";
                setBaca = "ZA";
                setVoiceID = "51";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnZI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ジ";
                setBaca = "JI";
                setVoiceID = "52";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnZU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ズ";
                setBaca = "ZU";
                setVoiceID = "53";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnZE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ゼ";
                setBaca = "ZE";
                setVoiceID = "54";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnZO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ゾ";
                setBaca = "ZO";
                setVoiceID = "55";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));



        btnDA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ダ";
                setBaca = "DA";
                setVoiceID = "56";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnDI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ヂ";
                setBaca = "DJI";
                setVoiceID = "57";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnDU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ヅ";
                setBaca = "DZU";
                setVoiceID = "58";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnDE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "デ";
                setBaca = "DE";
                setVoiceID = "59";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnDO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ド";
                setBaca = "DO";
                setVoiceID = "60";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnBA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "バ";
                setBaca = "BA";
                setVoiceID = "61";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnBI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ビ";
                setBaca = "BI";
                setVoiceID = "62";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnBU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ブ";
                setBaca = "BU";
                setVoiceID = "63";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnBE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ベ";
                setBaca = "BE";
                setVoiceID = "64";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnBO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ボ";
                setBaca = "BO";
                setVoiceID = "65";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnPA.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "パ";
                setBaca = "PA";
                setVoiceID = "66";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnPI.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ピ";
                setBaca = "PI";
                setVoiceID = "67";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnPU.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "プ";
                setBaca = "PU";
                setVoiceID = "68";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnPE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ペ";
                setBaca = "PE";
                setVoiceID = "69";
                pindahHalaman(setHuruf , setBaca, setVoiceID);
            }
        }));

        btnPO.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setHuruf = "ポ";
                setBaca = "PO";
                setVoiceID = "70";
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
        btnYA = findViewById(R.id.buttonkatakana_ya);
        btnYU = findViewById(R.id.buttonkatakana_yu);
        btnYO = findViewById(R.id.buttonkatakana_yo);
        btnRA = findViewById(R.id.buttonkatakana_ra);
        btnRI = findViewById(R.id.buttonkatakana_ri);
        btnRU = findViewById(R.id.buttonkatakana_ru);
        btnRE = findViewById(R.id.buttonkatakana_re);
        btnRO = findViewById(R.id.buttonkatakana_ro);
        btnWA = findViewById(R.id.buttonkatakana_wa);
        btnWO = findViewById(R.id.buttonkatakana_wo);
        btnN = findViewById(R.id.buttonkatakana_n);
        btnGA = findViewById(R.id.buttonkatakana_ga);
        btnGI = findViewById(R.id.buttonkatakana_gi);
        btnGU = findViewById(R.id.buttonkatakana_gu);
        btnGE = findViewById(R.id.buttonkatakana_ge);
        btnGO = findViewById(R.id.buttonkatakana_go);
        btnZA = findViewById(R.id.buttonkatakana_za);
        btnZI = findViewById(R.id.buttonkatakana_zi);
        btnZU = findViewById(R.id.buttonkatakana_zu);
        btnZE = findViewById(R.id.buttonkatakana_ze);
        btnZO = findViewById(R.id.buttonkatakana_zo);
        btnDA = findViewById(R.id.buttonkatakana_da);
        btnDI = findViewById(R.id.buttonkatakana_di);
        btnDU = findViewById(R.id.buttonkatakana_du);
        btnDE = findViewById(R.id.buttonkatakana_de);
        btnDO = findViewById(R.id.buttonkatakana_do);
        btnBA = findViewById(R.id.buttonkatakana_ba);
        btnBI = findViewById(R.id.buttonkatakana_bi);
        btnBU = findViewById(R.id.buttonkatakana_bu);
        btnBE = findViewById(R.id.buttonkatakana_be);
        btnBO = findViewById(R.id.buttonkatakana_bo);
        btnPA = findViewById(R.id.buttonkatakana_pa);
        btnPI = findViewById(R.id.buttonkatakana_pi);
        btnPU = findViewById(R.id.buttonkatakana_pu);
        btnPE = findViewById(R.id.buttonkatakana_pe);
        btnPO = findViewById(R.id.buttonkatakana_po);
    }
}