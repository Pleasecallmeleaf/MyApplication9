package com.example.administrator.myapplication;

import android.app.Application;

/**
 * Created by Administrator on 2018/11/30 0030.
 */

public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        MobSDK.init(this);
    }

}
