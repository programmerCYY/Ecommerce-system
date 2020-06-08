package com.example.ecommerce.service;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.mbg.model.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/2 17:48
 * @description:
 */

public interface ManagerService {
    String  login(String username,String password);



}
