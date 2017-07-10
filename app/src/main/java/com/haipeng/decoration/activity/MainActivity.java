package com.haipeng.decoration.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.haipeng.decoration.R;
import com.haipeng.decoration.base.BaseMainActivity;
import com.haipeng.decoration.fragment.HomePageFragment;
import com.haipeng.decoration.helper.activityhelper.MainActivityController;
import com.haipeng.decoration.helper.activityhelper.MainActivityViewHelper;

public class MainActivity extends BaseMainActivity implements HomePageFragment.OnFragmentInteractionListener {

    private MainActivityController mController;
    private MainActivityViewHelper mViewHelper;
    public FrameLayout frameLayout;
    public FragmentManager fragmentManager;
    public FragmentTransaction fragmentTransaction;
    public HomePageFragment homePageFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewHelper = new MainActivityViewHelper(this);
        mController = new MainActivityController(this, mViewHelper);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
