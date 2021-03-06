package com.example.soporte.personas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by soporte on 09/05/2017.
 */

public class PersonasSQLiteOpenHelper extends SQLiteOpenHelper {
    String sql= "CREATE TABLE Personas(foto text, nombre text, apellido text, edad text, pasatiempo text)";


    public PersonasSQLiteOpenHelper(Context contexto, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(contexto,name,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Personas");
        db.execSQL(sql);
    }
}
