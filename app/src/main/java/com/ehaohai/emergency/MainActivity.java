package com.ehaohai.emergency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ehaohai.emergency.web.WebsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String webUrl = "https://www.baidu.com";
//        String webUrl = "http://ehaohai.com/contact";
        String webUrl = "https://www.bilibili.com/";

        Intent intent = new Intent(this, WebsActivity.class);
        intent.putExtra("webUrl",webUrl);
        startActivity(intent);
    }
}