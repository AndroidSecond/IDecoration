package com.haipeng.decoration.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/8/19.
 */

public class ItemOrderViewHelper extends RecyclerView.ViewHolder{

    public ItemOrderViewHelper(View itemView) {
        super(itemView);
    }

    TextView tvName;
    TextView tvPhone;
    TextView tvEmail;
    TextView tvAddress;
    TextView tvArea;
    TextView tvRequire;
    ImageView imageAvator;
}
