package com.haipeng.decoration.helper.fragmenthelper;

import com.haipeng.decoration.fragment.HomePageFragment;
import com.haipeng.decoration.widget.viewpager.MyNavigationViewPagerAdapter;

/**
 * Created by Administrator on 2017/7/10.
 */

public class HomePagerFragementController {

    HomePageFragment mFragment;
    HomePageFragmentViewHelper mViewHelper;
    public HomePagerFragementController(HomePageFragment pageFragment,HomePageFragmentViewHelper viewHelper) {
        mFragment = pageFragment;
        mViewHelper = viewHelper;
        init();
    }

    public void init(){
        mViewHelper.initView();
        mFragment.mPagerAdapter = new MyNavigationViewPagerAdapter(mFragment.navigationViewPager.getViews(mFragment.getActivity()));
        mFragment.navigationViewPager.setAdapter(mFragment.mPagerAdapter);
    }

}
