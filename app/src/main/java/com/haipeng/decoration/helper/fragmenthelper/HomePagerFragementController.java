package com.haipeng.decoration.helper.fragmenthelper;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MotionEvent;
import android.view.View;

import com.haipeng.decoration.adapter.MyHorizontalRecyclerviewRecommendAdapter;
import com.haipeng.decoration.fragment.HomePageFragment;
import com.haipeng.decoration.listener.OnCountListener;
import com.haipeng.decoration.utils.CountUtils;
import com.haipeng.decoration.widget.viewpager.MyNavigationViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/10.
 */

public class HomePagerFragementController implements OnCountListener {

    HomePageFragment mFragment;
    HomePageFragmentViewHelper mViewHelper;
    private CountUtils countUtils;

    List<String> data = new ArrayList<String>();

    public void setData() {
        data.add("a");
        data.add("b");
        data.add("c");
    }

    public HomePagerFragementController(HomePageFragment pageFragment, HomePageFragmentViewHelper viewHelper) {
        mFragment = pageFragment;
        mViewHelper = viewHelper;
        countUtils = new CountUtils();
        setData();
        init();
    }

    public void init() {
        mViewHelper.initView();
        mFragment.mPagerAdapter = new MyNavigationViewPagerAdapter(mFragment.navigationViewPager.getViews(mFragment.getActivity()));
        mFragment.navigationViewPager.setAdapter(mFragment.mPagerAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mFragment.getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mFragment.horizontalRecyclerView.setLayoutManager(linearLayoutManager);

        mFragment.recyclerviewRecommendAdapter = new MyHorizontalRecyclerviewRecommendAdapter(mFragment.getActivity(),data);
        mFragment.horizontalRecyclerView.setAdapter(mFragment.recyclerviewRecommendAdapter);

        mFragment.navigationViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                CountUtils.num = position;
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

        countUtils.setListener(this);
    }

    @Override
    public void countAction() {
//        mFragment.mPagerAdapter.notifyDataSetChanged();
        mFragment.navigationViewPager.setCurrentItem(CountUtils.num);
        // Countils.num 为1的时候，adapter的postition为2，第二
    }
}
