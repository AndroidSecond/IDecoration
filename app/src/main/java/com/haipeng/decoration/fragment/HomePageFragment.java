package com.haipeng.decoration.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.haipeng.decoration.R;
import com.haipeng.decoration.base.BaseMainFragment;
import com.haipeng.decoration.helper.fragmenthelper.HomePageFragmentViewHelper;
import com.haipeng.decoration.helper.fragmenthelper.HomePagerFragementController;
import com.haipeng.decoration.widget.viewpager.MyNavigationViewPager;
import com.haipeng.decoration.widget.viewpager.MyNavigationViewPagerAdapter;

public class HomePageFragment extends BaseMainFragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private HomePageFragmentViewHelper viewHelper;
    private HomePagerFragementController mController;
    public MyNavigationViewPagerAdapter mPagerAdapter;
    public View mContentView;
    public MyNavigationViewPager navigationViewPager;
    public RecyclerView horizontalRecyclerView;
    public RecyclerView verticalRecyclerView;

    public static HomePageFragment newInstance(String param1, String param2) {
        HomePageFragment fragment = new HomePageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mContentView = inflater.inflate(R.layout.fragment_home_page, container, false);
        viewHelper = new HomePageFragmentViewHelper(this);
        mController = new HomePagerFragementController(this, viewHelper);
        return mContentView;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
