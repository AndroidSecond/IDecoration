package com.haipeng.decoration.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.haipeng.decoration.R;
import com.haipeng.decoration.adapter.viewholder.MyHorizontalRecommendViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2017/7/19.
 */

public class MyHorizontalRecyclerviewRecommendAdapter extends RecyclerView.Adapter<MyHorizontalRecommendViewHolder> {

    private LayoutInflater mInflater;
    private List<String> mDatas;
    private Context mContext;

    public MyHorizontalRecyclerviewRecommendAdapter(Context context,List<String> mDatas) {
        this.mDatas = mDatas;
        this.mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public MyHorizontalRecommendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_recycle_hori_recommend,parent,false);
        MyHorizontalRecommendViewHolder  viewHolder = new MyHorizontalRecommendViewHolder(view);
        viewHolder.ivRecommend = (ImageView) view.findViewById(R.id.iv_recommend_avator);
        viewHolder.tvRecommend = (TextView) view.findViewById(R.id.tv_recommend);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyHorizontalRecommendViewHolder holder, int position) {
        holder.ivRecommend.setImageResource(R.mipmap.ic_launcher);
        holder.tvRecommend.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}
