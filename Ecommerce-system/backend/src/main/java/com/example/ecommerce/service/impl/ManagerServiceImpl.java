package com.example.ecommerce.service.impl;

import com.example.ecommerce.common.utils.JwtTokenUtil;
import com.example.ecommerce.dto.AdminUserDetails;
import com.example.ecommerce.mbg.mapper.ManagerMapper;
import com.example.ecommerce.mbg.mapper.UserpermissionMapper;
import com.example.ecommerce.mbg.model.Manager;
import com.example.ecommerce.mbg.model.ManagerExample;
import com.example.ecommerce.mbg.model.Userpermission;
import com.example.ecommerce.mbg.model.UserpermissionExample;
import com.example.ecommerce.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/2 17:48
 * @description:
 */
public class ManagerServiceImpl implements ManagerService {


    @Autowired
    private ManagerService managerService;

    @Autowired(required = false)
    private ManagerMapper managerMapper;

    @Autowired(required = false)
    private UserpermissionMapper userpermissionMapper;

    @Autowired(required = false)
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public Manager getManagerByUsername(String userid) {
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andAdminidEqualTo(userid);
        List<Manager> list = managerMapper.selectByExample(managerExample);
        if(list!=null&&list.size()>0)
        {
            return list.get(0);
        }

        return null;
    }

    @Override
    public List<Userpermission> getPermissionList(String token) {
        UserpermissionExample userpermissionExample = new UserpermissionExample();
        userpermissionExample.createCriteria().andUseridEqualTo(token);
        List<Userpermission> list = userpermissionMapper.selectByExample(userpermissionExample);
        if(list!=null)
            return list;
        return null;
    }

    @Override
    public String getPassword(String userid) {
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andAdminidEqualTo(userid);
        List<Manager> managerList = managerMapper.selectByExample(managerExample);

        return "";
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        Manager manager = managerService.getManagerByUsername(username);
        if(manager!=null){
            List<Userpermission> permissionList = managerService.getPermissionList(manager.getAdminid());
            String password = managerService.getPassword(username);
            return new AdminUserDetails(manager,permissionList);
        }throw new UsernameNotFoundException("用户名或密码错误");
    }

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

}
