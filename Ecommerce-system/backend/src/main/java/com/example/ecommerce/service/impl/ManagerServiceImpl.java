package com.example.ecommerce.service.impl;

import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.common.utils.JwtTokenUtil;
import com.example.ecommerce.dto.AdminUserDetails;
import com.example.ecommerce.mbg.mapper.GoodsMapper;
import com.example.ecommerce.mbg.mapper.ManagerMapper;
import com.example.ecommerce.mbg.mapper.ShopMapper;
import com.example.ecommerce.mbg.mapper.UserpermissionMapper;
import com.example.ecommerce.mbg.model.*;
import com.example.ecommerce.service.ManagerService;
import com.example.ecommerce.service.UserpermissionService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/2 17:48
 * @description:
 */
@Service
public class ManagerServiceImpl implements ManagerService {


    @Autowired
    private ManagerService managerService;

    @Autowired
    private UserpermissionService userpermissionService;

    @Autowired(required = false)
    private UserpermissionMapper userpermissionMapper;

    @Autowired(required = false)
    private GoodsMapper goodsMapper;

    @Autowired(required = false)
    private ShopMapper shopMapper;

    @Autowired(required = false)
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;


    @Override
    public String login(String username, String password) {
        String token=null;
        try{
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if(!passwordEncoder.matches(password,userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken token1 = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(token1);
            token=jwtTokenUtil.generateToken(userDetails);
        }catch (AuthenticationException e){
        }
        return token;
    }

    @Override
    public List<Shop> getNeedVerifyRegister(int pageNum, int pageSize) {
        ShopExample shopExample = new ShopExample();
        shopExample.createCriteria().andRegisterstateEqualTo(0);
        PageHelper.startPage(pageNum, pageSize);
        return shopMapper.selectByExample(shopExample);
    }

    @Override
    public CommonResult VerifyShopRegisterSuccess(String Sellername) {

        Shop shop = shopMapper.selectByPrimaryKey(Sellername);
        shop.setRegisterstate(1);
        String value="商家";
        Userpermission userpermission = new Userpermission();
        userpermission.setValue(value);
        userpermission.setName(Sellername);
        userpermission.setCreatetime(new Date());
        userpermission.setRole(2);

        userpermissionMapper.insert(userpermission);
        shopMapper.updateByPrimaryKey(shop);

        VerifyRegisterSendEmail(Sellername,1);
        return CommonResult.success(Sellername,"商家注册审核成功");
    }

    @Override
    public CommonResult VerifyShopRegisterFailed(String Sellername) {
        shopMapper.deleteByPrimaryKey(Sellername);

        VerifyRegisterSendEmail(Sellername,0);
        return CommonResult.success(Sellername,"该用户审核不通过");
    }

    @Override
    public CommonResult VerifyRegisterSendEmail(String Sellername, int num) {
        if(num==1)
        {
            return CommonResult.success(Sellername,"注册审核通过，邮件发送成功");
        }
        if(num==0)
        {
            return CommonResult.success(Sellername,"注册审核失败，已发邮件通知");
        }
        return null;
    }

    @Override
    public List<Goods> getNeedVerifyGoods(int pageNum, int pageSize) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andCheckstateEqualTo(0);
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public CommonResult VerifyGoodSuccess(String Goodid) {
        Goods goods = goodsMapper.selectByPrimaryKey(Goodid);
        goods.setCheckstate(1);
        goods.setUpdownstate(1);
        goodsMapper.updateByPrimaryKey(goods);
        VerifyRegisterSendEmail(Goodid,1);

        return CommonResult.success(Goodid,"商品上架成功");
    }

    @Override
    public CommonResult VerifyGoodFailed(String Goodid) {
        goodsMapper.deleteByPrimaryKey(Goodid);

        VerifyGoodSendEmail(Goodid,0);
        return CommonResult.success(Goodid,"商品审核失败，拒绝上架");
    }

    @Override
    public CommonResult VerifyGoodSendEmail(String Goodid, int num) {
        if(num==1)
        {
            return CommonResult.success(Goodid,"商品上架成功，邮件发送成功");
        }
        if(num==0)
        {
            return CommonResult.success(Goodid,"商品上架失败，已发邮件通知");
        }
        return null;
    }

}
