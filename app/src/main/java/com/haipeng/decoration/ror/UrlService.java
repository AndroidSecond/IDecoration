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
    @POST("148124/user/queryUser")
    Flowable<ResponseUserModel> signIn(@Field("UserName") String userName,@Field("UserPassword") String userPassword);

    @FormUrlEncoded
    @POST("148124/user/queryUserByUniqueNumber")
    Flowable<ResponseUserModel> signIn(@Field("UserUniqueNumber") long uniqueNumber);

    @FormUrlEncoded
    @POST("order/addOrder")
    Flowable<OrderModel> addOrder(@Field("OrderModel") String json);

    @FormUrlEncoded
    @POST("order/queryAllOrder")
    Flowable<List<OrderModel>> getAllOrder();

    @FormUrlEncoded
    @POST("order/getOrderByOrderUniqueNumber")
    Flowable<OrderModel> getOrderByOrderUniqueNumber(@Field("OrderUniqueNumber") long id);

    @FormUrlEncoded
    @POST("order/getOrdersByUserUniqueNumber")
    Flowable<List<OrderModel>> getOrdersByUserUniqueNumber(@Field("UserUniqueNumber") long id);


    @FormUrlEncoded
    @POST("template/queryOneTemplate")
    Flowable<TemplateModel> queryOneTemplate(@Field("TemplateUniqueNumber") String uniqueNumber);

    @FormUrlEncoded
    @POST("template/queryAllTemplate")
    Flowable<List<TemplateModel>> queryAllTemplate();

    @FormUrlEncoded
    @POST("vendor/queryOneVendor")
    Flowable<VendorModel> queryOneVendor(@Field("VendorUniqueNumber") String uniqueNumber);

    @FormUrlEncoded
    @POST("vendor/queryAllVendor")
    Flowable<List<VendorModel>> queryAllVendor();

    @FormUrlEncoded
    @POST("master/queryOneMaster")
    Flowable<MasterModel> queryOneMaster(@Field("MasterUniqueNumber") String uniqueNumber);

    @FormUrlEncoded
    @POST("master/queryAllMaster")
    Flowable<List<MasterModel>> queryAllMaster();

    @FormUrlEncoded
    @POST("recommend/queryOneRecommend")
    Flowable<RecommendModel> queryOneRecommend(@Field("RecommendUniqueNumber") String uniqueNumber);

    @FormUrlEncoded
    @POST("recommend/queryAllRecommend")
    Flowable<List<RecommendModel>> queryAllRecommend();




}
