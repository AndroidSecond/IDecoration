package com.haipeng.decoration.helper.fragmenthelper;

import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;

import com.haipeng.decoration.fragment.HomePageFragment;
import com.haipeng.decoration.listener.OnCountListener;
import com.haipeng.decoration.utils.CountUtils;
import com.haipeng.decoration.widget.viewpager.MyNavigationViewPagerAdapter;

/**
 * Created by Administrator on 2017/7/10.
 */

public class HomePagerFragementController implements OnCountListener {

    HomePageFragment mFragment;
    HomePageFragmentViewHelper mViewHelper;
    private CountUtils countUtils;

    public HomePagerFragementController(HomePageFragment pageFragment, HomePageFragmentViewHelper viewHelper) {
        mFragment = pageFragment;
        mViewHelper = viewHelper;
        countUtils = new CountUtils();
        countUtils.setListener(this);
        init();
    }

    public void init() {
        mViewHelper.initView();
        mFragment.mPagerAdapter = new MyNavigationViewPagerAdapter(mFragment.navigationViewPager.getViews(mFragment.getActivity()));
        mFragment.navigationViewPager.setAdapter(mFragment.mPagerAdapter);

        mFragment.navigationViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                CountUtils.num = position;
//                countUtils.inRefresh();
//                mFragment.mPagerAdapter.notifyDataSetChanged();
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void countAction() {
        mFragment.mPagerAdapter.notifyDataSetChanged();
    }
}
