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
    private Userpermission userpermission;

    private List<Userpermission> userpermissionList;

    private String password;

    public AdminUserDetails(Userpermission userper,List<Userpermission> userpermissionList,String password)
    {
        this.userpermission=userper;
        this.userpermissionList=userpermissionList;
        this.password=password;
        System.out.println("2"+this.password);
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
        return password;
    }

    @Override
    public String getUsername() {
        return userpermission.getName();
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
