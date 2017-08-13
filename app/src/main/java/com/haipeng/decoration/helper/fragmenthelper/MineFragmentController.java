package com.haipeng.decoration.helper.fragmenthelper;

import com.haipeng.decoration.fragment.MainFragment;
import com.haipeng.decoration.fragment.MineFragment;

/**
 * Created by Administrator on 2017/8/12.
 */

public class MineFragmentController {
    MineFragment mFragment = null;
    MineFragmentViewHelper viewHelper = null;

    public MineFragmentController(MineFragment mineFragment, MineFragmentViewHelper viewHelper) {
        this.mFragment = mineFragment;
        this.viewHelper = viewHelper;
    }
}
