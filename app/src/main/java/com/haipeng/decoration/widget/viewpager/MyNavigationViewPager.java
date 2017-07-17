package com.haipeng.decoration.widget.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.haipeng.decoration.R;
import com.haipeng.decoration.listener.OnCountListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/10.
 */

public class MyNavigationViewPager extends ViewPager implements OnCountListener {


    private ImageView view1, view2, view3, view4;
    private List<ImageView> viewList;

    public MyNavigationViewPager(Context context) {
        super(context);

    }

    public MyNavigationViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

//    @Override
//    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//    }
//
//    @Override
//    public void onPageSelected(int position) {
//
//    }
//
//    @Override
//    public void onPageScrollStateChanged(int state) {
//
//    }


    @Override
    public void countAction() {

    }

    public void init(){
//        addOnPageChangeListener(this);
//        addOnPageChangeListener(new OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
    }

//
//    public void
//
//    mFragment.navigationViewPager.setOnGenericMotionListener(new View.OnGenericMotionListener() {
//        @Override
//        public boolean onGenericMotion(View v, MotionEvent event) {
//            if(event.getAction() == MotionEvent.ACTION_DOWN){
//                countUtils.cancelAction();
//            }else if(event.getAction() == MotionEvent.ACTION_UP) {
//                countUtils.inRefresh();
//            }
//            return true;
//        }
//    });


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
