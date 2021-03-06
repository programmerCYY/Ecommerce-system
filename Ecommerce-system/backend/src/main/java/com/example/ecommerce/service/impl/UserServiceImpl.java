package com.example.ecommerce.service.impl;

import cn.hutool.crypto.digest.BCrypt;
import com.example.ecommerce.common.api.CommonResult;
import com.example.ecommerce.common.utils.JwtTokenUtil;
import com.example.ecommerce.mbg.mapper.UserpermissionMapper;
import com.example.ecommerce.mbg.mapper.UserrMapper;
import com.example.ecommerce.mbg.model.Manager;
import com.example.ecommerce.mbg.model.Userpermission;
import com.example.ecommerce.mbg.model.Userr;
import com.example.ecommerce.mbg.model.UserrExample;
import com.example.ecommerce.service.UserrService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import springfox.documentation.spi.service.contexts.SecurityContext;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author: rain
 * @date: 2020/6/1 11:47
 * @description:
 */
@Service
public class UserServiceImpl implements UserrService {

    @Autowired(required = false)
    private UserrMapper userrMapper;

    @Autowired(required = false)
    private UserpermissionMapper userpermissionMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDetailsService userDetailsService;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public CommonResult register(String userid, String password,String telephone) {


        String text = "未评论";
        Userr userr = new Userr();
        userr.setUserid(userid);
        userr.setUseraddress(text);
        userr.setUsertelephone(telephone);

        UserrExample userrExample = new UserrExample();
        userrExample.createCriteria().andUseridEqualTo(userr.getUserid());
        List<Userr> userrList = userrMapper.selectByExample(userrExample);
        if(userrList.size()>0)
        {
            return CommonResult.failed("该用户名已注册");
        }

        String passw = passwordEncoder.encode(password);
        userr.setUserpassword(passw);

        String value="普通用户";
        Userpermission userpermission = new Userpermission();
        userpermission.setValue(value);
        userpermission.setName(userid);
        userpermission.setCreatetime(new Date());
        userpermission.setRole(0);

        userrMapper.insert(userr);
        userpermissionMapper.insert(userpermission);
        return CommonResult.success(userid, "注册成功");
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
        }
        return token;
    }


}
