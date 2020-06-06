package com.example.ecommerce.service;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.mbg.model.GoodSku;
import com.example.ecommerce.mbg.model.Goods;
import com.example.ecommerce.mbg.model.Order;
import com.example.ecommerce.mbg.model.OrderReturn;

import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/4 21:48
 * @description:
 */
public interface ShopService {
    CommonResult SellerRegister(String Sellername, String password,String Shopname);

    String SellerLogin(String Sellername,String Sellerpassword);

    //分页查询退货申请
    CommonResult getOrderReturnApply(int pageNum,int pageSize,String SellerId);
    //批量删除退货订单申请
    int deleteOrderReturnApply(List<Long> ids);
    //退货退款审核通过
    CommonResult verifyOrderReturn(String orderId);
    //拒绝退货退款
    CommonResult rejectOrderReturn(String orderId);
    //获取申请详情
    OrderReturn getReturnInformation(String id);
    //批量发货
    int delivery(List<Order> list);

    int modifyShowState();

    Goods getGoodsInformationBypGoodsId(String goodid);
    //修改商品信息
    int modifyGoods();

    CommonResult deleteGoodsByGoodsId(String goodid);

    int createGoods(Goods good);

    int modifyGoodsSKU(String Goodid,GoodSku goodSku);

    //修改状态
    CommonResult modifyPublishState(String goodid);
    CommonResult modifyShowState(String goodid);
    CommonResult modifyPackageState(String goodid);
    CommonResult modifyDeleteState(String goodid);



}
