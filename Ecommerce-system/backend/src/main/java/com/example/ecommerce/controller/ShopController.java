package com.example.ecommerce.controller;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.dto.GoodsParam;
import com.example.ecommerce.mbg.model.Shop;
import com.example.ecommerce.service.ShopService;
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
 * @date: 2020/6/5 17:27
 * @description:
 */
@Api(tags = "ShopController",description = "商家的操作接口")
@Controller
@RequestMapping("/Shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation("商家的注册")
    @RequestMapping(value = "/Sellerregister",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult register(@RequestParam String password,
                                 @RequestParam String Shopname,
                                 @RequestParam String Sellername,
                                 @RequestParam String address,
                                 @RequestParam String sellertelephone)
    {
        return shopService.SellerRegister(password, Shopname,Sellername,address,sellertelephone);
    }

    @ApiOperation("商家登录")
    @RequestMapping(value = "/Sellerlogin",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult login(@RequestParam String username,
                              @RequestParam String password)
    {
        String token = shopService.SellerLogin(username, password);
        if(token == null)
        {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String,String> map = new HashMap<>();
        map.put("token",token);
        map.put("tokenhead",tokenHead);

        return CommonResult.success(map);
    }

    @ApiOperation("商家申请上架商品")
    @RequestMapping(value = "/ApplyGoodsOn",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult ApplyGoodsOn(@RequestBody GoodsParam goodsParam,BindingResult bindingResult)
    {
        return shopService.ApplyGoodsUp(goodsParam);
    }

}
