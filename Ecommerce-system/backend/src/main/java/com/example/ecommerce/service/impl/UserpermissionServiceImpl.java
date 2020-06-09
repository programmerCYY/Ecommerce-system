package com.example.ecommerce.service.impl;

import com.example.ecommerce.dto.AdminUserDetails;
import com.example.ecommerce.mbg.mapper.ManagerMapper;
import com.example.ecommerce.mbg.mapper.ShopMapper;
import com.example.ecommerce.mbg.mapper.UserpermissionMapper;
import com.example.ecommerce.mbg.mapper.UserrMapper;
import com.example.ecommerce.mbg.model.*;
import com.example.ecommerce.service.ManagerService;
import com.example.ecommerce.service.UserpermissionService;
import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/5 19:31
 * @description:
 */
//用于登录时的权限部分
@Service
public class UserpermissionServiceImpl implements UserpermissionService {

    @Autowired(required = false)
    private UserpermissionService userpermissionService;

    @Autowired(required = false)
    private ManagerMapper managerMapper;

    @Autowired(required = false)
    private UserpermissionMapper userpermissionMapper;

    @Autowired(required = false)
    private ShopMapper shopMapper;

    @Autowired(required = false)
    private UserrMapper userrMapper;

    @Override
    public Userpermission getPeopleByUsername(String userid) {
        UserpermissionExample userpermissionExample = new UserpermissionExample();
        userpermissionExample.createCriteria().andNameEqualTo(userid);
        List<Userpermission> list = userpermissionMapper.selectByExample(userpermissionExample);
        if(list!=null&&list.size()>0)
        {
            return list.get(0);
        }

        return null;
    }

    @Override
    public List<Userpermission> getPermissionList(String token) {
        UserpermissionExample userpermissionExample = new UserpermissionExample();
        userpermissionExample.createCriteria().andNameEqualTo(token);
        List<Userpermission> list = userpermissionMapper.selectByExample(userpermissionExample);
        if(list!=null)
            return list;
        return null;
    }

    @Override
    public String getPassword(String userid) {
        UserpermissionExample u=new UserpermissionExample();
        u.createCriteria().andNameEqualTo(userid);
        List<Userpermission> userpermission = userpermissionMapper.selectByExample(u);
        if(userpermission!=null&&userpermission.size()>0)
        {
            if(userpermission.get(0).getRole().equals(0))
            {
                return userrMapper.selectByPrimaryKey(userid).getUserpassword();
            }
            else if(userpermission.get(0).getRole().equals(1))
            {
                return managerMapper.selectByPrimaryKey(userid).getAdminword();
            }else if(userpermission.get(0).getRole().equals(2))
            {
                return shopMapper.selectByPrimaryKey(userid).getSellerpassword();
            }
            else
            {
                return "";
            }
        }
        return "";
    }


}
