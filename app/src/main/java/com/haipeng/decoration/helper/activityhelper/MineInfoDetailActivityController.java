package com.haipeng.decoration.helper.activityhelper;

import com.haipeng.decoration.activity.MineInfoDetailActivity;
import com.haipeng.decoration.model.UserModel;

/**
 * Created by Administrator on 2017/7/10.
 */

public class MineInfoDetailActivityController {

    MineInfoDetailActivity mActivity;
    MineInfoDetailActivityViewHelper mViewHelper;
    
    public static String MASTER_UNIQUENMBER_KEY = "master_unique_key";

    public MineInfoDetailActivityController(MineInfoDetailActivity mainActivity, MineInfoDetailActivityViewHelper viewHelper) {
        mActivity = mainActivity;
        mViewHelper = viewHelper;
    }

    public void init() {

    }

    public void setViewData(UserModel model) {

    }


    public void refreshForConnectNet() {

    }

    public void refreshForLoginSuccess() {

    }


}
