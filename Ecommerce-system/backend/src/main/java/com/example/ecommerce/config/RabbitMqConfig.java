package com.example.ecommerce.config;

import com.example.ecommerce.dto.QueueEnum;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: rain
 * @date: 2020/6/8 15:48
 * @description:
 */
@Configuration
public class RabbitMqConfig {
    //超时取消商家注册队列绑定的交换机
    @Bean
    DirectExchange overTimeDirect(){
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_REGISTER_CANCEL.getExchange())
                .durable(true)
                .build();
    }

    //超时取消注册延迟队列
    @Bean
    DirectExchange overTimeTtlDirect(){
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_REGISTER_CANCEL_TTL.getExchange())
                .durable(true)
                .build();
    }
    //超时触发取消注册队列
    @Bean
    public Queue overTimeQueue(){return new Queue(QueueEnum.QUEUE_REGISTER_CANCEL.getName());}
    @Bean
    public Queue overTimeTtlQueue()
    {
        return QueueBuilder
                .durable(QueueEnum.QUEUE_REGISTER_CANCEL_TTL.getName())
                .withArgument("x-dead-letter-exchange",QueueEnum.QUEUE_REGISTER_CANCEL.getExchange())
                .withArgument("x-dead-letter-routing-key",QueueEnum.QUEUE_REGISTER_CANCEL.getRouteKey())
                .build();
        //到期后转发到的交换机和路由器
    }
    //超时触发取消注册延迟队列绑定到交换机
    @Bean
    Binding overTimeTtlBinding(DirectExchange overTimeTtlDirect,Queue overTimeTtlQueue)
    {
        return BindingBuilder
                .bind(overTimeTtlQueue)
                .to(overTimeTtlDirect)
                .with(QueueEnum.QUEUE_REGISTER_CANCEL_TTL.getRouteKey());
    }

    //超时触发取消注册队列绑定到交换机
    @Bean
    Binding overTimeBinding(DirectExchange overTimeDirect,Queue overTimeQueue)
    {
        return BindingBuilder
                .bind(overTimeQueue)
                .to(overTimeDirect)
                .with(QueueEnum.QUEUE_REGISTER_CANCEL.getRouteKey());
    }


    @Bean
    DirectExchange RegisterSuccessDirect()
    {
        return (DirectExchange)ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_REGISTER_SUCCESS.getExchange())
                .durable(true)
                .build();
    }

    @Bean
    DirectExchange RegisterSuccessTtlDirect()
    {
        return (DirectExchange)ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_REGISTER_SUCCESS_TTL.getExchange())
                .durable(true)
                .build();
    }


    @Bean
    public Queue RegisterSuccessQueue() { return new Queue(QueueEnum.QUEUE_REGISTER_SUCCESS.getName());};

    @Bean
    public Queue RegisterSuccessTtlQueue()
    {
        return QueueBuilder
                .durable(QueueEnum.QUEUE_REGISTER_SUCCESS_TTL.getName())
                .withArgument("x-dead-letter-exchange",QueueEnum.QUEUE_REGISTER_SUCCESS.getExchange())
                .withArgument("x-dead-letter-routing-key",QueueEnum.QUEUE_REGISTER_SUCCESS.getRouteKey())
                .build();
    }

    @Bean
    Binding RegisterSucceessTtlBinding(DirectExchange RegisterSuccessTtlDirect,Queue RegisterSuccessTtlQueue)
    {
        return BindingBuilder
                .bind(RegisterSuccessTtlQueue)
                .to(RegisterSuccessTtlDirect)
                .with(QueueEnum.QUEUE_REGISTER_SUCCESS_TTL.getRouteKey());
    }

    @Bean
    Binding RegisterSuccessBinding(DirectExchange RegisterSuccessDirect,Queue RegisterSuccessQueue)
    {
        return BindingBuilder
                .bind(RegisterSuccessQueue)
                .to(RegisterSuccessDirect)
                .with(QueueEnum.QUEUE_REGISTER_SUCCESS.getRouteKey());
    }

    @Bean
    DirectExchange ShopRegisterDirect()
    {
        return (DirectExchange)ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_REGISTER.getExchange())
                .build();
    }

    @Bean
    DirectExchange ShopRegisterTtlDirect()
    {
        return (DirectExchange)ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_REGISTER_TTL.getExchange())
                .build();
    }

    @Bean
    public Queue ShopRegisterQueue(){return new Queue(QueueEnum.QUEUE_REGISTER.getName());}

    @Bean
    public Queue ShopRegisterTtlQueue(){
        return QueueBuilder.durable(QueueEnum.QUEUE_REGISTER_TTL.getName())
                .withArgument("x-dead-letter-exchange",QueueEnum.QUEUE_REGISTER.getExchange())
                .withArgument("x-dead-letter-routing-key",QueueEnum.QUEUE_REGISTER.getRouteKey())
                .build();
    }

    @Bean
    Binding RegisterBinding(DirectExchange ShopRegisterDirect,Queue ShopRegisterQueue)
    {
        return BindingBuilder
                .bind(ShopRegisterQueue)
                .to(ShopRegisterDirect)
                .with(QueueEnum.QUEUE_REGISTER.getRouteKey());
    }

    @Bean
    Binding RegisterTtlBinding(DirectExchange ShopRegisterTtlDirect,Queue ShopRegisterQueue)
    {
        return BindingBuilder
                .bind(ShopRegisterQueue)
                .to(ShopRegisterTtlDirect)
                .with(QueueEnum.QUEUE_REGISTER_TTL.getRouteKey());
    }

    @Bean
    DirectExchange ShopUpDirect()
    {
        return (DirectExchange)ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_UP.getExchange())
                .build();
    }

    @Bean
    DirectExchange ShopUpTtlDirect()
    {
        return (DirectExchange)ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_UP_TTL.getExchange())
                .build();
    }

    @Bean
    public Queue ShopUpQueue(){return new Queue(QueueEnum.QUEUE_UP.getName());}

    @Bean
    public Queue ShopUpTtlQueue(){
        return QueueBuilder.durable(QueueEnum.QUEUE_UP_TTL.getName())
                .withArgument("x-dead-letter-exchange",QueueEnum.QUEUE_UP.getExchange())
                .withArgument("x-dead-letter-routing-key",QueueEnum.QUEUE_UP.getRouteKey())
                .build();
    }

    @Bean
    Binding ShopUpBinding(DirectExchange ShopUpDirect,Queue ShopUpQueue)
    {
        return BindingBuilder
                .bind(ShopUpQueue)
                .to(ShopUpDirect)
                .with(QueueEnum.QUEUE_UP.getRouteKey());
    }

    @Bean
    Binding ShopUpTtlBinding(DirectExchange ShopUpTtlDirect,Queue ShopUpQueue)
    {
        return BindingBuilder
                .bind(ShopUpQueue)
                .to(ShopUpTtlDirect)
                .with(QueueEnum.QUEUE_UP_TTL.getRouteKey());
    }

    @Bean
        //审核陈坤实际消息队列绑定的交换机
    DirectExchange verifySuccessDirect()
    {
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_REGISTER_SUCCESS.getExchange())
                .durable(true)
                .build();
    }
    //审核陈坤队列延迟队列所绑定的交换机
    @Bean
    DirectExchange verifySuccessTtlDirect()
    {
        return  (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_REGISTER_SUCCESS_TTL.getExchange())
                .durable(true)
                .build();
    }
    //审核陈坤后的操作消息队列
    @Bean
    public Queue verifySuccessQueue()
    {
        return new Queue(QueueEnum.QUEUE_REGISTER_SUCCESS.getName());
    }
    //审核陈坤延迟队列
    @Bean
    public Queue verifySuccessTtlQueue()
    {
        return QueueBuilder
                .durable(QueueEnum.QUEUE_REGISTER_SUCCESS_TTL.getName())
                .withArgument("x-dead-letter-exchange",QueueEnum.QUEUE_REGISTER_SUCCESS.getExchange())
                //到期后转发到的交换机
                .withArgument("x-dead-letter-routing-key",QueueEnum.QUEUE_REGISTER_SUCCESS.getRouteKey())
                //到期后转发的路由键
                .build();
    }
    //审核陈坤延迟队列绑定到交换机
    @Bean
    Binding verifySuccessTtlBinding(DirectExchange verifySuccessTtlDirect,Queue verifySuccessTtlQueue)
    {
        return BindingBuilder
                .bind(verifySuccessTtlQueue)
                .to(verifySuccessTtlDirect)
                .with(QueueEnum.QUEUE_REGISTER_SUCCESS_TTL.getRouteKey());
    }
    //审核陈坤队列绑定到交换机
    @Bean
    Binding verifySuccessBinding(DirectExchange verifySuccessDirect,Queue verifySuccessQueue)
    {
        return BindingBuilder
                .bind(verifySuccessQueue)
                .to(verifySuccessDirect)
                .with(QueueEnum.QUEUE_REGISTER_SUCCESS.getRouteKey());
    }
    //审核失败实际队列绑定交换机
    @Bean
    DirectExchange verifyFaliedDirect()
    {
        return (DirectExchange) ExchangeBuilder.directExchange(QueueEnum.QUEUE_REGISTER_FAILED.getExchange())
                .durable(true).build();
    }
    //审核失败延迟队列绑定交换机
    @Bean
    DirectExchange verifyFailedTtlDirect()
    {
        return (DirectExchange) ExchangeBuilder.directExchange(QueueEnum.QUEUE_REGISTER_FAILED_TTL.getExchange())
                .durable(true).build();
    }
    //审核失败实际队列
    @Bean
    public Queue verifyFailedQueue()
    {
        return new Queue(QueueEnum.QUEUE_REGISTER_FAILED.getName());
    }
    //审核失败延迟队列
    @Bean
    public Queue verifyFailedTtlQueue(){
        return QueueBuilder.durable(QueueEnum.QUEUE_REGISTER_FAILED_TTL.getName())
                .withArgument("x-dead-letter-exchange",QueueEnum.QUEUE_REGISTER_FAILED.getExchange())
                .withArgument("x-dead-letter-routing-key",QueueEnum.QUEUE_REGISTER_FAILED.getRouteKey())
                .build();
    }
    //审核核失败实际队列绑定到交换机
    @Bean
    Binding verifyFailedBinding(DirectExchange verifyFaliedDirect, Queue verifyFailedQueue)
    {
        return BindingBuilder.bind(verifyFailedQueue).to(verifyFaliedDirect).with(QueueEnum.QUEUE_REGISTER_FAILED.getRouteKey());
    }
    //审核失败延迟队列绑定到交换机
    @Bean
    Binding verifyFailedTtlBinding(DirectExchange verifyFailedTtlDirect,Queue verifyFailedTtlQueue)
    {
        return BindingBuilder.bind(verifyFailedTtlQueue).to(verifyFailedTtlDirect).with(QueueEnum.QUEUE_REGISTER_FAILED_TTL.getRouteKey());
    }

}
