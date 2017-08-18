package com.haipeng.decoration.ror;

import com.haipeng.decoration.model.BaseModel;
import com.haipeng.decoration.model.MasterModel;
import com.haipeng.decoration.model.OrderModel;
import com.haipeng.decoration.model.RecommendModel;
import com.haipeng.decoration.model.ResponseUserModel;
import com.haipeng.decoration.model.ReturnResult;
import com.haipeng.decoration.model.TemplateModel;
import com.haipeng.decoration.model.VendorModel;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2017/8/16.
 */

public interface UrlService {

    @FormUrlEncoded
    @POST("148124/user/addUser")
    Flowable<ReturnResult> signUp(@Field("UserModel") String json);

    @FormUrlEncoded
    @GET("148124/user/queryUser")
    Flowable<ResponseUserModel> signIn(@Field("UserName") String userName,@Field("UserPassword") String UserPassword);

    @FormUrlEncoded
    @POST("order/addOrder")
    Flowable<OrderModel> addOrder(@Field("OrderModel") String json);

    @FormUrlEncoded
    @GET("order/queryOrder")
    Flowable<OrderModel> getOrder(@Field("UserUniqueNumber") String id);


    @FormUrlEncoded
    @GET("template/queryOneTemplate")
    Flowable<TemplateModel> queryOneTemplate(@Field("TemplateUniqueNumber") String uniqueNumber);

    @FormUrlEncoded
    @GET("template/queryAllTemplate")
    Flowable<List<TemplateModel>> queryAllTemplate();

    @FormUrlEncoded
    @GET("vendor/queryOneVendor")
    Flowable<VendorModel> queryOneVendor(@Field("VendorUniqueNumber") String uniqueNumber);

    @FormUrlEncoded
    @GET("vendor/queryAllVendor")
    Flowable<List<VendorModel>> queryAllVendor();

    @FormUrlEncoded
    @GET("master/queryOneMaster")
    Flowable<MasterModel> queryOneMaster(@Field("MasterUniqueNumber") String uniqueNumber);

    @FormUrlEncoded
    @GET("master/queryAllMaster")
    Flowable<List<MasterModel>> queryAllMaster();

    @FormUrlEncoded
    @GET("recommend/queryOneRecommend")
    Flowable<RecommendModel> queryOneRecommend(@Field("RecommendUniqueNumber") String uniqueNumber);

    @FormUrlEncoded
    @GET("recommend/queryAllRecommend")
    Flowable<List<RecommendModel>> queryAllRecommend();




}
