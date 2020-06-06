package com.example.ecommerce.service;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.mbg.model.Manager;
import com.example.ecommerce.mbg.model.Order;
import com.example.ecommerce.mbg.model.Shop;
import com.example.ecommerce.mbg.model.Userpermission;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import sun.security.provider.SHA;

import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/2 17:48
 * @description:
 */
@Service
public interface ManagerService {
    String  login(String username,String password);

    CommonResult verifySellerregister(String sellerId);
    List<Shop> getNeedVerifyShop(int pageNum, int pageSize);

    CommonResult verifyGoodsPuton(String goodId);

    CommonResult deleteCommentByUserId(String userId);

    List<Shop> getAllShop(int pageNum,int pageSize);

    Shop getShopByShopname(String shopname);
    Shop getShopByShopId(String shopid);

    //创建属性分类
    int createGoodsCategory(String name);
    //修改属性分类
    int updateGoodsCategory(String id, String name);
    //删除属性分类
    int deleteGoodsCategory(String id);

}
