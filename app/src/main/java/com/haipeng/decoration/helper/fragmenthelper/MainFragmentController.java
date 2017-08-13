package com.haipeng.decoration.helper.fragmenthelper;

import com.haipeng.decoration.fragment.MainFragment;

/**
 * Created by Administrator on 2017/8/12.
 */

public class MainFragmentController {

    MainFragment mFragment = null;
    MainFragmentViewHelper viewHelper = null;

    public MainFragmentController(MainFragment mainFragment, MainFragmentViewHelper viewHelper) {
        this.mFragment = mainFragment;
        this.viewHelper = viewHelper;
    }
}
