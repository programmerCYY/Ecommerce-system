package com.example.ecommerce.controller;

import com.example.ecommerce.service.ManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: rain
 * @date: 2020/6/3 23:54
 * @description:
 */
@Api(tags = "ManagerController",description = "普通用户的操作接口")
@Controller
@RequestMapping("/Manager")
public class ManageController {

    @Autowired
    private ManagerService managerService;

    @ApiOperation("管理员登录")
    @RequestMapping(value = "/Managerlogin",method = RequestMethod.GET)
    @ResponseBody
    public String login(@RequestParam String username,
                        @RequestParam String password)
    {
        return managerService.login(username, password);
    }
}
