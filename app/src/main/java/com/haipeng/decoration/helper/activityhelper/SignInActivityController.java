package com.haipeng.decoration.helper.activityhelper;

import android.text.Editable;
import android.view.View;

import com.google.gson.Gson;
import com.haipeng.decoration.R;
import com.haipeng.decoration.activity.LoginActivity;
import com.haipeng.decoration.activity.SignInActivity;
import com.haipeng.decoration.model.ResponseUserModel;
import com.haipeng.decoration.model.UserModel;
import com.haipeng.decoration.ror.UrlUtils;

import io.reactivex.functions.Consumer;

/**
 * Created by Administrator on 2017/7/10.
 */

public class SignInActivityController implements View.OnClickListener{

    SignInActivity mActivity;
    SignActivityViewHelper mViewHelper;

    public SignInActivityController(SignInActivity mainActivity, SignActivityViewHelper viewHelper) {
        mActivity = mainActivity;
        mViewHelper = viewHelper;

        init();
    }

    public void init() {
        mViewHelper.initView();

        mActivity.back.setOnClickListener(this);
        mActivity.commit.setOnClickListener(this);
        mActivity.img.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                break;
            case R.id.commit:
                UrlUtils.signUp(getUserModelJson(""),consumer);
                break;
            case R.id.iv_add_user:
                break;
        }
    }


    Consumer<ResponseUserModel> consumer = new Consumer<ResponseUserModel>() {

        @Override
        public void accept(ResponseUserModel responseUserModel) throws Exception {

        }
    };

    public String getUserModelJson(String imgPath){
        UserModel userModel = new UserModel();
        userModel.setName(filterStringExe(mActivity.etName.getText()));
        userModel.setPhone(filterStringExe(mActivity.etPhone.getText()));
        userModel.setEmail(filterStringExe(mActivity.etEmail.getText()));
        userModel.setPassword(filterStringExe(mActivity.etPassword.getText()));
        userModel.setRepeatPassword(filterStringExe(mActivity.etRePassword.getText()));
        userModel.setImagePath(imgPath);
        Gson gson = new Gson();

        return gson.toJson(userModel);
    }

    public String filterStringExe(Editable eta){
        String temp = "";
        if(null == eta)
            return "";
        else
        {
            temp = eta.toString().trim();
            return temp;
        }
    }


}
