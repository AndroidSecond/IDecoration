package com.haipeng.decoration.helper.fragmenthelper;

import com.haipeng.decoration.fragment.MainFragment;
import com.haipeng.decoration.fragment.MastersFragment;

/**
 * Created by Administrator on 2017/8/12.
 */

public class MastersFragmentController {

    MastersFragment mFragment = null;
    MastersFragmentViewHelper viewHelper = null;

    public MastersFragmentController(MastersFragment mainFragment, MastersFragmentViewHelper viewHelper) {
        this.mFragment = mainFragment;
        this.viewHelper = viewHelper;
    }
}
