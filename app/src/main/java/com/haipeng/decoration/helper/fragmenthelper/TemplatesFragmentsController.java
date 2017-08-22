package com.haipeng.decoration.helper.fragmenthelper;

import com.haipeng.decoration.fragment.TemplatesFragment;

/**
 * Created by Administrator on 2017/8/12.
 */

public class TemplatesFragmentsController {
    
    TemplatesFragment mFragment = null;
    TemplatesFragmentsViewHelper viewHelper = null;

    public TemplatesFragmentsController(TemplatesFragment templatesFragment, TemplatesFragmentsViewHelper viewHelper) {
        this.mFragment = templatesFragment;
        this.viewHelper = viewHelper;
    }

    public void refreshForConnectNet(){

    }

    public void refreshForLoginSuccess(){

    }

}
