package com.haipeng.decoration.widget.viewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.haipeng.decoration.utils.CountUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/7/10.
 */

public class MyNavigationViewPagerAdapter extends PagerAdapter {


    List<ImageView> mViewList;

    public MyNavigationViewPagerAdapter(List<ImageView> viewList) {
        mViewList = viewList;
    }

    @Override
    public int getCount() {
        return mViewList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        int preNum = CountUtils.num < 0 ? 3 : CountUtils.num;
        container.removeView(mViewList.get(preNum));

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
//        container.removeView();
        container.removeView(mViewList.get(CountUtils.num));
        container.addView(mViewList.get(CountUtils.num));

        return mViewList.get(CountUtils.num);
    }

}
