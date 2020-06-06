package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class GoodsCategory implements Serializable {
    @ApiModelProperty(value = "自增ID")
    private Integer id;

    @ApiModelProperty(value = "商品分类Id")
    private String categoryid;

    @ApiModelProperty(value = "商家Id")
    private String sellerid;

    @ApiModelProperty(value = "名称")
    private String goodsname;

    @ApiModelProperty(value = "图片")
    private String pic;

    @ApiModelProperty(value = "分类等级")
    private Integer categorydegree;

    @ApiModelProperty(value = "数量")
    private Integer number;

    @ApiModelProperty(value = "单位")
    private String danwei;

    @ApiModelProperty(value = "是否展示在主页")
    private Integer showstate;

    @ApiModelProperty(value = "描述")
    private String descipt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getSellerid() {
        return sellerid;
    }

    public void setSellerid(String sellerid) {
        this.sellerid = sellerid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getCategorydegree() {
        return categorydegree;
    }

    public void setCategorydegree(Integer categorydegree) {
        this.categorydegree = categorydegree;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    public Integer getShowstate() {
        return showstate;
    }

    public void setShowstate(Integer showstate) {
        this.showstate = showstate;
    }

    public String getDescipt() {
        return descipt;
    }

    public void setDescipt(String descipt) {
        this.descipt = descipt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", sellerid=").append(sellerid);
        sb.append(", goodsname=").append(goodsname);
        sb.append(", pic=").append(pic);
        sb.append(", categorydegree=").append(categorydegree);
        sb.append(", number=").append(number);
        sb.append(", danwei=").append(danwei);
        sb.append(", showstate=").append(showstate);
        sb.append(", descipt=").append(descipt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}