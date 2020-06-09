package com.example.ecommerce.controller;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.dto.LoginParam;
import com.example.ecommerce.service.UserrService;
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
 * @date: 2020/6/1 12:04
 * @description:
 */
@Api(tags = "UserController",description = "普通用户的操作接口")
@Controller
@RequestMapping("/User")
public class UserrController {

    @Autowired
    private UserrService userrService;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation("普通用户的注册")
    @RequestMapping(value = "/Userregister",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult register(@RequestParam String username,
                                 @RequestParam String password,
                                 @RequestParam String telephone)
    {
        return userrService.register(username, password, telephone);
    }

    @ApiOperation("普通用户登录")
    @RequestMapping(value = "/Userlogin",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody LoginParam loginParam,
                              BindingResult bindingResult)
    {
        String token = userrService.login(loginParam.getUsername(), loginParam.getPassword());
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
