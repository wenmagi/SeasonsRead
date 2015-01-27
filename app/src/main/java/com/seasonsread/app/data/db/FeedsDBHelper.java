package com.seasonsread.app.data.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.seasonsread.app.SeasonsReadApp;

/**
 * Created by ZhanTao on 1/13/15.
 */
public class FeedsDBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "seasonsread.db";

    private static final int VERSION = 1;

    private static FeedsDBHelper mFeedsDBHelper = null;

    private FeedsDBHelper(Context context){
        super(context, DB_NAME, null, VERSION);
    }

    public static FeedsDBHelper getDBHelper(){
        if(mFeedsDBHelper == null)
            mFeedsDBHelper = new FeedsDBHelper(SeasonsReadApp.getAppContext());
        return mFeedsDBHelper;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL( "CREATE TABLE IF NOT EXISTS "+
                        FeedsDBTable.TABLE_NAME+ "("+
                        FeedsDBTable.ROW_ID + " integer primary key autoincrement," +
                        FeedsDBTable.ROW_TITLE + " varchar," +
                        FeedsDBTable.ROW_AUTHOR + " varchar," +
                        FeedsDBTable.ROW_ARTICLE_ID + " integer," +
                        FeedsDBTable.ROW_TYPE_ID + " integer," +
                        FeedsDBTable.ROW_HITNUM + " integer," +
                        FeedsDBTable.ROW_IS_RESERVED + " integer," +
                        FeedsDBTable.ROW_CREATE_TIME + " varchar" +
                        ")"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL( "DROP TABLE IF EXISTS " + FeedsDBTable.TABLE_NAME );
        onCreate(db);
    }
}
