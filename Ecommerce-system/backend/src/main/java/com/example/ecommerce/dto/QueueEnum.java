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
    QUEUE_REGISTER_CANCEL_TTL("ecommerce.shop.direct","ecommerce.shop.cancel.ttl","ecommerce.shop.cancel.ttl"),
    //商家注册失败队列
    QUEUE_REGISTER_FAILED("ecommerce.shop.direct","ecommerce.shop.failed","ecommerce.shop.failed"),
    //商家注册失败延迟队列
    QUEUE_REGISTER_FAILED_TTL("ecommerce.shop.direct","ecommerce.shop.failed.ttl","ecommerce.shop.failed.ttl"),
    //商家注册成功队列
    QUEUE_REGISTER_SUCCESS("ecommerce.shop.direct","ecommerce.shop.success","ecommerce.shop.success"),
    //商家注册成功延迟队列
    QUEUE_REGISTER_SUCCESS_TTL("ecommerce.shop.direct","ecommerce.shop.success.ttl","ecommerce.shop.success.ttl"),
    //注册流程消息队列
    QUEUE_REGISTER("ecommerce.shop.direct","ecommerce.shop.register","ecommerce.shop.register"),
    //注册流程消息延迟队列
    QUEUE_REGISTER_TTL("ecommerce.shop.direct","ecommerce.shop.redister.ttl","ecommerce.shop.register.ttl"),

    //商家上架审核超时队列
    QUEUE_UP_CANCEL("ecommerce.shop.direct","ecommerce.shop.upcancel","ecommerce.shop.upcancel"),
    //商家上架审核超时延迟队列
    QUEUE_UP_CANCEL_TTL("ecommerce.shop.direct","ecommerce.shop.upcancel.ttl","ecommerce.shop.upcancel.ttl"),
    //商家上架失败队列
    QUEUE_UP_FAILED("ecommerce.shop.direct","ecommerce.shop.upfailed","ecommerce.shop.upfailed"),
    //商家上架失败延迟队列
    QUEUE_UP_FAILED_TTL("ecommerce.shop.direct","ecommerce.shop.upfailed.ttl","ecommerce.shop.upfailed.ttl"),
    //商家上架流程队列
    QUEUE_UP("ecommerce.shop.direct","ecommerce.shop.up","ecommerce.shop.up"),
    //商家上架流程延迟队列
    QUEUE_UP_TTL("ecommerce.shop.direct","ecommerce.shop.up.ttl","ecommerce.shop.up.ttl");


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
