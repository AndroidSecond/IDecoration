package com.haipeng.decoration.helper.activityhelper;

import android.support.v4.app.FragmentTransaction;

import com.haipeng.decoration.R;
import com.haipeng.decoration.activity.LoginActivity;
import com.haipeng.decoration.activity.MainActivity;
import com.haipeng.decoration.base.BaseMainFragment;
import com.haipeng.decoration.fragment.HomePageFragment;
import com.haipeng.decoration.fragment.MainFragment;
import com.haipeng.decoration.fragment.MastersFragment;
import com.haipeng.decoration.fragment.MineFragment;
import com.haipeng.decoration.fragment.TemplatesFragment;
import com.haipeng.decoration.listener.OnButtonsSwitchListener;

/**
 * Created by Administrator on 2017/7/10.
 */

public class LoginActivityController {

    LoginActivity mActivity;
    LoginActivityViewHelper mViewHelper;

    public LoginActivityController(LoginActivity mainActivity, LoginActivityViewHelper viewHelper) {
        mActivity = mainActivity;
        mViewHelper = viewHelper;

        init();
    }

    public void init() {
        mViewHelper.initView();

    }


}
