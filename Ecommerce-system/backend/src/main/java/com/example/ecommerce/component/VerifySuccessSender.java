package com.example.ecommerce.component;

import com.example.ecommerce.service.ManagerService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: rain
 * @date: 2020/6/8 16:21
 * @description:
 */
@Component
@RabbitListener(queues = "ecommerce.shop.success")
public class VerifySuccessSender {

    @Autowired
    private ManagerService managerService;

    @RabbitHandler
    public void handle(String username)
    {

    }

}
