package com.haipeng.decoration.application;

import android.app.Application;

/**
 * Created by Administrator on 2017/8/16.
 */

public class MyApplication extends Application {

    public static MyApplication myApplication;

    public static MyApplication getInstance(){
        if(null == myApplication){
            myApplication = new MyApplication();
        }
        return myApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
