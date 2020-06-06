package com.example.ecommerce.service;

import com.example.ecommerce.mbg.model.Manager;
import com.example.ecommerce.mbg.model.Userpermission;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: rain
 * @date: 2020/6/5 19:29
 * @description:
 */

public interface UserpermissionService {
    Userpermission getPeopleByUsername(String userid);
    List<Userpermission> getPermissionList(String token);
    String getPassword(String userid);

}
