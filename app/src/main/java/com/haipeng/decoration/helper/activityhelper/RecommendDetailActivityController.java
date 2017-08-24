package com.haipeng.decoration.helper.activityhelper;


import com.haipeng.decoration.activity.RecommendDetailActivity;

/**
 * Created by Administrator on 2017/7/10.
 */

public class RecommendDetailActivityController {

    RecommendDetailActivity mActivity;
    RecommendDetailActivityViewHelper mViewHelper;

    public RecommendDetailActivityController(RecommendDetailActivity mainActivity, RecommendDetailActivityViewHelper viewHelper) {
        mActivity = mainActivity;
        mViewHelper = viewHelper;

        init();
    }

    public void init() {
        mViewHelper.initView();

    }

    public void refreshForConnectNet() {

    }

    public void refreshForLoginSuccess() {

    }


}
