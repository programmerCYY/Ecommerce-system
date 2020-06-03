package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Goods implements Serializable {
    private Integer goodid;

    private String storeid;

    private String goodname;

    private String goodpictrue;

    @ApiModelProperty(value = "审核状态")
    private Integer checkstate;

    private Integer number;

    private String introduction;

    private static final long serialVersionUID = 1L;

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getGoodpictrue() {
        return goodpictrue;
    }

    public void setGoodpictrue(String goodpictrue) {
        this.goodpictrue = goodpictrue;
    }

    public Integer getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(Integer checkstate) {
        this.checkstate = checkstate;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodid=").append(goodid);
        sb.append(", storeid=").append(storeid);
        sb.append(", goodname=").append(goodname);
        sb.append(", goodpictrue=").append(goodpictrue);
        sb.append(", checkstate=").append(checkstate);
        sb.append(", number=").append(number);
        sb.append(", introduction=").append(introduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}