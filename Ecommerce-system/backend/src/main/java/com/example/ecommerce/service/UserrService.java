package com.example.ecommerce.service;

import com.example.ecommerce.common.api.CommonResult;
import org.springframework.stereotype.Service;

/**
 * @author: rain
 * @date: 2020/6/1 11:47
 * @description:
 */
@Service
public interface UserrService {

    CommonResult register(String username,String password,String telephone);

    String login(String username,String password);

}
