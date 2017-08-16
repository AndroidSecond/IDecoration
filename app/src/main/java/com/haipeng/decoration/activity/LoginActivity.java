package com.haipeng.decoration.activity;

import android.os.Bundle;

import com.haipeng.decoration.R;
import com.haipeng.decoration.base.BaseMainActivity;
import com.haipeng.decoration.helper.activityhelper.LoginActivityController;
import com.haipeng.decoration.helper.activityhelper.LoginActivityViewHelper;
import com.haipeng.decoration.helper.activityhelper.MainActivityController;
import com.haipeng.decoration.helper.activityhelper.MainActivityViewHelper;

/**
 * Created by Administrator on 2017/8/17.
 */

public class LoginActivity extends BaseMainActivity{


    LoginActivityViewHelper mViewHelper;
    LoginActivityController mController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewHelper = new LoginActivityViewHelper(this);
        mController = new LoginActivityController(this, mViewHelper);
    }

}
