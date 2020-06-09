package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    @ApiModelProperty(value = "商品ID")
    private String goodid;

    @ApiModelProperty(value = "商家ID")
    private String shopid;

    @ApiModelProperty(value = "商品名字")
    private String goodname;

    @ApiModelProperty(value = "商品图片")
    private String goodpicture;

    @ApiModelProperty(value = "审核状态，0为待审核上架，1为已审核成功上架")
    private Integer checkstate;

    @ApiModelProperty(value = "数量")
    private Integer number;

    @ApiModelProperty(value = "包邮状态，0为不包邮，1为包邮")
    private Integer ispackage;

    @ApiModelProperty(value = "首页图片")
    private String frontpicture;

    @ApiModelProperty(value = "上架时间")
    private Date shangtime;

    @ApiModelProperty(value = "分类Id")
    private String categoryid;

    @ApiModelProperty(value = "总销售量")
    private Integer allsellnumber;

    @ApiModelProperty(value = "是否在删除状态，0为正常，1为已删除")
    private Integer deletestate;

    @ApiModelProperty(value = "上下架状态，0是待上架，1是已上架，2是已下架")
    private Integer updownstate;

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

    public String getGoodpicture() {
        return goodpicture;
    }

    public void setGoodpicture(String goodpicture) {
        this.goodpicture = goodpicture;
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

    public String getFrontpicture() {
        return frontpicture;
    }

    public void setFrontpicture(String frontpicture) {
        this.frontpicture = frontpicture;
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

    public Integer getDeletestate() {
        return deletestate;
    }

    public void setDeletestate(Integer deletestate) {
        this.deletestate = deletestate;
    }

    public Integer getUpdownstate() {
        return updownstate;
    }

    public void setUpdownstate(Integer updownstate) {
        this.updownstate = updownstate;
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
        sb.append(", goodpicture=").append(goodpicture);
        sb.append(", checkstate=").append(checkstate);
        sb.append(", number=").append(number);
        sb.append(", ispackage=").append(ispackage);
        sb.append(", frontpicture=").append(frontpicture);
        sb.append(", shangtime=").append(shangtime);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", allsellnumber=").append(allsellnumber);
        sb.append(", deletestate=").append(deletestate);
        sb.append(", updownstate=").append(updownstate);
        sb.append(", introduction=").append(introduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}