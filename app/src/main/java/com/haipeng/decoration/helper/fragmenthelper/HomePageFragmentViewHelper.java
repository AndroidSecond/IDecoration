package com.haipeng.decoration.helper.fragmenthelper;

import android.support.v4.view.ViewPager;
import android.view.View;

import com.haipeng.decoration.R;
import com.haipeng.decoration.fragment.HomePageFragment;
import com.haipeng.decoration.widget.viewpager.MyNavigationViewPager;

/**
 * Created by Administrator on 2017/7/10.
 */

public class HomePageFragmentViewHelper {
    HomePageFragment mFragment;
    View mView;

    public HomePageFragmentViewHelper(HomePageFragment homePageFragment) {
        mFragment = homePageFragment;
        mView = mFragment.mContentView;
    }

    public void initView(){
        mFragment.navigationViewPager = (MyNavigationViewPager) mView.findViewById(R.id.view_pager_navigation);
    }


}
