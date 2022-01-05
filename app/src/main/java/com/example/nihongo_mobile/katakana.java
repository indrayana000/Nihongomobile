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

        /*
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

         */

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
        btnWA = findViewById(R.id.buttonkatakana_wo);
        btnWO = findViewById(R.id.buttonkatakana_wo);
        btnN = findViewById(R.id.buttonkatakana_n);
    }
}