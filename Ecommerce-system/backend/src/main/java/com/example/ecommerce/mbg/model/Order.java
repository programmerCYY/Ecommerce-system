package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    @ApiModelProperty(value = "订单号")
    private String orderid;

    @ApiModelProperty(value = "用户名")
    private String userid;

    @ApiModelProperty(value = "0未支付，1已支付，2申请退，3已退，4超时")
    private Integer state;

    @ApiModelProperty(value = "支付时间")
    private Date paytime;

    @ApiModelProperty(value = "收货时间")
    private Date gettime;

    @ApiModelProperty(value = "评论时间")
    private Date commenttime;

    @ApiModelProperty(value = "评论")
    private String comment;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getGettime() {
        return gettime;
    }

    public void setGettime(Date gettime) {
        this.gettime = gettime;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", userid=").append(userid);
        sb.append(", state=").append(state);
        sb.append(", paytime=").append(paytime);
        sb.append(", gettime=").append(gettime);
        sb.append(", commenttime=").append(commenttime);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}