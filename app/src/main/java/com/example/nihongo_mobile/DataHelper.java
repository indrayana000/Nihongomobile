package com.example.nihongo_mobile;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class DataHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "hirakata.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        try{
            String sql = "create table soal" +
                    "(id int primary key, type text, soal text, " +
                    "voiceId int, a text, b text, c text, d text, kunci text);";
            Log.d("Data", "onCreate"+sql);
            db.execSQL(sql);
            sql = "create table skor(skor integer)";
            Log.d("Data", "onCreate"+sql);
            db.execSQL(sql);
            String dataSoal = "INSERT INTO soal VALUES" +
                    "(0,'text','A',NULL,'あ','お','は','ま','A'),"+
                    "(1,'text','Hi',NULL,'ま','ひ','せ','ふ','B'),"+
                    "(2,'text','Ko',NULL,'な','ぬ','こ','は','C'),"+
                    "(3,'text','み',NULL,'Ra','O','Go','Mi','D'),"+
                    "(4,'text','ね',NULL,'Ne','No','Wo','Mu','A'),"+
                    "(5,'text','さ',NULL,'Tsu','Sa','Po','Hi','B'),"+
                    "(6,'text','No',NULL,'ユ','ロ','ノ','ヘ','C'),"+
                    "(7,'text','Ha',NULL,'ア','テ','カ','ハ','D'),"+
                    "(8,'text','Shi',NULL,'シ','ヤ','ダ','モ','A'),"+
                    "(9,'text','タ',NULL,'Ke','Ta','Za','Ku','B'),"+
                    "(10,'text','ク',NULL,'He','U','Ku','Ka','C'),"+
                    "(11,'text','ニ',NULL,'Ge','Bi','Ga','Ni','D'),"+
                    "(12,'voice',NULL,0,'ぬ','す','ず','え','A'),"+
                    "(13,'voice',NULL,1,'よ','つ','む','で','B'),"+
                    "(14,'voice',NULL,2,'ひ','み','と','ご','C'),"+
                    "(15,'voice',NULL,3,'せ','え','や','ぴ','D'),"+
                    "(16,'voice',NULL,4,'ダ','イ','パ','メ','A'),"+
                    "(17,'voice',NULL,5,'ヂ','バ','ウ','デ','B'),"+
                    "(18,'voice',NULL,6,'ト','ミ','フ','ウ','C'),"+
                    "(19,'voice',NULL,7,'エ','メ','プ','ソ','D');";
            db.execSQL(dataSoal);
        }catch (Exception e){
        }

    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}
