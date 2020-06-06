package com.example.ecommerce.service.impl;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.common.utils.JwtTokenUtil;
import com.example.ecommerce.mbg.mapper.ShopMapper;
import com.example.ecommerce.mbg.model.Shop;
import com.example.ecommerce.mbg.model.ShopExample;
import com.example.ecommerce.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/4 21:48
 * @description:
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired(required = false)
    private ShopMapper shopMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDetailsService userDetailsService;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;



    @Override
    public CommonResult SellerRegister(String Sellername, String password,String Shopname) {
        ShopExample shopExample = new ShopExample();
        shopExample.createCriteria().andSellernameEqualTo(Sellername);
        List<Shop> shopList = shopMapper.selectByExample(shopExample);
        if(shopList.size()>0)
        {
            return CommonResult.failed("用户名已经注册");
        }

        String text = "待填写";

        Shop shop = new Shop();
        shop.setSellername(Sellername);
        shop.setRegisterstate(0);
        shop.setSellerpassword(passwordEncoder.encode(password));
        shop.setShopaddress(text);
        shop.setShopname(Shopname);

        shopMapper.insert(shop);
        return CommonResult.success(Sellername,"注册请求已提交，等待审核");
    }

    @Override
    public String SellerLogin(String Sellername, String Sellerpassword) {
        String token=null;
        try{
            UserDetails userDetails = userDetailsService.loadUserByUsername(Sellername);
            if(!passwordEncoder.matches(Sellerpassword,userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken token1 = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(token1);
            token=jwtTokenUtil.generateToken(userDetails);
        }catch (AuthenticationException e){
        }
        return token;
    }
}
