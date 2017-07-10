package com.haipeng.decoration.widget.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.haipeng.decoration.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/10.
 */

public class MyNavigationViewPager extends ViewPager {


    private ImageView view1, view2, view3, view4;
    private List<ImageView> viewList;

    public MyNavigationViewPager(Context context) {
        super(context);
    }

    public MyNavigationViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public List<ImageView> getViews(Context context) {
        viewList = new ArrayList<ImageView>();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(LayoutParams.MATCH_PARENT, 400);
        view1 = new ImageView(context);
        view2 = new ImageView(context);
        view3 = new ImageView(context);
        view4 = new ImageView(context);

        view1.setImageResource(R.mipmap.ic_launcher);
        view2.setImageResource(R.mipmap.bg_student_offline);
        view3.setImageResource(R.mipmap.bg_student_online);
        view4.setImageResource(R.mipmap.bg_teacher_online);

        view1.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams);
        view3.setLayoutParams(layoutParams);
        view4.setLayoutParams(layoutParams);

        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        viewList.add(view4);

        return viewList;
    }


}
