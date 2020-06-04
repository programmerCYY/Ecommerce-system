package com.example.ecommerce.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class TokenTranslate {
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired(required = false)
    private JwtTokenUtil jwtTokenUtil;
    //解析header中token的username
    public String GetUsernameByHeader(HttpServletRequest request)
    {
        String authHeader = request.getHeader(this.tokenHeader);
        if(authHeader!=null&&authHeader.startsWith(this.tokenHead)){
            String authToken = authHeader.substring(this.tokenHead.length());
            String username = jwtTokenUtil.getUserNameFromToken(authToken);
            return username;
        }
        else
            return "";
    }
}
