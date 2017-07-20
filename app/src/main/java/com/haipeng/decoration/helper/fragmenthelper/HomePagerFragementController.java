package com.haipeng.decoration.helper.fragmenthelper;

import android.support.v7.widget.LinearLayoutManager;

import com.haipeng.decoration.adapter.ChildRecommendHoriAdapter;
import com.haipeng.decoration.adapter.HomePageAdapter;
import com.haipeng.decoration.fragment.HomePageFragment;
import com.haipeng.decoration.listener.OnCountListener;
import com.haipeng.decoration.utils.CountUtils;
import com.haipeng.decoration.widget.viewpager.ChildRecommendNaviViewPagerAdapter;

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

        //纵向recyclerView初始化
        LinearLayoutManager VLM = new LinearLayoutManager(mFragment.getActivity());
        VLM.setOrientation(LinearLayoutManager.VERTICAL);
        mFragment.verticalRecyclerView.setLayoutManager(VLM);
        mFragment.verticalAdapter = new HomePageAdapter(mFragment.getActivity(),data);
        mFragment.verticalRecyclerView.setAdapter(mFragment.verticalAdapter);

//        countUtils.setListener(this);
    }

    @Override
    public void countAction() {
//        mFragment.mPagerAdapter.notifyDataSetChanged();
//        mFragment.navigationViewPager.setCurrentItem(CountUtils.num);
        // Countils.num 为1的时候，adapter的postition为2，第二
    }
}
