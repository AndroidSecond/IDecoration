package com.haipeng.decoration.helper.activityhelper;

import android.widget.FrameLayout;

import com.haipeng.decoration.R;
import com.haipeng.decoration.activity.MainActivity;

/**
 * Created by Administrator on 2017/7/4.
 */

public class MainActivityViewHelper {

    MainActivity mActivity;

    public MainActivityViewHelper(MainActivity mainActivity) {
        mActivity = mainActivity;
    }

    public void initView(){
        mActivity.frameLayout = (FrameLayout) mActivity.findViewById(R.id.fragment);
    }


}
