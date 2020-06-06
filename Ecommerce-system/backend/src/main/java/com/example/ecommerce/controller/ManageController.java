package com.example.ecommerce.controller;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.dto.LoginParam;
import com.example.ecommerce.service.ManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: rain
 * @date: 2020/6/3 23:54
 * @description:
 */
@Api(tags = "ManagerController",description = "普通用户的操作接口")
@Controller
@RequestMapping("/Manager")
public class ManageController {

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private ManagerService managerService;

    @ApiOperation("管理员登录")
    @RequestMapping(value = "/Managerlogin",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody LoginParam loginParam,
                              BindingResult bindingResult)
    {
        String token = managerService.login(loginParam.getUsername(),loginParam.getPassword());
        if(token == null)
        {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String,String> map = new HashMap<>();
        map.put("token",token);
        map.put("tokenhead",tokenHead);

        return CommonResult.success(map);
    }
}
