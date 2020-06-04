package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class Chart implements Serializable {
    private String chartid;

    @ApiModelProperty(value = "用户ID")
    private String userid;

    @ApiModelProperty(value = "商品ID（要商品图片，价格，名字，属性）")
    private String goodid;

    @ApiModelProperty(value = "数量")
    private Integer number;

    @ApiModelProperty(value = "价钱")
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    public String getChartid() {
        return chartid;
    }

    public void setChartid(String chartid) {
        this.chartid = chartid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chartid=").append(chartid);
        sb.append(", userid=").append(userid);
        sb.append(", goodid=").append(goodid);
        sb.append(", number=").append(number);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}