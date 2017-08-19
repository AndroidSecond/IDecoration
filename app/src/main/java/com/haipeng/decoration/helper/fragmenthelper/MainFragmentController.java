package com.haipeng.decoration.helper.fragmenthelper;

import android.view.View;

import com.google.gson.Gson;
import com.haipeng.decoration.R;
import com.haipeng.decoration.constant.LoginConstant;
import com.haipeng.decoration.fragment.MainFragment;
import com.haipeng.decoration.model.OrderModel;
import com.haipeng.decoration.model.UserModel;
import com.haipeng.decoration.ror.UrlUtils;
import com.haipeng.decoration.utils.StringUtils;
import com.haipeng.decoration.utils.UniqueNumberUtils;
import com.haipeng.decoration.utils.widget.MyToastUtils;

import io.reactivex.functions.Consumer;

/**
 * Created by Administrator on 2017/8/12.
 */

public class MainFragmentController implements View.OnClickListener {

    MainFragment mFragment = null;
    MainFragmentViewHelper mViewHelper = null;

    public MainFragmentController(MainFragment mainFragment, MainFragmentViewHelper viewHelper) {
        this.mFragment = mainFragment;
        this.mViewHelper = viewHelper;
    }

    public void init() {
        mFragment.btnCommit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_commit:
                UrlUtils.addOrder(getOrderModelJson(""),consumer,errorConsumer);
                break;
        }
    }

    public String getOrderModelJson(String imgPath) {
        OrderModel model = new OrderModel();
        model.setUniqueNumber(UniqueNumberUtils.getUniqueNumber());
        model.setUserName(StringUtils.filterStringExe(mFragment.etUserName.getText()));
        model.setUserPhone(StringUtils.filterStringExe(mFragment.etUserPhone.getText()));
        model.setUserAdress(StringUtils.filterStringExe(mFragment.etUserAddress.getText()));
        model.setUserUniqueNumber(LoginConstant.USER_UNIQUENUMBER);
        model.setDecorationArea(StringUtils.filterStringExe(mFragment.etDecorationArea.getText()));
        model.setDecorationStyle(StringUtils.filterStringExe(mFragment.etDecorationStyle.getText()));
        model.setDecorationRequire(StringUtils.filterStringExe(mFragment.etDecorationRequire.getText()));
        model.setImageAvator(imgPath);

        Gson gson = new Gson();

        return gson.toJson(model);
    }
    
    Consumer<OrderModel> consumer = new Consumer<OrderModel>() {
        @Override
        public void accept(OrderModel orderModel) throws Exception {
            
        }
    };
    Consumer<Throwable> errorConsumer = new Consumer<Throwable>() {
        @Override
        public void accept(Throwable throwable) throws Exception {
            MyToastUtils.showToastLong(mFragment.getContext(),"发布装修失败");
        }
    };
    
}
