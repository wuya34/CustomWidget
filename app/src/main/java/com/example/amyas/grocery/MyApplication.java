package com.example.amyas.grocery;

import android.app.Application;

import com.example.amyas.grocery.bean.MyObjectBox;

import io.objectbox.BoxStore;

/**
 * author: Amyas
 * date: 2017/12/18
 */

public class MyApplication extends Application {
    public static BoxStore mBoxStore;
    @Override
    public void onCreate() {
        super.onCreate();
        mBoxStore = MyObjectBox.builder().androidContext(this).build();

    }

    public BoxStore getBoxStore(){
        return mBoxStore;
    }
}
