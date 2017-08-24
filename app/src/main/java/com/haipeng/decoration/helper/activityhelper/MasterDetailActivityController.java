package com.haipeng.decoration.helper.activityhelper;

import com.haipeng.decoration.activity.MasterDetailActivity;
import com.haipeng.decoration.model.MasterModel;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by Administrator on 2017/7/10.
 */

public class MasterDetailActivityController {

    MasterDetailActivity mActivity;
    MasterDetailActivityViewHelper mViewHelper;
    public static String MASTER_UNIQUENMBER_KEY = "master_unique_key";

    public MasterDetailActivityController(MasterDetailActivity mainActivity, MasterDetailActivityViewHelper viewHelper) {
        mActivity = mainActivity;
        mViewHelper = viewHelper;
    }

    public void init() {


    }

    public void setViewData(MasterModel model) {
        mActivity.tvName.setText(model.getName());
        mActivity.tvPhone.setText(model.getPhone());// (TextView) mActivity.findViewById(R.id.tv_phone);
        mActivity.tvEmail.setText(model.getEmail());// (TextView) mActivity.findViewById(R.id.tv_email);
        mActivity.tvAddress.setText(model.getAddress());// (TextView) mActivity.findViewById(R.id.tv_address);
        mActivity.tvLegalRep.setText(model.getLegalRepresentative());// (TextView) mActivity.findViewById(R.id.tv_legal_representative);
        ImageLoader.getInstance().displayImage(model.getImageAvator(), mActivity.imageAavator);
        ImageLoader.getInstance().displayImage(model.getImageLicense(), mActivity.imageLicense);
    }


    public void refreshForConnectNet() {

    }

    public void refreshForLoginSuccess() {

    }


}
