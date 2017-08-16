package com.haipeng.decoration.ror;

import com.haipeng.decoration.model.BaseModel;
import com.haipeng.decoration.model.MasterModel;
import com.haipeng.decoration.model.OrderModel;
import com.haipeng.decoration.model.RecommendModel;
import com.haipeng.decoration.model.ResponseUserModel;
import com.haipeng.decoration.model.TemplateModel;
import com.haipeng.decoration.model.UserModel;
import com.haipeng.decoration.model.VendorModel;

import org.reactivestreams.Subscriber;

import java.util.List;
import java.util.Observable;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/8/16.
 */

public class UrlUtils extends RetrofitUtils {

    protected static final UrlService urlService = getRetrofit().create(UrlService.class);

    //设缓存有效期为1天
    protected static final long CACHE_STALE_SEC = 60 * 60 * 24 * 1;
    //查询缓存的Cache-Control设置，使用缓存
    protected static final String CACHE_CONTROL_CACHE = "only-if-cached, max-stale=" + CACHE_STALE_SEC;
    //查询网络的Cache-Control设置。不使用缓存
    protected static final String CACHE_CONTROL_NETWORK = "max-age=0";

    public static <T> void setSubscribe(Flowable<T> flowable, Consumer<T> consumer) {
        flowable.subscribeOn(Schedulers.io())
                .subscribeOn(Schedulers.newThread())//子线程访问网络
                .observeOn(AndroidSchedulers.mainThread())//回到主线程
                .subscribe(consumer);
    }

    static Consumer<? super Throwable> errrorConsumer = new Consumer<Throwable>() {
        @Override
        public void accept(Throwable throwable) throws Exception {

        }
    };


//    = FFunction<? super Throwable, ? extends BaseModel> valueSupplier

    public static void signUp(String json, Consumer<ResponseUserModel> consumer) {
        setSubscribe(urlService.signUp(json), consumer);
    }

    public static void signIn(String userName, String userPassword, Consumer<ResponseUserModel> consumer) {
        setSubscribe(urlService.signIn(userName, userPassword), consumer);
    }

    public static void addOrder(String json, Consumer<OrderModel> consumer) {
        setSubscribe(urlService.addOrder(json), consumer);
    }

    public static void getOrder(String uniqueNumber, Consumer<OrderModel> consumer) {
        setSubscribe(urlService.getOrder(uniqueNumber), consumer);
    }

    public static void queryOneTemplate(String uniqueNumber, Consumer<TemplateModel> consumer) {
        setSubscribe(urlService.queryOneTemplate(uniqueNumber), consumer);
    }

    public static void queryAllTemplate(Consumer<List<TemplateModel>> consumer) {
        setSubscribe(urlService.queryAllTemplate(), consumer);
    }

    public static void queryOneVendor(String uniqueNumber, Consumer<VendorModel> consumer) {
        setSubscribe(urlService.queryOneVendor(uniqueNumber).doOnError(errrorConsumer), consumer);
    }

    public static void queryAllVendor(Consumer<List<VendorModel>> consumer) {
        setSubscribe(urlService.queryAllVendor(), consumer);
    }

    public static void queryOneMaster(String uniqueNumber, Consumer<MasterModel> consumer) {
        setSubscribe(urlService.queryOneMaster(uniqueNumber), consumer);
    }

    public static void queryAllMaster(Consumer<List<MasterModel>> consumer) {
        setSubscribe(urlService.queryAllMaster(), consumer);
    }

    public static void queryOneRecommend(String uniqueNumber, Consumer<RecommendModel> consumer) {
        setSubscribe(urlService.queryOneRecommend(uniqueNumber), consumer);
    }

    public static void queryAllRecommend(Consumer<List<RecommendModel>> consumer) {
        setSubscribe(urlService.queryAllRecommend(), consumer);
    }

}
