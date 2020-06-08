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

public interface UserrService {

    CommonResult register(String username,String password,String telephone);

    String login(String username,String password);


}
