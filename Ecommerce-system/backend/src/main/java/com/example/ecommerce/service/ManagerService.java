package com.example.ecommerce.service;

import com.example.ecommerce.mbg.model.Manager;
import com.example.ecommerce.mbg.model.Userpermission;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/2 17:48
 * @description:
 */
@Service
public interface ManagerService {
    public Manager getManagerByUsername(String userid);
    List<Userpermission> getPermissionList(String token);
    public String getPassword(String userid);
    UserDetails loadUserByUsername(String username);

    String  login(String username,String password);
}
