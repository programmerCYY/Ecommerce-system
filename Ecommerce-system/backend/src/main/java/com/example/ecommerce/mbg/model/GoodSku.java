package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class GoodSku implements Serializable {
    @ApiModelProperty(value = "自增ID")
    private Integer skuid;

    @ApiModelProperty(value = "商品Id")
    private String goodid;

    @ApiModelProperty(value = "数量")
    private Integer number;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "Vip价格")
    private BigDecimal vipprice;

    @ApiModelProperty(value = "库存量")
    private Integer leftNumber;

    @ApiModelProperty(value = "销售量")
    private Integer soldNumber;

    @ApiModelProperty(value = "图片")
    private String picture;

    @ApiModelProperty(value = "属性")
    private String attribute;

    private static final long serialVersionUID = 1L;

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public String getGoodid() {
        return goodid;
    }

    public void setGoodid(String goodid) {
        this.goodid = goodid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVipprice() {
        return vipprice;
    }

    public void setVipprice(BigDecimal vipprice) {
        this.vipprice = vipprice;
    }

    public Integer getLeftNumber() {
        return leftNumber;
    }

    public void setLeftNumber(Integer leftNumber) {
        this.leftNumber = leftNumber;
    }

    public Integer getSoldNumber() {
        return soldNumber;
    }

    public void setSoldNumber(Integer soldNumber) {
        this.soldNumber = soldNumber;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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
        sb.append(", skuid=").append(skuid);
        sb.append(", goodid=").append(goodid);
        sb.append(", number=").append(number);
        sb.append(", price=").append(price);
        sb.append(", vipprice=").append(vipprice);
        sb.append(", leftNumber=").append(leftNumber);
        sb.append(", soldNumber=").append(soldNumber);
        sb.append(", picture=").append(picture);
        sb.append(", attribute=").append(attribute);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}