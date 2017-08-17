package com.haipeng.decoration.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.haipeng.decoration.R;
import com.haipeng.decoration.base.BaseMainActivity;
import com.haipeng.decoration.helper.activityhelper.LoginActivityController;
import com.haipeng.decoration.helper.activityhelper.LoginActivityViewHelper;
import com.haipeng.decoration.helper.activityhelper.SignActivityViewHelper;
import com.haipeng.decoration.helper.activityhelper.SignInActivityController;

/**
 * Created by Administrator on 2017/8/17.
 */

public class SignInActivity extends BaseMainActivity{


    public Button back;
    public Button commit;
    public ImageView img;
    public EditText etName, etPhone, etEmail, etPassword, etRePassword;

    SignActivityViewHelper mViewHelper;
    SignInActivityController mController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mViewHelper = new SignActivityViewHelper(this);
        mController = new SignInActivityController(this, mViewHelper);
    }

}
