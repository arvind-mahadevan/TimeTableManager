package com.androidfisac.scheduleapp.helpers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.androidfisac.scheduleapp.datamodel.Timetable;

import java.util.ArrayList;

public class DbAdapter {
    private static String dbName = "TimetableDb";
    private static int dbVersion = 1;
    private timetableDbHelper helper;
    private SQLiteDatabase timetableDb;

    public DbAdapter(Context context){
        helper = new timetableDbHelper(context, dbName,
                null, dbVersion);
    }

    public void openWrite(){
        timetableDb = helper.getWritableDatabase();
    }

    public void openRead(){
        timetableDb = helper.getReadableDatabase();
    }

    public void closeAdapter() { timetableDb.close(); }

    public void insertData(String sNo, String className, String startTime, String endTime, String roomNo)
    {
        ContentValues contentValues = new ContentValues();

        contentValues.put("sNo",sNo);
        contentValues.put("className",className);
        contentValues.put("startTime",startTime);
        contentValues.put("endTime",endTime);
        contentValues.put("roomNo",roomNo);

        timetableDb.insert("timetable",null,contentValues);
        Cursor cursor = timetableDb.rawQuery("SELECT * FROM timetable",null);

        if (cursor.moveToFirst()) {
            do {
                Log.e("DBQUERY","RESULT0 " + cursor.getString(0));
                Log.e("DBQUERY","RESULT1 " + cursor.getString(1));
                Log.e("DBQUERY","RESULT2 " + cursor.getString(2));
                Log.e("DBQUERY","RESULT3 " + cursor.getString(3));
                Log.e("DBQUERY","RESULT4 " + cursor.getString(4));
            } while (cursor.moveToNext());
        }

    }

    public ArrayList<Timetable> readTimetable(){
        Cursor cursor = timetableDb.rawQuery("SELECT * FROM timetable", null);

        ArrayList<Timetable> timetableArrayList = new ArrayList<>();

        if(cursor.moveToFirst()) {
            do {
                timetableArrayList.add(new Timetable(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4)));
            } while(cursor.moveToNext());
        }
        cursor.close();
        return timetableArrayList;

    }

    public long rowCount(){
        long count = DatabaseUtils.queryNumEntries(timetableDb,"timetable");
        return count;
    }

    public void deleteData(String classNameDel){
        timetableDb.execSQL("DELETE FROM timetable WHERE className='" + classNameDel+"'");
        Log.e("DBQUERY","Deleted");
    }



    private static class timetableDbHelper extends SQLiteOpenHelper{

        public timetableDbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            //CHANGE SQL QUERY
            sqLiteDatabase.execSQL("CREATE TABLE timetable( " +
                    "sNo TEXT PRIMARY KEY, className TEXT" +
                    ", startTime TEXT, endTime TEXT, roomNo TEXT)");
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
            sqLiteDatabase.execSQL("DROP TABLE timetable");
            sqLiteDatabase.execSQL("CREATE TABLE timetable( " +
                    "sNo TEXT PRIMARY KEY AUTOINCREMENT, className TEXT" +
                    ", startTime TEXT, endTime TEXT, roomNo TEXT)");
        }
    }
}






