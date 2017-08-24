package com.haipeng.decoration.helper.activityhelper;

import com.haipeng.decoration.activity.MainActivity;

/**
 * Created by Administrator on 2017/7/10.
 */

public class TemplateDetailActivityController  {

    MainActivity mActivity;
    MainActivityViewHelper mViewHelper;
    public static String TEMPLATE_UNIQUENMBER_KEY ="template_unique_key";

    public TemplateDetailActivityController(MainActivity mainActivity, MainActivityViewHelper viewHelper) {
        mActivity = mainActivity;
        mViewHelper = viewHelper;

        init();
    }

    public void init() {
        mViewHelper.initView();

    }

    public void refreshForConnectNet(){

    }

    public void refreshForLoginSuccess(){

    }



}
