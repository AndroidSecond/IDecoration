package com.haipeng.decoration.helper.activityhelper;

import com.haipeng.decoration.activity.OrderListActivity;

/**
 * Created by Administrator on 2017/8/19.
 */

public class OrderListActivityController {

    OrderListActivity mActivity;
    OrderListActivityViewHelper mViewHelper;

    public OrderListActivityController(OrderListActivity mActivity, OrderListActivityViewHelper mViewHelper) {
        this.mActivity = mActivity;
        this.mViewHelper = mViewHelper;
    }

    public void init(){

    }
}
