package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Shop implements Serializable {
    @ApiModelProperty(value = "店主名")
    private String sellername;

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

    private static final long serialVersionUID = 1L;

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sellername=").append(sellername);
        sb.append(", shopname=").append(shopname);
        sb.append(", totalsales=").append(totalsales);
        sb.append(", shopaddress=").append(shopaddress);
        sb.append(", registerstate=").append(registerstate);
        sb.append(", sellerpassword=").append(sellerpassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}