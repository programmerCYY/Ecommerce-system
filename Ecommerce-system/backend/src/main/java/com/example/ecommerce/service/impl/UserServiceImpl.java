package com.example.ecommerce.service.impl;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.mbg.mapper.UserrMapper;
import com.example.ecommerce.mbg.model.Userr;
import com.example.ecommerce.service.UserrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: rain
 * @date: 2020/6/1 11:47
 * @description:
 */
@Service
public class UserServiceImpl implements UserrService {

    @Autowired(required = false)
    private UserrMapper userrMapper;

    @Override
    public CommonResult register(String username, String password,String telephone) {

        String text ="未填写";
        Userr userr = new Userr();

        userr.setUserid(username);
        userr.setUserpassword(password);
        userr.setUseraddress(text);
        userr.setUsertelephone(telephone);

        userrMapper.insert(userr);
        return CommonResult.success(username, "注册成功");
    }

    @Override
    public CommonResult login(String username, String password) {
        Userr userr=userrMapper.selectByPrimaryKey(username);
        if(userr==null)
        {
            return CommonResult.failed("该用户名不存在");
        }
        else if(!password.equals(userr.getUserpassword())) {
            return CommonResult.failed("密码错误，请重新输入");
        }
        else
        {
            return CommonResult.success(username,"登录成功");
        }
    }
}
