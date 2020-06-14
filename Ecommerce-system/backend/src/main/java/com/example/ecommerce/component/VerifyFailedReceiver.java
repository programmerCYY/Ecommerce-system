package com.example.ecommerce.component;

import com.example.ecommerce.service.ManagerService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: rain
 * @date: 2020/6/7 15:11
 * @description:
 */
@Component
@RabbitListener(queues = "ecommerce.shop.failed")
public class VerifyFailedReceiver {

    @Autowired
    private ManagerService managerService;

    public void handle(String sellerId)
    {

        managerService.VerifyShopRegisterFailed(sellerId);
    }
}
