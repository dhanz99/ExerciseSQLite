package com.hirdhanaghnia.exercisesqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DB_helper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "biodata.db";
    public DB_helper(Context context){
        super(context, DATABASE_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "create table biodata(nama text null, tlp text null, email text null, alamat text null);";
        Log.d("Data","OnCreate "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }

}