package com.example.ecommerce.service;

import com.example.ecommerce.common.api.CommonResult;

/**
 * @author: rain
 * @date: 2020/6/1 11:47
 * @description:
 */
public interface UserrService {

    CommonResult register(String username,String password,String telephone);

    CommonResult login(String username,String password);

}
