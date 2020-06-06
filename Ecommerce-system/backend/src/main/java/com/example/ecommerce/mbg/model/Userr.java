package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Userr implements Serializable {
    @ApiModelProperty(value = "用户的账号")
    private String userid;

    @ApiModelProperty(value = "用户的密码")
    private String userpassword;

    @ApiModelProperty(value = "用户的电话号码")
    private String useraddress;

    @ApiModelProperty(value = "用户的地址")
    private String usertelephone;

    @ApiModelProperty(value = "用户的权限，0是普通用户，1是VIP")
    private Integer userpower;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getUsertelephone() {
        return usertelephone;
    }

    public void setUsertelephone(String usertelephone) {
        this.usertelephone = usertelephone;
    }

    public Integer getUserpower() {
        return userpower;
    }

    public void setUserpower(Integer userpower) {
        this.userpower = userpower;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", userpassword=").append(userpassword);
        sb.append(", useraddress=").append(useraddress);
        sb.append(", usertelephone=").append(usertelephone);
        sb.append(", userpower=").append(userpower);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}