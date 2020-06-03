package com.example.ecommerce.controller;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.service.UserrService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: rain
 * @date: 2020/6/1 12:04
 * @description:
 */
@Api(tags = "UserrController",description = "普通用户的操作接口")
@Controller
@RequestMapping("/Userr")
public class UserrController {

    @Autowired
    private UserrService userrService;


    @ApiOperation("普通用户的注册，暂时使用")
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult register(@RequestParam String username,
                                 @RequestParam String password,
                                 @RequestParam String telephone)
    {
        return userrService.register(username, password, telephone);
    }

    @ApiOperation("普通用户登录，暂时使用")
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult login(@RequestParam String username,
                                 @RequestParam String password)
    {
        return userrService.login(username, password);
    }
}
