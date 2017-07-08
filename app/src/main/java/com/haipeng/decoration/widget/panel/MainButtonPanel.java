package com.haipeng.decoration.widget.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.haipeng.decoration.R;

/**
 * Created by Administrator on 2017/7/4.
 */

public class MainButtonPanel extends LinearLayout {

    LayoutInflater mLayoutInflater;
    Context mContext;
    View mContentView;

    public MainButtonPanel(Context context) {
        super(context);
        init(context);
    }

    public MainButtonPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(Context context) {
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mContentView = mLayoutInflater.inflate(R.layout.panel_main_button, null);
        addView(mContentView);
    }


}
