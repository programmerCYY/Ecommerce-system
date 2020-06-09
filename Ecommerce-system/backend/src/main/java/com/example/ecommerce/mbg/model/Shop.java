package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Shop implements Serializable {
    @ApiModelProperty(value = "商家Id")
    private String shopid;

    @ApiModelProperty(value = "商家名")
    private String shopname;

    @ApiModelProperty(value = "总销量")
    private Integer totalsales;

    @ApiModelProperty(value = "商家地址")
    private String shopaddress;

    @ApiModelProperty(value = "注册的审核状态，0为待审核，1为审核通过")
    private Integer registerstate;

    @ApiModelProperty(value = "商家的登录密码")
    private String sellerpassword;

    @ApiModelProperty(value = "店主的名字")
    private String sellername;

    @ApiModelProperty(value = "店主的电话")
    private String sellertelephone;

    private static final long serialVersionUID = 1L;

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public Integer getTotalsales() {
        return totalsales;
    }

    public void setTotalsales(Integer totalsales) {
        this.totalsales = totalsales;
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress;
    }

    public Integer getRegisterstate() {
        return registerstate;
    }

    public void setRegisterstate(Integer registerstate) {
        this.registerstate = registerstate;
    }

    public String getSellerpassword() {
        return sellerpassword;
    }

    public void setSellerpassword(String sellerpassword) {
        this.sellerpassword = sellerpassword;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getSellertelephone() {
        return sellertelephone;
    }

    public void setSellertelephone(String sellertelephone) {
        this.sellertelephone = sellertelephone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", totalsales=").append(totalsales);
        sb.append(", shopaddress=").append(shopaddress);
        sb.append(", registerstate=").append(registerstate);
        sb.append(", sellerpassword=").append(sellerpassword);
        sb.append(", sellername=").append(sellername);
        sb.append(", sellertelephone=").append(sellertelephone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}