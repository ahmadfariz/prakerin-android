package com.example.apel;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

public class MyApp extends Application {
    private DaoSession daoSession;

    private static MyApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,  "apel-db");
        Database db =  helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public static synchronized MyApp getInstance() {
        return mInstance;
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}