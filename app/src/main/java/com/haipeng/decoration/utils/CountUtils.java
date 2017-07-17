package com.haipeng.decoration.utils;

import android.support.v4.view.ViewPager;
import android.util.Log;

import com.haipeng.decoration.listener.OnCountListener;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.concurrent.TimeUnit;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/7/17.
 */

public class CountUtils {

    Subscription subs;
    int temp;
    public static int num;
    private OnCountListener listener;

    Flowable<Integer> flowableCountDown;
    Subscriber<Integer> suscriberCountDown;

    public CountUtils() {
        flowableCountDown = Flowable.create(new FlowableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull FlowableEmitter<Integer> e) throws Exception {
                suscriberCountDown.onNext(temp);
                suscriberCountDown.onComplete();
            }
        }, BackpressureStrategy.ERROR);

        suscriberCountDown = new Subscriber<Integer>() {
            @Override
            public void onSubscribe(Subscription s) {
                subs = s;
            }

            @Override
            public void onNext(Integer integer) {
                action(integer.intValue());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        };
        action(5);
    }


    public void setListener(OnCountListener listener) {
        this.listener = listener;
    }

    public void action(int seconds) {
        flowableCountDown.delay(seconds, TimeUnit.SECONDS).
                subscribeOn(AndroidSchedulers.mainThread()).
                subscribe(suscriberCountDown);
        temp = 5;
        num = num + 1 > 4 ? 0 : num + 1;
        Log.d("tag", "" + num);
        listener.countAction();
    }

    public void cancelAction() {
        if (null != subs)
            subs.cancel();//取消订阅
    }

    // 当用户手滑动时
    public void inRefresh() {
        cancelAction();
        temp = 10;
        action(temp);
    }


}
