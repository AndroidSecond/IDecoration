package com.haipeng.decoration.activity;

import android.os.Bundle;

import com.haipeng.decoration.R;
import com.haipeng.decoration.base.BaseMainActivity;

import retrofit2.http.Body;

public class MainActivity extends BaseMainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
