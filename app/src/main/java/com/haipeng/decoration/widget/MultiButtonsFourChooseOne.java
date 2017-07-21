package com.haipeng.decoration.widget;

import android.content.Context;
import android.widget.Button;

import com.haipeng.decoration.R;

/**
 * Created by wanin on 2017/7/20.
 */

public class MultiButtonsFourChooseOne {

    private Button type1, type2, type3, type4;
    private Context mContext;

    public MultiButtonsFourChooseOne(Context context) {
        mContext = context;
    }

    // 按钮
    public void setBtnHomeworkTypes(Button type1, Button type2, Button type3, Button type4) {
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
        this.type4 = type4;
    }

    public void changeBtnHomeworkType(int type) {
        switch (type) {
            case 1:
                btnHomeworkTypePress(type1);
                btnHomeworkTypeNormal(type2);
                btnHomeworkTypeNormal(type3);
                btnHomeworkTypeNormal(type4);
                break;
            case 2:
                btnHomeworkTypeNormal(type1);
                btnHomeworkTypePress(type2);
                btnHomeworkTypeNormal(type3);
                btnHomeworkTypeNormal(type4);
                break;
            case 3:
                btnHomeworkTypeNormal(type1);
                btnHomeworkTypeNormal(type2);
                btnHomeworkTypePress(type3);
                btnHomeworkTypeNormal(type4);
                break;
            case 4:
                btnHomeworkTypeNormal(type1);
                btnHomeworkTypeNormal(type2);
                btnHomeworkTypeNormal(type3);
                btnHomeworkTypePress(type4);
                break;
        }
    }

    public void btnHomeworkTypePress(Button btn) {
        btn.setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
    }

    public void btnHomeworkTypeNormal(Button btn) {
        btn.setBackgroundColor(mContext.getResources().getColor(R.color.colorWhite));
//        btn.setTextColor(mContext.getResources().getColor(R.color.colorBtnSelectNormal));
    }
}
