package com.haipeng.decoration.helper.activityhelper;

import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.webkit.URLUtil;

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
import com.haipeng.decoration.model.ResponseUserModel;
import com.haipeng.decoration.ror.UrlUtils;
import com.haipeng.decoration.utils.StringUtils;

import io.reactivex.functions.Consumer;

/**
 * Created by Administrator on 2017/7/10.
 */

public class LoginActivityController implements View.OnClickListener{

    LoginActivity mActivity;
    LoginActivityViewHelper mViewHelper;

    public LoginActivityController(LoginActivity mainActivity, LoginActivityViewHelper viewHelper) {
        mActivity = mainActivity;
        mViewHelper = viewHelper;
    }

    public void init() {
        mActivity.btnCommit.setOnClickListener(this);
    }

    Consumer<ResponseUserModel> consumer = new Consumer<ResponseUserModel>() {
        @Override
        public void accept(ResponseUserModel responseUserModel) throws Exception {

        }
    };


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_commit:
                UrlUtils.signIn(StringUtils.filterStringExe(mActivity.etAccount.getText())
                ,StringUtils.filterStringExe(mActivity.etPassword.getText())
                ,consumer);
                break;
        }
    }
}
