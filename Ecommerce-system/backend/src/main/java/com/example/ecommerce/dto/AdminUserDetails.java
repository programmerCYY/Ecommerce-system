package com.example.ecommerce.dto;

import com.example.ecommerce.mbg.model.Manager;
import com.example.ecommerce.mbg.model.Userpermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: rain
 * @date: 2020/6/2 14:01
 * @description:
 */
public class AdminUserDetails implements UserDetails {

    @Autowired
    private Manager manager;

    private List<Userpermission> userpermissionList;


    public AdminUserDetails(Manager manager,List<Userpermission> userpermissionList)
    {
        this.manager=manager;
        this.userpermissionList=userpermissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return userpermissionList.stream()
                .filter(userpermission -> userpermission.getValue()!=null)
                .map(userpermission -> new SimpleGrantedAuthority(userpermission.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return manager.getAdminword();
    }

    @Override
    public String getUsername() {
        return manager.getAdminid();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
