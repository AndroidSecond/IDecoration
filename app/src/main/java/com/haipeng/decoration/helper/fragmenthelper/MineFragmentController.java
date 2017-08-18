package com.haipeng.decoration.helper.fragmenthelper;

import android.content.Intent;
import android.view.View;

import com.haipeng.decoration.R;
import com.haipeng.decoration.activity.LoginActivity;
import com.haipeng.decoration.activity.SignUpActivity;
import com.haipeng.decoration.fragment.MineFragment;

/**
 * Created by Administrator on 2017/8/12.
 */

public class MineFragmentController implements View.OnClickListener{
    MineFragment mFragment = null;
    MineFragmentViewHelper viewHelper = null;

    public MineFragmentController(MineFragment mineFragment, MineFragmentViewHelper viewHelper) {
        this.mFragment = mineFragment;
        this.viewHelper = viewHelper;
        init();
    }

    public void init(){
        mFragment.btnSignIn.setOnClickListener(this);
        mFragment.btnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_sign_up:
                Intent intent = new Intent(mFragment.getActivity(), SignUpActivity.class);
                mFragment.getActivity().startActivity(intent);
                break;
            case R.id.btn_sign_in:
                Intent intent2 = new Intent(mFragment.getActivity(), LoginActivity.class);
                mFragment.getActivity().startActivity(intent2);
                break;
        }
    }

}
