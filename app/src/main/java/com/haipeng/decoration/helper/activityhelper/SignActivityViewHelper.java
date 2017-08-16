package com.haipeng.decoration.helper.activityhelper;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.haipeng.decoration.R;
import com.haipeng.decoration.activity.LoginActivity;
import com.haipeng.decoration.activity.SignInActivity;
import com.haipeng.decoration.model.ResponseUserModel;
import com.haipeng.decoration.model.UserModel;
import com.haipeng.decoration.ror.UrlUtils;

import io.reactivex.functions.Consumer;

/**
 * Created by Administrator on 2017/7/4.
 */

public class SignActivityViewHelper{

    SignInActivity mActivity;

    public SignActivityViewHelper(SignInActivity loginActivity) {
        mActivity = loginActivity;
    }

    public void initView(){
        mActivity.back = (Button) mActivity.findViewById(R.id.back);
        mActivity.commit = (Button) mActivity.findViewById(R.id.commit);
        mActivity.img = (ImageView) mActivity.findViewById(R.id.iv_add_user);

        mActivity.etName = (EditText) mActivity.findViewById(R.id.et_name);
        mActivity.etPhone = (EditText) mActivity.findViewById(R.id.et_phone);
        mActivity.etEmail = (EditText) mActivity.findViewById(R.id.et_email);
        mActivity.etPassword = (EditText) mActivity.findViewById(R.id.et_password);
        mActivity.etRePassword = (EditText) mActivity.findViewById(R.id.et_re_password);
    }




}
