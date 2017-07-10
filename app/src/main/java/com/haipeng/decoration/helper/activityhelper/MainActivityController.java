package com.haipeng.decoration.helper.activityhelper;

import android.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.haipeng.decoration.R;
import com.haipeng.decoration.activity.MainActivity;
import com.haipeng.decoration.fragment.HomePageFragment;

/**
 * Created by Administrator on 2017/7/10.
 */

public class MainActivityController {

    MainActivity mActivity;
    MainActivityViewHelper mViewHelper;

    public MainActivityController(MainActivity mainActivity, MainActivityViewHelper viewHelper) {
        mActivity = mainActivity;
        mViewHelper = viewHelper;

        init();
    }

    public void init() {
        mViewHelper.initView();
        mActivity.homePageFragment = HomePageFragment.newInstance("", "");
        mActivity.fragmentManager = mActivity.getSupportFragmentManager();
        mActivity.fragmentTransaction = mActivity.fragmentManager.beginTransaction();
        mActivity.fragmentTransaction.replace(R.id.fragment, mActivity.homePageFragment);
        mActivity.fragmentTransaction.commit();
    }

}
