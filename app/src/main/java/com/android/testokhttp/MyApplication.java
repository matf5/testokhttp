package com.android.testokhttp;

import android.app.Application;
import android.util.Log;

import com.lzy.okhttputils.OkHttpUtils;
import com.lzy.okhttputils.cookie.store.PersistentCookieStore;


import java.util.concurrent.TimeUnit;

import okhttp3.Call;

/**
 * Created by Administrator on 2016/4/16.
 */
public class MyApplication extends Application {

    private static final String TAG="MyApplication";

    public void onCreate() {
        super.onCreate();
        OkHttpUtils.init(this);
        OkHttpUtils.getInstance()//
                .debug("OkHttpUtils").setCookieStore(new PersistentCookieStore());

    }
}
