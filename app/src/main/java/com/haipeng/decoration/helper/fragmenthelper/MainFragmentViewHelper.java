package com.haipeng.decoration.helper.fragmenthelper;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.haipeng.decoration.R;
import com.haipeng.decoration.fragment.HomePageFragment;
import com.haipeng.decoration.fragment.MainFragment;

/**
 * Created by Administrator on 2017/7/4.
 */

public class MainFragmentViewHelper {
    MainFragment mFragment;
    View mView;

    public MainFragmentViewHelper(MainFragment mainFragment) {
        mFragment = mainFragment;
        mView = mFragment.mContentView;
    }

    public void initView(){
    }
}
