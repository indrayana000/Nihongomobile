package com.example.nihongo_mobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class halaman_soal extends AppCompatActivity {
    protected Cursor cursor;
    int jumlah = 0;
    int nilai = 0;
    int idVoice;
    String tipe, soal, kunci, cekId;
    TextView txtSoal, txtNoSoal;
    Integer[] testArray = new Integer[20];
    Button btnA, btnB, btnC, btnD, btnAudio;
    DataHelper dbHelper;
    MediaPlayer mp;
    ArrayList<Integer> voices  = new ArrayList<>();
    public static halaman_soal ma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_soal);
        getSupportActionBar().hide();

        // Deklarasi Button dan TextView
        btnA = findViewById(R.id.buttonjawaban_1a);
        btnB = findViewById(R.id.buttonjawaban_1b);
        btnC = findViewById(R.id.buttonjawaban_1c);
        btnD = findViewById(R.id.buttonjawaban_1d);
        btnAudio = findViewById(R.id.button_audio_soal);
        txtSoal = findViewById(R.id.txtSoal);
        txtNoSoal = findViewById(R.id.txtNoSoal);
        // Deklarasi list audio yang dipakai
        declareAudio();
        // Buat array 0-19 lalu acak
        try {
            for (Integer i = 0; i < 20; i++){
                testArray[i] = i;
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Error: " + e, Toast.LENGTH_SHORT).show();
        }
        List<Integer> array2 = Arrays.asList(testArray);
        Collections.shuffle(array2);

        ma = this;
        dbHelper = new DataHelper(this);
        getSoal(testArray[jumlah]);

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
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                refreshView("A");
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                refreshView("B");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                refreshView("C");
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                refreshView("D");
            }
        });
    }

    public void refreshView(String kunjaw){
        String jawaban = kunjaw;
        if (jumlah <4){
            jumlah++;
            //Toast.makeText(getApplicationContext(), "Jawab: " + jawaban + "\n Kunci Jawaban: " + kunci, Toast.LENGTH_SHORT).show();
            if (jawaban.equals(kunci)){
                nilai++;
            }
            txtNoSoal.setText("No. " + String.valueOf(jumlah + 1) + "/5");
            getSoal(testArray[jumlah]);
        }else{
            if (jawaban.equals(kunci)){
                nilai++;
            }
            //Toast.makeText(getApplicationContext(), "Skor = " + String.valueOf(nilai), Toast.LENGTH_SHORT).show();
            // 1. Instantiate an <code><a href="/reference/android/app/AlertDialog.Builder.html">AlertDialog.Builder</a></code> with its constructor
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

// 2. Chain together various setter methods to set the dialog characteristics
            builder.setMessage(String.valueOf(nilai) + " dari 5 jawaban benar!")
                    .setTitle("Skor")
                    .setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // User clicked OK button
                    finish();
                }
            });

// 3. Get the <code><a href="/reference/android/app/AlertDialog.html">AlertDialog</a></code> from <code><a href="/reference/android/app/AlertDialog.Builder.html#create()">create()</a></code>
            AlertDialog dialog = builder.create();
            dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public void onShow(DialogInterface dialogInterface) {
                    dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.primaryorange));

                }
            });
            dialog.show();
        }
    }
    protected void declareAudio(){
        try {
            voices.add(0, R.raw.nu);
            voices.add(1, R.raw.tsu);
            voices.add(2, R.raw.to);
            voices.add(3, R.raw.pi);
            voices.add(4, R.raw.da);
            voices.add(5, R.raw.ba);
            voices.add(6, R.raw.fu);
            voices.add(7, R.raw.so);

        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error + " + e, Toast.LENGTH_SHORT).show();
        }
    }
    // Retrieve data soal dari database
    public void getSoal(int nomorID){
        try {
            // INDEX DI DATABASE
            // 0 = id,
            // 1 = type,
            // 2 = soal,
            // 3 = voiceId
            // 8 = kunci

            // Cek Readable Database
            SQLiteDatabase db = dbHelper.getReadableDatabase();

            //Ambil value nomorID
            String angkaSoal = String.valueOf(nomorID);

            // Masukkan nomorID ke dalam sql
            String SQL = "Select * From soal where id = '" + angkaSoal + "'";

            // Fetch database
            cursor = db.rawQuery(SQL, null);
            cursor.moveToFirst();
            // Ambil tipe soal & kunci jawaban
            tipe = cursor.getString(1).toString();
            kunci = cursor.getString(8).toString();

            // Cek tipe soal
            if(tipe.equals("text")){
                txtSoal.setVisibility(View.VISIBLE);
                btnAudio.setVisibility(View.INVISIBLE);
                soal = cursor.getString(2).toString();
                txtSoal.setText(soal);
            }else{
                txtSoal.setVisibility(View.INVISIBLE);
                btnAudio.setVisibility(View.VISIBLE);
                try {
                    // idVoice = Integer.getInteger(cursor.getString(4).toString());
                    cekId = cursor.getString(3);
                    idVoice = Integer.valueOf(cekId);
                    mp = MediaPlayer.create(getApplicationContext(), voices.get(idVoice));
                    // btnAudio.setText(String.valueOf(cekId));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Error di AmbilData: " + e, Toast.LENGTH_SHORT).show();
                }
            }
            // 4 = a,
            // 5 = b,
            // 6 = c,
            // 7 = d,
            btnA.setText(cursor.getString(4).toString());
            btnB.setText(cursor.getString(5).toString());
            btnC.setText(cursor.getString(6).toString());
            btnD.setText(cursor.getString(7).toString());

        }catch (Exception e) {
            //Toast.makeText(getApplicationContext(), "Error di getSoal: " + e, Toast.LENGTH_SHORT).show();
        }
    }
}