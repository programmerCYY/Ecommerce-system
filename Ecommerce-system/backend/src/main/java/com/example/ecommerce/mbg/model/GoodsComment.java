package com.example.ecommerce.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class GoodsComment implements Serializable {
    @ApiModelProperty(value = "评价ID，自增")
    private String commentid;

    @ApiModelProperty(value = "用户账号")
    private String userid;

    @ApiModelProperty(value = "商品属性")
    private String typeid;

    @ApiModelProperty(value = "评价星级")
    private Integer level;

    @ApiModelProperty(value = "评论时间")
    private Date commenttime;

    @ApiModelProperty(value = "0是未评价，1是已评价")
    private Integer state;

    @ApiModelProperty(value = "评论详情")
    private String comment;

    private static final long serialVersionUID = 1L;

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        sb.append(", commentid=").append(commentid);
        sb.append(", userid=").append(userid);
        sb.append(", typeid=").append(typeid);
        sb.append(", level=").append(level);
        sb.append(", commenttime=").append(commenttime);
        sb.append(", state=").append(state);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}