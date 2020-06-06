package com.example.ecommerce.dto;

/**
 * @author: rain
 * @date: 2020/6/6 21:06
 * @description:
 */
public enum QueueEnum {
    //商家注册审核超时队列，10小时不审核就直接取消
    QUEUE_REGISTER_CANCEL("ecommerce.shop.direct","ecommerce.shop.cancel","ecommerce.shop.cancel"),
    //商家注册审核超时延迟队列
    //商家注册失败队列
    //商家注册失败延迟队列
    //商家注册成功队列
    //商家注册成功延迟队列

    //商家上架审核超时队列
    //商家上架审核超时延迟队列
    //商家上架失败队列
    //商家上架失败延迟队列
    //商家上架成功队列
    //商家上架成功延迟队列

    //交换机名字
    private String exchange;
    //队列名称
    private String name;
    //路由键
    private String routeKey;
    QueueEnum(String exchange,String name,String routeKey)
    {
        this.exchange = exchange;
        this.name = name;
        this.routeKey =  routeKey;
    }

    public String getExchange() {
        return exchange;
    }

    public String getRouteKey() {
        return routeKey;
    }

    public String getName() {
        return name;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }

}
