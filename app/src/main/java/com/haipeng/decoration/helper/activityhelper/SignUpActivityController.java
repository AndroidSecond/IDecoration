package com.haipeng.decoration.helper.activityhelper;

import android.text.Editable;
import android.view.View;

import com.google.gson.Gson;
import com.haipeng.decoration.R;
import com.haipeng.decoration.activity.SignUpActivity;
import com.haipeng.decoration.model.ReturnResult;
import com.haipeng.decoration.model.UserModel;
import com.haipeng.decoration.ror.UrlUtils;
import com.haipeng.decoration.utils.UniqueNumberUtils;
import com.haipeng.decoration.utils.widget.MyToastUtils;

import io.reactivex.functions.Consumer;

/**
 * Created by Administrator on 2017/7/10.
 */

public class SignUpActivityController implements View.OnClickListener {

    SignUpActivity mActivity;
    SignUpActivityViewHelper mViewHelper;

    public SignUpActivityController(SignUpActivity mainActivity, SignUpActivityViewHelper viewHelper) {
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
                UrlUtils.signUp(getUserModelJson(""), consumer, errorConsumer);
                break;
            case R.id.iv_add_user:
                break;
        }
    }


    Consumer<ReturnResult> consumer = new Consumer<ReturnResult>() {

        @Override
        public void accept(ReturnResult rr) throws Exception {
            MyToastUtils.showToastLong(mActivity, rr.getMsg());
            mActivity.finish();
        }
    };

    Consumer<Throwable> errorConsumer = new Consumer<Throwable>() {
        @Override
        public void accept(Throwable throwable) throws Exception {
            MyToastUtils.showToastLong(mActivity, "注册失败");
        }
    };

    public String getUserModelJson(String imgPath) {
        UserModel userModel = new UserModel();
        userModel.setUniqueNumber(UniqueNumberUtils.getUniqueNumber());
        userModel.setName(filterStringExe(mActivity.etName.getText()));
        userModel.setPhone(filterStringExe(mActivity.etPhone.getText()));
        userModel.setEmail(filterStringExe(mActivity.etEmail.getText()));
        userModel.setPassword(filterStringExe(mActivity.etPassword.getText()));
        userModel.setRepeatPassword(filterStringExe(mActivity.etRePassword.getText()));
        userModel.setImagePath(imgPath);
        Gson gson = new Gson();

        return gson.toJson(userModel);
    }

    public String filterStringExe(Editable eta) {
        String temp = "";
        if (null == eta)
            return "";
        else {
            temp = eta.toString().trim();
            return temp;
        }
    }


}