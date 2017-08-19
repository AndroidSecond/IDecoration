package com.haipeng.decoration.helper.activityhelper;

import com.haipeng.decoration.activity.OrderDetailActivity;

/**
 * Created by Administrator on 2017/8/19.
 */

public class OrderDetailActivityController {
    OrderDetailActivity mActivity;
    OrderDetailActivityViewHelper mViewHelper;

    public OrderDetailActivityController(OrderDetailActivity mActivity, OrderDetailActivityViewHelper mViewHelper) {
        this.mActivity = mActivity;
        this.mViewHelper = mViewHelper;
    }

    public void init(){

    }
}
