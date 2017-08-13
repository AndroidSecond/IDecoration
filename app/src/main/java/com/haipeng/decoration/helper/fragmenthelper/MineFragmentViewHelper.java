package com.haipeng.decoration.helper.fragmenthelper;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.haipeng.decoration.R;
import com.haipeng.decoration.fragment.HomePageFragment;
import com.haipeng.decoration.fragment.MineFragment;

/**
 * Created by Administrator on 2017/8/12.
 */

public class MineFragmentViewHelper {
    MineFragment mFragment;
    View mView;

    public MineFragmentViewHelper(MineFragment mineFragment) {
        mFragment = mineFragment;
        mView = mFragment.mContentView;
    }

    public void initView(){
    }
}
