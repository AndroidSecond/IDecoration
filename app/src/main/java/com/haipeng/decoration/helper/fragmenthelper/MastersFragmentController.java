package com.haipeng.decoration.helper.fragmenthelper;

import com.haipeng.decoration.adapter.MastersAdapter;
import com.haipeng.decoration.fragment.MainFragment;
import com.haipeng.decoration.fragment.MastersFragment;
import com.haipeng.decoration.model.MasterModel;

import java.util.List;

/**
 * Created by Administrator on 2017/8/12.
 */

public class MastersFragmentController {

    MastersFragment mFragment = null;
    MastersFragmentViewHelper viewHelper = null;

    MastersAdapter adapter;

    public MastersFragmentController(MastersFragment mainFragment, MastersFragmentViewHelper viewHelper) {
        this.mFragment = mainFragment;
        this.viewHelper = viewHelper;
    }

    public void init(){
        adapter = new MastersAdapter(mFragment.getActivity());
        mFragment.verticalRecyclerView.setAdapter(adapter);
    }

    public void setData(List<MasterModel> models){
        this.adapter.setData(models);
    }

    public void refreshForConnectNet(){

    }

    public void refreshForLoginSuccess(){

    }
}
