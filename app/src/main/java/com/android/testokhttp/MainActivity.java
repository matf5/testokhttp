package com.android.testokhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.android.testokhttp.jsonbean.SceneJson;
import com.lzy.okhttputils.OkHttpUtils;
import com.lzy.okhttputils.cache.CacheMode;

import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
   private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);
        OkHttpUtils.post("http://119.29.187.58:10000/LouShi/base/scene.action")
                // 请求方式和请求url
                .tag(this).params("scene_group_id", "1").params("user_id", "0").params("recommended","false")
                .params("skip", "0").params("take", "3")
                        // 请求的 tag, 主要用于取消对应的请求
                .cacheKey("scene")            // 设置当前请求的缓存key,建议每个不同功能的请求设置一个
                .cacheMode(CacheMode.REQUEST_FAILED_READ_CACHE)    // 缓存模式，详细请看缓存介绍
                .execute(new JsonCallback<SceneJson>(SceneJson.class) {
                    @Override
                    public void onResponse(boolean b, SceneJson sceneJson, Request request, Response response) {
                        tv.setText(sceneJson.getBody().get(0).getName());
                    }


                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
