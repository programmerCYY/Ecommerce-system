package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class GoodsInformation implements Serializable {
    @ApiModelProperty(value = "商品ID自增")
    private String goodid;

    @ApiModelProperty(value = "商家ID外码")
    private String shopid;

    @ApiModelProperty(value = "商品名字")
    private String goodname;

    @ApiModelProperty(value = "商品图片")
    private String goodpictrue;

    @ApiModelProperty(value = "上下架状态，0为待审核，1为已审核")
    private Integer checkstate;

    @ApiModelProperty(value = "数量")
    private Integer number;

    @ApiModelProperty(value = "包邮状态，0为不包邮，1为包邮")
    private Integer ispackage;

    @ApiModelProperty(value = "首页图片")
    private String frontpictrue;

    @ApiModelProperty(value = "上架时间")
    private Date shangtime;

    @ApiModelProperty(value = "分类Id")
    private String categoryid;

    @ApiModelProperty(value = "总销售量")
    private Integer allsellnumber;

    @ApiModelProperty(value = "商品介绍")
    private String introduction;

    private static final long serialVersionUID = 1L;

    public String getGoodid() {
        return goodid;
    }

    public void setGoodid(String goodid) {
        this.goodid = goodid;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
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

    public Integer getIspackage() {
        return ispackage;
    }

    public void setIspackage(Integer ispackage) {
        this.ispackage = ispackage;
    }

    public String getFrontpictrue() {
        return frontpictrue;
    }

    public void setFrontpictrue(String frontpictrue) {
        this.frontpictrue = frontpictrue;
    }

    public Date getShangtime() {
        return shangtime;
    }

    public void setShangtime(Date shangtime) {
        this.shangtime = shangtime;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getAllsellnumber() {
        return allsellnumber;
    }

    public void setAllsellnumber(Integer allsellnumber) {
        this.allsellnumber = allsellnumber;
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
        sb.append(", shopid=").append(shopid);
        sb.append(", goodname=").append(goodname);
        sb.append(", goodpictrue=").append(goodpictrue);
        sb.append(", checkstate=").append(checkstate);
        sb.append(", number=").append(number);
        sb.append(", ispackage=").append(ispackage);
        sb.append(", frontpictrue=").append(frontpictrue);
        sb.append(", shangtime=").append(shangtime);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", allsellnumber=").append(allsellnumber);
        sb.append(", introduction=").append(introduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}