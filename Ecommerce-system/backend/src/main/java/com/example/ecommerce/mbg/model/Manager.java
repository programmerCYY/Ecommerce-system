package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Manager implements Serializable {
    @ApiModelProperty(value = "管理员的ID（主码）")
    private String adminid;

    @ApiModelProperty(value = "管理员的密码 ")
    private String adminword;

    private static final long serialVersionUID = 1L;

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getAdminword() {
        return adminword;
    }

    public void setAdminword(String adminword) {
        this.adminword = adminword;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminid=").append(adminid);
        sb.append(", adminword=").append(adminword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}