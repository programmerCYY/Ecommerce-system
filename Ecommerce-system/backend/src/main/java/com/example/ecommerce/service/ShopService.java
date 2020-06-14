package com.example.ecommerce.service;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.mbg.model.GoodSku;
import com.example.ecommerce.mbg.model.Goods;
import com.example.ecommerce.mbg.model.Order;
import com.example.ecommerce.mbg.model.OrderReturn;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/4 21:48
 * @description:
 */

public interface ShopService {

    @Transactional
    CommonResult SellerRegister(String password, String Shopname,String Sellername,String address,String sellertelephone);

    String SellerLogin(String Sellername,String Sellerpassword);

    @Transactional
    CommonResult ApplyGoodsUp(String ShopId,String Goodname, String Goodpicture, String introduction, int number, int isPackage, String Frontpicture, String categoryId);

    void SendDelayMessageOverTime(String ShopId);

    CommonResult CancelRegister(String ShopId);
}
