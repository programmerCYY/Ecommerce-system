package com.example.ecommerce.component;

import com.example.ecommerce.service.ManagerService;
import com.example.ecommerce.service.ShopService;
import com.example.ecommerce.service.UserrService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: rain
 * @date: 2020/6/7 14:50
 * @description:
 */
@Component
@RabbitListener(queues = "ecommerce.shop.register")
public class ShopRegisterReceiver {

    @Autowired
    private ManagerService managerService;

    @RabbitHandler
    public void handle(String[] SellerId_RegisterState)
    {
    }

}
