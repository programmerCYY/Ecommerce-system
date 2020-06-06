package com.example.ecommerce.service;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.mbg.model.Chart;
import com.example.ecommerce.mbg.model.GoodsCategory;
import com.example.ecommerce.mbg.model.Order;
import com.example.ecommerce.mbg.model.Shop;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/1 11:47
 * @description:
 */
@Service
public interface UserrService {

    CommonResult register(String username,String password,String telephone);

    String login(String username,String password);

    //购物车部分
    CommonResult AddChart();
    List<Chart> getAllChartByUserId();
    int updateNumInChart(String userId,String GoodId,int num);
    int deleteChartByGoodsId(String userId,String goodId);
    int clearChart(String userId);

    CommonResult getAllGoods(int pageNum,int pageSize);

    CommonResult getGoodsByShopId(String shopid);

    List<Order> getAllOrderByUserId();

    List<GoodsCategory> getAllGoodsCategory(int pageNum,int pageSize);

    GoodsCategory getGoodsCategoryByGoodId(String GoodId);

    List<Order> getAllOrder(int pageNum,int pageSize);

    CommonResult getOrderDetail();

    List<GoodsCategory> getAllCategory(int pageNum,int pageSize);

    int GoodsReturnApply();

    List<Shop> getAllShop(int pageNum,int pageSize);

}
