package com.example.MathFunction;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DBhelper extends SQLiteOpenHelper {




    public DBhelper( Context context) {
        super(context,"Userdata.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create Table Userdetails(name TEXT ,email TEXT,mobile TEXT,gender TEXT,pass TEXT,confpass TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop Table if exists Userdetails");
        onCreate(DB);
    }

    public String insertData(String name, String email, String mobile, String gender, String pass, String confp)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("email", email);
        contentValues.put("mobile", mobile);
        contentValues.put("gender", gender);
        contentValues.put("pass", pass);
        contentValues.put("confpass", confp);

        long result = DB.insert("Userdetails",null,contentValues);

        if(result == -1)
        {
            return "Failed";
        }
        else {
            return "Execute";
        }
    }


    public boolean fetchPasswordEmail(String e,String p)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor  =DB.rawQuery("select * from Userdetails where email=? and pass=?",new String[] {e,p},null);
        if(cursor.getCount()>0)
        {
            return true;
        }
        else {
            return false;
        }
    }




}
