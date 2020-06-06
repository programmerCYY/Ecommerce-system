package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderGoods implements Serializable {
    @ApiModelProperty(value = "订单Id")
    private String orderid;

    @ApiModelProperty(value = "商品名字")
    private String goodname;

    @ApiModelProperty(value = "商家名字")
    private String shopname;

    @ApiModelProperty(value = "状态")
    private String state;

    @ApiModelProperty(value = "总数量")
    private Integer totalNumber;

    @ApiModelProperty(value = "总价钱")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "图片")
    private String goodpictrue;

    @ApiModelProperty(value = "属性")
    private String attribute;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getGoodpictrue() {
        return goodpictrue;
    }

    public void setGoodpictrue(String goodpictrue) {
        this.goodpictrue = goodpictrue;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", goodname=").append(goodname);
        sb.append(", shopname=").append(shopname);
        sb.append(", state=").append(state);
        sb.append(", totalNumber=").append(totalNumber);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", goodpictrue=").append(goodpictrue);
        sb.append(", attribute=").append(attribute);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}