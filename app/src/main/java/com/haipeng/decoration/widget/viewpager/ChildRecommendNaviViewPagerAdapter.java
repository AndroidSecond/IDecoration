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

public class ChildRecommendNaviViewPagerAdapter extends PagerAdapter {


    List<ImageView> mViewList;

    public ChildRecommendNaviViewPagerAdapter(List<ImageView> viewList) {
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
//        int preNum = CountUtils.num - 1 < 0 ? 3 : CountUtils.num - 1;
        container.removeView(mViewList.get(position % mViewList.size()));

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mViewList.get(position % mViewList.size()));
        return mViewList.get(position % mViewList.size());
    }

}
