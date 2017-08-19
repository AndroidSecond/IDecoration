package com.haipeng.decoration.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.haipeng.decoration.adapter.viewholder.ItemOrderViewHelper;
import com.haipeng.decoration.model.OrderModel;

import java.util.List;

/**
 * Created by Administrator on 2017/8/19.
 */

public class OrderListAdapter extends RecyclerView.Adapter<ItemOrderViewHelper> {

    Context mContext;
    List<OrderModel> models;
    public OrderListAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<OrderModel> list){
        this.models = list;
    }

    @Override
    public ItemOrderViewHelper onCreateViewHolder(ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(ItemOrderViewHelper holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
